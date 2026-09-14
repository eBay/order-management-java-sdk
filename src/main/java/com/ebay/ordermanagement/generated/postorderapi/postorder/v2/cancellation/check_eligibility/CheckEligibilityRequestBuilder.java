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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.check_eligibility;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
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
 * Builds and executes requests for operations under /post-order/v2/cancellation/check_eligibility
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CheckEligibilityRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CheckEligibilityRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckEligibilityRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/check_eligibility", pathParameters);
    }
    /**
     * Instantiates a new {@link CheckEligibilityRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CheckEligibilityRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/check_eligibility", rawUrl);
    }
    /**
     * This method is used to check if a specified order is eligible to be cancelled.  &lt;br/&gt;&lt;br/&gt;The response contains information on cancellation eligibility at the order and order line-item levels.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only an entire order can be cancelled; the cancellation of individual line items in the order is not supported.&lt;/p&gt;  &lt;p&gt;For an order to be eligible for cancellation, all of the line items in the order must be eligible for cancellation.&lt;/p&gt;
     * @param body Binary request body
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final InputStream body) {
        return post(body, null);
    }
    /**
     * This method is used to check if a specified order is eligible to be cancelled.  &lt;br/&gt;&lt;br/&gt;The response contains information on cancellation eligibility at the order and order line-item levels.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only an entire order can be cancelled; the cancellation of individual line items in the order is not supported.&lt;/p&gt;  &lt;p&gt;For an order to be eligible for cancellation, all of the line items in the order must be eligible for cancellation.&lt;/p&gt;
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream post(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This method is used to check if a specified order is eligible to be cancelled.  &lt;br/&gt;&lt;br/&gt;The response contains information on cancellation eligibility at the order and order line-item levels.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only an entire order can be cancelled; the cancellation of individual line items in the order is not supported.&lt;/p&gt;  &lt;p&gt;For an order to be eligible for cancellation, all of the line items in the order must be eligible for cancellation.&lt;/p&gt;
     * @param body Binary request body
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InputStream body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used to check if a specified order is eligible to be cancelled.  &lt;br/&gt;&lt;br/&gt;The response contains information on cancellation eligibility at the order and order line-item levels.  &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, only an entire order can be cancelled; the cancellation of individual line items in the order is not supported.&lt;/p&gt;  &lt;p&gt;For an order to be eligible for cancellation, all of the line items in the order must be eligible for cancellation.&lt;/p&gt;
     * @param body Binary request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final InputStream body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/xml, application/json");
        requestInfo.setStreamContent(body, "application/xml");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CheckEligibilityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CheckEligibilityRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CheckEligibilityRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
