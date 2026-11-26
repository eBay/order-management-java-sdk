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

package com.ebay.ordermanagement.generated.fulfillment.order.item.shipping_fulfillment.create_additional;

import com.ebay.ordermanagement.generated.fulfillment.models.ErrorResponse;
import com.ebay.ordermanagement.generated.fulfillment.models.ShippingTrackingDetails;
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
 * Builds and executes requests for operations under /order/{order-id}/shipping_fulfillment/create_additional
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAdditionalRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CreateAdditionalRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateAdditionalRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}/shipping_fulfillment/create_additional", pathParameters);
    }
    /**
     * Instantiates a new {@link CreateAdditionalRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CreateAdditionalRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/order/{order%2Did}/shipping_fulfillment/create_additional", rawUrl);
    }
    /**
     * This method is used by sellers to add an additional shipping fulfillment for an order shipped in multiple packages. Each call creates one additional shipping fulfillment for the specified order line items and associates that package with its own tracking number and shipping carrier. Use this method when an order is fulfilled across multiple packages and each package needs to be tracked separately, including when the same line item is shipped in more than one package.&lt;p&gt;Before using this method, determine which line items are included in the additional package. If the package has already shipped, provide the shipment date in the request. If no shipment date is provided, the current date and time are used.&lt;/p&gt;&lt;p&gt;After using &lt;b&gt;createAdditionalShippingFulfillment&lt;/b&gt;, do not use &lt;b&gt;createShippingFulfillment&lt;/b&gt; unless you intend to replace all previously entered fulfillment information.&lt;/p&gt;
     * @param body Details of the additional shipping fulfillment to create for the order.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final ShippingTrackingDetails body) {
        post(body, null);
    }
    /**
     * This method is used by sellers to add an additional shipping fulfillment for an order shipped in multiple packages. Each call creates one additional shipping fulfillment for the specified order line items and associates that package with its own tracking number and shipping carrier. Use this method when an order is fulfilled across multiple packages and each package needs to be tracked separately, including when the same line item is shipped in more than one package.&lt;p&gt;Before using this method, determine which line items are included in the additional package. If the package has already shipped, provide the shipment date in the request. If no shipment date is provided, the current date and time are used.&lt;/p&gt;&lt;p&gt;After using &lt;b&gt;createAdditionalShippingFulfillment&lt;/b&gt;, do not use &lt;b&gt;createShippingFulfillment&lt;/b&gt; unless you intend to replace all previously entered fulfillment information.&lt;/p&gt;
     * @param body Details of the additional shipping fulfillment to create for the order.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 403 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final ShippingTrackingDetails body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("403", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method is used by sellers to add an additional shipping fulfillment for an order shipped in multiple packages. Each call creates one additional shipping fulfillment for the specified order line items and associates that package with its own tracking number and shipping carrier. Use this method when an order is fulfilled across multiple packages and each package needs to be tracked separately, including when the same line item is shipped in more than one package.&lt;p&gt;Before using this method, determine which line items are included in the additional package. If the package has already shipped, provide the shipment date in the request. If no shipment date is provided, the current date and time are used.&lt;/p&gt;&lt;p&gt;After using &lt;b&gt;createAdditionalShippingFulfillment&lt;/b&gt;, do not use &lt;b&gt;createShippingFulfillment&lt;/b&gt; unless you intend to replace all previously entered fulfillment information.&lt;/p&gt;
     * @param body Details of the additional shipping fulfillment to create for the order.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ShippingTrackingDetails body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used by sellers to add an additional shipping fulfillment for an order shipped in multiple packages. Each call creates one additional shipping fulfillment for the specified order line items and associates that package with its own tracking number and shipping carrier. Use this method when an order is fulfilled across multiple packages and each package needs to be tracked separately, including when the same line item is shipped in more than one package.&lt;p&gt;Before using this method, determine which line items are included in the additional package. If the package has already shipped, provide the shipment date in the request. If no shipment date is provided, the current date and time are used.&lt;/p&gt;&lt;p&gt;After using &lt;b&gt;createAdditionalShippingFulfillment&lt;/b&gt;, do not use &lt;b&gt;createShippingFulfillment&lt;/b&gt; unless you intend to replace all previously entered fulfillment information.&lt;/p&gt;
     * @param body Details of the additional shipping fulfillment to create for the order.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ShippingTrackingDetails body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link CreateAdditionalRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateAdditionalRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CreateAdditionalRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
