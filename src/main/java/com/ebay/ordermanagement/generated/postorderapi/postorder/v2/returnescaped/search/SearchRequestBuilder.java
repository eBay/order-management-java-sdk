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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.search;

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
 * Builds and executes requests for operations under /post-order/v2/return/search
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/search{?creation_date_range_from*,creation_date_range_to*,item_id*,limit*,offset*,order_id*,return_id*,return_state*,role*,sort*,states*,transaction_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/return/search{?creation_date_range_from*,creation_date_range_to*,item_id*,limit*,offset*,order_id*,return_id*,return_state*,role*,sort*,states*,transaction_id*}", rawUrl);
    }
    /**
     * Use this method to retrieve the details on one or more  return requests, or a summary of return requests per user. This method supports several filters, supplied as query parameters, that allow you to restrict results by date, return status, return type, or by listing. If you use more than one filter type in the request, Boolean AND logic is applied to the results set. Boolean OR logic is used for conditions within a filter.&lt;br&gt;
     * @return a {@link InputStream}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * Use this method to retrieve the details on one or more  return requests, or a summary of return requests per user. This method supports several filters, supplied as query parameters, that allow you to restrict results by date, return status, return type, or by listing. If you use more than one filter type in the request, Boolean AND logic is applied to the results set. Boolean OR logic is used for conditions within a filter.&lt;br&gt;
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
     * Use this method to retrieve the details on one or more  return requests, or a summary of return requests per user. This method supports several filters, supplied as query parameters, that allow you to restrict results by date, return status, return type, or by listing. If you use more than one filter type in the request, Boolean AND logic is applied to the results set. Boolean OR logic is used for conditions within a filter.&lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this method to retrieve the details on one or more  return requests, or a summary of return requests per user. This method supports several filters, supplied as query parameters, that allow you to restrict results by date, return status, return type, or by listing. If you use more than one filter type in the request, Boolean AND logic is applied to the results set. Boolean OR logic is used for conditions within a filter.&lt;br&gt;
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
     * Use this method to retrieve the details on one or more  return requests, or a summary of return requests per user. This method supports several filters, supplied as query parameters, that allow you to restrict results by date, return status, return type, or by listing. If you use more than one filter type in the request, Boolean AND logic is applied to the results set. Boolean OR logic is used for conditions within a filter.&lt;br&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Specify the &lt;b&gt;creation_date_range_from&lt;/b&gt; and &lt;b&gt;creation_date_range_to&lt;/b&gt; query parameters if you want to retrieve return requests that were created during a specific period of time.  &lt;br/&gt;&lt;br/&gt;Specify the starting date for your date range using the &lt;b&gt;creation_date_range_from&lt;/b&gt; parameter. The date specified must be older than the &lt;b&gt;creation_date_range_to&lt;/b&gt; timestamp and it cannot be set to more than 18 months in the past. If you specify a &lt;b&gt;creation_date_range_from&lt;/b&gt; value, but do not specify a &lt;b&gt;creation_date_range_to&lt;/b&gt; value, the method returns all return requests created at or after the specified timestamp and goes forward for the following 90 days. Use an ISO-8601 date format to specify the timestamp. For example: &lt;code&gt;2021-05-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String creationDateRangeFrom;
        /**
         * Specify the &lt;b&gt;creation_date_range_from&lt;/b&gt; and &lt;b&gt;creation_date_range_to&lt;/b&gt; query parameters if you want to retrieve return requests that were created during a specific period of time.  &lt;br/&gt;&lt;br/&gt;Specify the ending date for your date range using the &lt;b&gt;creation_date_range_to&lt;/b&gt; parameter. The date specified must be more recent than the &lt;b&gt;creation_date_range_from&lt;/b&gt;. If you specify a &lt;b&gt;creation_date_range_to&lt;/b&gt; value, but do not specify a &lt;b&gt;creation_date_range_from&lt;/b&gt;, the method returns all return requests created at or before the specified timestamp, goes backwards for the preceding 90 days. Use an ISO-8601 date format to specify the timestamp. For example: &lt;code&gt;2021-07-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String creationDateRangeTo;
        /**
         * The unique eBay-assigned ID of a listing. If this parameter is used, eBay will search for any return requests filed against this listing. &lt;br/&gt;&lt;br/&gt;This parameter is conditionally required if the &lt;b&gt;transaction_id&lt;/b&gt; query parameter is used, as both Item ID and Transaction ID values are needed to identify a line item.
         */
        @jakarta.annotation.Nullable
        public String itemId;
        /**
         * This parameter specifies the maximum number of return requests to display per page of data. If this query parameter is not used, its value defaults to 25 (return requests per page). &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 1&lt;br/&gt;&lt;b&gt;Max value&lt;/b&gt;: 200&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 25
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies the number of entries to skip in the result set before returning the first item in the paginated response. A 0-based index is used, so page &apos;1&apos; of results is returned if &lt;code&gt;0&lt;/code&gt; is set in this field or if this query parameter is omitted. Specify a positive value equal to or lower than the number of pages available (which you determine by examining the results in the &lt;b&gt;paginationOutput&lt;/b&gt; container of your initial call).&lt;br/&gt;&lt;br/&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control how many and which items are returned in the response.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 0&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * The unique ID of an order. An &lt;b&gt;order_id&lt;/b&gt; value is provided as a query parameter if the user wants to see if a return request was filed against one or more order line items in the order specified in this field.  &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;b&gt;Note:&lt;/b&gt; The order ID value changes as an order goes from the unpaid to the paid state.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String orderId;
        /**
         * The unigue identifier of a specific return request. If this query parameter is used, any other query parameters that are included are ignored since the request will only return this specific return request (if it is found).
         */
        @jakarta.annotation.Nullable
        public String returnId;
        /**
         * This query parameter is used if the user wants to search for return requests in a specific return state classification, such as all open requests, or return requests where the seller&apos;s response is currently due. One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/ReturnCountFilterEnum.html&quot;&gt;ReturnCountFilterEnum&lt;/a&gt; type definition must be used in this query parameter.
         */
        @jakarta.annotation.Nullable
        public String returnState;
        /**
         * Use this query parameter to get return actions that were initiated by either the buyer or the seller. The supported values are &lt;code&gt;BUYER&lt;/code&gt; and &lt;code&gt;SELLER&lt;/code&gt;, and both value are case-sensitive (e.g. all CAPS are required).
         */
        @jakarta.annotation.Nullable
        public String role;
        /**
         * This query parameter allows a user to sort cancellation requests in the response by &lt;code&gt;ACTUAL_AMOUNT&lt;/code&gt;, &lt;code&gt;BUYER_LOGIN_NAME&lt;/code&gt;, &lt;code&gt;ESTIMATED_AMOUNT&lt;/code&gt;, &lt;code&gt;FILING_DATE&lt;/code&gt;, &lt;code&gt;REASON&lt;/code&gt;, &lt;code&gt;REFUND_DUE_DATE&lt;/code&gt;, &lt;code&gt;RETURN_ID&lt;/code&gt;, or &lt;code&gt;STATUS&lt;/code&gt; in ascending or descending order. One of these enumeration values must be used as the &lt;b&gt;sort&lt;/b&gt; value, and will be preceding by either a &lt;code&gt;+&lt;/code&gt; (plus sign) to sort in ascending order, or a &lt;code&gt;-&lt;/code&gt; (minus sign) to sort in descending order. &lt;br/&gt;&lt;br/&gt;So, to sort in ascending order according to the actual refund amount, the following syntax would be used: &lt;code&gt;sort=+ACTUAL_AMOUNT&lt;/code&gt;. To sort in descending order according to return creation date, &lt;code&gt;sort=-FILING_DATE&lt;/code&gt; would be used. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/ret:ReturnSortField
         */
        @jakarta.annotation.Nullable
        public String sort;
        /**
         * This query parameter is used if the user wants to search for return requests in a specific state in the return process. One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/ReturnStateEnum.html&quot;&gt;ReturnStateEnum&lt;/a&gt; type definition must be used in this query parameter. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/ret:ReturnStateEnum
         */
        @jakarta.annotation.Nullable
        public String states;
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
            allQueryParams.put("creation_date_range_from", creationDateRangeFrom);
            allQueryParams.put("creation_date_range_to", creationDateRangeTo);
            allQueryParams.put("item_id", itemId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_id", orderId);
            allQueryParams.put("return_id", returnId);
            allQueryParams.put("return_state", returnState);
            allQueryParams.put("role", role);
            allQueryParams.put("sort", sort);
            allQueryParams.put("states", states);
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
