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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped;

import com.ebay.ordermanagement.generated.postorderapi.models.CreateReturnRequest;
import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.WithReturnItemRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.preference.PreferenceRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.search.SearchRequestBuilder;
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
 * Builds and executes requests for operations under /post-order/v2/return
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ReturnRequestBuilder extends BaseRequestBuilder {
    /**
     * The preference property
     * @return a {@link PreferenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PreferenceRequestBuilder preference() {
        return new PreferenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.postorderapi.postOrder.v2.return.item collection
     * @param returnId The unique eBay-assigned ID of the return request. This field is required to identify the return request that the user wishes to retrieve. The return ID value is passed in as part of the call URI.
     * @return a {@link WithReturnItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReturnItemRequestBuilder byReturnId(@jakarta.annotation.Nonnull final String returnId) {
        Objects.requireNonNull(returnId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("returnId", returnId);
        return new WithReturnItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ReturnRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return{?fieldgroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link ReturnRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ReturnRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return{?fieldgroups*}", rawUrl);
    }
    /**
     * This method is used to create a return request on behalf of the buyer. If you are converting a return request draft into an actual return request, you must include the &lt;b&gt;draftId&lt;/b&gt; field in the request. Whether you are creating a return request directly, or converting a return request draft into a return request, you must include values for the &lt;b&gt;itemId&lt;/b&gt;, &lt;b&gt;transactionId&lt;/b&gt;, &lt;b&gt;reason&lt;/b&gt;, &lt;b&gt;returnQuantity&lt;/b&gt;, and &lt;b&gt;type&lt;/b&gt; fields.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is set to &lt;code&gt;FULL&lt;/code&gt;, the response may also include provisional refund information under &lt;b&gt;detail.detail.refundInfo.provisionalRefund&lt;/b&gt;, since the full response uses the same return detail type returned by the &lt;b&gt;Get Return&lt;/b&gt; call.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method, which allows you to create a return request from scratch or to convert a return request draft into a return request.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final CreateReturnRequest body) {
        return post(body, null);
    }
    /**
     * This method is used to create a return request on behalf of the buyer. If you are converting a return request draft into an actual return request, you must include the &lt;b&gt;draftId&lt;/b&gt; field in the request. Whether you are creating a return request directly, or converting a return request draft into a return request, you must include values for the &lt;b&gt;itemId&lt;/b&gt;, &lt;b&gt;transactionId&lt;/b&gt;, &lt;b&gt;reason&lt;/b&gt;, &lt;b&gt;returnQuantity&lt;/b&gt;, and &lt;b&gt;type&lt;/b&gt; fields.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is set to &lt;code&gt;FULL&lt;/code&gt;, the response may also include provisional refund information under &lt;b&gt;detail.detail.refundInfo.provisionalRefund&lt;/b&gt;, since the full response uses the same return detail type returned by the &lt;b&gt;Get Return&lt;/b&gt; call.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method, which allows you to create a return request from scratch or to convert a return request draft into a return request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final CreateReturnRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method is used to create a return request on behalf of the buyer. If you are converting a return request draft into an actual return request, you must include the &lt;b&gt;draftId&lt;/b&gt; field in the request. Whether you are creating a return request directly, or converting a return request draft into a return request, you must include values for the &lt;b&gt;itemId&lt;/b&gt;, &lt;b&gt;transactionId&lt;/b&gt;, &lt;b&gt;reason&lt;/b&gt;, &lt;b&gt;returnQuantity&lt;/b&gt;, and &lt;b&gt;type&lt;/b&gt; fields.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is set to &lt;code&gt;FULL&lt;/code&gt;, the response may also include provisional refund information under &lt;b&gt;detail.detail.refundInfo.provisionalRefund&lt;/b&gt;, since the full response uses the same return detail type returned by the &lt;b&gt;Get Return&lt;/b&gt; call.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method, which allows you to create a return request from scratch or to convert a return request draft into a return request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateReturnRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to create a return request on behalf of the buyer. If you are converting a return request draft into an actual return request, you must include the &lt;b&gt;draftId&lt;/b&gt; field in the request. Whether you are creating a return request directly, or converting a return request draft into a return request, you must include values for the &lt;b&gt;itemId&lt;/b&gt;, &lt;b&gt;transactionId&lt;/b&gt;, &lt;b&gt;reason&lt;/b&gt;, &lt;b&gt;returnQuantity&lt;/b&gt;, and &lt;b&gt;type&lt;/b&gt; fields.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is set to &lt;code&gt;FULL&lt;/code&gt;, the response may also include provisional refund information under &lt;b&gt;detail.detail.refundInfo.provisionalRefund&lt;/b&gt;, since the full response uses the same return detail type returned by the &lt;b&gt;Get Return&lt;/b&gt; call.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @param body The base request type of the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method, which allows you to create a return request from scratch or to convert a return request draft into a return request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateReturnRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ReturnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReturnRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ReturnRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method is used to create a return request on behalf of the buyer. If you are converting a return request draft into an actual return request, you must include the &lt;b&gt;draftId&lt;/b&gt; field in the request. Whether you are creating a return request directly, or converting a return request draft into a return request, you must include values for the &lt;b&gt;itemId&lt;/b&gt;, &lt;b&gt;transactionId&lt;/b&gt;, &lt;b&gt;reason&lt;/b&gt;, &lt;b&gt;returnQuantity&lt;/b&gt;, and &lt;b&gt;type&lt;/b&gt; fields.&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;If the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is set to &lt;code&gt;FULL&lt;/code&gt;, the response may also include provisional refund information under &lt;b&gt;detail.detail.refundInfo.provisionalRefund&lt;/b&gt;, since the full response uses the same return detail type returned by the &lt;b&gt;Get Return&lt;/b&gt; call.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostQueryParameters implements QueryParameters {
        /**
         * The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is used to control the detail level that is returned in the response. One of the values defined in the &lt;a href=&quot;types/GetReturnFieldGroupEnum.html&quot;&gt;GetReturnFieldGroupEnum&lt;/a&gt; type definition must be used here. If this query parameter is not included in the request, its value defaults to &lt;code&gt;NONE&lt;/code&gt;, which means that only the &lt;b&gt;returnId&lt;/b&gt; value for the newly-created return request will be in the response.
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
    public class PostRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public PostQueryParameters queryParameters = new PostQueryParameters();
    }
}
