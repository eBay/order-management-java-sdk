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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DecideReturnRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * This enumerated type lists all values that can be passed in the &lt;b&gt;decision&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; request. With the values supported in the &lt;b&gt;decision&lt;/b&gt; field, the seller can offer the return option to the buyer, approve or decline a return request, offer a partial refund to the buyer, or provide a Return Merchandise Authorization (RMA) number to the buyer. There are only a few supported values for a buyer, and these are discussed in the descriptions below.
     */
    private DecisionEnum decision;
    /**
     * The seller can include this field and set it to &lt;code&gt;true&lt;/code&gt; if they are OK with the buyer keeping the original item they received, and not requiring them to return the item. A seller may choose to do this in the case of a SNAD item or if the buyer is claiming that the item arrived damaged or was missing parts. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     */
    private Boolean keepOriginalItem;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount partialRefundAmount;
    /**
     * This field is conditionally required if the seller is using the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method to provide a return merchandise authorization (RMA) to the buyer. The RMA value cannot be validated by eBay, so the seller should pay close attention to ensure that the RMA is accurate. If an RMA is provided in this field, the &lt;b&gt;decision&lt;/b&gt; value should be &lt;code&gt;PROVIDE_RMA&lt;/code&gt;.
     */
    private String rMANumber;
    /**
     * If set to &lt;code&gt;true&lt;/code&gt;, it indicates that the seller provided an RMA number to the buyer for processing of the return.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     */
    private Boolean rMAProvided;
    /**
     * Instantiates a new {@link DecideReturnRequest} and sets the default values.
     */
    public DecideReturnRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DecideReturnRequest}
     */
    @jakarta.annotation.Nonnull
    public static DecideReturnRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DecideReturnRequest();
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
     * Gets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @return a {@link Text}
     */
    @jakarta.annotation.Nullable
    public Text getComments() {
        return this.comments;
    }
    /**
     * Gets the decision property value. This enumerated type lists all values that can be passed in the &lt;b&gt;decision&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; request. With the values supported in the &lt;b&gt;decision&lt;/b&gt; field, the seller can offer the return option to the buyer, approve or decline a return request, offer a partial refund to the buyer, or provide a Return Merchandise Authorization (RMA) number to the buyer. There are only a few supported values for a buyer, and these are discussed in the descriptions below.
     * @return a {@link DecisionEnum}
     */
    @jakarta.annotation.Nullable
    public DecisionEnum getDecision() {
        return this.decision;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("decision", (n) -> { this.setDecision(n.getEnumValue(DecisionEnum::forValue)); });
        deserializerMap.put("keepOriginalItem", (n) -> { this.setKeepOriginalItem(n.getBooleanValue()); });
        deserializerMap.put("partialRefundAmount", (n) -> { this.setPartialRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("RMANumber", (n) -> { this.setRMANumber(n.getStringValue()); });
        deserializerMap.put("rMAProvided", (n) -> { this.setRMAProvided(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepOriginalItem property value. The seller can include this field and set it to &lt;code&gt;true&lt;/code&gt; if they are OK with the buyer keeping the original item they received, and not requiring them to return the item. A seller may choose to do this in the case of a SNAD item or if the buyer is claiming that the item arrived damaged or was missing parts. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getKeepOriginalItem() {
        return this.keepOriginalItem;
    }
    /**
     * Gets the partialRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getPartialRefundAmount() {
        return this.partialRefundAmount;
    }
    /**
     * Gets the RMANumber property value. This field is conditionally required if the seller is using the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method to provide a return merchandise authorization (RMA) to the buyer. The RMA value cannot be validated by eBay, so the seller should pay close attention to ensure that the RMA is accurate. If an RMA is provided in this field, the &lt;b&gt;decision&lt;/b&gt; value should be &lt;code&gt;PROVIDE_RMA&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRMANumber() {
        return this.rMANumber;
    }
    /**
     * Gets the rMAProvided property value. If set to &lt;code&gt;true&lt;/code&gt;, it indicates that the seller provided an RMA number to the buyer for processing of the return.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRMAProvided() {
        return this.rMAProvided;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("comments", this.getComments());
        writer.writeEnumValue("decision", this.getDecision());
        writer.writeBooleanValue("keepOriginalItem", this.getKeepOriginalItem());
        writer.writeObjectValue("partialRefundAmount", this.getPartialRefundAmount());
        writer.writeStringValue("RMANumber", this.getRMANumber());
        writer.writeBooleanValue("rMAProvided", this.getRMAProvided());
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
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the decision property value. This enumerated type lists all values that can be passed in the &lt;b&gt;decision&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; request. With the values supported in the &lt;b&gt;decision&lt;/b&gt; field, the seller can offer the return option to the buyer, approve or decline a return request, offer a partial refund to the buyer, or provide a Return Merchandise Authorization (RMA) number to the buyer. There are only a few supported values for a buyer, and these are discussed in the descriptions below.
     * @param value Value to set for the decision property.
     */
    public void setDecision(@jakarta.annotation.Nullable final DecisionEnum value) {
        this.decision = value;
    }
    /**
     * Sets the keepOriginalItem property value. The seller can include this field and set it to &lt;code&gt;true&lt;/code&gt; if they are OK with the buyer keeping the original item they received, and not requiring them to return the item. A seller may choose to do this in the case of a SNAD item or if the buyer is claiming that the item arrived damaged or was missing parts. &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @param value Value to set for the keepOriginalItem property.
     */
    public void setKeepOriginalItem(@jakarta.annotation.Nullable final Boolean value) {
        this.keepOriginalItem = value;
    }
    /**
     * Sets the partialRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the partialRefundAmount property.
     */
    public void setPartialRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.partialRefundAmount = value;
    }
    /**
     * Sets the RMANumber property value. This field is conditionally required if the seller is using the &lt;b&gt;POST /post-order/v2/return/{returnId}/decide&lt;/b&gt; method to provide a return merchandise authorization (RMA) to the buyer. The RMA value cannot be validated by eBay, so the seller should pay close attention to ensure that the RMA is accurate. If an RMA is provided in this field, the &lt;b&gt;decision&lt;/b&gt; value should be &lt;code&gt;PROVIDE_RMA&lt;/code&gt;.
     * @param value Value to set for the RMANumber property.
     */
    public void setRMANumber(@jakarta.annotation.Nullable final String value) {
        this.rMANumber = value;
    }
    /**
     * Sets the rMAProvided property value. If set to &lt;code&gt;true&lt;/code&gt;, it indicates that the seller provided an RMA number to the buyer for processing of the return.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Default:&lt;/b&gt; &lt;code&gt;false&lt;/code&gt;
     * @param value Value to set for the rMAProvided property.
     */
    public void setRMAProvided(@jakarta.annotation.Nullable final Boolean value) {
        this.rMAProvided = value;
    }
}
