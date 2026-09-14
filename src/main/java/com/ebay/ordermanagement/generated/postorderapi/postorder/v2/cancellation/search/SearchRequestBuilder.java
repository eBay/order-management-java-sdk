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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.search;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
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
 * Builds and executes requests for operations under /post-order/v2/cancellation/search
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/search{?cancel_id*,creation_date_range_from*,creation_date_range_to*,item_id*,legacy_order_id*,limit*,offset*,role*,sort*,transaction_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/cancellation/search{?cancel_id*,creation_date_range_from*,creation_date_range_to*,item_id*,legacy_order_id*,limit*,offset*,role*,sort*,transaction_id*}", rawUrl);
    }
    /**
     * Use this method to search for and retrieve one or more order cancellations.  &lt;br/&gt;&lt;br/&gt;Specify the search criteria using query parameters.  &lt;br/&gt;&lt;br/&gt;The result set is paginated and returned one page at a time. Depending on the values of the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; parameters, the results set (cancellations matching filter criteria) may contain only one page or multiple pages. If the results set has multiple pages, the user will need to make subsequent calls to view additional pages, adjusting the offset value each time.
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Use this method to search for and retrieve one or more order cancellations.  &lt;br/&gt;&lt;br/&gt;Specify the search criteria using query parameters.  &lt;br/&gt;&lt;br/&gt;The result set is paginated and returned one page at a time. Depending on the values of the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; parameters, the results set (cancellations matching filter criteria) may contain only one page or multiple pages. If the results set has multiple pages, the user will need to make subsequent calls to view additional pages, adjusting the offset value each time.
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
     * Use this method to search for and retrieve one or more order cancellations.  &lt;br/&gt;&lt;br/&gt;Specify the search criteria using query parameters.  &lt;br/&gt;&lt;br/&gt;The result set is paginated and returned one page at a time. Depending on the values of the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; parameters, the results set (cancellations matching filter criteria) may contain only one page or multiple pages. If the results set has multiple pages, the user will need to make subsequent calls to view additional pages, adjusting the offset value each time.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to search for and retrieve one or more order cancellations.  &lt;br/&gt;&lt;br/&gt;Specify the search criteria using query parameters.  &lt;br/&gt;&lt;br/&gt;The result set is paginated and returned one page at a time. Depending on the values of the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; parameters, the results set (cancellations matching filter criteria) may contain only one page or multiple pages. If the results set has multiple pages, the user will need to make subsequent calls to view additional pages, adjusting the offset value each time.
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
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SearchRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Use this method to search for and retrieve one or more order cancellations.  &lt;br/&gt;&lt;br/&gt;Specify the search criteria using query parameters.  &lt;br/&gt;&lt;br/&gt;The result set is paginated and returned one page at a time. Depending on the values of the &lt;b&gt;limit&lt;/b&gt; and &lt;b&gt;offset&lt;/b&gt; parameters, the results set (cancellations matching filter criteria) may contain only one page or multiple pages. If the results set has multiple pages, the user will need to make subsequent calls to view additional pages, adjusting the offset value each time.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The unigue identifier of a specific cancellation request. If this query parameter is used, any other query parameters that are included are ignored since the request will only return this specific cancellation request (if it is found).
         */
        @jakarta.annotation.Nullable
        public String cancelId;
        /**
         * Use the &lt;b&gt;creation_date_range_from&lt;/b&gt; and &lt;b&gt;creation_date_range_to&lt;/b&gt; query parameters to retrieve cancellation requests that were created during a specific time range.  &lt;br/&gt;&lt;br/&gt;Set &lt;b&gt;creation_date_range_from&lt;/b&gt; to the beginning of the time range and set &lt;b&gt;creation_date_range_to&lt;/b&gt; to a date that&apos;s after the start date. Do not set the start date more than 18 months in the past.  &lt;br/&gt;&lt;br/&gt;If you set &lt;b&gt;creation_date_range_from&lt;/b&gt; but do not set  &lt;b&gt;creation_date_range_to&lt;/b&gt;, the service searches through all cancellation requests created at or after the specified time, and searches forward 90 days from there. &lt;br/&gt;&lt;br/&gt;This parameter takes an ISO 8601-formatted date. For example: &lt;br/&gt;&lt;code&gt;2015-05-15T03:00:00.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String creationDateRangeFrom;
        /**
         * Use &lt;b&gt;creation_date_range_to&lt;/b&gt; in conjunction with the &lt;b&gt;creation_date_range_from&lt;/b&gt; query parameter. See &lt;b&gt;creation_date_range_to&lt;/b&gt; for details on how to set this parameter. &lt;br/&gt;&lt;br/&gt;This parameter takes an ISO 8601-formatted date.
         */
        @jakarta.annotation.Nullable
        public String creationDateRangeTo;
        /**
         * The unique eBay-assigned ID of a listing. If this parameter is used, eBay will search for any cancellation requests filed against this listing. &lt;br/&gt;&lt;br/&gt;This parameter is conditionally required if the &lt;b&gt;transaction_id&lt;/b&gt; query parameter is used, as both Item ID and Transaction ID values are needed to identify a line item.
         */
        @jakarta.annotation.Nullable
        public String itemId;
        /**
         * The unique eBay-assigned ID of an order.  If this parameter is used, eBay will search for any cancellation requests filed against this order ID. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Note that order ID values change as an order goes from the unpaid to the paid state, and order IDs in both states are supported with this parameter.
         */
        @jakarta.annotation.Nullable
        public String legacyOrderId;
        /**
         * This parameter specifies the maximum number of order cancellations to return per page of data. If this query parameter is not used, its value defaults to 10 (order cancellations per page)&lt;p&gt;&lt;b&gt;Default: &lt;/b&gt;10 &lt;br/&gt;&lt;b&gt;Maximum:&lt;/b&gt; 500 &lt;br/&gt;&lt;b&gt;Minimum:&lt;/b&gt; 1&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies the number of entries to skip in the result set before returning the first item in the paginated response.  &lt;p&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control how many and which items are returned in the response. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; value of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; value of &lt;code&gt;10&lt;/code&gt;, the first page of the response will contain the first 10 items from the results set. If the &lt;b&gt;offset&lt;/b&gt; value is &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; value is &lt;code&gt;20&lt;/code&gt;, the first page of the response will contain items 11-30 from the results set.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Default:&lt;/b&gt; 0&lt;/p&gt;
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * Use this query parameter to filter the order cancellation results based on who inititated the order cancellation request. The supported values are &lt;code&gt;BUYER&lt;/code&gt; and &lt;code&gt;SELLER&lt;/code&gt;, and both value are case-sensitive (e.g. all CAPS are required).  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;SELLER&lt;/code&gt; For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/zbase:UserRoleFilterEnum
         */
        @jakarta.annotation.Nullable
        public String role;
        /**
         * This query parameter allows a user to sort cancellation requests in the response by &lt;b&gt;CANCEL_ID&lt;/b&gt; or by &lt;b&gt;CANCEL_REQUEST_DATE&lt;/b&gt;, in ascending or descending order. One of these two enumeration values must be used as the &lt;b&gt;sort&lt;/b&gt; value, and will be preceding by either a &lt;code&gt;+&lt;/code&gt; (plus sign) to sort in ascending order, or a &lt;code&gt;-&lt;/code&gt; (minus sign) to sort in descending order. &lt;br/&gt;&lt;br/&gt;So, to sort in ascending order according to cancellation ID, the following syntax would be used: &lt;code&gt;sort=+CANCEL_ID&lt;/code&gt;. To sort in descending order according to cancellation request date, &lt;code&gt;sort=-CANCEL_REQUEST_DATE&lt;/code&gt; would be used. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/can:CancelSortField
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * The unique eBay-assigned ID of the line item purchase. If this parameter is used, the &lt;b&gt;item_id&lt;/b&gt; query parameter must also be used, as both Item ID and Transaction ID values are needed to identify a line item. If you use &lt;b&gt;transaction_id&lt;/b&gt; without also supplying an &lt;b&gt;item_id&lt;/b&gt; value, this parameter is ignored.
         */
        @jakarta.annotation.Nullable
        public String transactionId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("cancel_id", cancelId);
            allQueryParams.put("creation_date_range_from", creationDateRangeFrom);
            allQueryParams.put("creation_date_range_to", creationDateRangeTo);
            allQueryParams.put("item_id", itemId);
            allQueryParams.put("legacy_order_id", legacyOrderId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("role", role);
            allQueryParams.put("sort", sort);
            allQueryParams.put("transaction_id", transactionId);
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
