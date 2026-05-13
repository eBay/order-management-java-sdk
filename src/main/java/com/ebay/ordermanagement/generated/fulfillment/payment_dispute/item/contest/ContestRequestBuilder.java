package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.contest;

import com.ebay.ordermanagement.generated.fulfillment.models.ContestPaymentDisputeRequest;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/contest
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContestRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link ContestRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContestRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/contest", pathParameters);
    }
    /**
     * Instantiates a new {@link ContestRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ContestRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/contest", rawUrl);
    }
    /**
     * This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before contesting a payment dispute, the seller must upload all supporting files using the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt;), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of supporting file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;If a seller decides to contest a payment dispute, that seller should be prepared to provide supporting documents such as proof of delivery, proof of authentication, or other documents. The type of supporting documents that the seller will provide will depend on why the buyer filed the payment dispute.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on these fields.
     * @param body This type is used by the request payload of the &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; method.
     */
    public void post(@jakarta.annotation.Nonnull final ContestPaymentDisputeRequest body) {
        post(body, null);
    }
    /**
     * This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before contesting a payment dispute, the seller must upload all supporting files using the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt;), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of supporting file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;If a seller decides to contest a payment dispute, that seller should be prepared to provide supporting documents such as proof of delivery, proof of authentication, or other documents. The type of supporting documents that the seller will provide will depend on why the buyer filed the payment dispute.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on these fields.
     * @param body This type is used by the request payload of the &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     */
    public void post(@jakarta.annotation.Nonnull final ContestPaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        this.requestAdapter.sendPrimitive(requestInfo, null, Void.class);
    }
    /**
     * This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before contesting a payment dispute, the seller must upload all supporting files using the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt;), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of supporting file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;If a seller decides to contest a payment dispute, that seller should be prepared to provide supporting documents such as proof of delivery, proof of authentication, or other documents. The type of supporting documents that the seller will provide will depend on why the buyer filed the payment dispute.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on these fields.
     * @param body This type is used by the request payload of the &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ContestPaymentDisputeRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Before contesting a payment dispute, the seller must upload all supporting files using the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods. Once the seller has officially contested the dispute (using &lt;strong&gt;contestPaymentDispute&lt;/strong&gt;), the &lt;strong&gt;addEvidence&lt;/strong&gt; and &lt;strong&gt;updateEvidence&lt;/strong&gt; methods can no longer be used. In the &lt;strong&gt;evidenceRequests&lt;/strong&gt; array of the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; response, eBay prompts the seller with the type of supporting file(s) that will be needed to contest the payment dispute.&lt;/span&gt;&lt;br&gt;&lt;br&gt;If a seller decides to contest a payment dispute, that seller should be prepared to provide supporting documents such as proof of delivery, proof of authentication, or other documents. The type of supporting documents that the seller will provide will depend on why the buyer filed the payment dispute.&lt;br&gt;&lt;br&gt;The &lt;strong&gt;revision&lt;/strong&gt; field in the request payload is required, and the &lt;strong&gt;returnAddress&lt;/strong&gt; field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on these fields.
     * @param body This type is used by the request payload of the &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ContestPaymentDisputeRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link ContestRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ContestRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ContestRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
