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
package io.vertx.kotlin.ext.web.handler.graphql

import io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions
import io.vertx.ext.web.handler.graphql.GraphiQLOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.GraphQLHandler].
 *
 * @param graphiQLOptions  Configure the GraphiQL development tool.
 * @param requestBatchingEnabled  Whether request batching should be enabled. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions original] using Vert.x codegen.
 */
fun graphQLHandlerOptionsOf(
  graphiQLOptions: io.vertx.ext.web.handler.graphql.GraphiQLOptions? = null,
  requestBatchingEnabled: Boolean? = null): GraphQLHandlerOptions = io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions().apply {

  if (graphiQLOptions != null) {
    this.setGraphiQLOptions(graphiQLOptions)
  }
  if (requestBatchingEnabled != null) {
    this.setRequestBatchingEnabled(requestBatchingEnabled)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions] objects.
 *
 * Options for configuring the [io.vertx.ext.web.handler.graphql.GraphQLHandler].
 *
 * @param graphiQLOptions  Configure the GraphiQL development tool.
 * @param requestBatchingEnabled  Whether request batching should be enabled. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("graphQLHandlerOptionsOf(graphiQLOptions, requestBatchingEnabled)")
)
fun GraphQLHandlerOptions(
  graphiQLOptions: io.vertx.ext.web.handler.graphql.GraphiQLOptions? = null,
  requestBatchingEnabled: Boolean? = null): GraphQLHandlerOptions = io.vertx.ext.web.handler.graphql.GraphQLHandlerOptions().apply {

  if (graphiQLOptions != null) {
    this.setGraphiQLOptions(graphiQLOptions)
  }
  if (requestBatchingEnabled != null) {
    this.setRequestBatchingEnabled(requestBatchingEnabled)
  }
}

