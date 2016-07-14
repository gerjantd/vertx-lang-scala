package io.vertx.lang.scala.pump

/**
  * Created by jochen on 13.07.16.
  */
import java.util.ArrayList

import io.vertx.scala.core.streams.{Pump, ReadStream, WriteStream}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * @author <a href="mailto:jochen.mader@codecentric.de">Jochen Mader</a
  */
@RunWith(classOf[JUnitRunner])
class PumpTest extends FlatSpec with Matchers {

  "A Pump" should "be able to pump results between a ReadStream and a WriteStream" in {
    val jrs = new JavaFakeReadStream[MyClass]()
    val jws = new JavaFakeWriteStream[MyClass]()

    val rs = ReadStream(jrs)
    val ws = WriteStream(jws)

    val p = Pump.pump(rs, ws, 1001)

    (0 to 10).foreach(v => {
      p.start()
      val inp = new ArrayList[MyClass]()
      (0 to 10).foreach(v2 => {
        val myClass = new MyClass()
        inp.add(myClass)
        jrs.addData(myClass)
      })
      assert(inp == jws.received)
      assert(!jrs.paused)
      assert(0 == jrs.pauseCount)
      assert(0 == jrs.resumeCount)

      p.stop()
      jws.clearReceived()
      val myClass = new MyClass()
      jrs.addData(myClass)
      assert(0 == jws.received.size())
    })
  }

  "A Pump" should "be pausable" in {
    val jrs = new JavaFakeReadStream[MyClass]()
    val jws = new JavaFakeWriteStream[MyClass]()

    val rs = ReadStream(jrs)
    val ws = WriteStream(jws)
    val p = Pump.pump(rs, ws, 5)
    p.start()

    (0 to 10).foreach(v => {
      p.start()
      val inp = new ArrayList[MyClass]()
      (0 to 3).foreach(v2 => {
        val myClass = new MyClass()
        inp.add(myClass)
        jrs.addData(myClass)
        assert(!jrs.paused)
        assert(v == jrs.pauseCount)
        assert(v == jrs.resumeCount)
      })
      val myClass = new MyClass()
      inp.add(myClass)
      jrs.addData(myClass)
      assert(jrs.paused)
      assert(v + 1 == jrs.pauseCount)
      assert(v == jrs.resumeCount)

      assert(inp == jws.received)
      jws.clearReceived()
      assert(!jrs.paused)
      assert(v + 1 == jrs.pauseCount)
      assert(v + 1 == jrs.resumeCount)
    })
  }

  "testPumpReadStreamNull" should "work" in {
    val rs = new JavaFakeReadStream[MyClass]()
    intercept[NullPointerException] {
      Pump.pump(ReadStream(rs), null)
    }
  }

  "testPumpWriteStreamNull" should "work" in {
    val ws = new JavaFakeWriteStream[MyClass]()
    intercept[NullPointerException] {
      Pump.pump(null, WriteStream(ws))
    }
  }

  "testPumpReadStreamNull2" should "work" in {
    val rs = new JavaFakeReadStream[MyClass]()
    intercept[NullPointerException] {
      Pump.pump(ReadStream(rs), null, 1000)
    }
  }

  "testPumpWriteStreamNull2" should "work" in {
    val ws = new JavaFakeWriteStream[MyClass]()
    intercept[NullPointerException] {
      Pump.pump(null, WriteStream(ws), 1000)
    }
  }

}

class MyClass{
}




