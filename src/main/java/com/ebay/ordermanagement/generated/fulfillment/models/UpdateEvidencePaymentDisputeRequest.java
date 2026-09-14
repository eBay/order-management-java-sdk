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

package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the request payload of the &lt;strong&gt;updateEvidence&lt;/strong&gt; method. The &lt;strong&gt;updateEvidence&lt;/strong&gt; method is used to update an existing evidence set against a payment dispute with one or more evidence files.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateEvidencePaymentDisputeRequest extends ProcessEvidencePaymentDisputeRequest implements Parsable {
    /**
     * The unique identifier of the evidence set that is being updated with new evidence files.&lt;br&gt;&lt;br&gt; This ID is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
     */
    private String evidenceId;
    /**
     * Instantiates a new {@link UpdateEvidencePaymentDisputeRequest} and sets the default values.
     */
    public UpdateEvidencePaymentDisputeRequest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateEvidencePaymentDisputeRequest}
     */
    @jakarta.annotation.Nonnull
    public static UpdateEvidencePaymentDisputeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateEvidencePaymentDisputeRequest();
    }
    /**
     * Gets the evidenceId property value. The unique identifier of the evidence set that is being updated with new evidence files.&lt;br&gt;&lt;br&gt; This ID is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvidenceId() {
        return this.evidenceId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("evidenceId", (n) -> { this.setEvidenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("evidenceId", this.getEvidenceId());
    }
    /**
     * Sets the evidenceId property value. The unique identifier of the evidence set that is being updated with new evidence files.&lt;br&gt;&lt;br&gt; This ID is returned under the &lt;strong&gt;evidence&lt;/strong&gt; array in the &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
     * @param value Value to set for the evidenceId property.
     */
    public void setEvidenceId(@jakarta.annotation.Nullable final String value) {
        this.evidenceId = value;
    }
}
