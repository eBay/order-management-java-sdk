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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.close;

import com.ebay.ordermanagement.generated.postorderapi.models.BuyerCloseInquiryRequest;
import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/inquiry/{inquiryId}/close
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloseRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CloseRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloseRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/close", pathParameters);
    }
    /**
     * Instantiates a new {@link CloseRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CloseRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/close", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;This method can be used on behalf of the buyer to close an Item Not Received (INR) inquiry. The inquiry ID is passed in as a path parameter to identify the inquiry to close, and there are two optional request payload fields to provide more information about why the inquiry is being closed.
     * @param body The base request type for the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/close&lt;/b&gt; method, which is used to close an INR inquiry.
     * @return a {@link ClosePostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ClosePostResponse post(@jakarta.annotation.Nonnull final BuyerCloseInquiryRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;This method can be used on behalf of the buyer to close an Item Not Received (INR) inquiry. The inquiry ID is passed in as a path parameter to identify the inquiry to close, and there are two optional request payload fields to provide more information about why the inquiry is being closed.
     * @param body The base request type for the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/close&lt;/b&gt; method, which is used to close an INR inquiry.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ClosePostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ClosePostResponse post(@jakarta.annotation.Nonnull final BuyerCloseInquiryRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ClosePostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;This method can be used on behalf of the buyer to close an Item Not Received (INR) inquiry. The inquiry ID is passed in as a path parameter to identify the inquiry to close, and there are two optional request payload fields to provide more information about why the inquiry is being closed.
     * @param body The base request type for the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/close&lt;/b&gt; method, which is used to close an INR inquiry.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BuyerCloseInquiryRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;This method can be used on behalf of the buyer to close an Item Not Received (INR) inquiry. The inquiry ID is passed in as a path parameter to identify the inquiry to close, and there are two optional request payload fields to provide more information about why the inquiry is being closed.
     * @param body The base request type for the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/close&lt;/b&gt; method, which is used to close an INR inquiry.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BuyerCloseInquiryRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CloseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloseRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CloseRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
