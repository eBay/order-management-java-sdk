// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.ebay.ordermanagement.clients.graphql

import com.ebay.ordermanagement.configuration.OrderManagementConfiguration
import com.ebay.ordermanagement.configuration.TokenContext
import okhttp3.Interceptor
import okhttp3.Response

/**
 * OkHttp interceptor that adds Bearer token authentication to GraphQL requests.
 * Reads token from TokenContext (per-call) or configuration (fallback).
 */
internal class BearerTokenInterceptor(private val config: OrderManagementConfiguration) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = TokenContext.CURRENT.get()
            ?: config.accessToken
            ?: error("No access token. Pass accessToken per-call or set OrderManagementConfiguration.accessToken.")
        return chain.proceed(
            chain.request().newBuilder()
                .header("Authorization", "Bearer $token")
                .build()
        )
    }
}
