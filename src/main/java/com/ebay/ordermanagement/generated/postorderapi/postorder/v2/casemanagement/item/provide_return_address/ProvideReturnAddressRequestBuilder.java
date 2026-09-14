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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.provide_return_address;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.ReturnAddressRequest;
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
 * Builds and executes requests for operations under /post-order/v2/casemanagement/{caseId}/provide_return_address
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvideReturnAddressRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ProvideReturnAddressRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvideReturnAddressRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}/provide_return_address", pathParameters);
    }
    /**
     * Instantiates a new {@link ProvideReturnAddressRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProvideReturnAddressRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}/provide_return_address", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to provide the correct return address to the buyer. If applicable, and requested by the buyer, the seller can also provide the Return Merchandise Authorization (RMA) number to the buyer through the request payload.&lt;br&gt;&lt;/p&gt;
     * @param body This type is used by the request payload of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; method, and the payload is used to provide the seller&apos;s return address and Return Merchandise Authorization (RMA) number (if applicable) to the seller.
     * @return a {@link ProvideReturnAddressPostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ProvideReturnAddressPostResponse post(@jakarta.annotation.Nonnull final ReturnAddressRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to provide the correct return address to the buyer. If applicable, and requested by the buyer, the seller can also provide the Return Merchandise Authorization (RMA) number to the buyer through the request payload.&lt;br&gt;&lt;/p&gt;
     * @param body This type is used by the request payload of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; method, and the payload is used to provide the seller&apos;s return address and Return Merchandise Authorization (RMA) number (if applicable) to the seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link ProvideReturnAddressPostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public ProvideReturnAddressPostResponse post(@jakarta.annotation.Nonnull final ReturnAddressRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ProvideReturnAddressPostResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to provide the correct return address to the buyer. If applicable, and requested by the buyer, the seller can also provide the Return Merchandise Authorization (RMA) number to the buyer through the request payload.&lt;br&gt;&lt;/p&gt;
     * @param body This type is used by the request payload of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; method, and the payload is used to provide the seller&apos;s return address and Return Merchandise Authorization (RMA) number (if applicable) to the seller.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReturnAddressRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to provide the correct return address to the buyer. If applicable, and requested by the buyer, the seller can also provide the Return Merchandise Authorization (RMA) number to the buyer through the request payload.&lt;br&gt;&lt;/p&gt;
     * @param body This type is used by the request payload of the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/provide_return_address&lt;/b&gt; method, and the payload is used to provide the seller&apos;s return address and Return Merchandise Authorization (RMA) number (if applicable) to the seller.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ReturnAddressRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link ProvideReturnAddressRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvideReturnAddressRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProvideReturnAddressRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
