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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.search;

import com.ebay.ordermanagement.generated.postorderapi.models.CaseSearchResponse;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/casemanagement/search
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/search{?case_creation_date_range_from*,case_creation_date_range_to*,case_status_filter*,fieldgroups*,item_id*,limit*,offset*,order_id*,return_id*,sort*,transaction_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/search{?case_creation_date_range_from*,case_creation_date_range_to*,case_status_filter*,fieldgroups*,item_id*,limit*,offset*,order_id*,return_id*,sort*,transaction_id*}", rawUrl);
    }
    /**
     * This method is used to search for return requests and Item Not Received inquiries that have been escalated to eBay cases by the buyer. &lt;br/&gt;&lt;br/&gt;There are multiple filters available for this method, including the following:&lt;ul&gt;&lt;li&gt;Searching by item ID&lt;/li&gt;&lt;li&gt;Searching by order ID (or item ID/transaction ID)&lt;/li&gt;&lt;li&gt;Searching by return ID&lt;/li&gt;&lt;li&gt;Searching by case status&lt;/li&gt;&lt;li&gt;Searching by case creation date&lt;/li&gt;&lt;/ul&gt;Pagination is also available for this method that allows the user to control how many and which cases are returned in the results set.
     * @return a {@link CaseSearchResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CaseSearchResponse get() {
        return get(null);
    }
    /**
     * This method is used to search for return requests and Item Not Received inquiries that have been escalated to eBay cases by the buyer. &lt;br/&gt;&lt;br/&gt;There are multiple filters available for this method, including the following:&lt;ul&gt;&lt;li&gt;Searching by item ID&lt;/li&gt;&lt;li&gt;Searching by order ID (or item ID/transaction ID)&lt;/li&gt;&lt;li&gt;Searching by return ID&lt;/li&gt;&lt;li&gt;Searching by case status&lt;/li&gt;&lt;li&gt;Searching by case creation date&lt;/li&gt;&lt;/ul&gt;Pagination is also available for this method that allows the user to control how many and which cases are returned in the results set.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CaseSearchResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CaseSearchResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CaseSearchResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to search for return requests and Item Not Received inquiries that have been escalated to eBay cases by the buyer. &lt;br/&gt;&lt;br/&gt;There are multiple filters available for this method, including the following:&lt;ul&gt;&lt;li&gt;Searching by item ID&lt;/li&gt;&lt;li&gt;Searching by order ID (or item ID/transaction ID)&lt;/li&gt;&lt;li&gt;Searching by return ID&lt;/li&gt;&lt;li&gt;Searching by case status&lt;/li&gt;&lt;li&gt;Searching by case creation date&lt;/li&gt;&lt;/ul&gt;Pagination is also available for this method that allows the user to control how many and which cases are returned in the results set.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method is used to search for return requests and Item Not Received inquiries that have been escalated to eBay cases by the buyer. &lt;br/&gt;&lt;br/&gt;There are multiple filters available for this method, including the following:&lt;ul&gt;&lt;li&gt;Searching by item ID&lt;/li&gt;&lt;li&gt;Searching by order ID (or item ID/transaction ID)&lt;/li&gt;&lt;li&gt;Searching by return ID&lt;/li&gt;&lt;li&gt;Searching by case status&lt;/li&gt;&lt;li&gt;Searching by case creation date&lt;/li&gt;&lt;/ul&gt;Pagination is also available for this method that allows the user to control how many and which cases are returned in the results set.
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
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SearchRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This method is used to search for return requests and Item Not Received inquiries that have been escalated to eBay cases by the buyer. &lt;br/&gt;&lt;br/&gt;There are multiple filters available for this method, including the following:&lt;ul&gt;&lt;li&gt;Searching by item ID&lt;/li&gt;&lt;li&gt;Searching by order ID (or item ID/transaction ID)&lt;/li&gt;&lt;li&gt;Searching by return ID&lt;/li&gt;&lt;li&gt;Searching by case status&lt;/li&gt;&lt;li&gt;Searching by case creation date&lt;/li&gt;&lt;/ul&gt;Pagination is also available for this method that allows the user to control how many and which cases are returned in the results set.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * The &lt;b&gt;case_creation_date_range_from&lt;/b&gt; and &lt;b&gt;case_creation_date_range_to&lt;/b&gt; query parameters are used if the user wants to retrieve cases that were created during a specific time range. The starting date range is input into the &lt;b&gt;case_creation_date_range_from&lt;/b&gt; query parameter. The &lt;b&gt;case_creation_date_range_from&lt;/b&gt; date must be older than the &lt;b&gt;case_creation_date_range_to&lt;/b&gt; date, and it cannot be set back more than 18 months in the past. If the &lt;b&gt;case_creation_date_range_from&lt;/b&gt; query parameter is used, but the &lt;b&gt;case_creation_date_range_to&lt;/b&gt; query parameter is not used, the method will look for all cases created at or after this date/time, going forward 90 days from this date. The ISO-8601 date format should be used for this query parameter. Here&apos;s a sample of that format: &lt;code&gt;2015-05-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String caseCreationDateRangeFrom;
        /**
         * The &lt;b&gt;case_creation_date_range_from&lt;/b&gt; and &lt;b&gt;case_creation_date_range_to&lt;/b&gt; query parameters are used if the user wants to retrieve cases that were created during a specific time range. The ending date range is input into the &lt;b&gt;case_creation_date_range_to&lt;/b&gt; query parameter. The &lt;b&gt;case_creation_date_range_to&lt;/b&gt; date must be more recent than the &lt;b&gt;case_creation_date_range_from&lt;/b&gt; date. If the &lt;b&gt;case_creation_date_range_from&lt;/b&gt; query parameter is used, but the &lt;b&gt;case_creation_date_range_to&lt;/b&gt; query parameter is not used, the method will look for all cases created at or after the &lt;b&gt;case_creation_date_range_from&lt;/b&gt; value, going forward 90 days from this date. The ISO-8601 date format should be used for this query parameter. Here&apos;s a sample of that format: &lt;code&gt;2015-05-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String caseCreationDateRangeTo;
        /**
         * This query parameter is used if the user wants to search for cases in a specific state. One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusFilter.html&quot;&gt;CaseStatusFilter&lt;/a&gt; type definition must be used in this query parameter. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/res:CaseStatusFilter
         */
        @jakarta.annotation.Nullable
        public String caseStatusFilter;
        /**
         * In the future, the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter may be used in the request to control the amount of detail that is returned in the response, but for now, the scope of the response will be the same even if this query parameter is used and set to &lt;code&gt;DEFAULT&lt;/code&gt;, which is the only supported value. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/res:CaseSearchFieldGroupEnum
         */
        @jakarta.annotation.Nullable
        public String fieldgroups;
        /**
         * The unique eBay-assigned ID of a listing. If this parameter is used, eBay will search for any cases filed against this listing. &lt;br/&gt;&lt;br/&gt;This parameter is conditionally required if the &lt;b&gt;transaction_id&lt;/b&gt; query parameter is used, as both Item ID and Transaction ID values are needed to identify a line item.
         */
        @jakarta.annotation.Nullable
        public String itemId;
        /**
         * This parameter specifies the maximum number of cases to display per page of data. If this query parameter is not used, its value defaults to 25 (cases per page). &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 1&lt;br/&gt;&lt;b&gt;Max value&lt;/b&gt;: 200&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 25
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies the number of entries to skip in the result set before returning the first item in the paginated response. A 0-based index is used, so page &apos;1&apos; of results is returned if &lt;code&gt;0&lt;/code&gt; is set in this field or if this query parameter is omitted. Specify a positive value equal to or lower than the number of pages available (which you determine by examining the results in the &lt;b&gt;paginationOutput&lt;/b&gt; container of your initial call).&lt;br/&gt;&lt;br/&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control how many and which items are returned in the response.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 0&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * The unique ID of an order. An &lt;b&gt;order_id&lt;/b&gt; value is provided as a query parameter if the user wants to see if a case was filed against one or more order line items in the order specified in this field.  &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;b&gt;Note:&lt;/b&gt; The order ID value changes as an order goes from the unpaid to the paid state.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String orderId;
        /**
         * The unique identifier of a return request. A &lt;b&gt;return_id&lt;/b&gt; value is provided as a query parameter if the user wants to see if a particular return request has been escalated to a case.
         */
        @jakarta.annotation.Nullable
        public String returnId;
        /**
         * This query parameter is used if you want to control whether cases are retrieved in descending order (most recent cases returned at top of the response) or ascending order (oldest cases returned at top of the response). If this query parameter is used, either &lt;code&gt;Descending&lt;/code&gt; or &lt;code&gt;Ascending&lt;/code&gt; must be used as the value.&lt;br/&gt;&lt;br/&gt;&lt;code&gt;Descending&lt;/code&gt; is the default value, so this query parameter is more useful if you want to sort cases in ascending order.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: Descending 
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
            allQueryParams.put("case_creation_date_range_from", caseCreationDateRangeFrom);
            allQueryParams.put("case_creation_date_range_to", caseCreationDateRangeTo);
            allQueryParams.put("case_status_filter", caseStatusFilter);
            allQueryParams.put("fieldgroups", fieldgroups);
            allQueryParams.put("item_id", itemId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_id", orderId);
            allQueryParams.put("return_id", returnId);
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
