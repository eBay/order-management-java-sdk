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

package com.ebay.ordermanagement.generated.logistics.shipment.item;

import com.ebay.ordermanagement.generated.logistics.models.Shipment;
import com.ebay.ordermanagement.generated.logistics.shipment.item.cancel.CancelRequestBuilder;
import com.ebay.ordermanagement.generated.logistics.shipment.item.download_label_file.DownloadLabelFileRequestBuilder;
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
 * Builds and executes requests for operations under /shipment/{shipmentId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithShipmentItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The cancel property
     * @return a {@link CancelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The download_label_file property
     * @return a {@link DownloadLabelFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadLabelFileRequestBuilder downloadLabelFile() {
        return new DownloadLabelFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithShipmentItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithShipmentItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithShipmentItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithShipmentItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}", rawUrl);
    }
    /**
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @return a {@link Shipment}
     */
    @jakarta.annotation.Nullable
    public Shipment get() {
        return get(null);
    }
    /**
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Shipment}
     */
    @jakarta.annotation.Nullable
    public Shipment get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Shipment::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves the shipment details for the specified shipment ID. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithShipmentItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithShipmentItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithShipmentItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
