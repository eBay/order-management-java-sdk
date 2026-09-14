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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.approve.ApproveRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.confirm.ConfirmRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.item.reject.RejectRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/cancellation/{cancelId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCancelItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The approve property
     * @return a {@link ApproveRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ApproveRequestBuilder approve() {
        return new ApproveRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The confirm property
     * @return a {@link ConfirmRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfirmRequestBuilder confirm() {
        return new ConfirmRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The reject property
     * @return a {@link RejectRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public RejectRequestBuilder reject() {
        return new RejectRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCancelItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCancelItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}{?fieldgroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCancelItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCancelItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/{cancelId}{?fieldgroups*}", rawUrl);
    }
    /**
     * This method retrieves the details of a specific cancellation request.  &lt;br/&gt;&lt;br/&gt;The response from this method depends on the value set for the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter. If the value of &lt;b&gt;fieldgroups&lt;/b&gt; is set to &lt;code&gt;SUMMARY&lt;/code&gt;, the response payload is identical to the payload retrieved in the &lt;b&gt;GET /post-order/v2/cancellation/search&lt;/b&gt; method. If you set the value of &lt;b&gt;fieldgroups&lt;/b&gt; to &lt;code&gt;FULL&lt;/code&gt;, the response includes a history of each cancellation request and the list of each line item in the order.&lt;br&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * This method retrieves the details of a specific cancellation request.  &lt;br/&gt;&lt;br/&gt;The response from this method depends on the value set for the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter. If the value of &lt;b&gt;fieldgroups&lt;/b&gt; is set to &lt;code&gt;SUMMARY&lt;/code&gt;, the response payload is identical to the payload retrieved in the &lt;b&gt;GET /post-order/v2/cancellation/search&lt;/b&gt; method. If you set the value of &lt;b&gt;fieldgroups&lt;/b&gt; to &lt;code&gt;FULL&lt;/code&gt;, the response includes a history of each cancellation request and the list of each line item in the order.&lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method retrieves the details of a specific cancellation request.  &lt;br/&gt;&lt;br/&gt;The response from this method depends on the value set for the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter. If the value of &lt;b&gt;fieldgroups&lt;/b&gt; is set to &lt;code&gt;SUMMARY&lt;/code&gt;, the response payload is identical to the payload retrieved in the &lt;b&gt;GET /post-order/v2/cancellation/search&lt;/b&gt; method. If you set the value of &lt;b&gt;fieldgroups&lt;/b&gt; to &lt;code&gt;FULL&lt;/code&gt;, the response includes a history of each cancellation request and the list of each line item in the order.&lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the details of a specific cancellation request.  &lt;br/&gt;&lt;br/&gt;The response from this method depends on the value set for the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter. If the value of &lt;b&gt;fieldgroups&lt;/b&gt; is set to &lt;code&gt;SUMMARY&lt;/code&gt;, the response payload is identical to the payload retrieved in the &lt;b&gt;GET /post-order/v2/cancellation/search&lt;/b&gt; method. If you set the value of &lt;b&gt;fieldgroups&lt;/b&gt; to &lt;code&gt;FULL&lt;/code&gt;, the response includes a history of each cancellation request and the list of each line item in the order.&lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCancelItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCancelItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCancelItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method retrieves the details of a specific cancellation request.  &lt;br/&gt;&lt;br/&gt;The response from this method depends on the value set for the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter. If the value of &lt;b&gt;fieldgroups&lt;/b&gt; is set to &lt;code&gt;SUMMARY&lt;/code&gt;, the response payload is identical to the payload retrieved in the &lt;b&gt;GET /post-order/v2/cancellation/search&lt;/b&gt; method. If you set the value of &lt;b&gt;fieldgroups&lt;/b&gt; to &lt;code&gt;FULL&lt;/code&gt;, the response includes a history of each cancellation request and the list of each line item in the order.&lt;br&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The value set in this query parameter controls the level of detail that is returned in the response. One of the values defined in the &lt;a href=&quot;/devzone/post-order/types/GetCancelFieldGroup.html&quot;&gt;GetCancelFieldGroup&lt;/a&gt; type definition must be used in this query parameter. &lt;br/&gt;&lt;br/&gt; &lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;FULL&lt;/code&gt;. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/can:GetCancelFieldGroup
         */
        @jakarta.annotation.Nullable
        public String fieldgroups;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("fieldgroups", fieldgroups);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
}
