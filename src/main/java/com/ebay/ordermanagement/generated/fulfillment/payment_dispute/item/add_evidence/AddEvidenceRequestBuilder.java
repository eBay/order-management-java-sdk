package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.add_evidence;

import com.ebay.ordermanagement.generated.fulfillment.models.AddEvidencePaymentDisputeRequest;
import com.ebay.ordermanagement.generated.fulfillment.models.AddEvidencePaymentDisputeResponse;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/add_evidence
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddEvidenceRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link AddEvidenceRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddEvidenceRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/add_evidence", pathParameters);
    }
    /**
     * Instantiates a new {@link AddEvidenceRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AddEvidenceRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/add_evidence", rawUrl);
    }
    /**
     * This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload.  Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the &lt;strong&gt;evidenceId&lt;/strong&gt; field of the &lt;strong&gt;addEvidence&lt;/strong&gt; response payload upon a successful call.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field. All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an &lt;strong&gt;evidenceId&lt;/strong&gt; value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the &lt;strong&gt;fileId&lt;/strong&gt; array. The &lt;strong&gt;evidenceId&lt;/strong&gt; value will be needed if the seller wishes to add to the evidence set by using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method, or if they want to retrieve a specific evidence file within the evidence set by using the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method.
     * @param body This type is used by the request payload of the &lt;strong&gt;addEvidence&lt;/strong&gt; method. The &lt;strong&gt;addEvidence&lt;/strong&gt; method is used to create a new evidence set against a payment dispute with one or more evidence files.
     * @return a {@link AddEvidencePaymentDisputeResponse}
     */
    @jakarta.annotation.Nullable
    public AddEvidencePaymentDisputeResponse post(@jakarta.annotation.Nonnull final AddEvidencePaymentDisputeRequest body) {
        return post(body, null);
    }
    /**
     * This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload.  Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the &lt;strong&gt;evidenceId&lt;/strong&gt; field of the &lt;strong&gt;addEvidence&lt;/strong&gt; response payload upon a successful call.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field. All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an &lt;strong&gt;evidenceId&lt;/strong&gt; value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the &lt;strong&gt;fileId&lt;/strong&gt; array. The &lt;strong&gt;evidenceId&lt;/strong&gt; value will be needed if the seller wishes to add to the evidence set by using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method, or if they want to retrieve a specific evidence file within the evidence set by using the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method.
     * @param body This type is used by the request payload of the &lt;strong&gt;addEvidence&lt;/strong&gt; method. The &lt;strong&gt;addEvidence&lt;/strong&gt; method is used to create a new evidence set against a payment dispute with one or more evidence files.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link AddEvidencePaymentDisputeResponse}
     */
    @jakarta.annotation.Nullable
    public AddEvidencePaymentDisputeResponse post(@jakarta.annotation.Nonnull final AddEvidencePaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AddEvidencePaymentDisputeResponse::createFromDiscriminatorValue);
    }
    /**
     * This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload.  Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the &lt;strong&gt;evidenceId&lt;/strong&gt; field of the &lt;strong&gt;addEvidence&lt;/strong&gt; response payload upon a successful call.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field. All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an &lt;strong&gt;evidenceId&lt;/strong&gt; value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the &lt;strong&gt;fileId&lt;/strong&gt; array. The &lt;strong&gt;evidenceId&lt;/strong&gt; value will be needed if the seller wishes to add to the evidence set by using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method, or if they want to retrieve a specific evidence file within the evidence set by using the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method.
     * @param body This type is used by the request payload of the &lt;strong&gt;addEvidence&lt;/strong&gt; method. The &lt;strong&gt;addEvidence&lt;/strong&gt; method is used to create a new evidence set against a payment dispute with one or more evidence files.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddEvidencePaymentDisputeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All evidence files should be uploaded using &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt;  before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; or through My eBay), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;The file(s) to add are identified through the &lt;strong&gt;files&lt;/strong&gt; array in the request payload.  Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the &lt;strong&gt;evidenceId&lt;/strong&gt; field of the &lt;strong&gt;addEvidence&lt;/strong&gt; response payload upon a successful call.&lt;br&gt;&lt;br&gt;The type of evidence being added should be specified in the &lt;strong&gt;evidenceType&lt;/strong&gt; field. All files being added (if more than one) should correspond to this evidence type.&lt;br&gt;&lt;br&gt;Upon a successful call, an &lt;strong&gt;evidenceId&lt;/strong&gt; value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the &lt;strong&gt;fileId&lt;/strong&gt; array. The &lt;strong&gt;evidenceId&lt;/strong&gt; value will be needed if the seller wishes to add to the evidence set by using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method, or if they want to retrieve a specific evidence file within the evidence set by using the &lt;strong&gt;fetchEvidenceContent&lt;/strong&gt; method.
     * @param body This type is used by the request payload of the &lt;strong&gt;addEvidence&lt;/strong&gt; method. The &lt;strong&gt;addEvidence&lt;/strong&gt; method is used to create a new evidence set against a payment dispute with one or more evidence files.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final AddEvidencePaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link AddEvidenceRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AddEvidenceRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AddEvidenceRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
