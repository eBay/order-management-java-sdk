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

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the request payload of the &lt;strong&gt;contestPaymentDispute&lt;/strong&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContestPaymentDisputeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length:&lt;/strong&gt; 1000 characters.
     */
    private String note;
    /**
     * This container is needed if the seller is requesting that the buyer return the item. If this container is used, all relevant fields must be included, including &lt;strong&gt;fullName&lt;/strong&gt; and &lt;strong&gt;primaryPhone&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the &lt;a href =&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute.disputereasonenum&quot; target=&quot;_blank&quot;&gt;Dispute Reason&lt;/a&gt; is &lt;code&gt;SIGNIFICANTLY_NOT_AS_DESCRIBED&lt;/code&gt;, &lt;strong&gt;returnAddress&lt;/strong&gt; is required.&lt;/span&gt;
     */
    private ReturnAddress returnAddress;
    /**
     * This integer value indicates the revision number of the payment dispute. This field is required. The current &lt;strong&gt;revision&lt;/strong&gt; number for a payment dispute can be retrieved with the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method. Each time an action is taken against a payment dispute, this integer value increases by 1.
     */
    private Integer revision;
    /**
     * Instantiates a new {@link ContestPaymentDisputeRequest} and sets the default values.
     */
    public ContestPaymentDisputeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContestPaymentDisputeRequest}
     */
    @jakarta.annotation.Nonnull
    public static ContestPaymentDisputeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContestPaymentDisputeRequest();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("note", (n) -> { this.setNote(n.getStringValue()); });
        deserializerMap.put("returnAddress", (n) -> { this.setReturnAddress(n.getObjectValue(ReturnAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("revision", (n) -> { this.setRevision(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the note property value. This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length:&lt;/strong&gt; 1000 characters.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNote() {
        return this.note;
    }
    /**
     * Gets the returnAddress property value. This container is needed if the seller is requesting that the buyer return the item. If this container is used, all relevant fields must be included, including &lt;strong&gt;fullName&lt;/strong&gt; and &lt;strong&gt;primaryPhone&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the &lt;a href =&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute.disputereasonenum&quot; target=&quot;_blank&quot;&gt;Dispute Reason&lt;/a&gt; is &lt;code&gt;SIGNIFICANTLY_NOT_AS_DESCRIBED&lt;/code&gt;, &lt;strong&gt;returnAddress&lt;/strong&gt; is required.&lt;/span&gt;
     * @return a {@link ReturnAddress}
     */
    @jakarta.annotation.Nullable
    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }
    /**
     * Gets the revision property value. This integer value indicates the revision number of the payment dispute. This field is required. The current &lt;strong&gt;revision&lt;/strong&gt; number for a payment dispute can be retrieved with the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method. Each time an action is taken against a payment dispute, this integer value increases by 1.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRevision() {
        return this.revision;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("note", this.getNote());
        writer.writeObjectValue("returnAddress", this.getReturnAddress());
        writer.writeIntegerValue("revision", this.getRevision());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the note property value. This field shows information that the seller provides about the dispute, such as the basis for the dispute, any relevant evidence, tracking numbers, and so forth.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Max Length:&lt;/strong&gt; 1000 characters.
     * @param value Value to set for the note property.
     */
    public void setNote(@jakarta.annotation.Nullable final String value) {
        this.note = value;
    }
    /**
     * Sets the returnAddress property value. This container is needed if the seller is requesting that the buyer return the item. If this container is used, all relevant fields must be included, including &lt;strong&gt;fullName&lt;/strong&gt; and &lt;strong&gt;primaryPhone&lt;/strong&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If the &lt;a href =&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-payment_dispute-getpaymentdispute.disputereasonenum&quot; target=&quot;_blank&quot;&gt;Dispute Reason&lt;/a&gt; is &lt;code&gt;SIGNIFICANTLY_NOT_AS_DESCRIBED&lt;/code&gt;, &lt;strong&gt;returnAddress&lt;/strong&gt; is required.&lt;/span&gt;
     * @param value Value to set for the returnAddress property.
     */
    public void setReturnAddress(@jakarta.annotation.Nullable final ReturnAddress value) {
        this.returnAddress = value;
    }
    /**
     * Sets the revision property value. This integer value indicates the revision number of the payment dispute. This field is required. The current &lt;strong&gt;revision&lt;/strong&gt; number for a payment dispute can be retrieved with the &lt;strong&gt;getPaymentDispute&lt;/strong&gt; method. Each time an action is taken against a payment dispute, this integer value increases by 1.
     * @param value Value to set for the revision property.
     */
    public void setRevision(@jakarta.annotation.Nullable final Integer value) {
        this.revision = value;
    }
}
