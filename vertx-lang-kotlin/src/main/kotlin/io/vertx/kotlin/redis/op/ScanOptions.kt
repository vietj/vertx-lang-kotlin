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
package io.vertx.kotlin.redis.op

import io.vertx.redis.op.ScanOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.ScanOptions] objects.
 *
 *
 * @param count 
 * @param match 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.ScanOptions original] using Vert.x codegen.
 */
fun scanOptionsOf(
  count: Int? = null,
  match: String? = null): ScanOptions = io.vertx.redis.op.ScanOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.ScanOptions] objects.
 *
 *
 * @param count 
 * @param match 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.ScanOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("scanOptionsOf(count, match)")
)
fun ScanOptions(
  count: Int? = null,
  match: String? = null): ScanOptions = io.vertx.redis.op.ScanOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

