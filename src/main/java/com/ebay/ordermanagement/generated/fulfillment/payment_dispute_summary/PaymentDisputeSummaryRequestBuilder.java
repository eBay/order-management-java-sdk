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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute_summary;

import com.ebay.ordermanagement.generated.fulfillment.models.DisputeSummaryResponse;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
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
 * Builds and executes requests for operations under /payment_dispute_summary
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeSummaryRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link PaymentDisputeSummaryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentDisputeSummaryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute_summary{?buyer_username*,limit*,offset*,open_date_from*,open_date_to*,order_id*,payment_dispute_status*}", pathParameters);
    }
    /**
     * Instantiates a new {@link PaymentDisputeSummaryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PaymentDisputeSummaryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute_summary{?buyer_username*,limit*,offset*,open_date_from*,open_date_to*,order_id*,payment_dispute_status*}", rawUrl);
    }
    /**
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br&gt;&lt;br&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br&gt;&lt;br&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.
     * @return a {@link DisputeSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public DisputeSummaryResponse get() {
        return get(null);
    }
    /**
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br&gt;&lt;br&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br&gt;&lt;br&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link DisputeSummaryResponse}
     */
    @jakarta.annotation.Nullable
    public DisputeSummaryResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DisputeSummaryResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br&gt;&lt;br&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br&gt;&lt;br&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br&gt;&lt;br&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br&gt;&lt;br&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link PaymentDisputeSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentDisputeSummaryRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new PaymentDisputeSummaryRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned:&lt;ul&gt;&lt;li&gt;Dispute filed against a specific order (&lt;b&gt;order_id&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed by a specific buyer (&lt;b&gt;buyer_username&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;li&gt;Dispute(s) filed within a specific date range (&lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; parameters are used)&lt;/li&gt;&lt;li&gt;Disputes in a specific state (&lt;b&gt;payment_dispute_status&lt;/b&gt; parameter is used)&lt;/li&gt;&lt;/ul&gt;More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used.&lt;br&gt;&lt;br&gt;If none of the filters are used, all open and recently closed payment disputes are returned.&lt;br&gt;&lt;br&gt;Pagination is also available. See the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; fields for more information on how pagination is used for this method.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This filter is used if the seller wishes to retrieve one or more payment disputes opened by a specific buyer. The string that is passed in to this query parameter is the eBay user ID of the buyer.
         */
        @jakarta.annotation.Nullable
        public String buyerUsername;
        /**
         * The value passed in this query parameter sets the maximum number of payment disputes to return per page of data. The value passed in this field should be an integer from 1 to 200. If this query parameter is not set, up to 200 records will be returned on each page of results.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 1&lt;br&gt;&lt;br&gt; &lt;b&gt;Max&lt;/b&gt;: 200&lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: 200
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This field is used to specify the number of records to skip in the result set before returning the first payment dispute in the paginated response. A zero-based index is used, so if you set the &lt;b&gt;offset&lt;/b&gt; value to &lt;code&gt;0&lt;/code&gt; (default value), the first payment dispute in the result set appears at the top of the response. &lt;br&gt;&lt;br&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; parameter to control the payment disputes returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; value of &lt;code&gt;10&lt;/code&gt;, the response will contain the first 10 payment disputes from the result set that matches the input criteria. If you supply an &lt;b&gt;offset&lt;/b&gt; value of &lt;code&gt;10&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; value of &lt;code&gt;20&lt;/code&gt;, the response will contain payment disputes 11-30 from the result set that matches the input criteria.&lt;br&gt;&lt;br&gt;&lt;b&gt;Min&lt;/b&gt;: 0 &lt;br&gt;&lt;br&gt;&lt;b&gt;Default&lt;/b&gt;: 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * The &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.&lt;br&gt;&lt;br&gt;The &lt;b&gt;open_date_from&lt;/b&gt; field sets the beginning date of the date range, and can be set as far back as 18 months from the present time. If a &lt;b&gt;open_date_from&lt;/b&gt; field is used, but a &lt;b&gt;open_date_to&lt;/b&gt; field is not used, the &lt;b&gt;open_date_to&lt;/b&gt; value will default to 90 days after the date specified in the &lt;b&gt;open_date_from&lt;/b&gt; field, or to the present time if less than 90 days in the past.&lt;br&gt;&lt;br&gt;The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String openDateFrom;
        /**
         * The &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; date filters are used if the seller wishes to retrieve payment disputes opened within a specific date range. A maximum date range that may be set with the &lt;b&gt;open_date_from&lt;/b&gt; and/or &lt;b&gt;open_date_to&lt;/b&gt; filters is 90 days. These date filters use the ISO-8601 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu.&lt;br&gt;&lt;br&gt;The &lt;b&gt;open_date_to&lt;/b&gt; field sets the ending date of the date range, and can be set up to 90 days from the date set in the &lt;b&gt;open_date_from&lt;/b&gt; field. &lt;br&gt;&lt;br&gt;The ISO-8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String openDateTo;
        /**
         * This filter is used if the seller wishes to retrieve one or more payment disputes filed against a specific order. It is possible that there can be more than one dispute filed against an order if the order has multiple line items. If this filter is used, any other filters are ignored.&lt;br&gt;&lt;br&gt;Use the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank &quot;&gt;getOrders&lt;/a&gt; method to retrieve order IDs. Order ID values are also shown in My eBay/Seller Hub.
         */
        @jakarta.annotation.Nullable
        public String orderId;
        /**
         * This filter is used if the seller wishes to only retrieve payment disputes in one or more specific states. To filter by more than one status value, a separate &lt;b&gt;payment_dispute_status&lt;/b&gt; filter must be used for each value, as shown below:&lt;br&gt;&lt;br&gt;&lt;i&gt;https://apiz.ebay.com/sell/fulfillment/v1/payment_dispute_summary?payment_dispute_status=OPEN&amp;payment_dispute_status=ACTION_NEEDED&lt;/i&gt; &lt;br&gt;&lt;br&gt;If no &lt;b&gt;payment_dispute_status&lt;/b&gt; filter is used, payment disputes in all states are returned in the response.&lt;br&gt;&lt;br&gt;See &lt;a href=&quot;/api-docs/sell/fulfillment/types/api:DisputeStateEnum&quot; target=&quot;_blank &quot;&gt;DisputeStatusEnum&lt;/a&gt; type for supported values.
         */
        @jakarta.annotation.Nullable
        public String paymentDisputeStatus;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("buyer_username", buyerUsername);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("open_date_from", openDateFrom);
            allQueryParams.put("open_date_to", openDateTo);
            allQueryParams.put("order_id", orderId);
            allQueryParams.put("payment_dispute_status", paymentDisputeStatus);
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
