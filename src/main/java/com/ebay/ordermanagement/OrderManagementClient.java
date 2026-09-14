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

package com.ebay.ordermanagement;

import com.ebay.ordermanagement.clients.graphql.ApolloClientFactory;
import com.ebay.ordermanagement.clients.graphql.BearerTokenInterceptor;
import com.ebay.ordermanagement.clients.graphql.DynamicGraphQLClient;
import com.ebay.ordermanagement.clients.graphql.OrderManagementGraphQLClient;
import com.ebay.ordermanagement.clients.rest.FulfillmentClient;
import com.ebay.ordermanagement.clients.rest.LogisticsClient;
import com.ebay.ordermanagement.clients.rest.PostOrderApiClient;
import com.ebay.ordermanagement.configuration.KiotaAuthProvider;
import com.ebay.ordermanagement.configuration.OrderManagementConfiguration;
import com.ebay.ordermanagement.generated.fulfillment.FulfillmentApiClient;
import com.ebay.ordermanagement.generated.logistics.LogisticsApiClient;
import com.ebay.ordermanagement.generated.postorderapi.PostOrderApiApiClient;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * Main facade for the Order Management SDK.
 */
public final class OrderManagementClient implements Closeable {
    private final OkHttpClient sharedHttpClient;
    private final OkHttpClient apolloHttpClient;

    public final FulfillmentClient fulfillment;
    public final LogisticsClient logistics;
    public final PostOrderApiClient postOrderApi;
    public final OrderManagementGraphQLClient graphQL;

    public OrderManagementClient(OrderManagementConfiguration config) {
        this.sharedHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build();

        var authProvider = new BaseBearerTokenAuthenticationProvider(new KiotaAuthProvider(config));

        var fulfillmentAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        fulfillmentAdapter.setBaseUrl(config.getFulfillmentBaseUrl());
        this.fulfillment = new FulfillmentClient(new FulfillmentApiClient(fulfillmentAdapter), config);

        var logisticsAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        logisticsAdapter.setBaseUrl(config.getLogisticsBaseUrl());
        this.logistics = new LogisticsClient(new LogisticsApiClient(logisticsAdapter), config);

        var postOrderApiAdapter = new OkHttpRequestAdapter(authProvider, null, null, sharedHttpClient);
        postOrderApiAdapter.setBaseUrl(config.getPostOrderApiBaseUrl());
        this.postOrderApi = new PostOrderApiClient(new PostOrderApiApiClient(postOrderApiAdapter), config);

        this.apolloHttpClient = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(new BearerTokenInterceptor(config))
            .build();
        var apolloClient = ApolloClientFactory.create(
            config.getGraphQLBaseUrl(),
            apolloHttpClient
        );

        this.graphQL = new OrderManagementGraphQLClient(
            apolloClient,
            new DynamicGraphQLClient(sharedHttpClient, config),
            config
        );
    }

    @Override
    public void close() {
        sharedHttpClient.dispatcher().executorService().shutdown();
        sharedHttpClient.connectionPool().evictAll();
        apolloHttpClient.dispatcher().executorService().shutdown();
        apolloHttpClient.connectionPool().evictAll();
    }
}
