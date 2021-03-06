/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.amqp

import io.vertx.amqp.AmqpMessage
import io.vertx.amqp.AmqpSender
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.amqp.AmqpSender.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpSender] using Vert.x codegen.
 */
suspend fun AmqpSender.endAwait(): Unit {
  return awaitResult {
    this.end { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpSender.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpSender] using Vert.x codegen.
 */
suspend fun AmqpSender.endAwait(data: AmqpMessage): Unit {
  return awaitResult {
    this.end(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun AmqpSender.writeAwait(data: AmqpMessage): Unit {
  return awaitResult {
    this.write(data) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpSender.sendWithAck]
 *
 * @param message the message, must not be <code>null</code>
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpSender] using Vert.x codegen.
 */
suspend fun AmqpSender.sendWithAckAwait(message: AmqpMessage): Unit {
  return awaitResult {
    this.sendWithAck(message) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.amqp.AmqpSender.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.amqp.AmqpSender] using Vert.x codegen.
 */
suspend fun AmqpSender.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

