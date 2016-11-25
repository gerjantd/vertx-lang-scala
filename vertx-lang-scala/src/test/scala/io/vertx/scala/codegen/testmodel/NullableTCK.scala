/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.scala.codegen.testmodel

import io.vertx.lang.scala.HandlerOps._
import scala.compat.java8.FunctionConverters._
import scala.collection.JavaConverters._
import io.vertx.codegen.testmodel.{NullableTCK => JNullableTCK}
import io.vertx.codegen.testmodel.{TestDataObject => JTestDataObject}
import io.vertx.codegen.testmodel.{RefedInterface1 => JRefedInterface1}
import io.vertx.core.json.JsonArray
import io.vertx.codegen.testmodel.TestEnum
import io.vertx.core.json.JsonObject
import io.vertx.codegen.testmodel.TestGenEnum

/**
  * The TCK for @Nullable.
  */
class NullableTCK(private val _asJava: JNullableTCK) {

  def asJava: JNullableTCK = _asJava

  def methodWithNonNullableByteParam(param: Byte): Boolean = {
    _asJava.methodWithNonNullableByteParam(param)
  }

  def methodWithNullableByteParam(expectNull: Boolean, param: scala.Option[Byte]): Unit = {
    _asJava.methodWithNullableByteParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableByteHandler(notNull: Boolean, handler: io.vertx.core.Handler[Byte]): Unit = {
    _asJava.methodWithNullableByteHandler(notNull, funcToMappedHandler[java.lang.Byte, Byte](x => x)(handler))
  }

  def methodWithNullableByteHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Byte] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Byte,Byte]((x => x))
    _asJava.methodWithNullableByteHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableByteReturn(notNull: Boolean): scala.Option[Byte] = {
    nullsafeConvToOption(_asJava.methodWithNullableByteReturn(notNull))
  }

  def methodWithNonNullableShortParam(param: Short): Boolean = {
    _asJava.methodWithNonNullableShortParam(param)
  }

  def methodWithNullableShortParam(expectNull: Boolean, param: scala.Option[Short]): Unit = {
    _asJava.methodWithNullableShortParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableShortHandler(notNull: Boolean, handler: io.vertx.core.Handler[Short]): Unit = {
    _asJava.methodWithNullableShortHandler(notNull, funcToMappedHandler[java.lang.Short, Short](x => x)(handler))
  }

  def methodWithNullableShortHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Short] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Short,Short]((x => x))
    _asJava.methodWithNullableShortHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableShortReturn(notNull: Boolean): scala.Option[Short] = {
    nullsafeConvToOption(_asJava.methodWithNullableShortReturn(notNull))
  }

  def methodWithNonNullableIntegerParam(param: Int): Boolean = {
    _asJava.methodWithNonNullableIntegerParam(param)
  }

  def methodWithNullableIntegerParam(expectNull: Boolean, param: scala.Option[Int]): Unit = {
    _asJava.methodWithNullableIntegerParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableIntegerHandler(notNull: Boolean, handler: io.vertx.core.Handler[Int]): Unit = {
    _asJava.methodWithNullableIntegerHandler(notNull, funcToMappedHandler[java.lang.Integer, Int](x => x)(handler))
  }

  def methodWithNullableIntegerHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Int] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Integer,Int]((x => x))
    _asJava.methodWithNullableIntegerHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableIntegerReturn(notNull: Boolean): scala.Option[Int] = {
    nullsafeConvToOption(_asJava.methodWithNullableIntegerReturn(notNull))
  }

  def methodWithNonNullableLongParam(param: Long): Boolean = {
    _asJava.methodWithNonNullableLongParam(param)
  }

  def methodWithNullableLongParam(expectNull: Boolean, param: scala.Option[Long]): Unit = {
    _asJava.methodWithNullableLongParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableLongHandler(notNull: Boolean, handler: io.vertx.core.Handler[Long]): Unit = {
    _asJava.methodWithNullableLongHandler(notNull, funcToMappedHandler[java.lang.Long, Long](x => x)(handler))
  }

  def methodWithNullableLongHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Long] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Long,Long]((x => x))
    _asJava.methodWithNullableLongHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableLongReturn(notNull: Boolean): scala.Option[Long] = {
    nullsafeConvToOption(_asJava.methodWithNullableLongReturn(notNull))
  }

  def methodWithNonNullableFloatParam(param: Float): Boolean = {
    _asJava.methodWithNonNullableFloatParam(param)
  }

  def methodWithNullableFloatParam(expectNull: Boolean, param: scala.Option[Float]): Unit = {
    _asJava.methodWithNullableFloatParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableFloatHandler(notNull: Boolean, handler: io.vertx.core.Handler[Float]): Unit = {
    _asJava.methodWithNullableFloatHandler(notNull, funcToMappedHandler[java.lang.Float, Float](x => x)(handler))
  }

  def methodWithNullableFloatHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Float] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Float,Float]((x => x))
    _asJava.methodWithNullableFloatHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableFloatReturn(notNull: Boolean): scala.Option[Float] = {
    nullsafeConvToOption(_asJava.methodWithNullableFloatReturn(notNull))
  }

  def methodWithNonNullableDoubleParam(param: Double): Boolean = {
    _asJava.methodWithNonNullableDoubleParam(param)
  }

  def methodWithNullableDoubleParam(expectNull: Boolean, param: scala.Option[Double]): Unit = {
    _asJava.methodWithNullableDoubleParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableDoubleHandler(notNull: Boolean, handler: io.vertx.core.Handler[Double]): Unit = {
    _asJava.methodWithNullableDoubleHandler(notNull, funcToMappedHandler[java.lang.Double, Double](x => x)(handler))
  }

  def methodWithNullableDoubleHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Double] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Double,Double]((x => x))
    _asJava.methodWithNullableDoubleHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableDoubleReturn(notNull: Boolean): scala.Option[Double] = {
    nullsafeConvToOption(_asJava.methodWithNullableDoubleReturn(notNull))
  }

  def methodWithNonNullableBooleanParam(param: Boolean): Boolean = {
    _asJava.methodWithNonNullableBooleanParam(param)
  }

  def methodWithNullableBooleanParam(expectNull: Boolean, param: scala.Option[Boolean]): Unit = {
    _asJava.methodWithNullableBooleanParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableBooleanHandler(notNull: Boolean, handler: io.vertx.core.Handler[Boolean]): Unit = {
    _asJava.methodWithNullableBooleanHandler(notNull, funcToMappedHandler[java.lang.Boolean, Boolean](x => x)(handler))
  }

  def methodWithNullableBooleanHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Boolean] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Boolean,Boolean]((x => x))
    _asJava.methodWithNullableBooleanHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableBooleanReturn(notNull: Boolean): scala.Option[Boolean] = {
    nullsafeConvToOption(_asJava.methodWithNullableBooleanReturn(notNull))
  }

  def methodWithNonNullableStringParam(param: String): Boolean = {
    _asJava.methodWithNonNullableStringParam(param)
  }

  def methodWithNullableStringParam(expectNull: Boolean, param: scala.Option[String]): Unit = {
    _asJava.methodWithNullableStringParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableStringHandler(notNull: Boolean, handler: io.vertx.core.Handler[String]): Unit = {
    _asJava.methodWithNullableStringHandler(notNull, (handler))
  }

  def methodWithNullableStringHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[String] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.String,String]((x => x))
    _asJava.methodWithNullableStringHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableStringReturn(notNull: Boolean): scala.Option[String] = {
    scala.Option(_asJava.methodWithNullableStringReturn(notNull))
  }

  def methodWithNonNullableCharParam(param: Char): Boolean = {
    _asJava.methodWithNonNullableCharParam(param)
  }

  def methodWithNullableCharParam(expectNull: Boolean, param: scala.Option[Char]): Unit = {
    _asJava.methodWithNullableCharParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableCharHandler(notNull: Boolean, handler: io.vertx.core.Handler[Char]): Unit = {
    _asJava.methodWithNullableCharHandler(notNull, funcToMappedHandler[java.lang.Character, Char](x => x)(handler))
  }

  def methodWithNullableCharHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Char] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.Character,Char]((x => x))
    _asJava.methodWithNullableCharHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableCharReturn(notNull: Boolean): scala.Option[Char] = {
    nullsafeConvToOption(_asJava.methodWithNullableCharReturn(notNull))
  }

  def methodWithNonNullableJsonObjectParam(param: JsonObject): Boolean = {
    _asJava.methodWithNonNullableJsonObjectParam(param)
  }

  def methodWithNullableJsonObjectParam(expectNull: Boolean, param: scala.Option[JsonObject]): Unit = {
    _asJava.methodWithNullableJsonObjectParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableJsonObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[JsonObject]): Unit = {
    _asJava.methodWithNullableJsonObjectHandler(notNull, (handler))
  }

  def methodWithNullableJsonObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[JsonObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JsonObject,JsonObject]((x => x))
    _asJava.methodWithNullableJsonObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableJsonObjectReturn(notNull: Boolean): scala.Option[JsonObject] = {
    scala.Option(_asJava.methodWithNullableJsonObjectReturn(notNull))
  }

  def methodWithNonNullableJsonArrayParam(param: JsonArray): Boolean = {
    _asJava.methodWithNonNullableJsonArrayParam(param)
  }

  def methodWithNullableJsonArrayParam(expectNull: Boolean, param: scala.Option[JsonArray]): Unit = {
    _asJava.methodWithNullableJsonArrayParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableJsonArrayHandler(notNull: Boolean, handler: io.vertx.core.Handler[JsonArray]): Unit = {
    _asJava.methodWithNullableJsonArrayHandler(notNull, (handler))
  }

  def methodWithNullableJsonArrayHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[JsonArray] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JsonArray,JsonArray]((x => x))
    _asJava.methodWithNullableJsonArrayHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableJsonArrayReturn(notNull: Boolean): scala.Option[JsonArray] = {
    scala.Option(_asJava.methodWithNullableJsonArrayReturn(notNull))
  }

  def methodWithNonNullableApiParam(param: RefedInterface1): Boolean = {
    _asJava.methodWithNonNullableApiParam(param.asJava.asInstanceOf[JRefedInterface1])
  }

  def methodWithNullableApiParam(expectNull: Boolean, param: scala.Option[RefedInterface1]): Unit = {
    _asJava.methodWithNullableApiParam(expectNull, (if (param.isDefined) param.get.asJava else null))
  }

  def methodWithNullableApiHandler(notNull: Boolean, handler: io.vertx.core.Handler[RefedInterface1]): Unit = {
    _asJava.methodWithNullableApiHandler(notNull, funcToMappedHandler(RefedInterface1.apply)(handler))
  }

  def methodWithNullableApiHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[RefedInterface1] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JRefedInterface1,RefedInterface1]((x => if (x == null) null else RefedInterface1.apply(x)))
    _asJava.methodWithNullableApiHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableApiReturn(notNull: Boolean): scala.Option[RefedInterface1] = {
    scala.Option(RefedInterface1.apply(_asJava.methodWithNullableApiReturn(notNull)))
  }

  def methodWithNonNullableDataObjectParam(param: TestDataObject): Boolean = {
    _asJava.methodWithNonNullableDataObjectParam(param.asJava)
  }

  def methodWithNullableDataObjectParam(expectNull: Boolean, param: scala.Option[TestDataObject]): Unit = {
    _asJava.methodWithNullableDataObjectParam(expectNull, (if (param.isDefined) param.get.asJava else null))
  }

  def methodWithNullableDataObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[TestDataObject]): Unit = {
    _asJava.methodWithNullableDataObjectHandler(notNull, funcToMappedHandler[JTestDataObject, TestDataObject](a => TestDataObject(a))(handler))
  }

  def methodWithNullableDataObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[TestDataObject] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[JTestDataObject,TestDataObject]((x => io.vertx.scala.codegen.testmodel.TestDataObject(x)))
    _asJava.methodWithNullableDataObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableDataObjectReturn(notNull: Boolean): scala.Option[TestDataObject] = {
    scala.Option(TestDataObject(_asJava.methodWithNullableDataObjectReturn(notNull)))
  }

  def methodWithNonNullableEnumParam(param: io.vertx.codegen.testmodel.TestEnum): Boolean = {
    _asJava.methodWithNonNullableEnumParam(param)
  }

  def methodWithNullableEnumParam(expectNull: Boolean, param: scala.Option[io.vertx.codegen.testmodel.TestEnum]): Unit = {
    _asJava.methodWithNullableEnumParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[io.vertx.codegen.testmodel.TestEnum]): Unit = {
    _asJava.methodWithNullableEnumHandler(notNull, (handler))
  }

  def methodWithNullableEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[io.vertx.codegen.testmodel.TestEnum] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[TestEnum,io.vertx.codegen.testmodel.TestEnum]((x => x))
    _asJava.methodWithNullableEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableEnumReturn(notNull: Boolean): scala.Option[io.vertx.codegen.testmodel.TestEnum] = {
    scala.Option(_asJava.methodWithNullableEnumReturn(notNull))
  }

  def methodWithNonNullableGenEnumParam(param: io.vertx.codegen.testmodel.TestGenEnum): Boolean = {
    _asJava.methodWithNonNullableGenEnumParam(param)
  }

  def methodWithNullableGenEnumParam(expectNull: Boolean, param: scala.Option[io.vertx.codegen.testmodel.TestGenEnum]): Unit = {
    _asJava.methodWithNullableGenEnumParam(expectNull, (if (param.isDefined) param.get else null))
  }

  def methodWithNullableGenEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[io.vertx.codegen.testmodel.TestGenEnum]): Unit = {
    _asJava.methodWithNullableGenEnumHandler(notNull, (handler))
  }

  def methodWithNullableGenEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[io.vertx.codegen.testmodel.TestGenEnum] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[TestGenEnum,io.vertx.codegen.testmodel.TestGenEnum]((x => x))
    _asJava.methodWithNullableGenEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableGenEnumReturn(notNull: Boolean): scala.Option[io.vertx.codegen.testmodel.TestGenEnum] = {
    scala.Option(_asJava.methodWithNullableGenEnumReturn(notNull))
  }

  def methodWithNullableTypeVariableParam[T](expectNull: Boolean, param: T): Unit = {
    _asJava.methodWithNullableTypeVariableParam(expectNull, param)
  }

  def methodWithNullableTypeVariableHandler[T](notNull: Boolean, value: T, handler: io.vertx.core.Handler[T]): Unit = {
    _asJava.methodWithNullableTypeVariableHandler(notNull, value, (handler))
  }

  def methodWithNullableTypeVariableHandlerAsyncResultFuture[T](notNull: Boolean, value: T): concurrent.Future[T] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[T,T]((x => x))
    _asJava.methodWithNullableTypeVariableHandlerAsyncResult(notNull, value, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableTypeVariableReturn[T](notNull: Boolean, value: T): T = {
    _asJava.methodWithNullableTypeVariableReturn(notNull, value)
  }

  def methodWithNullableObjectParam(expectNull: Boolean, param: AnyRef): Unit = {
    _asJava.methodWithNullableObjectParam(expectNull, param)
  }

  def methodWithNonNullableListByteParam(param: scala.collection.mutable.Buffer[Byte]): Boolean = {
    _asJava.methodWithNonNullableListByteParam(param.map(x => x:java.lang.Byte).asJava)
  }

  def methodWithNullableListByteParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Byte]]): Unit = {
    _asJava.methodWithNullableListByteParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Byte).asJava else null)
  }

  def methodWithNullableListByteHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Byte]]): Unit = {
    _asJava.methodWithNullableListByteHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Byte], scala.collection.mutable.Buffer[Byte]](x => if (x != null) x.asScala.map(x => x:Byte) else null)(handler))
  }

  def methodWithNullableListByteHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Byte],scala.collection.mutable.Buffer[Byte]]((x => if (x == null) null else x.asScala.map(x => x:Byte)))
    _asJava.methodWithNullableListByteHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListByteReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Byte]] = {
    scala.Option(_asJava.methodWithNullableListByteReturn(notNull)).map(_.asScala.map(x => x:Byte))
  }

  def methodWithNonNullableListShortParam(param: scala.collection.mutable.Buffer[Short]): Boolean = {
    _asJava.methodWithNonNullableListShortParam(param.map(x => x:java.lang.Short).asJava)
  }

  def methodWithNullableListShortParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Short]]): Unit = {
    _asJava.methodWithNullableListShortParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Short).asJava else null)
  }

  def methodWithNullableListShortHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Short]]): Unit = {
    _asJava.methodWithNullableListShortHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Short], scala.collection.mutable.Buffer[Short]](x => if (x != null) x.asScala.map(x => x:Short) else null)(handler))
  }

  def methodWithNullableListShortHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Short],scala.collection.mutable.Buffer[Short]]((x => if (x == null) null else x.asScala.map(x => x:Short)))
    _asJava.methodWithNullableListShortHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListShortReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Short]] = {
    scala.Option(_asJava.methodWithNullableListShortReturn(notNull)).map(_.asScala.map(x => x:Short))
  }

  def methodWithNonNullableListIntegerParam(param: scala.collection.mutable.Buffer[Int]): Boolean = {
    _asJava.methodWithNonNullableListIntegerParam(param.map(x => x:java.lang.Integer).asJava)
  }

  def methodWithNullableListIntegerParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Int]]): Unit = {
    _asJava.methodWithNullableListIntegerParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Integer).asJava else null)
  }

  def methodWithNullableListIntegerHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Int]]): Unit = {
    _asJava.methodWithNullableListIntegerHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Integer], scala.collection.mutable.Buffer[Int]](x => if (x != null) x.asScala.map(x => x:Int) else null)(handler))
  }

  def methodWithNullableListIntegerHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Integer],scala.collection.mutable.Buffer[Int]]((x => if (x == null) null else x.asScala.map(x => x:Int)))
    _asJava.methodWithNullableListIntegerHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListIntegerReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Int]] = {
    scala.Option(_asJava.methodWithNullableListIntegerReturn(notNull)).map(_.asScala.map(x => x:Int))
  }

  def methodWithNonNullableListLongParam(param: scala.collection.mutable.Buffer[Long]): Boolean = {
    _asJava.methodWithNonNullableListLongParam(param.map(x => x:java.lang.Long).asJava)
  }

  def methodWithNullableListLongParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Long]]): Unit = {
    _asJava.methodWithNullableListLongParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Long).asJava else null)
  }

  def methodWithNullableListLongHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Long]]): Unit = {
    _asJava.methodWithNullableListLongHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Long], scala.collection.mutable.Buffer[Long]](x => if (x != null) x.asScala.map(x => x:Long) else null)(handler))
  }

  def methodWithNullableListLongHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Long],scala.collection.mutable.Buffer[Long]]((x => if (x == null) null else x.asScala.map(x => x:Long)))
    _asJava.methodWithNullableListLongHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListLongReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Long]] = {
    scala.Option(_asJava.methodWithNullableListLongReturn(notNull)).map(_.asScala.map(x => x:Long))
  }

  def methodWithNonNullableListFloatParam(param: scala.collection.mutable.Buffer[Float]): Boolean = {
    _asJava.methodWithNonNullableListFloatParam(param.map(x => x:java.lang.Float).asJava)
  }

  def methodWithNullableListFloatParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Float]]): Unit = {
    _asJava.methodWithNullableListFloatParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Float).asJava else null)
  }

  def methodWithNullableListFloatHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Float]]): Unit = {
    _asJava.methodWithNullableListFloatHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Float], scala.collection.mutable.Buffer[Float]](x => if (x != null) x.asScala.map(x => x:Float) else null)(handler))
  }

  def methodWithNullableListFloatHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Float],scala.collection.mutable.Buffer[Float]]((x => if (x == null) null else x.asScala.map(x => x:Float)))
    _asJava.methodWithNullableListFloatHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListFloatReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Float]] = {
    scala.Option(_asJava.methodWithNullableListFloatReturn(notNull)).map(_.asScala.map(x => x:Float))
  }

  def methodWithNonNullableListDoubleParam(param: scala.collection.mutable.Buffer[Double]): Boolean = {
    _asJava.methodWithNonNullableListDoubleParam(param.map(x => x:java.lang.Double).asJava)
  }

  def methodWithNullableListDoubleParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Double]]): Unit = {
    _asJava.methodWithNullableListDoubleParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Double).asJava else null)
  }

  def methodWithNullableListDoubleHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Double]]): Unit = {
    _asJava.methodWithNullableListDoubleHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Double], scala.collection.mutable.Buffer[Double]](x => if (x != null) x.asScala.map(x => x:Double) else null)(handler))
  }

  def methodWithNullableListDoubleHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Double],scala.collection.mutable.Buffer[Double]]((x => if (x == null) null else x.asScala.map(x => x:Double)))
    _asJava.methodWithNullableListDoubleHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListDoubleReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Double]] = {
    scala.Option(_asJava.methodWithNullableListDoubleReturn(notNull)).map(_.asScala.map(x => x:Double))
  }

  def methodWithNonNullableListBooleanParam(param: scala.collection.mutable.Buffer[Boolean]): Boolean = {
    _asJava.methodWithNonNullableListBooleanParam(param.map(x => x:java.lang.Boolean).asJava)
  }

  def methodWithNullableListBooleanParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Boolean]]): Unit = {
    _asJava.methodWithNullableListBooleanParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Boolean).asJava else null)
  }

  def methodWithNullableListBooleanHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Boolean]]): Unit = {
    _asJava.methodWithNullableListBooleanHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Boolean], scala.collection.mutable.Buffer[Boolean]](x => if (x != null) x.asScala.map(x => x:Boolean) else null)(handler))
  }

  def methodWithNullableListBooleanHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Boolean],scala.collection.mutable.Buffer[Boolean]]((x => if (x == null) null else x.asScala.map(x => x:Boolean)))
    _asJava.methodWithNullableListBooleanHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListBooleanReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Boolean]] = {
    scala.Option(_asJava.methodWithNullableListBooleanReturn(notNull)).map(_.asScala.map(x => x:Boolean))
  }

  def methodWithNonNullableListStringParam(param: scala.collection.mutable.Buffer[String]): Boolean = {
    _asJava.methodWithNonNullableListStringParam(param.map(x => x:java.lang.String).asJava)
  }

  def methodWithNullableListStringParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[String]]): Unit = {
    _asJava.methodWithNullableListStringParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.String).asJava else null)
  }

  def methodWithNullableListStringHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[String]]): Unit = {
    _asJava.methodWithNullableListStringHandler(notNull, funcToMappedHandler[java.util.List[java.lang.String], scala.collection.mutable.Buffer[String]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithNullableListStringHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.String],scala.collection.mutable.Buffer[String]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithNullableListStringHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListStringReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[String]] = {
    scala.Option(_asJava.methodWithNullableListStringReturn(notNull)).map(_.asScala.map(x => x:String))
  }

  def methodWithNonNullableListCharParam(param: scala.collection.mutable.Buffer[Char]): Boolean = {
    _asJava.methodWithNonNullableListCharParam(param.map(x => x:java.lang.Character).asJava)
  }

  def methodWithNullableListCharParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[Char]]): Unit = {
    _asJava.methodWithNullableListCharParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Character).asJava else null)
  }

  def methodWithNullableListCharHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Char]]): Unit = {
    _asJava.methodWithNullableListCharHandler(notNull, funcToMappedHandler[java.util.List[java.lang.Character], scala.collection.mutable.Buffer[Char]](x => if (x != null) x.asScala.map(x => x:Char) else null)(handler))
  }

  def methodWithNullableListCharHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Character],scala.collection.mutable.Buffer[Char]]((x => if (x == null) null else x.asScala.map(x => x:Char)))
    _asJava.methodWithNullableListCharHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListCharReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[Char]] = {
    scala.Option(_asJava.methodWithNullableListCharReturn(notNull)).map(_.asScala.map(x => x:Char))
  }

  def methodWithNonNullableListJsonObjectParam(param: scala.collection.mutable.Buffer[JsonObject]): Boolean = {
    _asJava.methodWithNonNullableListJsonObjectParam(param.map(x => x:io.vertx.core.json.JsonObject).asJava)
  }

  def methodWithNullableListJsonObjectParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[JsonObject]]): Unit = {
    _asJava.methodWithNullableListJsonObjectParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.core.json.JsonObject).asJava else null)
  }

  def methodWithNullableListJsonObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[JsonObject]]): Unit = {
    _asJava.methodWithNullableListJsonObjectHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.core.json.JsonObject], scala.collection.mutable.Buffer[JsonObject]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithNullableListJsonObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.core.json.JsonObject],scala.collection.mutable.Buffer[JsonObject]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithNullableListJsonObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListJsonObjectReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[JsonObject]] = {
    scala.Option(_asJava.methodWithNullableListJsonObjectReturn(notNull)).map(_.asScala.map(x => x:JsonObject))
  }

  def methodWithNonNullableListJsonArrayParam(param: scala.collection.mutable.Buffer[JsonArray]): Boolean = {
    _asJava.methodWithNonNullableListJsonArrayParam(param.map(x => x:io.vertx.core.json.JsonArray).asJava)
  }

  def methodWithNullableListJsonArrayParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[JsonArray]]): Unit = {
    _asJava.methodWithNullableListJsonArrayParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.core.json.JsonArray).asJava else null)
  }

  def methodWithNullableListJsonArrayHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[JsonArray]]): Unit = {
    _asJava.methodWithNullableListJsonArrayHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.core.json.JsonArray], scala.collection.mutable.Buffer[JsonArray]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithNullableListJsonArrayHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.core.json.JsonArray],scala.collection.mutable.Buffer[JsonArray]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithNullableListJsonArrayHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListJsonArrayReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[JsonArray]] = {
    scala.Option(_asJava.methodWithNullableListJsonArrayReturn(notNull)).map(_.asScala.map(x => x:JsonArray))
  }

  def methodWithNonNullableListApiParam(param: scala.collection.mutable.Buffer[RefedInterface1]): Boolean = {
    _asJava.methodWithNonNullableListApiParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithNullableListApiParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[RefedInterface1]]): Unit = {
    _asJava.methodWithNullableListApiParam(expectNull, if (param.isDefined) param.get.map(x => if (x == null) null else x.asJava).asJava else null)
  }

  def methodWithNullableListApiHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[RefedInterface1]]): Unit = {
    _asJava.methodWithNullableListApiHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.RefedInterface1], scala.collection.mutable.Buffer[RefedInterface1]](x => if (x != null) x.asScala.map(RefedInterface1.apply) else null)(handler))
  }

  def methodWithNullableListApiHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.RefedInterface1],scala.collection.mutable.Buffer[RefedInterface1]]((x => if (x == null) null else x.asScala.map(RefedInterface1.apply)))
    _asJava.methodWithNullableListApiHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListApiReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[RefedInterface1]] = {
    scala.Option(_asJava.methodWithNullableListApiReturn(notNull)).map(_.asScala.map(RefedInterface1.apply))
  }

  def methodWithNonNullableListDataObjectParam(param: scala.collection.mutable.Buffer[TestDataObject]): Boolean = {
    _asJava.methodWithNonNullableListDataObjectParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithNullableListDataObjectParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[TestDataObject]]): Unit = {
    _asJava.methodWithNullableListDataObjectParam(expectNull, if (param.isDefined) param.get.map(x => if (x == null) null else x.asJava).asJava else null)
  }

  def methodWithNullableListDataObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[TestDataObject]]): Unit = {
    _asJava.methodWithNullableListDataObjectHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestDataObject], scala.collection.mutable.Buffer[TestDataObject]](x => if (x != null) x.asScala.map(x => TestDataObject(x)) else null)(handler))
  }

  def methodWithNullableListDataObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestDataObject],scala.collection.mutable.Buffer[TestDataObject]]((x => if (x == null) null else x.asScala.map(x => TestDataObject(x))))
    _asJava.methodWithNullableListDataObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListDataObjectReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[TestDataObject]] = {
    scala.Option(_asJava.methodWithNullableListDataObjectReturn(notNull)).map(_.asScala.map(x => TestDataObject(x)))
  }

  def methodWithNonNullableListEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]): Boolean = {
    _asJava.methodWithNonNullableListEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava)
  }

  def methodWithNullableListEnumParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithNullableListEnumParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava else null)
  }

  def methodWithNullableListEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithNullableListEnumHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithNullableListEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithNullableListEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListEnumReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    scala.Option(_asJava.methodWithNullableListEnumReturn(notNull)).map(_.asScala.map(x => x:io.vertx.codegen.testmodel.TestEnum))
  }

  def methodWithNonNullableListGenEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]): Boolean = {
    _asJava.methodWithNonNullableListGenEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava)
  }

  def methodWithNullableListGenEnumParam(expectNull: Boolean, param: scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithNullableListGenEnumParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava else null)
  }

  def methodWithNullableListGenEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithNullableListGenEnumHandler(notNull, funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestGenEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithNullableListGenEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestGenEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithNullableListGenEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableListGenEnumReturn(notNull: Boolean): scala.Option[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    scala.Option(_asJava.methodWithNullableListGenEnumReturn(notNull)).map(_.asScala.map(x => x:io.vertx.codegen.testmodel.TestGenEnum))
  }

  def methodWithNonNullableSetByteParam(param: Set[Byte]): Boolean = {
    _asJava.methodWithNonNullableSetByteParam(param.map(x => x:java.lang.Byte).asJava)
  }

  def methodWithNullableSetByteParam(expectNull: Boolean, param: scala.Option[Set[Byte]]): Unit = {
    _asJava.methodWithNullableSetByteParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Byte).asJava else null)
  }

  def methodWithNullableSetByteHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Byte]]): Unit = {
    _asJava.methodWithNullableSetByteHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Byte], Set[Byte]](x => if (x != null) x.asScala.map(x => x:Byte).toSet else null)(handler))
  }

  def methodWithNullableSetByteHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Byte],Set[Byte]]((x => if (x == null) null else x.asScala.map(x => x:Byte).toSet))
    _asJava.methodWithNullableSetByteHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetByteReturn(notNull: Boolean): scala.Option[Set[Byte]] = {
    scala.Option(_asJava.methodWithNullableSetByteReturn(notNull)).map(_.asScala.map(x => x:Byte).toSet)
  }

  def methodWithNonNullableSetShortParam(param: Set[Short]): Boolean = {
    _asJava.methodWithNonNullableSetShortParam(param.map(x => x:java.lang.Short).asJava)
  }

  def methodWithNullableSetShortParam(expectNull: Boolean, param: scala.Option[Set[Short]]): Unit = {
    _asJava.methodWithNullableSetShortParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Short).asJava else null)
  }

  def methodWithNullableSetShortHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Short]]): Unit = {
    _asJava.methodWithNullableSetShortHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Short], Set[Short]](x => if (x != null) x.asScala.map(x => x:Short).toSet else null)(handler))
  }

  def methodWithNullableSetShortHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Short],Set[Short]]((x => if (x == null) null else x.asScala.map(x => x:Short).toSet))
    _asJava.methodWithNullableSetShortHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetShortReturn(notNull: Boolean): scala.Option[Set[Short]] = {
    scala.Option(_asJava.methodWithNullableSetShortReturn(notNull)).map(_.asScala.map(x => x:Short).toSet)
  }

  def methodWithNonNullableSetIntegerParam(param: Set[Int]): Boolean = {
    _asJava.methodWithNonNullableSetIntegerParam(param.map(x => x:java.lang.Integer).asJava)
  }

  def methodWithNullableSetIntegerParam(expectNull: Boolean, param: scala.Option[Set[Int]]): Unit = {
    _asJava.methodWithNullableSetIntegerParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Integer).asJava else null)
  }

  def methodWithNullableSetIntegerHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Int]]): Unit = {
    _asJava.methodWithNullableSetIntegerHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Integer], Set[Int]](x => if (x != null) x.asScala.map(x => x:Int).toSet else null)(handler))
  }

  def methodWithNullableSetIntegerHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Integer],Set[Int]]((x => if (x == null) null else x.asScala.map(x => x:Int).toSet))
    _asJava.methodWithNullableSetIntegerHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetIntegerReturn(notNull: Boolean): scala.Option[Set[Int]] = {
    scala.Option(_asJava.methodWithNullableSetIntegerReturn(notNull)).map(_.asScala.map(x => x:Int).toSet)
  }

  def methodWithNonNullableSetLongParam(param: Set[Long]): Boolean = {
    _asJava.methodWithNonNullableSetLongParam(param.map(x => x:java.lang.Long).asJava)
  }

  def methodWithNullableSetLongParam(expectNull: Boolean, param: scala.Option[Set[Long]]): Unit = {
    _asJava.methodWithNullableSetLongParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Long).asJava else null)
  }

  def methodWithNullableSetLongHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Long]]): Unit = {
    _asJava.methodWithNullableSetLongHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Long], Set[Long]](x => if (x != null) x.asScala.map(x => x:Long).toSet else null)(handler))
  }

  def methodWithNullableSetLongHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Long],Set[Long]]((x => if (x == null) null else x.asScala.map(x => x:Long).toSet))
    _asJava.methodWithNullableSetLongHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetLongReturn(notNull: Boolean): scala.Option[Set[Long]] = {
    scala.Option(_asJava.methodWithNullableSetLongReturn(notNull)).map(_.asScala.map(x => x:Long).toSet)
  }

  def methodWithNonNullableSetFloatParam(param: Set[Float]): Boolean = {
    _asJava.methodWithNonNullableSetFloatParam(param.map(x => x:java.lang.Float).asJava)
  }

  def methodWithNullableSetFloatParam(expectNull: Boolean, param: scala.Option[Set[Float]]): Unit = {
    _asJava.methodWithNullableSetFloatParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Float).asJava else null)
  }

  def methodWithNullableSetFloatHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Float]]): Unit = {
    _asJava.methodWithNullableSetFloatHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Float], Set[Float]](x => if (x != null) x.asScala.map(x => x:Float).toSet else null)(handler))
  }

  def methodWithNullableSetFloatHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Float],Set[Float]]((x => if (x == null) null else x.asScala.map(x => x:Float).toSet))
    _asJava.methodWithNullableSetFloatHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetFloatReturn(notNull: Boolean): scala.Option[Set[Float]] = {
    scala.Option(_asJava.methodWithNullableSetFloatReturn(notNull)).map(_.asScala.map(x => x:Float).toSet)
  }

  def methodWithNonNullableSetDoubleParam(param: Set[Double]): Boolean = {
    _asJava.methodWithNonNullableSetDoubleParam(param.map(x => x:java.lang.Double).asJava)
  }

  def methodWithNullableSetDoubleParam(expectNull: Boolean, param: scala.Option[Set[Double]]): Unit = {
    _asJava.methodWithNullableSetDoubleParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Double).asJava else null)
  }

  def methodWithNullableSetDoubleHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Double]]): Unit = {
    _asJava.methodWithNullableSetDoubleHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Double], Set[Double]](x => if (x != null) x.asScala.map(x => x:Double).toSet else null)(handler))
  }

  def methodWithNullableSetDoubleHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Double],Set[Double]]((x => if (x == null) null else x.asScala.map(x => x:Double).toSet))
    _asJava.methodWithNullableSetDoubleHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetDoubleReturn(notNull: Boolean): scala.Option[Set[Double]] = {
    scala.Option(_asJava.methodWithNullableSetDoubleReturn(notNull)).map(_.asScala.map(x => x:Double).toSet)
  }

  def methodWithNonNullableSetBooleanParam(param: Set[Boolean]): Boolean = {
    _asJava.methodWithNonNullableSetBooleanParam(param.map(x => x:java.lang.Boolean).asJava)
  }

  def methodWithNullableSetBooleanParam(expectNull: Boolean, param: scala.Option[Set[Boolean]]): Unit = {
    _asJava.methodWithNullableSetBooleanParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Boolean).asJava else null)
  }

  def methodWithNullableSetBooleanHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Boolean]]): Unit = {
    _asJava.methodWithNullableSetBooleanHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Boolean], Set[Boolean]](x => if (x != null) x.asScala.map(x => x:Boolean).toSet else null)(handler))
  }

  def methodWithNullableSetBooleanHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Boolean],Set[Boolean]]((x => if (x == null) null else x.asScala.map(x => x:Boolean).toSet))
    _asJava.methodWithNullableSetBooleanHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetBooleanReturn(notNull: Boolean): scala.Option[Set[Boolean]] = {
    scala.Option(_asJava.methodWithNullableSetBooleanReturn(notNull)).map(_.asScala.map(x => x:Boolean).toSet)
  }

  def methodWithNonNullableSetStringParam(param: Set[String]): Boolean = {
    _asJava.methodWithNonNullableSetStringParam(param.map(x => x:java.lang.String).asJava)
  }

  def methodWithNullableSetStringParam(expectNull: Boolean, param: scala.Option[Set[String]]): Unit = {
    _asJava.methodWithNullableSetStringParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.String).asJava else null)
  }

  def methodWithNullableSetStringHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[String]]): Unit = {
    _asJava.methodWithNullableSetStringHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.String], Set[String]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithNullableSetStringHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.String],Set[String]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithNullableSetStringHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetStringReturn(notNull: Boolean): scala.Option[Set[String]] = {
    scala.Option(_asJava.methodWithNullableSetStringReturn(notNull)).map(_.asScala.map(x => x:String).toSet)
  }

  def methodWithNonNullableSetCharParam(param: Set[Char]): Boolean = {
    _asJava.methodWithNonNullableSetCharParam(param.map(x => x:java.lang.Character).asJava)
  }

  def methodWithNullableSetCharParam(expectNull: Boolean, param: scala.Option[Set[Char]]): Unit = {
    _asJava.methodWithNullableSetCharParam(expectNull, if (param.isDefined) param.get.map(x => x:java.lang.Character).asJava else null)
  }

  def methodWithNullableSetCharHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[Char]]): Unit = {
    _asJava.methodWithNullableSetCharHandler(notNull, funcToMappedHandler[java.util.Set[java.lang.Character], Set[Char]](x => if (x != null) x.asScala.map(x => x:Char).toSet else null)(handler))
  }

  def methodWithNullableSetCharHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Character],Set[Char]]((x => if (x == null) null else x.asScala.map(x => x:Char).toSet))
    _asJava.methodWithNullableSetCharHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetCharReturn(notNull: Boolean): scala.Option[Set[Char]] = {
    scala.Option(_asJava.methodWithNullableSetCharReturn(notNull)).map(_.asScala.map(x => x:Char).toSet)
  }

  def methodWithNonNullableSetJsonObjectParam(param: Set[JsonObject]): Boolean = {
    _asJava.methodWithNonNullableSetJsonObjectParam(param.map(x => x:io.vertx.core.json.JsonObject).asJava)
  }

  def methodWithNullableSetJsonObjectParam(expectNull: Boolean, param: scala.Option[Set[JsonObject]]): Unit = {
    _asJava.methodWithNullableSetJsonObjectParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.core.json.JsonObject).asJava else null)
  }

  def methodWithNullableSetJsonObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[JsonObject]]): Unit = {
    _asJava.methodWithNullableSetJsonObjectHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.core.json.JsonObject], Set[JsonObject]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithNullableSetJsonObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.core.json.JsonObject],Set[JsonObject]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithNullableSetJsonObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetJsonObjectReturn(notNull: Boolean): scala.Option[Set[JsonObject]] = {
    scala.Option(_asJava.methodWithNullableSetJsonObjectReturn(notNull)).map(_.asScala.map(x => x:JsonObject).toSet)
  }

  def methodWithNonNullableSetJsonArrayParam(param: Set[JsonArray]): Boolean = {
    _asJava.methodWithNonNullableSetJsonArrayParam(param.map(x => x:io.vertx.core.json.JsonArray).asJava)
  }

  def methodWithNullableSetJsonArrayParam(expectNull: Boolean, param: scala.Option[Set[JsonArray]]): Unit = {
    _asJava.methodWithNullableSetJsonArrayParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.core.json.JsonArray).asJava else null)
  }

  def methodWithNullableSetJsonArrayHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[JsonArray]]): Unit = {
    _asJava.methodWithNullableSetJsonArrayHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.core.json.JsonArray], Set[JsonArray]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithNullableSetJsonArrayHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.core.json.JsonArray],Set[JsonArray]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithNullableSetJsonArrayHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetJsonArrayReturn(notNull: Boolean): scala.Option[Set[JsonArray]] = {
    scala.Option(_asJava.methodWithNullableSetJsonArrayReturn(notNull)).map(_.asScala.map(x => x:JsonArray).toSet)
  }

  def methodWithNonNullableSetApiParam(param: Set[RefedInterface1]): Boolean = {
    _asJava.methodWithNonNullableSetApiParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithNullableSetApiParam(expectNull: Boolean, param: scala.Option[Set[RefedInterface1]]): Unit = {
    _asJava.methodWithNullableSetApiParam(expectNull, if (param.isDefined) param.get.map(x => if (x == null) null else x.asJava).asJava else null)
  }

  def methodWithNullableSetApiHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[RefedInterface1]]): Unit = {
    _asJava.methodWithNullableSetApiHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.RefedInterface1], Set[RefedInterface1]](x => if (x != null) x.asScala.map(RefedInterface1.apply).toSet else null)(handler))
  }

  def methodWithNullableSetApiHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.RefedInterface1],Set[RefedInterface1]]((x => if (x == null) null else x.asScala.map(RefedInterface1.apply).toSet))
    _asJava.methodWithNullableSetApiHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetApiReturn(notNull: Boolean): scala.Option[Set[RefedInterface1]] = {
    scala.Option(_asJava.methodWithNullableSetApiReturn(notNull)).map(_.asScala.map(RefedInterface1.apply).toSet)
  }

  def methodWithNonNullableSetDataObjectParam(param: Set[TestDataObject]): Boolean = {
    _asJava.methodWithNonNullableSetDataObjectParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithNullableSetDataObjectParam(expectNull: Boolean, param: scala.Option[Set[TestDataObject]]): Unit = {
    _asJava.methodWithNullableSetDataObjectParam(expectNull, if (param.isDefined) param.get.map(x => if (x == null) null else x.asJava).asJava else null)
  }

  def methodWithNullableSetDataObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[TestDataObject]]): Unit = {
    _asJava.methodWithNullableSetDataObjectHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestDataObject], Set[TestDataObject]](x => if (x != null) x.asScala.map(x => TestDataObject(x)).toSet else null)(handler))
  }

  def methodWithNullableSetDataObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestDataObject],Set[TestDataObject]]((x => if (x == null) null else x.asScala.map(x => TestDataObject(x)).toSet))
    _asJava.methodWithNullableSetDataObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetDataObjectReturn(notNull: Boolean): scala.Option[Set[TestDataObject]] = {
    scala.Option(_asJava.methodWithNullableSetDataObjectReturn(notNull)).map(_.asScala.map(x => TestDataObject(x)).toSet)
  }

  def methodWithNonNullableSetEnumParam(param: Set[io.vertx.codegen.testmodel.TestEnum]): Boolean = {
    _asJava.methodWithNonNullableSetEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava)
  }

  def methodWithNullableSetEnumParam(expectNull: Boolean, param: scala.Option[Set[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithNullableSetEnumParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava else null)
  }

  def methodWithNullableSetEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithNullableSetEnumHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestEnum], Set[io.vertx.codegen.testmodel.TestEnum]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithNullableSetEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestEnum],Set[io.vertx.codegen.testmodel.TestEnum]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithNullableSetEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetEnumReturn(notNull: Boolean): scala.Option[Set[io.vertx.codegen.testmodel.TestEnum]] = {
    scala.Option(_asJava.methodWithNullableSetEnumReturn(notNull)).map(_.asScala.map(x => x:io.vertx.codegen.testmodel.TestEnum).toSet)
  }

  def methodWithNonNullableSetGenEnumParam(param: Set[io.vertx.codegen.testmodel.TestGenEnum]): Boolean = {
    _asJava.methodWithNonNullableSetGenEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava)
  }

  def methodWithNullableSetGenEnumParam(expectNull: Boolean, param: scala.Option[Set[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithNullableSetGenEnumParam(expectNull, if (param.isDefined) param.get.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava else null)
  }

  def methodWithNullableSetGenEnumHandler(notNull: Boolean, handler: io.vertx.core.Handler[Set[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithNullableSetGenEnumHandler(notNull, funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestGenEnum], Set[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithNullableSetGenEnumHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestGenEnum],Set[io.vertx.codegen.testmodel.TestGenEnum]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithNullableSetGenEnumHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableSetGenEnumReturn(notNull: Boolean): scala.Option[Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    scala.Option(_asJava.methodWithNullableSetGenEnumReturn(notNull)).map(_.asScala.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).toSet)
  }

  def methodWithNonNullableMapByteParam(param: Map[String, Byte]): Boolean = {
    _asJava.methodWithNonNullableMapByteParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Byte)).asJava)
  }

  def methodWithNullableMapByteParam(expectNull: Boolean, param: scala.Option[Map[String, Byte]]): Unit = {
    _asJava.methodWithNullableMapByteParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Byte)).asJava else null)
  }

  def methodWithNullableMapByteHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Byte]]): Unit = {
    _asJava.methodWithNullableMapByteHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Byte], Map[String, Byte]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Byte)).toMap else null)(handler))
  }

  def methodWithNullableMapByteHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Byte],Map[String, Byte]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Byte)).toMap))
    _asJava.methodWithNullableMapByteHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapByteReturn(notNull: Boolean): scala.Option[Map[String, Byte]] = {
    scala.Option(_asJava.methodWithNullableMapByteReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Byte)).toMap)
  }

  def methodWithNonNullableMapShortParam(param: Map[String, Short]): Boolean = {
    _asJava.methodWithNonNullableMapShortParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Short)).asJava)
  }

  def methodWithNullableMapShortParam(expectNull: Boolean, param: scala.Option[Map[String, Short]]): Unit = {
    _asJava.methodWithNullableMapShortParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Short)).asJava else null)
  }

  def methodWithNullableMapShortHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Short]]): Unit = {
    _asJava.methodWithNullableMapShortHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Short], Map[String, Short]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Short)).toMap else null)(handler))
  }

  def methodWithNullableMapShortHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Short],Map[String, Short]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Short)).toMap))
    _asJava.methodWithNullableMapShortHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapShortReturn(notNull: Boolean): scala.Option[Map[String, Short]] = {
    scala.Option(_asJava.methodWithNullableMapShortReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Short)).toMap)
  }

  def methodWithNonNullableMapIntegerParam(param: Map[String, Int]): Boolean = {
    _asJava.methodWithNonNullableMapIntegerParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Integer)).asJava)
  }

  def methodWithNullableMapIntegerParam(expectNull: Boolean, param: scala.Option[Map[String, Int]]): Unit = {
    _asJava.methodWithNullableMapIntegerParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Integer)).asJava else null)
  }

  def methodWithNullableMapIntegerHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Int]]): Unit = {
    _asJava.methodWithNullableMapIntegerHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Integer], Map[String, Int]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Int)).toMap else null)(handler))
  }

  def methodWithNullableMapIntegerHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Integer],Map[String, Int]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Int)).toMap))
    _asJava.methodWithNullableMapIntegerHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapIntegerReturn(notNull: Boolean): scala.Option[Map[String, Int]] = {
    scala.Option(_asJava.methodWithNullableMapIntegerReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Int)).toMap)
  }

  def methodWithNonNullableMapLongParam(param: Map[String, Long]): Boolean = {
    _asJava.methodWithNonNullableMapLongParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Long)).asJava)
  }

  def methodWithNullableMapLongParam(expectNull: Boolean, param: scala.Option[Map[String, Long]]): Unit = {
    _asJava.methodWithNullableMapLongParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Long)).asJava else null)
  }

  def methodWithNullableMapLongHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Long]]): Unit = {
    _asJava.methodWithNullableMapLongHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Long], Map[String, Long]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Long)).toMap else null)(handler))
  }

  def methodWithNullableMapLongHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Long],Map[String, Long]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Long)).toMap))
    _asJava.methodWithNullableMapLongHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapLongReturn(notNull: Boolean): scala.Option[Map[String, Long]] = {
    scala.Option(_asJava.methodWithNullableMapLongReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Long)).toMap)
  }

  def methodWithNonNullableMapFloatParam(param: Map[String, Float]): Boolean = {
    _asJava.methodWithNonNullableMapFloatParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Float)).asJava)
  }

  def methodWithNullableMapFloatParam(expectNull: Boolean, param: scala.Option[Map[String, Float]]): Unit = {
    _asJava.methodWithNullableMapFloatParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Float)).asJava else null)
  }

  def methodWithNullableMapFloatHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Float]]): Unit = {
    _asJava.methodWithNullableMapFloatHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Float], Map[String, Float]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Float)).toMap else null)(handler))
  }

  def methodWithNullableMapFloatHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Float],Map[String, Float]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Float)).toMap))
    _asJava.methodWithNullableMapFloatHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapFloatReturn(notNull: Boolean): scala.Option[Map[String, Float]] = {
    scala.Option(_asJava.methodWithNullableMapFloatReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Float)).toMap)
  }

  def methodWithNonNullableMapDoubleParam(param: Map[String, Double]): Boolean = {
    _asJava.methodWithNonNullableMapDoubleParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Double)).asJava)
  }

  def methodWithNullableMapDoubleParam(expectNull: Boolean, param: scala.Option[Map[String, Double]]): Unit = {
    _asJava.methodWithNullableMapDoubleParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Double)).asJava else null)
  }

  def methodWithNullableMapDoubleHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Double]]): Unit = {
    _asJava.methodWithNullableMapDoubleHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Double], Map[String, Double]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Double)).toMap else null)(handler))
  }

  def methodWithNullableMapDoubleHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Double],Map[String, Double]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Double)).toMap))
    _asJava.methodWithNullableMapDoubleHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapDoubleReturn(notNull: Boolean): scala.Option[Map[String, Double]] = {
    scala.Option(_asJava.methodWithNullableMapDoubleReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Double)).toMap)
  }

  def methodWithNonNullableMapBooleanParam(param: Map[String, Boolean]): Boolean = {
    _asJava.methodWithNonNullableMapBooleanParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Boolean)).asJava)
  }

  def methodWithNullableMapBooleanParam(expectNull: Boolean, param: scala.Option[Map[String, Boolean]]): Unit = {
    _asJava.methodWithNullableMapBooleanParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Boolean)).asJava else null)
  }

  def methodWithNullableMapBooleanHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Boolean]]): Unit = {
    _asJava.methodWithNullableMapBooleanHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Boolean], Map[String, Boolean]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Boolean)).toMap else null)(handler))
  }

  def methodWithNullableMapBooleanHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Boolean],Map[String, Boolean]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Boolean)).toMap))
    _asJava.methodWithNullableMapBooleanHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapBooleanReturn(notNull: Boolean): scala.Option[Map[String, Boolean]] = {
    scala.Option(_asJava.methodWithNullableMapBooleanReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Boolean)).toMap)
  }

  def methodWithNonNullableMapStringParam(param: Map[String, String]): Boolean = {
    _asJava.methodWithNonNullableMapStringParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.String)).asJava)
  }

  def methodWithNullableMapStringParam(expectNull: Boolean, param: scala.Option[Map[String, String]]): Unit = {
    _asJava.methodWithNullableMapStringParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.String)).asJava else null)
  }

  def methodWithNullableMapStringHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, String]]): Unit = {
    _asJava.methodWithNullableMapStringHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.String], Map[String, String]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithNullableMapStringHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.String],Map[String, String]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithNullableMapStringHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapStringReturn(notNull: Boolean): scala.Option[Map[String, String]] = {
    scala.Option(_asJava.methodWithNullableMapStringReturn(notNull)).map(_.asScala.toMap)
  }

  def methodWithNonNullableMapCharParam(param: Map[String, Char]): Boolean = {
    _asJava.methodWithNonNullableMapCharParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Character)).asJava)
  }

  def methodWithNullableMapCharParam(expectNull: Boolean, param: scala.Option[Map[String, Char]]): Unit = {
    _asJava.methodWithNullableMapCharParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Character)).asJava else null)
  }

  def methodWithNullableMapCharHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, Char]]): Unit = {
    _asJava.methodWithNullableMapCharHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Character], Map[String, Char]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Char)).toMap else null)(handler))
  }

  def methodWithNullableMapCharHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Character],Map[String, Char]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Char)).toMap))
    _asJava.methodWithNullableMapCharHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapCharReturn(notNull: Boolean): scala.Option[Map[String, Char]] = {
    scala.Option(_asJava.methodWithNullableMapCharReturn(notNull)).map(_.asScala.map(kv => (kv._1, kv._2: Char)).toMap)
  }

  def methodWithNonNullableMapJsonObjectParam(param: Map[String, JsonObject]): Boolean = {
    _asJava.methodWithNonNullableMapJsonObjectParam(param.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonObject)).asJava)
  }

  def methodWithNullableMapJsonObjectParam(expectNull: Boolean, param: scala.Option[Map[String, JsonObject]]): Unit = {
    _asJava.methodWithNullableMapJsonObjectParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonObject)).asJava else null)
  }

  def methodWithNullableMapJsonObjectHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, JsonObject]]): Unit = {
    _asJava.methodWithNullableMapJsonObjectHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,io.vertx.core.json.JsonObject], Map[String, JsonObject]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithNullableMapJsonObjectHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,io.vertx.core.json.JsonObject],Map[String, JsonObject]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithNullableMapJsonObjectHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapJsonObjectReturn(notNull: Boolean): scala.Option[Map[String, JsonObject]] = {
    scala.Option(_asJava.methodWithNullableMapJsonObjectReturn(notNull)).map(_.asScala.toMap)
  }

  def methodWithNonNullableMapJsonArrayParam(param: Map[String, JsonArray]): Boolean = {
    _asJava.methodWithNonNullableMapJsonArrayParam(param.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonArray)).asJava)
  }

  def methodWithNullableMapJsonArrayParam(expectNull: Boolean, param: scala.Option[Map[String, JsonArray]]): Unit = {
    _asJava.methodWithNullableMapJsonArrayParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonArray)).asJava else null)
  }

  def methodWithNullableMapJsonArrayHandler(notNull: Boolean, handler: io.vertx.core.Handler[Map[String, JsonArray]]): Unit = {
    _asJava.methodWithNullableMapJsonArrayHandler(notNull, funcToMappedHandler[java.util.Map[java.lang.String,io.vertx.core.json.JsonArray], Map[String, JsonArray]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithNullableMapJsonArrayHandlerAsyncResultFuture(notNull: Boolean): concurrent.Future[Map[String, JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,io.vertx.core.json.JsonArray],Map[String, JsonArray]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithNullableMapJsonArrayHandlerAsyncResult(notNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithNullableMapJsonArrayReturn(notNull: Boolean): scala.Option[Map[String, JsonArray]] = {
    scala.Option(_asJava.methodWithNullableMapJsonArrayReturn(notNull)).map(_.asScala.toMap)
  }

  def methodWithNonNullableMapApiParam(param: Map[String, RefedInterface1]): Boolean = {
    _asJava.methodWithNonNullableMapApiParam(param.map(kv => (kv._1:java.lang.String, if (kv._2 != null) kv._2.asJava.asInstanceOf[JRefedInterface1] else null)).asJava)
  }

  def methodWithNullableMapApiParam(expectNull: Boolean, param: scala.Option[Map[String, RefedInterface1]]): Unit = {
    _asJava.methodWithNullableMapApiParam(expectNull, if (param.isDefined) param.get.map(kv => (kv._1:java.lang.String, if (kv._2 != null) kv._2.asJava.asInstanceOf[JRefedInterface1] else null)).asJava else null)
  }

  def methodWithListNullableByteParam(param: scala.collection.mutable.Buffer[Byte]): Unit = {
    _asJava.methodWithListNullableByteParam(param.map(x => x:java.lang.Byte).asJava)
  }

  def methodWithListNullableByteHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Byte]]): Unit = {
    _asJava.methodWithListNullableByteHandler(funcToMappedHandler[java.util.List[java.lang.Byte], scala.collection.mutable.Buffer[Byte]](x => if (x != null) x.asScala.map(x => x:Byte) else null)(handler))
  }

  def methodWithListNullableByteHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Byte],scala.collection.mutable.Buffer[Byte]]((x => if (x == null) null else x.asScala.map(x => x:Byte)))
    _asJava.methodWithListNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableByteReturn(): scala.collection.mutable.Buffer[Byte] = {
    _asJava.methodWithListNullableByteReturn().asScala.map(x => x:Byte)
  }

  def methodWithListNullableShortParam(param: scala.collection.mutable.Buffer[Short]): Unit = {
    _asJava.methodWithListNullableShortParam(param.map(x => x:java.lang.Short).asJava)
  }

  def methodWithListNullableShortHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Short]]): Unit = {
    _asJava.methodWithListNullableShortHandler(funcToMappedHandler[java.util.List[java.lang.Short], scala.collection.mutable.Buffer[Short]](x => if (x != null) x.asScala.map(x => x:Short) else null)(handler))
  }

  def methodWithListNullableShortHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Short],scala.collection.mutable.Buffer[Short]]((x => if (x == null) null else x.asScala.map(x => x:Short)))
    _asJava.methodWithListNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableShortReturn(): scala.collection.mutable.Buffer[Short] = {
    _asJava.methodWithListNullableShortReturn().asScala.map(x => x:Short)
  }

  def methodWithListNullableIntegerParam(param: scala.collection.mutable.Buffer[Int]): Unit = {
    _asJava.methodWithListNullableIntegerParam(param.map(x => x:java.lang.Integer).asJava)
  }

  def methodWithListNullableIntegerHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Int]]): Unit = {
    _asJava.methodWithListNullableIntegerHandler(funcToMappedHandler[java.util.List[java.lang.Integer], scala.collection.mutable.Buffer[Int]](x => if (x != null) x.asScala.map(x => x:Int) else null)(handler))
  }

  def methodWithListNullableIntegerHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Integer],scala.collection.mutable.Buffer[Int]]((x => if (x == null) null else x.asScala.map(x => x:Int)))
    _asJava.methodWithListNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableIntegerReturn(): scala.collection.mutable.Buffer[Int] = {
    _asJava.methodWithListNullableIntegerReturn().asScala.map(x => x:Int)
  }

  def methodWithListNullableLongParam(param: scala.collection.mutable.Buffer[Long]): Unit = {
    _asJava.methodWithListNullableLongParam(param.map(x => x:java.lang.Long).asJava)
  }

  def methodWithListNullableLongHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Long]]): Unit = {
    _asJava.methodWithListNullableLongHandler(funcToMappedHandler[java.util.List[java.lang.Long], scala.collection.mutable.Buffer[Long]](x => if (x != null) x.asScala.map(x => x:Long) else null)(handler))
  }

  def methodWithListNullableLongHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Long],scala.collection.mutable.Buffer[Long]]((x => if (x == null) null else x.asScala.map(x => x:Long)))
    _asJava.methodWithListNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableLongReturn(): scala.collection.mutable.Buffer[Long] = {
    _asJava.methodWithListNullableLongReturn().asScala.map(x => x:Long)
  }

  def methodWithListNullableBooleanParam(param: scala.collection.mutable.Buffer[Boolean]): Unit = {
    _asJava.methodWithListNullableBooleanParam(param.map(x => x:java.lang.Boolean).asJava)
  }

  def methodWithListNullableBooleanHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Boolean]]): Unit = {
    _asJava.methodWithListNullableBooleanHandler(funcToMappedHandler[java.util.List[java.lang.Boolean], scala.collection.mutable.Buffer[Boolean]](x => if (x != null) x.asScala.map(x => x:Boolean) else null)(handler))
  }

  def methodWithListNullableBooleanHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Boolean],scala.collection.mutable.Buffer[Boolean]]((x => if (x == null) null else x.asScala.map(x => x:Boolean)))
    _asJava.methodWithListNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableBooleanReturn(): scala.collection.mutable.Buffer[Boolean] = {
    _asJava.methodWithListNullableBooleanReturn().asScala.map(x => x:Boolean)
  }

  def methodWithListNullableFloatParam(param: scala.collection.mutable.Buffer[Float]): Unit = {
    _asJava.methodWithListNullableFloatParam(param.map(x => x:java.lang.Float).asJava)
  }

  def methodWithListNullableFloatHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Float]]): Unit = {
    _asJava.methodWithListNullableFloatHandler(funcToMappedHandler[java.util.List[java.lang.Float], scala.collection.mutable.Buffer[Float]](x => if (x != null) x.asScala.map(x => x:Float) else null)(handler))
  }

  def methodWithListNullableFloatHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Float],scala.collection.mutable.Buffer[Float]]((x => if (x == null) null else x.asScala.map(x => x:Float)))
    _asJava.methodWithListNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableFloatReturn(): scala.collection.mutable.Buffer[Float] = {
    _asJava.methodWithListNullableFloatReturn().asScala.map(x => x:Float)
  }

  def methodWithListNullableDoubleParam(param: scala.collection.mutable.Buffer[Double]): Unit = {
    _asJava.methodWithListNullableDoubleParam(param.map(x => x:java.lang.Double).asJava)
  }

  def methodWithListNullableDoubleHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Double]]): Unit = {
    _asJava.methodWithListNullableDoubleHandler(funcToMappedHandler[java.util.List[java.lang.Double], scala.collection.mutable.Buffer[Double]](x => if (x != null) x.asScala.map(x => x:Double) else null)(handler))
  }

  def methodWithListNullableDoubleHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Double],scala.collection.mutable.Buffer[Double]]((x => if (x == null) null else x.asScala.map(x => x:Double)))
    _asJava.methodWithListNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableDoubleReturn(): scala.collection.mutable.Buffer[Double] = {
    _asJava.methodWithListNullableDoubleReturn().asScala.map(x => x:Double)
  }

  def methodWithListNullableStringParam(param: scala.collection.mutable.Buffer[String]): Unit = {
    _asJava.methodWithListNullableStringParam(param.map(x => x:java.lang.String).asJava)
  }

  def methodWithListNullableStringHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[String]]): Unit = {
    _asJava.methodWithListNullableStringHandler(funcToMappedHandler[java.util.List[java.lang.String], scala.collection.mutable.Buffer[String]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithListNullableStringHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.String],scala.collection.mutable.Buffer[String]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithListNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableStringReturn(): scala.collection.mutable.Buffer[String] = {
    _asJava.methodWithListNullableStringReturn().asScala.map(x => x:String)
  }

  def methodWithListNullableCharParam(param: scala.collection.mutable.Buffer[Char]): Unit = {
    _asJava.methodWithListNullableCharParam(param.map(x => x:java.lang.Character).asJava)
  }

  def methodWithListNullableCharHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[Char]]): Unit = {
    _asJava.methodWithListNullableCharHandler(funcToMappedHandler[java.util.List[java.lang.Character], scala.collection.mutable.Buffer[Char]](x => if (x != null) x.asScala.map(x => x:Char) else null)(handler))
  }

  def methodWithListNullableCharHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[java.lang.Character],scala.collection.mutable.Buffer[Char]]((x => if (x == null) null else x.asScala.map(x => x:Char)))
    _asJava.methodWithListNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableCharReturn(): scala.collection.mutable.Buffer[Char] = {
    _asJava.methodWithListNullableCharReturn().asScala.map(x => x:Char)
  }

  def methodWithListNullableJsonObjectParam(param: scala.collection.mutable.Buffer[JsonObject]): Unit = {
    _asJava.methodWithListNullableJsonObjectParam(param.map(x => x:io.vertx.core.json.JsonObject).asJava)
  }

  def methodWithListNullableJsonObjectHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[JsonObject]]): Unit = {
    _asJava.methodWithListNullableJsonObjectHandler(funcToMappedHandler[java.util.List[io.vertx.core.json.JsonObject], scala.collection.mutable.Buffer[JsonObject]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithListNullableJsonObjectHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.core.json.JsonObject],scala.collection.mutable.Buffer[JsonObject]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithListNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableJsonObjectReturn(): scala.collection.mutable.Buffer[JsonObject] = {
    _asJava.methodWithListNullableJsonObjectReturn().asScala.map(x => x:JsonObject)
  }

  def methodWithListNullableJsonArrayParam(param: scala.collection.mutable.Buffer[JsonArray]): Unit = {
    _asJava.methodWithListNullableJsonArrayParam(param.map(x => x:io.vertx.core.json.JsonArray).asJava)
  }

  def methodWithListNullableJsonArrayHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[JsonArray]]): Unit = {
    _asJava.methodWithListNullableJsonArrayHandler(funcToMappedHandler[java.util.List[io.vertx.core.json.JsonArray], scala.collection.mutable.Buffer[JsonArray]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithListNullableJsonArrayHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.core.json.JsonArray],scala.collection.mutable.Buffer[JsonArray]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithListNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableJsonArrayReturn(): scala.collection.mutable.Buffer[JsonArray] = {
    _asJava.methodWithListNullableJsonArrayReturn().asScala.map(x => x:JsonArray)
  }

  def methodWithListNullableApiParam(param: scala.collection.mutable.Buffer[RefedInterface1]): Unit = {
    _asJava.methodWithListNullableApiParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithListNullableApiHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[RefedInterface1]]): Unit = {
    _asJava.methodWithListNullableApiHandler(funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.RefedInterface1], scala.collection.mutable.Buffer[RefedInterface1]](x => if (x != null) x.asScala.map(RefedInterface1.apply) else null)(handler))
  }

  def methodWithListNullableApiHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.RefedInterface1],scala.collection.mutable.Buffer[RefedInterface1]]((x => if (x == null) null else x.asScala.map(RefedInterface1.apply)))
    _asJava.methodWithListNullableApiHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableApiReturn(): scala.collection.mutable.Buffer[RefedInterface1] = {
    _asJava.methodWithListNullableApiReturn().asScala.map(RefedInterface1.apply)
  }

  def methodWithListNullableDataObjectParam(param: scala.collection.mutable.Buffer[TestDataObject]): Unit = {
    _asJava.methodWithListNullableDataObjectParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithListNullableDataObjectHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[TestDataObject]]): Unit = {
    _asJava.methodWithListNullableDataObjectHandler(funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestDataObject], scala.collection.mutable.Buffer[TestDataObject]](x => if (x != null) x.asScala.map(x => TestDataObject(x)) else null)(handler))
  }

  def methodWithListNullableDataObjectHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestDataObject],scala.collection.mutable.Buffer[TestDataObject]]((x => if (x == null) null else x.asScala.map(x => TestDataObject(x))))
    _asJava.methodWithListNullableDataObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableDataObjectReturn(): scala.collection.mutable.Buffer[TestDataObject] = {
    _asJava.methodWithListNullableDataObjectReturn().asScala.map(x => TestDataObject(x))
  }

  def methodWithListNullableEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]): Unit = {
    _asJava.methodWithListNullableEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava)
  }

  def methodWithListNullableEnumHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithListNullableEnumHandler(funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithListNullableEnumHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithListNullableEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableEnumReturn(): scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestEnum] = {
    _asJava.methodWithListNullableEnumReturn().asScala.map(x => x:io.vertx.codegen.testmodel.TestEnum)
  }

  def methodWithListNullableGenEnumParam(param: scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]): Unit = {
    _asJava.methodWithListNullableGenEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava)
  }

  def methodWithListNullableGenEnumHandler(handler: io.vertx.core.Handler[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithListNullableGenEnumHandler(funcToMappedHandler[java.util.List[io.vertx.codegen.testmodel.TestGenEnum], scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x != null) x.asScala else null)(handler))
  }

  def methodWithListNullableGenEnumHandlerAsyncResultFuture(): concurrent.Future[scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.List[io.vertx.codegen.testmodel.TestGenEnum],scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum]]((x => if (x == null) null else x.asScala))
    _asJava.methodWithListNullableGenEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithListNullableGenEnumReturn(): scala.collection.mutable.Buffer[io.vertx.codegen.testmodel.TestGenEnum] = {
    _asJava.methodWithListNullableGenEnumReturn().asScala.map(x => x:io.vertx.codegen.testmodel.TestGenEnum)
  }

  def methodWithSetNullableByteParam(param: Set[Byte]): Unit = {
    _asJava.methodWithSetNullableByteParam(param.map(x => x:java.lang.Byte).asJava)
  }

  def methodWithSetNullableByteHandler(handler: io.vertx.core.Handler[Set[Byte]]): Unit = {
    _asJava.methodWithSetNullableByteHandler(funcToMappedHandler[java.util.Set[java.lang.Byte], Set[Byte]](x => if (x != null) x.asScala.map(x => x:Byte).toSet else null)(handler))
  }

  def methodWithSetNullableByteHandlerAsyncResultFuture(): concurrent.Future[Set[Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Byte],Set[Byte]]((x => if (x == null) null else x.asScala.map(x => x:Byte).toSet))
    _asJava.methodWithSetNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableByteReturn(): Set[Byte] = {
    _asJava.methodWithSetNullableByteReturn().asScala.map(x => x:Byte).toSet
  }

  def methodWithSetNullableShortParam(param: Set[Short]): Unit = {
    _asJava.methodWithSetNullableShortParam(param.map(x => x:java.lang.Short).asJava)
  }

  def methodWithSetNullableShortHandler(handler: io.vertx.core.Handler[Set[Short]]): Unit = {
    _asJava.methodWithSetNullableShortHandler(funcToMappedHandler[java.util.Set[java.lang.Short], Set[Short]](x => if (x != null) x.asScala.map(x => x:Short).toSet else null)(handler))
  }

  def methodWithSetNullableShortHandlerAsyncResultFuture(): concurrent.Future[Set[Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Short],Set[Short]]((x => if (x == null) null else x.asScala.map(x => x:Short).toSet))
    _asJava.methodWithSetNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableShortReturn(): Set[Short] = {
    _asJava.methodWithSetNullableShortReturn().asScala.map(x => x:Short).toSet
  }

  def methodWithSetNullableIntegerParam(param: Set[Int]): Unit = {
    _asJava.methodWithSetNullableIntegerParam(param.map(x => x:java.lang.Integer).asJava)
  }

  def methodWithSetNullableIntegerHandler(handler: io.vertx.core.Handler[Set[Int]]): Unit = {
    _asJava.methodWithSetNullableIntegerHandler(funcToMappedHandler[java.util.Set[java.lang.Integer], Set[Int]](x => if (x != null) x.asScala.map(x => x:Int).toSet else null)(handler))
  }

  def methodWithSetNullableIntegerHandlerAsyncResultFuture(): concurrent.Future[Set[Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Integer],Set[Int]]((x => if (x == null) null else x.asScala.map(x => x:Int).toSet))
    _asJava.methodWithSetNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableIntegerReturn(): Set[Int] = {
    _asJava.methodWithSetNullableIntegerReturn().asScala.map(x => x:Int).toSet
  }

  def methodWithSetNullableLongParam(param: Set[Long]): Unit = {
    _asJava.methodWithSetNullableLongParam(param.map(x => x:java.lang.Long).asJava)
  }

  def methodWithSetNullableLongHandler(handler: io.vertx.core.Handler[Set[Long]]): Unit = {
    _asJava.methodWithSetNullableLongHandler(funcToMappedHandler[java.util.Set[java.lang.Long], Set[Long]](x => if (x != null) x.asScala.map(x => x:Long).toSet else null)(handler))
  }

  def methodWithSetNullableLongHandlerAsyncResultFuture(): concurrent.Future[Set[Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Long],Set[Long]]((x => if (x == null) null else x.asScala.map(x => x:Long).toSet))
    _asJava.methodWithSetNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableLongReturn(): Set[Long] = {
    _asJava.methodWithSetNullableLongReturn().asScala.map(x => x:Long).toSet
  }

  def methodWithSetNullableBooleanParam(param: Set[Boolean]): Unit = {
    _asJava.methodWithSetNullableBooleanParam(param.map(x => x:java.lang.Boolean).asJava)
  }

  def methodWithSetNullableBooleanHandler(handler: io.vertx.core.Handler[Set[Boolean]]): Unit = {
    _asJava.methodWithSetNullableBooleanHandler(funcToMappedHandler[java.util.Set[java.lang.Boolean], Set[Boolean]](x => if (x != null) x.asScala.map(x => x:Boolean).toSet else null)(handler))
  }

  def methodWithSetNullableBooleanHandlerAsyncResultFuture(): concurrent.Future[Set[Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Boolean],Set[Boolean]]((x => if (x == null) null else x.asScala.map(x => x:Boolean).toSet))
    _asJava.methodWithSetNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableBooleanReturn(): Set[Boolean] = {
    _asJava.methodWithSetNullableBooleanReturn().asScala.map(x => x:Boolean).toSet
  }

  def methodWithSetNullableFloatParam(param: Set[Float]): Unit = {
    _asJava.methodWithSetNullableFloatParam(param.map(x => x:java.lang.Float).asJava)
  }

  def methodWithSetNullableFloatHandler(handler: io.vertx.core.Handler[Set[Float]]): Unit = {
    _asJava.methodWithSetNullableFloatHandler(funcToMappedHandler[java.util.Set[java.lang.Float], Set[Float]](x => if (x != null) x.asScala.map(x => x:Float).toSet else null)(handler))
  }

  def methodWithSetNullableFloatHandlerAsyncResultFuture(): concurrent.Future[Set[Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Float],Set[Float]]((x => if (x == null) null else x.asScala.map(x => x:Float).toSet))
    _asJava.methodWithSetNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableFloatReturn(): Set[Float] = {
    _asJava.methodWithSetNullableFloatReturn().asScala.map(x => x:Float).toSet
  }

  def methodWithSetNullableDoubleParam(param: Set[Double]): Unit = {
    _asJava.methodWithSetNullableDoubleParam(param.map(x => x:java.lang.Double).asJava)
  }

  def methodWithSetNullableDoubleHandler(handler: io.vertx.core.Handler[Set[Double]]): Unit = {
    _asJava.methodWithSetNullableDoubleHandler(funcToMappedHandler[java.util.Set[java.lang.Double], Set[Double]](x => if (x != null) x.asScala.map(x => x:Double).toSet else null)(handler))
  }

  def methodWithSetNullableDoubleHandlerAsyncResultFuture(): concurrent.Future[Set[Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Double],Set[Double]]((x => if (x == null) null else x.asScala.map(x => x:Double).toSet))
    _asJava.methodWithSetNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableDoubleReturn(): Set[Double] = {
    _asJava.methodWithSetNullableDoubleReturn().asScala.map(x => x:Double).toSet
  }

  def methodWithSetNullableStringParam(param: Set[String]): Unit = {
    _asJava.methodWithSetNullableStringParam(param.map(x => x:java.lang.String).asJava)
  }

  def methodWithSetNullableStringHandler(handler: io.vertx.core.Handler[Set[String]]): Unit = {
    _asJava.methodWithSetNullableStringHandler(funcToMappedHandler[java.util.Set[java.lang.String], Set[String]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithSetNullableStringHandlerAsyncResultFuture(): concurrent.Future[Set[String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.String],Set[String]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithSetNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableStringReturn(): Set[String] = {
    _asJava.methodWithSetNullableStringReturn().asScala.map(x => x:String).toSet
  }

  def methodWithSetNullableCharParam(param: Set[Char]): Unit = {
    _asJava.methodWithSetNullableCharParam(param.map(x => x:java.lang.Character).asJava)
  }

  def methodWithSetNullableCharHandler(handler: io.vertx.core.Handler[Set[Char]]): Unit = {
    _asJava.methodWithSetNullableCharHandler(funcToMappedHandler[java.util.Set[java.lang.Character], Set[Char]](x => if (x != null) x.asScala.map(x => x:Char).toSet else null)(handler))
  }

  def methodWithSetNullableCharHandlerAsyncResultFuture(): concurrent.Future[Set[Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[java.lang.Character],Set[Char]]((x => if (x == null) null else x.asScala.map(x => x:Char).toSet))
    _asJava.methodWithSetNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableCharReturn(): Set[Char] = {
    _asJava.methodWithSetNullableCharReturn().asScala.map(x => x:Char).toSet
  }

  def methodWithSetNullableJsonObjectParam(param: Set[JsonObject]): Unit = {
    _asJava.methodWithSetNullableJsonObjectParam(param.map(x => x:io.vertx.core.json.JsonObject).asJava)
  }

  def methodWithSetNullableJsonObjectHandler(handler: io.vertx.core.Handler[Set[JsonObject]]): Unit = {
    _asJava.methodWithSetNullableJsonObjectHandler(funcToMappedHandler[java.util.Set[io.vertx.core.json.JsonObject], Set[JsonObject]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithSetNullableJsonObjectHandlerAsyncResultFuture(): concurrent.Future[Set[JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.core.json.JsonObject],Set[JsonObject]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithSetNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableJsonObjectReturn(): Set[JsonObject] = {
    _asJava.methodWithSetNullableJsonObjectReturn().asScala.map(x => x:JsonObject).toSet
  }

  def methodWithSetNullableJsonArrayParam(param: Set[JsonArray]): Unit = {
    _asJava.methodWithSetNullableJsonArrayParam(param.map(x => x:io.vertx.core.json.JsonArray).asJava)
  }

  def methodWithSetNullableJsonArrayHandler(handler: io.vertx.core.Handler[Set[JsonArray]]): Unit = {
    _asJava.methodWithSetNullableJsonArrayHandler(funcToMappedHandler[java.util.Set[io.vertx.core.json.JsonArray], Set[JsonArray]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithSetNullableJsonArrayHandlerAsyncResultFuture(): concurrent.Future[Set[JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.core.json.JsonArray],Set[JsonArray]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithSetNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableJsonArrayReturn(): Set[JsonArray] = {
    _asJava.methodWithSetNullableJsonArrayReturn().asScala.map(x => x:JsonArray).toSet
  }

  def methodWithSetNullableApiParam(param: Set[RefedInterface1]): Unit = {
    _asJava.methodWithSetNullableApiParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithSetNullableApiHandler(handler: io.vertx.core.Handler[Set[RefedInterface1]]): Unit = {
    _asJava.methodWithSetNullableApiHandler(funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.RefedInterface1], Set[RefedInterface1]](x => if (x != null) x.asScala.map(RefedInterface1.apply).toSet else null)(handler))
  }

  def methodWithSetNullableApiHandlerAsyncResultFuture(): concurrent.Future[Set[RefedInterface1]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.RefedInterface1],Set[RefedInterface1]]((x => if (x == null) null else x.asScala.map(RefedInterface1.apply).toSet))
    _asJava.methodWithSetNullableApiHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableApiReturn(): Set[RefedInterface1] = {
    _asJava.methodWithSetNullableApiReturn().asScala.map(RefedInterface1.apply).toSet
  }

  def methodWithSetNullableDataObjectParam(param: Set[TestDataObject]): Unit = {
    _asJava.methodWithSetNullableDataObjectParam(param.map(x => if (x == null) null else x.asJava).asJava)
  }

  def methodWithSetNullableDataObjectHandler(handler: io.vertx.core.Handler[Set[TestDataObject]]): Unit = {
    _asJava.methodWithSetNullableDataObjectHandler(funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestDataObject], Set[TestDataObject]](x => if (x != null) x.asScala.map(x => TestDataObject(x)).toSet else null)(handler))
  }

  def methodWithSetNullableDataObjectHandlerAsyncResultFuture(): concurrent.Future[Set[TestDataObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestDataObject],Set[TestDataObject]]((x => if (x == null) null else x.asScala.map(x => TestDataObject(x)).toSet))
    _asJava.methodWithSetNullableDataObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableDataObjectReturn(): Set[TestDataObject] = {
    _asJava.methodWithSetNullableDataObjectReturn().asScala.map(x => TestDataObject(x)).toSet
  }

  def methodWithSetNullableEnumParam(param: Set[io.vertx.codegen.testmodel.TestEnum]): Unit = {
    _asJava.methodWithSetNullableEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestEnum).asJava)
  }

  def methodWithSetNullableEnumHandler(handler: io.vertx.core.Handler[Set[io.vertx.codegen.testmodel.TestEnum]]): Unit = {
    _asJava.methodWithSetNullableEnumHandler(funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestEnum], Set[io.vertx.codegen.testmodel.TestEnum]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithSetNullableEnumHandlerAsyncResultFuture(): concurrent.Future[Set[io.vertx.codegen.testmodel.TestEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestEnum],Set[io.vertx.codegen.testmodel.TestEnum]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithSetNullableEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableEnumReturn(): Set[io.vertx.codegen.testmodel.TestEnum] = {
    _asJava.methodWithSetNullableEnumReturn().asScala.map(x => x:io.vertx.codegen.testmodel.TestEnum).toSet
  }

  def methodWithSetNullableGenEnumParam(param: Set[io.vertx.codegen.testmodel.TestGenEnum]): Unit = {
    _asJava.methodWithSetNullableGenEnumParam(param.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).asJava)
  }

  def methodWithSetNullableGenEnumHandler(handler: io.vertx.core.Handler[Set[io.vertx.codegen.testmodel.TestGenEnum]]): Unit = {
    _asJava.methodWithSetNullableGenEnumHandler(funcToMappedHandler[java.util.Set[io.vertx.codegen.testmodel.TestGenEnum], Set[io.vertx.codegen.testmodel.TestGenEnum]](x => if (x != null) x.asScala.toSet else null)(handler))
  }

  def methodWithSetNullableGenEnumHandlerAsyncResultFuture(): concurrent.Future[Set[io.vertx.codegen.testmodel.TestGenEnum]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Set[io.vertx.codegen.testmodel.TestGenEnum],Set[io.vertx.codegen.testmodel.TestGenEnum]]((x => if (x == null) null else x.asScala.toSet))
    _asJava.methodWithSetNullableGenEnumHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithSetNullableGenEnumReturn(): Set[io.vertx.codegen.testmodel.TestGenEnum] = {
    _asJava.methodWithSetNullableGenEnumReturn().asScala.map(x => x:io.vertx.codegen.testmodel.TestGenEnum).toSet
  }

  def methodWithMapNullableByteParam(param: Map[String, Byte]): Unit = {
    _asJava.methodWithMapNullableByteParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Byte)).asJava)
  }

  def methodWithMapNullableByteHandler(handler: io.vertx.core.Handler[Map[String, Byte]]): Unit = {
    _asJava.methodWithMapNullableByteHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Byte], Map[String, Byte]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Byte)).toMap else null)(handler))
  }

  def methodWithMapNullableByteHandlerAsyncResultFuture(): concurrent.Future[Map[String, Byte]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Byte],Map[String, Byte]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Byte)).toMap))
    _asJava.methodWithMapNullableByteHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableByteReturn(): Map[String, Byte] = {
    _asJava.methodWithMapNullableByteReturn().asScala.map(kv => (kv._1, kv._2: Byte)).toMap
  }

  def methodWithMapNullableShortParam(param: Map[String, Short]): Unit = {
    _asJava.methodWithMapNullableShortParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Short)).asJava)
  }

  def methodWithMapNullableShortHandler(handler: io.vertx.core.Handler[Map[String, Short]]): Unit = {
    _asJava.methodWithMapNullableShortHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Short], Map[String, Short]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Short)).toMap else null)(handler))
  }

  def methodWithMapNullableShortHandlerAsyncResultFuture(): concurrent.Future[Map[String, Short]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Short],Map[String, Short]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Short)).toMap))
    _asJava.methodWithMapNullableShortHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableShortReturn(): Map[String, Short] = {
    _asJava.methodWithMapNullableShortReturn().asScala.map(kv => (kv._1, kv._2: Short)).toMap
  }

  def methodWithMapNullableIntegerParam(param: Map[String, Int]): Unit = {
    _asJava.methodWithMapNullableIntegerParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Integer)).asJava)
  }

  def methodWithMapNullableIntegerHandler(handler: io.vertx.core.Handler[Map[String, Int]]): Unit = {
    _asJava.methodWithMapNullableIntegerHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Integer], Map[String, Int]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Int)).toMap else null)(handler))
  }

  def methodWithMapNullableIntegerHandlerAsyncResultFuture(): concurrent.Future[Map[String, Int]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Integer],Map[String, Int]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Int)).toMap))
    _asJava.methodWithMapNullableIntegerHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableIntegerReturn(): Map[String, Int] = {
    _asJava.methodWithMapNullableIntegerReturn().asScala.map(kv => (kv._1, kv._2: Int)).toMap
  }

  def methodWithMapNullableLongParam(param: Map[String, Long]): Unit = {
    _asJava.methodWithMapNullableLongParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Long)).asJava)
  }

  def methodWithMapNullableLongHandler(handler: io.vertx.core.Handler[Map[String, Long]]): Unit = {
    _asJava.methodWithMapNullableLongHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Long], Map[String, Long]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Long)).toMap else null)(handler))
  }

  def methodWithMapNullableLongHandlerAsyncResultFuture(): concurrent.Future[Map[String, Long]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Long],Map[String, Long]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Long)).toMap))
    _asJava.methodWithMapNullableLongHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableLongReturn(): Map[String, Long] = {
    _asJava.methodWithMapNullableLongReturn().asScala.map(kv => (kv._1, kv._2: Long)).toMap
  }

  def methodWithMapNullableBooleanParam(param: Map[String, Boolean]): Unit = {
    _asJava.methodWithMapNullableBooleanParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Boolean)).asJava)
  }

  def methodWithMapNullableBooleanHandler(handler: io.vertx.core.Handler[Map[String, Boolean]]): Unit = {
    _asJava.methodWithMapNullableBooleanHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Boolean], Map[String, Boolean]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Boolean)).toMap else null)(handler))
  }

  def methodWithMapNullableBooleanHandlerAsyncResultFuture(): concurrent.Future[Map[String, Boolean]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Boolean],Map[String, Boolean]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Boolean)).toMap))
    _asJava.methodWithMapNullableBooleanHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableBooleanReturn(): Map[String, Boolean] = {
    _asJava.methodWithMapNullableBooleanReturn().asScala.map(kv => (kv._1, kv._2: Boolean)).toMap
  }

  def methodWithMapNullableFloatParam(param: Map[String, Float]): Unit = {
    _asJava.methodWithMapNullableFloatParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Float)).asJava)
  }

  def methodWithMapNullableFloatHandler(handler: io.vertx.core.Handler[Map[String, Float]]): Unit = {
    _asJava.methodWithMapNullableFloatHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Float], Map[String, Float]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Float)).toMap else null)(handler))
  }

  def methodWithMapNullableFloatHandlerAsyncResultFuture(): concurrent.Future[Map[String, Float]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Float],Map[String, Float]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Float)).toMap))
    _asJava.methodWithMapNullableFloatHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableFloatReturn(): Map[String, Float] = {
    _asJava.methodWithMapNullableFloatReturn().asScala.map(kv => (kv._1, kv._2: Float)).toMap
  }

  def methodWithMapNullableDoubleParam(param: Map[String, Double]): Unit = {
    _asJava.methodWithMapNullableDoubleParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Double)).asJava)
  }

  def methodWithMapNullableDoubleHandler(handler: io.vertx.core.Handler[Map[String, Double]]): Unit = {
    _asJava.methodWithMapNullableDoubleHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Double], Map[String, Double]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Double)).toMap else null)(handler))
  }

  def methodWithMapNullableDoubleHandlerAsyncResultFuture(): concurrent.Future[Map[String, Double]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Double],Map[String, Double]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Double)).toMap))
    _asJava.methodWithMapNullableDoubleHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableDoubleReturn(): Map[String, Double] = {
    _asJava.methodWithMapNullableDoubleReturn().asScala.map(kv => (kv._1, kv._2: Double)).toMap
  }

  def methodWithMapNullableStringParam(param: Map[String, String]): Unit = {
    _asJava.methodWithMapNullableStringParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.String)).asJava)
  }

  def methodWithMapNullableStringHandler(handler: io.vertx.core.Handler[Map[String, String]]): Unit = {
    _asJava.methodWithMapNullableStringHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.String], Map[String, String]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithMapNullableStringHandlerAsyncResultFuture(): concurrent.Future[Map[String, String]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.String],Map[String, String]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithMapNullableStringHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableStringReturn(): Map[String, String] = {
    _asJava.methodWithMapNullableStringReturn().asScala.toMap
  }

  def methodWithMapNullableCharParam(param: Map[String, Char]): Unit = {
    _asJava.methodWithMapNullableCharParam(param.map(kv => (kv._1:java.lang.String, kv._2:java.lang.Character)).asJava)
  }

  def methodWithMapNullableCharHandler(handler: io.vertx.core.Handler[Map[String, Char]]): Unit = {
    _asJava.methodWithMapNullableCharHandler(funcToMappedHandler[java.util.Map[java.lang.String,java.lang.Character], Map[String, Char]](x => if (x != null) x.asScala.map((a) => (a._1,a._2:Char)).toMap else null)(handler))
  }

  def methodWithMapNullableCharHandlerAsyncResultFuture(): concurrent.Future[Map[String, Char]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,java.lang.Character],Map[String, Char]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2:Char)).toMap))
    _asJava.methodWithMapNullableCharHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableCharReturn(): Map[String, Char] = {
    _asJava.methodWithMapNullableCharReturn().asScala.map(kv => (kv._1, kv._2: Char)).toMap
  }

  def methodWithMapNullableJsonObjectParam(param: Map[String, JsonObject]): Unit = {
    _asJava.methodWithMapNullableJsonObjectParam(param.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonObject)).asJava)
  }

  def methodWithMapNullableJsonObjectHandler(handler: io.vertx.core.Handler[Map[String, JsonObject]]): Unit = {
    _asJava.methodWithMapNullableJsonObjectHandler(funcToMappedHandler[java.util.Map[java.lang.String,io.vertx.core.json.JsonObject], Map[String, JsonObject]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithMapNullableJsonObjectHandlerAsyncResultFuture(): concurrent.Future[Map[String, JsonObject]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,io.vertx.core.json.JsonObject],Map[String, JsonObject]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithMapNullableJsonObjectHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableJsonObjectReturn(): Map[String, JsonObject] = {
    _asJava.methodWithMapNullableJsonObjectReturn().asScala.toMap
  }

  def methodWithMapNullableJsonArrayParam(param: Map[String, JsonArray]): Unit = {
    _asJava.methodWithMapNullableJsonArrayParam(param.map(kv => (kv._1:java.lang.String, kv._2:io.vertx.core.json.JsonArray)).asJava)
  }

  def methodWithMapNullableJsonArrayHandler(handler: io.vertx.core.Handler[Map[String, JsonArray]]): Unit = {
    _asJava.methodWithMapNullableJsonArrayHandler(funcToMappedHandler[java.util.Map[java.lang.String,io.vertx.core.json.JsonArray], Map[String, JsonArray]](x => if (x != null) x.asScala.map((a) => (a._1,a._2)).toMap else null)(handler))
  }

  def methodWithMapNullableJsonArrayHandlerAsyncResultFuture(): concurrent.Future[Map[String, JsonArray]] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.util.Map[java.lang.String,io.vertx.core.json.JsonArray],Map[String, JsonArray]]((x => if (x == null) null else x.asScala.map((a) => (a._1,a._2)).toMap))
    _asJava.methodWithMapNullableJsonArrayHandlerAsyncResult(promiseAndHandler._1)
    promiseAndHandler._2.future
  }

  def methodWithMapNullableJsonArrayReturn(): Map[String, JsonArray] = {
    _asJava.methodWithMapNullableJsonArrayReturn().asScala.toMap
  }

  def methodWithMapNullableApiParam(param: Map[String, RefedInterface1]): Unit = {
    _asJava.methodWithMapNullableApiParam(param.map(kv => (kv._1:java.lang.String, if (kv._2 != null) kv._2.asJava.asInstanceOf[JRefedInterface1] else null)).asJava)
  }

  def methodWithNullableHandler(expectNull: Boolean, handler: io.vertx.core.Handler[String]): Unit = {
    _asJava.methodWithNullableHandler(expectNull, (handler))
  }

  def methodWithNullableHandlerAsyncResultFuture(expectNull: Boolean): concurrent.Future[String] = {
    val promiseAndHandler = handlerForAsyncResultWithConversion[java.lang.String,String]((x => x))
    _asJava.methodWithNullableHandlerAsyncResult(expectNull, promiseAndHandler._1)
    promiseAndHandler._2.future
  }

}

object NullableTCK {

  def apply(_asJava: JNullableTCK): NullableTCK =
    new NullableTCK(_asJava)

}
