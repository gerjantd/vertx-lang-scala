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

package io.vertx.scala.core.eventbus

import io.vertx.core.json.JsonObject
import scala.collection.JavaConversions._

/**
  * Options to configure the event bus.
  */

class EventBusOptions(val java: io.vertx.core.eventbus.EventBusOptions) {
          def setAcceptBacklog(value:Int) = {
          java.setAcceptBacklog(value)
          this
  }
            def getAcceptBacklog = {
    java.getAcceptBacklog()
  }
            def setClientAuth(value:io.vertx.core.http.ClientAuth) = {
          java.setClientAuth(value)
          this
  }
            def getClientAuth = {
    java.getClientAuth()
  }
            def setClusterPingInterval(value:Long) = {
          java.setClusterPingInterval(value)
          this
  }
            def getClusterPingInterval = {
    java.getClusterPingInterval()
  }
            def setClusterPingReplyInterval(value:Long) = {
          java.setClusterPingReplyInterval(value)
          this
  }
            def getClusterPingReplyInterval = {
    java.getClusterPingReplyInterval()
  }
            def setClusterPublicHost(value:String) = {
          java.setClusterPublicHost(value)
          this
  }
            def getClusterPublicHost = {
    java.getClusterPublicHost()
  }
            def setClusterPublicPort(value:Int) = {
          java.setClusterPublicPort(value)
          this
  }
            def getClusterPublicPort = {
    java.getClusterPublicPort()
  }
            def setClustered(value:Boolean) = {
          java.setClustered(value)
          this
  }
            def isClustered = {
    java.isClustered()
  }
            def setConnectTimeout(value:Int) = {
          java.setConnectTimeout(value)
          this
  }
            def getConnectTimeout = {
    java.getConnectTimeout()
  }
            def addCrlPath(value:String) = {
            java.addCrlPath(value)
            this
    }
              def getCrlPaths = {
    java.getCrlPaths()
  }
            def addCrlValue(value:io.vertx.core.buffer.Buffer) = {
            java.addCrlValue(value)
            this
    }
              def getCrlValues = {
    java.getCrlValues()
  }
            def addEnabledCipherSuite(value:String) = {
            java.addEnabledCipherSuite(value)
            this
    }
              def getEnabledCipherSuites = {
    java.getEnabledCipherSuites()
  }
            def addEnabledSecureTransportProtocol(value:String) = {
            java.addEnabledSecureTransportProtocol(value)
            this
    }
              def getEnabledSecureTransportProtocols = {
    java.getEnabledSecureTransportProtocols()
  }
            def setHost(value:String) = {
          java.setHost(value)
          this
  }
            def getHost = {
    java.getHost()
  }
            def setIdleTimeout(value:Int) = {
          java.setIdleTimeout(value)
          this
  }
            def getIdleTimeout = {
    java.getIdleTimeout()
  }
            def setJdkSslEngineOptions(value:io.vertx.scala.core.net.JdkSSLEngineOptions) = {
          java.setJdkSslEngineOptions(value.java)
          this
  }
                    def setKeyStoreOptions(value:io.vertx.scala.core.net.JksOptions) = {
          java.setKeyStoreOptions(value.java)
          this
  }
                    def setLogActivity(value:Boolean) = {
          java.setLogActivity(value)
          this
  }
            def getLogActivity = {
    java.getLogActivity()
  }
            def setOpenSslEngineOptions(value:io.vertx.scala.core.net.OpenSSLEngineOptions) = {
          java.setOpenSslEngineOptions(value.java)
          this
  }
                    def setPemKeyCertOptions(value:io.vertx.scala.core.net.PemKeyCertOptions) = {
          java.setPemKeyCertOptions(value.java)
          this
  }
                    def setPemTrustOptions(value:io.vertx.scala.core.net.PemTrustOptions) = {
          java.setPemTrustOptions(value.java)
          this
  }
                    def setPfxKeyCertOptions(value:io.vertx.scala.core.net.PfxOptions) = {
          java.setPfxKeyCertOptions(value.java)
          this
  }
                    def setPfxTrustOptions(value:io.vertx.scala.core.net.PfxOptions) = {
          java.setPfxTrustOptions(value.java)
          this
  }
                    def setPort(value:Int) = {
          java.setPort(value)
          this
  }
            def getPort = {
    java.getPort()
  }
            def setReceiveBufferSize(value:Int) = {
          java.setReceiveBufferSize(value)
          this
  }
            def getReceiveBufferSize = {
    java.getReceiveBufferSize()
  }
            def setReconnectAttempts(value:Int) = {
          java.setReconnectAttempts(value)
          this
  }
            def getReconnectAttempts = {
    java.getReconnectAttempts()
  }
            def setReconnectInterval(value:Long) = {
          java.setReconnectInterval(value)
          this
  }
            def getReconnectInterval = {
    java.getReconnectInterval()
  }
            def setReuseAddress(value:Boolean) = {
          java.setReuseAddress(value)
          this
  }
            def isReuseAddress = {
    java.isReuseAddress()
  }
            def setSendBufferSize(value:Int) = {
          java.setSendBufferSize(value)
          this
  }
            def getSendBufferSize = {
    java.getSendBufferSize()
  }
            def setSoLinger(value:Int) = {
          java.setSoLinger(value)
          this
  }
            def getSoLinger = {
    java.getSoLinger()
  }
            def setSsl(value:Boolean) = {
          java.setSsl(value)
          this
  }
            def isSsl = {
    java.isSsl()
  }
            def setTcpKeepAlive(value:Boolean) = {
          java.setTcpKeepAlive(value)
          this
  }
            def isTcpKeepAlive = {
    java.isTcpKeepAlive()
  }
            def setTcpNoDelay(value:Boolean) = {
          java.setTcpNoDelay(value)
          this
  }
            def isTcpNoDelay = {
    java.isTcpNoDelay()
  }
            def setTrafficClass(value:Int) = {
          java.setTrafficClass(value)
          this
  }
            def getTrafficClass = {
    java.getTrafficClass()
  }
            def setTrustAll(value:Boolean) = {
          java.setTrustAll(value)
          this
  }
            def isTrustAll = {
    java.isTrustAll()
  }
            def setTrustStoreOptions(value:io.vertx.scala.core.net.JksOptions) = {
          java.setTrustStoreOptions(value.java)
          this
  }
                    def setUseAlpn(value:Boolean) = {
          java.setUseAlpn(value)
          this
  }
            def isUseAlpn = {
    java.isUseAlpn()
  }
            def setUsePooledBuffers(value:Boolean) = {
          java.setUsePooledBuffers(value)
          this
  }
            def isUsePooledBuffers = {
    java.isUsePooledBuffers()
  }
  }
object EventBusOptions {
  type EventBusOptionsJava = io.vertx.core.eventbus.EventBusOptions
  
  def apply(t: EventBusOptionsJava) = {
    if(t != null)
      new EventBusOptions(t)
    else
      null
   
  }
  
  def fromJson(json: JsonObject):EventBusOptions = {
    if(json != null)
      new EventBusOptions(new EventBusOptionsJava(json))
    else
      null
  }
}
