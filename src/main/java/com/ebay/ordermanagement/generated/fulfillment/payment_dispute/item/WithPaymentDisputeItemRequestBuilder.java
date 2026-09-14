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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item;

import com.ebay.ordermanagement.generated.fulfillment.models.ErrorResponse;
import com.ebay.ordermanagement.generated.fulfillment.models.PaymentDispute;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.accept.AcceptRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.activity.ActivityRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.add_evidence.AddEvidenceRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.contest.ContestRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.fetch_evidence_content.FetchEvidenceContentRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.update_evidence.UpdateEvidenceRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.upload_evidence_file.UploadEvidenceFileRequestBuilder;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithPaymentDisputeItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The accept property
     * @return a {@link AcceptRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AcceptRequestBuilder accept() {
        return new AcceptRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The activity property
     * @return a {@link ActivityRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ActivityRequestBuilder activity() {
        return new ActivityRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The add_evidence property
     * @return a {@link AddEvidenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddEvidenceRequestBuilder addEvidence() {
        return new AddEvidenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The contest property
     * @return a {@link ContestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContestRequestBuilder contest() {
        return new ContestRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The fetch_evidence_content property
     * @return a {@link FetchEvidenceContentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public FetchEvidenceContentRequestBuilder fetchEvidenceContent() {
        return new FetchEvidenceContentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The update_evidence property
     * @return a {@link UpdateEvidenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateEvidenceRequestBuilder updateEvidence() {
        return new UpdateEvidenceRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The upload_evidence_file property
     * @return a {@link UploadEvidenceFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadEvidenceFileRequestBuilder uploadEvidenceFile() {
        return new UploadEvidenceFileRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithPaymentDisputeItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPaymentDisputeItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithPaymentDisputeItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithPaymentDisputeItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}", rawUrl);
    }
    /**
     * This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI.&lt;br&gt;&lt;br&gt;Below is a summary of the information that is retrieved:&lt;ul&gt;&lt;li&gt;Current status of payment dispute&lt;/li&gt;&lt;li&gt;Amount of the payment dispute&lt;/li&gt;&lt;li&gt;Reason the payment dispute was opened&lt;/li&gt;&lt;li&gt;Order and line items associated with the payment dispute&lt;/li&gt;&lt;li&gt;Seller response options if an action is currently required on the payment dispute&lt;/li&gt;&lt;li&gt;Details on the results of the payment dispute if it has been closed&lt;/li&gt;&lt;li&gt;Details on any evidence that was provided by the seller to fight the payment dispute&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link PaymentDispute}
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaymentDispute get() {
        return get(null);
    }
    /**
     * This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI.&lt;br&gt;&lt;br&gt;Below is a summary of the information that is retrieved:&lt;ul&gt;&lt;li&gt;Current status of payment dispute&lt;/li&gt;&lt;li&gt;Amount of the payment dispute&lt;/li&gt;&lt;li&gt;Reason the payment dispute was opened&lt;/li&gt;&lt;li&gt;Order and line items associated with the payment dispute&lt;/li&gt;&lt;li&gt;Seller response options if an action is currently required on the payment dispute&lt;/li&gt;&lt;li&gt;Details on the results of the payment dispute if it has been closed&lt;/li&gt;&lt;li&gt;Details on any evidence that was provided by the seller to fight the payment dispute&lt;/li&gt;&lt;/ul&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link PaymentDispute}
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public PaymentDispute get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, PaymentDispute::createFromDiscriminatorValue);
    }
    /**
     * This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI.&lt;br&gt;&lt;br&gt;Below is a summary of the information that is retrieved:&lt;ul&gt;&lt;li&gt;Current status of payment dispute&lt;/li&gt;&lt;li&gt;Amount of the payment dispute&lt;/li&gt;&lt;li&gt;Reason the payment dispute was opened&lt;/li&gt;&lt;li&gt;Order and line items associated with the payment dispute&lt;/li&gt;&lt;li&gt;Seller response options if an action is currently required on the payment dispute&lt;/li&gt;&lt;li&gt;Details on the results of the payment dispute if it has been closed&lt;/li&gt;&lt;li&gt;Details on any evidence that was provided by the seller to fight the payment dispute&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI.&lt;br&gt;&lt;br&gt;Below is a summary of the information that is retrieved:&lt;ul&gt;&lt;li&gt;Current status of payment dispute&lt;/li&gt;&lt;li&gt;Amount of the payment dispute&lt;/li&gt;&lt;li&gt;Reason the payment dispute was opened&lt;/li&gt;&lt;li&gt;Order and line items associated with the payment dispute&lt;/li&gt;&lt;li&gt;Seller response options if an action is currently required on the payment dispute&lt;/li&gt;&lt;li&gt;Details on the results of the payment dispute if it has been closed&lt;/li&gt;&lt;li&gt;Details on any evidence that was provided by the seller to fight the payment dispute&lt;/li&gt;&lt;/ul&gt;
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
     * @return a {@link WithPaymentDisputeItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithPaymentDisputeItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithPaymentDisputeItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
