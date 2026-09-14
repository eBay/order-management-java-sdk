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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.search;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.InquirySearchResponse;
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
 * Builds and executes requests for operations under /post-order/v2/inquiry/search
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SearchRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/search{?fieldgroups*,inquiry_creation_date_range_from*,inquiry_creation_date_range_to*,inquiry_status*,item_id*,limit*,offset*,order_id*,sort*,transaction_id*}", pathParameters);
    }
    /**
     * Instantiates a new {@link SearchRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SearchRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/search{?fieldgroups*,inquiry_creation_date_range_from*,inquiry_creation_date_range_to*,inquiry_status*,item_id*,limit*,offset*,order_id*,sort*,transaction_id*}", rawUrl);
    }
    /**
     * This method is used to search for INR inquiries using multiple filter types.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Inquiries that have been escalated to cases are excluded from &lt;b&gt;searchInquiries&lt;/b&gt; results. Use &lt;a href=&quot;/devzone/post-order/post-order_v2_casemanagement-caseId__get.html&quot;&gt;getCase&lt;/a&gt; to locate the escalated case and the other &lt;b&gt;Post-Order Case Management Calls&lt;/b&gt; to manage escalated items. The &lt;a href=&quot;/devzone/post-order/post-order_v2_inquiry-inquiryId__get.html&quot;&gt;getInquiry&lt;/a&gt; endpoint may still return the original inquiry for historical context.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @return a {@link InquirySearchResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InquirySearchResponse get() {
        return get(null);
    }
    /**
     * This method is used to search for INR inquiries using multiple filter types.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Inquiries that have been escalated to cases are excluded from &lt;b&gt;searchInquiries&lt;/b&gt; results. Use &lt;a href=&quot;/devzone/post-order/post-order_v2_casemanagement-caseId__get.html&quot;&gt;getCase&lt;/a&gt; to locate the escalated case and the other &lt;b&gt;Post-Order Case Management Calls&lt;/b&gt; to manage escalated items. The &lt;a href=&quot;/devzone/post-order/post-order_v2_inquiry-inquiryId__get.html&quot;&gt;getInquiry&lt;/a&gt; endpoint may still return the original inquiry for historical context.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InquirySearchResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InquirySearchResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, InquirySearchResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used to search for INR inquiries using multiple filter types.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Inquiries that have been escalated to cases are excluded from &lt;b&gt;searchInquiries&lt;/b&gt; results. Use &lt;a href=&quot;/devzone/post-order/post-order_v2_casemanagement-caseId__get.html&quot;&gt;getCase&lt;/a&gt; to locate the escalated case and the other &lt;b&gt;Post-Order Case Management Calls&lt;/b&gt; to manage escalated items. The &lt;a href=&quot;/devzone/post-order/post-order_v2_inquiry-inquiryId__get.html&quot;&gt;getInquiry&lt;/a&gt; endpoint may still return the original inquiry for historical context.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method is used to search for INR inquiries using multiple filter types.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Inquiries that have been escalated to cases are excluded from &lt;b&gt;searchInquiries&lt;/b&gt; results. Use &lt;a href=&quot;/devzone/post-order/post-order_v2_casemanagement-caseId__get.html&quot;&gt;getCase&lt;/a&gt; to locate the escalated case and the other &lt;b&gt;Post-Order Case Management Calls&lt;/b&gt; to manage escalated items. The &lt;a href=&quot;/devzone/post-order/post-order_v2_inquiry-inquiryId__get.html&quot;&gt;getInquiry&lt;/a&gt; endpoint may still return the original inquiry for historical context.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
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
     * This method is used to search for INR inquiries using multiple filter types.&lt;br&gt;&lt;p&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;Inquiries that have been escalated to cases are excluded from &lt;b&gt;searchInquiries&lt;/b&gt; results. Use &lt;a href=&quot;/devzone/post-order/post-order_v2_casemanagement-caseId__get.html&quot;&gt;getCase&lt;/a&gt; to locate the escalated case and the other &lt;b&gt;Post-Order Case Management Calls&lt;/b&gt; to manage escalated items. The &lt;a href=&quot;/devzone/post-order/post-order_v2_inquiry-inquiryId__get.html&quot;&gt;getInquiry&lt;/a&gt; endpoint may still return the original inquiry for historical context.&lt;/span&gt;&lt;/p&gt;&lt;br&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * In the future, the &lt;b&gt;fieldgroups&lt;/b&gt; query parameter may be used in the request to control the amount of detail that is returned in the response, but for now, the scope of the response will be the same even if this query parameter is used and set to &lt;code&gt;DEFAULT&lt;/code&gt;, which is the only supported value. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/res:InquirySearchFieldGroupEnum
         */
        @jakarta.annotation.Nullable
        public String fieldgroups;
        /**
         * The &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; and &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; query parameters are used if the user wants to retrieve inquiries that were created during a specific time range. The starting date range is input into the &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; query parameter. The &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; date must be older than the &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; date, and it cannot be set back more than 18 months in the past. If the &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; query parameter is used, but the &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; query parameter is not used, the method will look for all inquiries created at or after this date/time, going forward 90 days from this date. The ISO-8601 date format should be used for this query parameter. Here&apos;s a sample of that format: &lt;code&gt;2015-05-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String inquiryCreationDateRangeFrom;
        /**
         * The &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; and &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; query parameters are used if the user wants to retrieve inquiries that were created during a specific time range. The ending date range is input into the &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; query parameter. The &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; date must be more recent than the &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; date. If the &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; query parameter is used, but the &lt;b&gt;inquiry_creation_date_range_to&lt;/b&gt; query parameter is not used, the method will look for all inquiries created at or after the &lt;b&gt;inquiry_creation_date_range_from&lt;/b&gt; value, going forward 90 days from this date. The ISO-8601 date format should be used for this query parameter. Here&apos;s a sample of that format: &lt;code&gt;2015-05-15T03:52:39.000Z&lt;/code&gt;.
         */
        @jakarta.annotation.Nullable
        public String inquiryCreationDateRangeTo;
        /**
         * This query parameter is used if the user wants to search for INR inquiries in a specific state. One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/InquirySearchFieldGroupEnum.html&quot;&gt;InquirySearchFieldGroupEnum&lt;/a&gt; type definition must be used in this query parameter. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/post-order/post-order/types/res:InquiryStatusFilter
         */
        @jakarta.annotation.Nullable
        public String inquiryStatus;
        /**
         * The unique eBay-assigned ID of a listing. If this parameter is used, eBay will search for any INR inquiries filed against this listing. &lt;br/&gt;&lt;br/&gt;This parameter is conditionally required if the &lt;b&gt;transaction_id&lt;/b&gt; query parameter is used, as both Item ID and Transaction ID values are needed to identify a line item.
         */
        @jakarta.annotation.Nullable
        public String itemId;
        /**
         * This parameter specifies the maximum number of INR inquiries to display per page of data. If this query parameter is not used, its value defaults to 25 (inquiries per page). &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 1&lt;br/&gt;&lt;b&gt;Max value&lt;/b&gt;: 200&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 25
         */
        @jakarta.annotation.Nullable
        public String limit;
        /**
         * This parameter specifies the number of entries to skip in the result set before returning the first item in the paginated response. A 0-based index is used, so page &apos;1&apos; of results is returned if &lt;code&gt;0&lt;/code&gt; is set in this field or if this query parameter is omitted. Specify a positive value equal to or lower than the number of pages available (which you determine by examining the results in the &lt;b&gt;paginationOutput&lt;/b&gt; container of your initial call).&lt;br/&gt;&lt;br/&gt;Combine &lt;b&gt;offset&lt;/b&gt; with the &lt;b&gt;limit&lt;/b&gt; query parameter to control how many and which items are returned in the response.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Min value&lt;/b&gt;: 0&lt;br/&gt;&lt;b&gt;Default value&lt;/b&gt;: 0
         */
        @jakarta.annotation.Nullable
        public String offset;
        /**
         * The unique ID of an order. An &lt;b&gt;order_id&lt;/b&gt; value is provided as a query parameter if the user wants to see if an inquiry was filed against one or more order line items in the order specified in this field.  &lt;br/&gt;&lt;br/&gt;&lt;span class=&quot;tablenote&quot;&gt; &lt;b&gt;Note:&lt;/b&gt; The order ID value changes as an order goes from the unpaid to the paid state.&lt;/span&gt;
         */
        @jakarta.annotation.Nullable
        public String orderId;
        /**
         * This query parameter is used if you want to control whether INR inquiries are retrieved in descending order (most recent inquiries returned at top of the response) or ascending order (oldest inquiries returned at top of the response). If this query parameter is used, either &lt;code&gt;Descending&lt;/code&gt; or &lt;code&gt;Ascending&lt;/code&gt; must be used as the value.&lt;br/&gt;&lt;br/&gt;&lt;code&gt;Descending&lt;/code&gt; is the default value, so this query parameter is more useful if you want to sort inquiries in ascending order.&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default&lt;/b&gt;: Descending 
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
            allQueryParams.put("fieldgroups", fieldgroups);
            allQueryParams.put("inquiry_creation_date_range_from", inquiryCreationDateRangeFrom);
            allQueryParams.put("inquiry_creation_date_range_to", inquiryCreationDateRangeTo);
            allQueryParams.put("inquiry_status", inquiryStatus);
            allQueryParams.put("item_id", itemId);
            allQueryParams.put("limit", limit);
            allQueryParams.put("offset", offset);
            allQueryParams.put("order_id", orderId);
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
