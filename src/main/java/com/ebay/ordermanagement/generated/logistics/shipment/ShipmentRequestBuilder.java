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

package com.ebay.ordermanagement.generated.logistics.shipment;

import com.ebay.ordermanagement.generated.logistics.shipment.create_from_shipping_quote.CreateFromShippingQuoteRequestBuilder;
import com.ebay.ordermanagement.generated.logistics.shipment.item.WithShipmentItemRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shipment
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShipmentRequestBuilder extends BaseRequestBuilder {
    /**
     * The create_from_shipping_quote property
     * @return a {@link CreateFromShippingQuoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CreateFromShippingQuoteRequestBuilder createFromShippingQuote() {
        return new CreateFromShippingQuoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.logistics.shipment.item collection
     * @param shipmentId This path parameter specifies the unique eBay-assigned identifier of the shipment you want to retrieve.&lt;br&gt;&lt;br&gt;The &lt;b&gt;shipmentId&lt;/b&gt; value is generated and returned by the &lt;a href=&quot;/api-docs/sell/logistics/resources/shipment/methods/createFromShippingQuote&quot; target=&quot;_blank&quot;&gt;createFromShippingQuote&lt;/a&gt; method.
     * @return a {@link WithShipmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithShipmentItemRequestBuilder byShipmentId(@jakarta.annotation.Nonnull final String shipmentId) {
        Objects.requireNonNull(shipmentId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("shipmentId", shipmentId);
        return new WithShipmentItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link ShipmentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShipmentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment", pathParameters);
    }
    /**
     * Instantiates a new {@link ShipmentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ShipmentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment", rawUrl);
    }
}
