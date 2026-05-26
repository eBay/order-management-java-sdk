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
 * This type is used by the &lt;strong&gt;resolution&lt;/strong&gt; container that is returned for payment disputes that have been resolved.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeOutcomeDetail implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount fees;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount protectedAmount;
    /**
     * This enumeration value indicates if the seller is fully protected, partially protected, or not protected by eBay for the payment dispute. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ProtectionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String protectionStatus;
    /**
     * The enumeration value returned in this field indicates the outcome of the payment dispute for the seller. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:OutcomeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reasonForClosure;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount recoupAmount;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount totalFeeCredit;
    /**
     * Instantiates a new {@link PaymentDisputeOutcomeDetail} and sets the default values.
     */
    public PaymentDisputeOutcomeDetail() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentDisputeOutcomeDetail}
     */
    @jakarta.annotation.Nonnull
    public static PaymentDisputeOutcomeDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentDisputeOutcomeDetail();
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
     * Gets the fees property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getFees() {
        return this.fees;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("fees", (n) -> { this.setFees(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("protectedAmount", (n) -> { this.setProtectedAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("protectionStatus", (n) -> { this.setProtectionStatus(n.getStringValue()); });
        deserializerMap.put("reasonForClosure", (n) -> { this.setReasonForClosure(n.getStringValue()); });
        deserializerMap.put("recoupAmount", (n) -> { this.setRecoupAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("totalFeeCredit", (n) -> { this.setTotalFeeCredit(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the protectedAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getProtectedAmount() {
        return this.protectedAmount;
    }
    /**
     * Gets the protectionStatus property value. This enumeration value indicates if the seller is fully protected, partially protected, or not protected by eBay for the payment dispute. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ProtectionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtectionStatus() {
        return this.protectionStatus;
    }
    /**
     * Gets the reasonForClosure property value. The enumeration value returned in this field indicates the outcome of the payment dispute for the seller. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:OutcomeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReasonForClosure() {
        return this.reasonForClosure;
    }
    /**
     * Gets the recoupAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getRecoupAmount() {
        return this.recoupAmount;
    }
    /**
     * Gets the totalFeeCredit property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getTotalFeeCredit() {
        return this.totalFeeCredit;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("fees", this.getFees());
        writer.writeObjectValue("protectedAmount", this.getProtectedAmount());
        writer.writeStringValue("protectionStatus", this.getProtectionStatus());
        writer.writeStringValue("reasonForClosure", this.getReasonForClosure());
        writer.writeObjectValue("recoupAmount", this.getRecoupAmount());
        writer.writeObjectValue("totalFeeCredit", this.getTotalFeeCredit());
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
     * Sets the fees property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the fees property.
     */
    public void setFees(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.fees = value;
    }
    /**
     * Sets the protectedAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the protectedAmount property.
     */
    public void setProtectedAmount(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.protectedAmount = value;
    }
    /**
     * Sets the protectionStatus property value. This enumeration value indicates if the seller is fully protected, partially protected, or not protected by eBay for the payment dispute. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:ProtectionStatusEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the protectionStatus property.
     */
    public void setProtectionStatus(@jakarta.annotation.Nullable final String value) {
        this.protectionStatus = value;
    }
    /**
     * Sets the reasonForClosure property value. The enumeration value returned in this field indicates the outcome of the payment dispute for the seller. This field is always returned once the payment dispute is resolved. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:OutcomeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reasonForClosure property.
     */
    public void setReasonForClosure(@jakarta.annotation.Nullable final String value) {
        this.reasonForClosure = value;
    }
    /**
     * Sets the recoupAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the recoupAmount property.
     */
    public void setRecoupAmount(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.recoupAmount = value;
    }
    /**
     * Sets the totalFeeCredit property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the totalFeeCredit property.
     */
    public void setTotalFeeCredit(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.totalFeeCredit = value;
    }
}
