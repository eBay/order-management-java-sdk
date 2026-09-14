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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.add_shipping_label.AddShippingLabelRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.decide.DecideRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.escalate.EscalateRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.file.FileRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.files.FilesRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.issue_refund.IssueRefundRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.mark_as_received.MarkAsReceivedRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.send_message.SendMessageRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.item.tracking.TrackingRequestBuilder;
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
 * Builds and executes requests for operations under /post-order/v2/return/{returnId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithReturnItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The add_shipping_label property
     * @return a {@link AddShippingLabelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddShippingLabelRequestBuilder addShippingLabel() {
        return new AddShippingLabelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The decide property
     * @return a {@link DecideRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public DecideRequestBuilder decide() {
        return new DecideRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The escalate property
     * @return a {@link EscalateRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EscalateRequestBuilder escalate() {
        return new EscalateRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The file property
     * @return a {@link FileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FileRequestBuilder file() {
        return new FileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The files property
     * @return a {@link FilesRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FilesRequestBuilder files() {
        return new FilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The issue_refund property
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder issueRefund() {
        return new IssueRefundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mark_as_received property
     * @return a {@link MarkAsReceivedRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public MarkAsReceivedRequestBuilder markAsReceived() {
        return new MarkAsReceivedRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The send_message property
     * @return a {@link SendMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMessageRequestBuilder sendMessage() {
        return new SendMessageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tracking property
     * @return a {@link TrackingRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public TrackingRequestBuilder tracking() {
        return new TrackingRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithReturnItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReturnItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}{?fieldgroups*}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithReturnItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithReturnItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/{returnId}{?fieldgroups*}", rawUrl);
    }
    /**
     * Use this method to retrieve information on a specific return request. The user can retrieve either the full details or a summary of the return. When applicable, the full response may also include provisional refund state under &lt;b&gt;detail.refundInfo.provisionalRefund&lt;/b&gt; to indicate whether a provisional refund was provided before return creation and whether that refund was later reversed.&lt;br&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Use this method to retrieve information on a specific return request. The user can retrieve either the full details or a summary of the return. When applicable, the full response may also include provisional refund state under &lt;b&gt;detail.refundInfo.provisionalRefund&lt;/b&gt; to indicate whether a provisional refund was provided before return creation and whether that refund was later reversed.&lt;br&gt;
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
     * Use this method to retrieve information on a specific return request. The user can retrieve either the full details or a summary of the return. When applicable, the full response may also include provisional refund state under &lt;b&gt;detail.refundInfo.provisionalRefund&lt;/b&gt; to indicate whether a provisional refund was provided before return creation and whether that refund was later reversed.&lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to retrieve information on a specific return request. The user can retrieve either the full details or a summary of the return. When applicable, the full response may also include provisional refund state under &lt;b&gt;detail.refundInfo.provisionalRefund&lt;/b&gt; to indicate whether a provisional refund was provided before return creation and whether that refund was later reversed.&lt;br&gt;
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
     * @return a {@link WithReturnItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithReturnItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithReturnItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to retrieve information on a specific return request. The user can retrieve either the full details or a summary of the return. When applicable, the full response may also include provisional refund state under &lt;b&gt;detail.refundInfo.provisionalRefund&lt;/b&gt; to indicate whether a provisional refund was provided before return creation and whether that refund was later reversed.&lt;br&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The &lt;b&gt;fieldgroups&lt;/b&gt; query parameter is used to control whether the response has full details on the return request, or just a summarized set of information. One of the values defined in the &lt;a href=&quot;types/GetReturnFieldGroupEnum.html&quot;&gt;GetReturnFieldGroupEnum&lt;/a&gt; type definition must be used here. If this query parameter is not included in the request, its value defaults to &lt;code&gt;FULL&lt;/code&gt;, which means that only the &lt;b&gt;detail&lt;/b&gt; container will get returned for the return request, and not the &lt;b&gt;summary&lt;/b&gt; container.
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
