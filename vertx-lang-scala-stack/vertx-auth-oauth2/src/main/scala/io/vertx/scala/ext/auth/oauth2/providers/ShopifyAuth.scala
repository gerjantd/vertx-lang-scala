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

package io.vertx.scala.ext.auth.oauth2.providers

import io.vertx.lang.scala.HandlerOps._
import scala.reflect.runtime.universe._
import io.vertx.lang.scala.Converter._
import io.vertx.scala.ext.auth.oauth2.OAuth2Auth
import io.vertx.core.http.{HttpClientOptions => JHttpClientOptions}
import io.vertx.ext.auth.oauth2.providers.{ShopifyAuth => JShopifyAuth}
import io.vertx.scala.core.http.HttpClientOptions
import io.vertx.scala.core.Vertx
import io.vertx.ext.auth.oauth2.{OAuth2Auth => JOAuth2Auth}
import io.vertx.core.{Vertx => JVertx}

/**
  * Simplified factory to create an  for Shopify.
  */
class ShopifyAuth(private val _asJava: Object) {

  def asJava = _asJava


}

object ShopifyAuth {
  def apply(asJava: JShopifyAuth) = new ShopifyAuth(asJava)  
  /**
    * Create a OAuth2Auth provider for Shopify
    * @param clientId the client id given to you by Shopify
    * @param clientSecret the client secret given to you by Shopify
    * @param shop your shop name
    */
  def create(vertx: Vertx, clientId: String, clientSecret: String, shop: String): OAuth2Auth = {
    OAuth2Auth(JShopifyAuth.create(vertx.asJava.asInstanceOf[JVertx], clientId.asInstanceOf[java.lang.String], clientSecret.asInstanceOf[java.lang.String], shop.asInstanceOf[java.lang.String]))
  }

  /**
    * Create a OAuth2Auth provider for Shopify
    * @param clientId the client id given to you by Shopify
    * @param clientSecret the client secret given to you by Shopify
    * @param shop your shop name
    * @param httpClientOptions custom http client optionssee <a href="../../../../../../../../../cheatsheet/HttpClientOptions.html">HttpClientOptions</a>
    */
  def create(vertx: Vertx, clientId: String, clientSecret: String, shop: String, httpClientOptions: HttpClientOptions): OAuth2Auth = {
    OAuth2Auth(JShopifyAuth.create(vertx.asJava.asInstanceOf[JVertx], clientId.asInstanceOf[java.lang.String], clientSecret.asInstanceOf[java.lang.String], shop.asInstanceOf[java.lang.String], httpClientOptions.asJava))
  }

}
