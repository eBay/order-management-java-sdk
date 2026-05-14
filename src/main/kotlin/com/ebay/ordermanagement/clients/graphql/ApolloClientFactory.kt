package com.ebay.ordermanagement.clients.graphql

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.network.http.DefaultHttpEngine
import okhttp3.OkHttpClient

/**
 * Factory for creating Apollo clients.
 * Provides a Java-friendly way to create ApolloClient with custom OkHttp configuration.
 */
object ApolloClientFactory {
    /**
     * Create an ApolloClient with custom OkHttp client.
     * This method is called from Java code in OrderManagementClient.
     */
    @JvmStatic
    fun create(serverUrl: String, okHttpClient: OkHttpClient): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl(serverUrl)
            .httpEngine(DefaultHttpEngine(okHttpClient))
            .build()
    }
}
