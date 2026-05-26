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

package com.ebay.ordermanagement.generated.logistics.shipment.item.download_label_file;

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
 * Builds and executes requests for operations under /shipment/{shipmentId}/download_label_file
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DownloadLabelFileRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link DownloadLabelFileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadLabelFileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}/download_label_file", pathParameters);
    }
    /**
     * Instantiates a new {@link DownloadLabelFileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DownloadLabelFileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}/download_label_file", rawUrl);
    }
    /**
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.sendPrimitive(requestInfo, null, InputStream.class);
    }
    /**
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method returns the shipping label file that was generated for the &lt;b&gt;shipmentId&lt;/b&gt; value specified in the request. Call &lt;b&gt;createFromShippingQuote&lt;/b&gt; to generate a shipment ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Use the &lt;code&gt;Accept&lt;/code&gt; HTTP header to specify the format of the returned file. The default file format is a PDF file. &lt;!-- Are other options available? --&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/pdf");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link DownloadLabelFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DownloadLabelFileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DownloadLabelFileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
