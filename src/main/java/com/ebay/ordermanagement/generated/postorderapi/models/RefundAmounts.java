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
 * This type provided details related to the expected and actual buyer refund amounts associated with an INR inquiry or case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RefundAmounts implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount buyerFinalAcceptRefundAmt;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount buyerInitExpectRefundAmt;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount donationAmount;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount feeCreditAmount;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount internationalRefundAmount;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount refundAmount;
    /**
     * Instantiates a new {@link RefundAmounts} and sets the default values.
     */
    public RefundAmounts() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RefundAmounts}
     */
    @jakarta.annotation.Nonnull
    public static RefundAmounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RefundAmounts();
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
     * Gets the buyerFinalAcceptRefundAmt property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBuyerFinalAcceptRefundAmt() {
        return this.buyerFinalAcceptRefundAmt;
    }
    /**
     * Gets the buyerInitExpectRefundAmt property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBuyerInitExpectRefundAmt() {
        return this.buyerInitExpectRefundAmt;
    }
    /**
     * Gets the donationAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getDonationAmount() {
        return this.donationAmount;
    }
    /**
     * Gets the feeCreditAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getFeeCreditAmount() {
        return this.feeCreditAmount;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("buyerFinalAcceptRefundAmt", (n) -> { this.setBuyerFinalAcceptRefundAmt(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("buyerInitExpectRefundAmt", (n) -> { this.setBuyerInitExpectRefundAmt(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("donationAmount", (n) -> { this.setDonationAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeCreditAmount", (n) -> { this.setFeeCreditAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("internationalRefundAmount", (n) -> { this.setInternationalRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundAmount", (n) -> { this.setRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internationalRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getInternationalRefundAmount() {
        return this.internationalRefundAmount;
    }
    /**
     * Gets the refundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getRefundAmount() {
        return this.refundAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buyerFinalAcceptRefundAmt", this.getBuyerFinalAcceptRefundAmt());
        writer.writeObjectValue("buyerInitExpectRefundAmt", this.getBuyerInitExpectRefundAmt());
        writer.writeObjectValue("donationAmount", this.getDonationAmount());
        writer.writeObjectValue("feeCreditAmount", this.getFeeCreditAmount());
        writer.writeObjectValue("internationalRefundAmount", this.getInternationalRefundAmount());
        writer.writeObjectValue("refundAmount", this.getRefundAmount());
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
     * Sets the buyerFinalAcceptRefundAmt property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the buyerFinalAcceptRefundAmt property.
     */
    public void setBuyerFinalAcceptRefundAmt(@jakarta.annotation.Nullable final Amount value) {
        this.buyerFinalAcceptRefundAmt = value;
    }
    /**
     * Sets the buyerInitExpectRefundAmt property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the buyerInitExpectRefundAmt property.
     */
    public void setBuyerInitExpectRefundAmt(@jakarta.annotation.Nullable final Amount value) {
        this.buyerInitExpectRefundAmt = value;
    }
    /**
     * Sets the donationAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the donationAmount property.
     */
    public void setDonationAmount(@jakarta.annotation.Nullable final Amount value) {
        this.donationAmount = value;
    }
    /**
     * Sets the feeCreditAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the feeCreditAmount property.
     */
    public void setFeeCreditAmount(@jakarta.annotation.Nullable final Amount value) {
        this.feeCreditAmount = value;
    }
    /**
     * Sets the internationalRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the internationalRefundAmount property.
     */
    public void setInternationalRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.internationalRefundAmount = value;
    }
    /**
     * Sets the refundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the refundAmount property.
     */
    public void setRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.refundAmount = value;
    }
}
