package io.vertx.lang.scala

import java.io.File
import java.nio.file.Files

import io.vertx.core.{AsyncResult, Handler, Vertx => JVertx}
import io.vertx.scala.core.Vertx
import org.junit.runner.RunWith
import org.scalatest.concurrent.PatienceConfiguration.Timeout
import org.scalatest.time.SpanSugar._
import org.scalatest.concurrent.ScalaFutures.whenReady
import org.scalatest.junit.JUnitRunner
import org.scalatest.{AsyncFlatSpec, Matchers}

import scala.concurrent.Promise

@RunWith(classOf[JUnitRunner])
class ScalaVerticleFactoryTest extends AsyncFlatSpec with Matchers {

  val defaultPatience = Timeout(2 seconds)

  "A bare Scala-Verticle" should "compile and deploy on the fly" in {
    val promise = Promise[String]
    val vertx = Vertx.vertx()
    val dir = Files.createTempDirectory("clazzes")
    val file = new File(dir.toString, "ScalaTestVerticle.scala")
    val rs = getClass.getClassLoader.getResourceAsStream("ScalaTestVerticle.scala")
    Files.copy(rs, file.toPath)

    val scalaVerticleFactory = new ScalaVerticleFactory
    vertx.asJava.asInstanceOf[JVertx]
      .deployVerticle(scalaVerticleFactory.createVerticle(file.toPath.toString, getClass.getClassLoader), new Handler[AsyncResult[java.lang.String]] {
        override def handle(event: AsyncResult[String]): Unit = promise.success(event.result())
      })

    whenReady(promise.future, defaultPatience) {_ shouldNot be(null)}
  }

  "A bare Scala-Verticle from the classpath" should "compile and deploy on the fly" in {
    val promise = Promise[String]
    val vertx = Vertx.vertx()
    val scalaVerticleFactory = new ScalaVerticleFactory
    vertx.asJava.asInstanceOf[JVertx]
      .deployVerticle(scalaVerticleFactory.createVerticle("ScalaTestVerticle2.scala", getClass.getClassLoader), new Handler[AsyncResult[java.lang.String]] {
        override def handle(event: AsyncResult[String]): Unit = promise.success(event.result())
      })

    whenReady(promise.future, defaultPatience) {_ shouldNot be(null)}
  }
}
