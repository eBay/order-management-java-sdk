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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.fetch_evidence_content;

import com.ebay.ordermanagement.generated.fulfillment.models.ErrorResponse;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/fetch_evidence_content
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FetchEvidenceContentRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link FetchEvidenceContentRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchEvidenceContentRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/fetch_evidence_content?evidence_id={evidence_id}&file_id={file_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link FetchEvidenceContentRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FetchEvidenceContentRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/fetch_evidence_content?evidence_id={evidence_id}&file_id={file_id}", rawUrl);
    }
    /**
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank&quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;
     * @return a {@link InputStream}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get() {
        return get(null);
    }
    /**
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank&quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link InputStream}
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public InputStream get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.sendPrimitive(requestInfo, errorMapping, InputStream.class);
    }
    /**
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank&quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank&quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/octet-stream, application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link FetchEvidenceContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FetchEvidenceContentRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FetchEvidenceContentRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;payment_dispute_id&lt;/strong&gt;: the identifier of the payment dispute. The identifier of each payment dispute is returned in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank&quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;evidence_id&lt;/strong&gt;: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;file_id&lt;/strong&gt;: the identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter. The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank&quot;&gt;getPaymentDispute&lt;/a&gt; response.&lt;/li&gt;&lt;/ul&gt;&lt;p&gt;An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.&lt;/p&gt;
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * This query parameter is used to specify the unique identifier of the evidential file set.&lt;br&gt;&lt;br&gt;The identifier of an evidential file set for a payment dispute is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
         */
        @jakarta.annotation.Nullable
        public String evidenceId;
        /**
         * This query parameter is used to specify the unique identifier of an evidential file. This file must belong to the evidential file set identified through the &lt;strong&gt;evidence_id&lt;/strong&gt; query parameter.&lt;br&gt;&lt;br&gt;The identifier of each evidential file is returned under the &lt;strong&gt;evidence.files&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
         */
        @jakarta.annotation.Nullable
        public String fileId;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a {@link Map<String, Object>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("evidence_id", evidenceId);
            allQueryParams.put("file_id", fileId);
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
