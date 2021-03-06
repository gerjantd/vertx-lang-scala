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

package io.vertx.scala.ext.stomp

import io.vertx.lang.scala.json.Json._
import io.vertx.core.json.JsonObject
import scala.collection.JavaConverters._
import io.vertx.core.buffer.Buffer
import io.vertx.ext.stomp.{Frame => JFrame}
import io.vertx.ext.stomp.Frame.Command

/**
  * Represents a STOMP frame. STOMP frames are structured as follows. It starts by a `command`, followed by a
  * set of headers. Then the frame may have a body and is finished by a `0` byte. This class represents this
  * structure and provide access to the different parts.
  * <p/>
  * This class is <strong>NOT</strong> thread-safe.
  */
class Frame(private val _asJava: JFrame) {

  def asJava = _asJava

  /**
    * Gets the value of the `ack` header.
    */

  /**
    * Sets the body of the frame.
    */
  def setBody(value: io.vertx.core.buffer.Buffer) = {
    asJava.setBody(value)
    this
  }
  def getBody: io.vertx.core.buffer.Buffer = {
    asJava.getBody()
  }

  /**
    * Gets the body of the frames as a String encoded in the frame encoding.
    */

  /**
    * Sets the frame command.
    */
  def setCommand(value: io.vertx.ext.stomp.Frame.Command) = {
    asJava.setCommand(value)
    this
  }
  def getCommand: io.vertx.ext.stomp.Frame.Command = {
    asJava.getCommand()
  }
  def setDestination(value: String) = {
    asJava.setDestination(value)
    this
  }
  def getDestination: String = {
    asJava.getDestination().asInstanceOf[String]
  }

  /**
    * Sets the headers of the frames.
    */
  def addHeader(key: String, value: String) = {
    asJava.addHeader(key, value.asInstanceOf[java.lang.String])
    this
  }
  def setHeaders(value: Map[String, String]) = {
    asJava.setHeaders(value.asJava)
    this
  }
  def getHeaders: scala.collection.mutable.Map[String, String] = {
    collection.mutable.Map(asJava.getHeaders().asScala.mapValues(x => x.asInstanceOf[String]).toSeq: _*)
  }
  def setId(value: String) = {
    asJava.setId(value)
    this
  }
  def getId: String = {
    asJava.getId().asInstanceOf[String]
  }
  def setTransaction(value: String) = {
    asJava.setTransaction(value)
    this
  }
  def getTransaction: String = {
    asJava.getTransaction().asInstanceOf[String]
  }
}

object Frame {
  
  def apply() = {
    new Frame(new JFrame(emptyObj()))
  }
  
  def apply(t: JFrame) = {
    if (t != null) {
      new Frame(t)
    } else {
      new Frame(new JFrame(emptyObj()))
    }
  }
  
  def fromJson(json: JsonObject): Frame = {
    if (json != null) {
      new Frame(new JFrame(json))
    } else {
      new Frame(new JFrame(emptyObj()))
    }
  }
}
