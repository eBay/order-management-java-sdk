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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.confirm_refund;

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
 * Builds and executes requests for operations under /post-order/v2/inquiry/{inquiryId}/confirm_refund
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConfirmRefundRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ConfirmRefundRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfirmRefundRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/confirm_refund", pathParameters);
    }
    /**
     * Instantiates a new {@link ConfirmRefundRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ConfirmRefundRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/confirm_refund", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;&lt;p&gt;This method can be used on behalf of the buyer to confirm receipt of a full refund for the order line item that has the INR inquiry. This method has no request or response payloads. The &lt;b&gt;inquiryId&lt;/b&gt; value is passed in as a path parameter, and if the refund is successfully confirmed, an HTTP status code of 200 is returned.&lt;/p&gt;&lt;p&gt;&lt;/p&gt;
     * @return a {@link ConfirmRefundPostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ConfirmRefundPostResponse post() {
        return post(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;&lt;p&gt;This method can be used on behalf of the buyer to confirm receipt of a full refund for the order line item that has the INR inquiry. This method has no request or response payloads. The &lt;b&gt;inquiryId&lt;/b&gt; value is passed in as a path parameter, and if the refund is successfully confirmed, an HTTP status code of 200 is returned.&lt;/p&gt;&lt;p&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ConfirmRefundPostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ConfirmRefundPostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ConfirmRefundPostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;&lt;p&gt;This method can be used on behalf of the buyer to confirm receipt of a full refund for the order line item that has the INR inquiry. This method has no request or response payloads. The &lt;b&gt;inquiryId&lt;/b&gt; value is passed in as a path parameter, and if the refund is successfully confirmed, an HTTP status code of 200 is returned.&lt;/p&gt;&lt;p&gt;&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 16, 2026. &lt;/span&gt;&lt;/span&gt;&lt;p&gt;This method can be used on behalf of the buyer to confirm receipt of a full refund for the order line item that has the INR inquiry. This method has no request or response payloads. The &lt;b&gt;inquiryId&lt;/b&gt; value is passed in as a path parameter, and if the refund is successfully confirmed, an HTTP status code of 200 is returned.&lt;/p&gt;&lt;p&gt;&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ConfirmRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ConfirmRefundRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ConfirmRefundRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
