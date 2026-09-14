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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.update_evidence;

import com.ebay.ordermanagement.generated.fulfillment.models.ErrorResponse;
import com.ebay.ordermanagement.generated.fulfillment.models.UpdateEvidencePaymentDisputeRequest;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/update_evidence
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateEvidenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UpdateEvidenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateEvidenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/update_evidence", pathParameters);
    }
    /**
     * Instantiates a new {@link UpdateEvidenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UpdateEvidenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/update_evidence", rawUrl);
    }
    /**
     * This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;The unique identifier of the evidence set to update is specified through the &lt;strong&gt;evidenceId&lt;/strong&gt; field, and the file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the &lt;strong&gt;fileId&lt;/strong&gt; field of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; response payload upon a successful call. Sellers must make sure to capture the &lt;strong&gt;fileId&lt;/strong&gt; value for each evidence file that is uploaded with the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field.  All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an http status code of &lt;code&gt;204 Success&lt;/code&gt; is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-fetchevidencecontent&quot; target=&quot;_blank&quot;&gt;fetchEvidenceContent&lt;/a&gt; method, passing in the proper &lt;strong&gt;evidenceId&lt;/strong&gt; and &lt;strong&gt;fileId&lt;/strong&gt; values.
     * @param body This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateEvidencePaymentDisputeRequest body) {
        post(body, null);
    }
    /**
     * This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;The unique identifier of the evidence set to update is specified through the &lt;strong&gt;evidenceId&lt;/strong&gt; field, and the file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the &lt;strong&gt;fileId&lt;/strong&gt; field of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; response payload upon a successful call. Sellers must make sure to capture the &lt;strong&gt;fileId&lt;/strong&gt; value for each evidence file that is uploaded with the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field.  All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an http status code of &lt;code&gt;204 Success&lt;/code&gt; is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-fetchevidencecontent&quot; target=&quot;_blank&quot;&gt;fetchEvidenceContent&lt;/a&gt; method, passing in the proper &lt;strong&gt;evidenceId&lt;/strong&gt; and &lt;strong&gt;fileId&lt;/strong&gt; values.
     * @param body This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @throws ErrorResponse When receiving a 400 status code
     * @throws ErrorResponse When receiving a 404 status code
     * @throws ErrorResponse When receiving a 409 status code
     * @throws ErrorResponse When receiving a 500 status code
     */
    public void post(@jakarta.annotation.Nonnull final UpdateEvidencePaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("404", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("409", ErrorResponse::createFromDiscriminatorValue);
        errorMapping.put("500", ErrorResponse::createFromDiscriminatorValue);
        this.requestAdapter.sendPrimitive(requestInfo, errorMapping, Void.class);
    }
    /**
     * This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;The unique identifier of the evidence set to update is specified through the &lt;strong&gt;evidenceId&lt;/strong&gt; field, and the file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the &lt;strong&gt;fileId&lt;/strong&gt; field of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; response payload upon a successful call. Sellers must make sure to capture the &lt;strong&gt;fileId&lt;/strong&gt; value for each evidence file that is uploaded with the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field.  All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an http status code of &lt;code&gt;204 Success&lt;/code&gt; is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-fetchevidencecontent&quot; target=&quot;_blank&quot;&gt;fetchEvidenceContent&lt;/a&gt; method, passing in the proper &lt;strong&gt;evidenceId&lt;/strong&gt; and &lt;strong&gt;fileId&lt;/strong&gt; values.
     * @param body This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateEvidencePaymentDisputeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdisputesummaries&quot; target=&quot;_blank &quot;&gt;getPaymentDisputeSummaries&lt;/a&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;The unique identifier of the evidence set to update is specified through the &lt;strong&gt;evidenceId&lt;/strong&gt; field, and the file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the &lt;strong&gt;fileId&lt;/strong&gt; field of the &lt;strong&gt;uploadEvidence&lt;/strong&gt; response payload upon a successful call. Sellers must make sure to capture the &lt;strong&gt;fileId&lt;/strong&gt; value for each evidence file that is uploaded with the &lt;strong&gt;uploadEvidence&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field.  All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an http status code of &lt;code&gt;204 Success&lt;/code&gt; is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-fetchevidencecontent&quot; target=&quot;_blank&quot;&gt;fetchEvidenceContent&lt;/a&gt; method, passing in the proper &lt;strong&gt;evidenceId&lt;/strong&gt; and &lt;strong&gt;fileId&lt;/strong&gt; values.
     * @param body This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final UpdateEvidencePaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link UpdateEvidenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UpdateEvidenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UpdateEvidenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
