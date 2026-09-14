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
 * This type is used by the &lt;b&gt;caseDetails&lt;/b&gt; container that is returned in the &lt;b&gt;GET /post-order/v2/casemanagement/{caseId}&lt;/b&gt; method to provide detailed information about the case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This string value indicates what the buyer ultimately agreed to with the seller to resolve the case.
     */
    private String buyerFinalAcceptResolution;
    /**
     * This string value indicates what the buyer initially agreed to with the seller to resolve the case.
     */
    private String buyerInitExpectResolution;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime creationDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime escalationDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime expirationDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime lastBuyerRespDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime lastSellerRespDate;
    /**
     * &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     */
    private Boolean paypalPaid;
    /**
     * This type provided details related to the expected and actual buyer refund amounts associated with an INR inquiry or case.
     */
    private RefundAmounts refundAmounts;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount refundChargeAmount;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime refundDeadlineDate;
    /**
     * This enumeration type contains the possible types of refunds - partial or full.
     */
    private RefundType refundType;
    /**
     * Instantiates a new {@link CaseDetails} and sets the default values.
     */
    public CaseDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseDetails}
     */
    @jakarta.annotation.Nonnull
    public static CaseDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseDetails();
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
     * Gets the buyerFinalAcceptResolution property value. This string value indicates what the buyer ultimately agreed to with the seller to resolve the case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerFinalAcceptResolution() {
        return this.buyerFinalAcceptResolution;
    }
    /**
     * Gets the buyerInitExpectResolution property value. This string value indicates what the buyer initially agreed to with the seller to resolve the case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyerInitExpectResolution() {
        return this.buyerInitExpectResolution;
    }
    /**
     * Gets the creationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the escalationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getEscalationDate() {
        return this.escalationDate;
    }
    /**
     * Gets the expirationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(12);
        deserializerMap.put("buyerFinalAcceptResolution", (n) -> { this.setBuyerFinalAcceptResolution(n.getStringValue()); });
        deserializerMap.put("buyerInitExpectResolution", (n) -> { this.setBuyerInitExpectResolution(n.getStringValue()); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("escalationDate", (n) -> { this.setEscalationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("lastBuyerRespDate", (n) -> { this.setLastBuyerRespDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSellerRespDate", (n) -> { this.setLastSellerRespDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("paypalPaid", (n) -> { this.setPaypalPaid(n.getBooleanValue()); });
        deserializerMap.put("refundAmounts", (n) -> { this.setRefundAmounts(n.getObjectValue(RefundAmounts::createFromDiscriminatorValue)); });
        deserializerMap.put("refundChargeAmount", (n) -> { this.setRefundChargeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundDeadlineDate", (n) -> { this.setRefundDeadlineDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("refundType", (n) -> { this.setRefundType(n.getEnumValue(RefundType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the lastBuyerRespDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getLastBuyerRespDate() {
        return this.lastBuyerRespDate;
    }
    /**
     * Gets the lastSellerRespDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getLastSellerRespDate() {
        return this.lastSellerRespDate;
    }
    /**
     * Gets the paypalPaid property value. &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPaypalPaid() {
        return this.paypalPaid;
    }
    /**
     * Gets the refundAmounts property value. This type provided details related to the expected and actual buyer refund amounts associated with an INR inquiry or case.
     * @return a {@link RefundAmounts}
     */
    @jakarta.annotation.Nullable
    public RefundAmounts getRefundAmounts() {
        return this.refundAmounts;
    }
    /**
     * Gets the refundChargeAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getRefundChargeAmount() {
        return this.refundChargeAmount;
    }
    /**
     * Gets the refundDeadlineDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getRefundDeadlineDate() {
        return this.refundDeadlineDate;
    }
    /**
     * Gets the refundType property value. This enumeration type contains the possible types of refunds - partial or full.
     * @return a {@link RefundType}
     */
    @jakarta.annotation.Nullable
    public RefundType getRefundType() {
        return this.refundType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buyerFinalAcceptResolution", this.getBuyerFinalAcceptResolution());
        writer.writeStringValue("buyerInitExpectResolution", this.getBuyerInitExpectResolution());
        writer.writeObjectValue("creationDate", this.getCreationDate());
        writer.writeObjectValue("escalationDate", this.getEscalationDate());
        writer.writeObjectValue("expirationDate", this.getExpirationDate());
        writer.writeObjectValue("lastBuyerRespDate", this.getLastBuyerRespDate());
        writer.writeObjectValue("lastSellerRespDate", this.getLastSellerRespDate());
        writer.writeBooleanValue("paypalPaid", this.getPaypalPaid());
        writer.writeObjectValue("refundAmounts", this.getRefundAmounts());
        writer.writeObjectValue("refundChargeAmount", this.getRefundChargeAmount());
        writer.writeObjectValue("refundDeadlineDate", this.getRefundDeadlineDate());
        writer.writeEnumValue("refundType", this.getRefundType());
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
     * Sets the buyerFinalAcceptResolution property value. This string value indicates what the buyer ultimately agreed to with the seller to resolve the case.
     * @param value Value to set for the buyerFinalAcceptResolution property.
     */
    public void setBuyerFinalAcceptResolution(@jakarta.annotation.Nullable final String value) {
        this.buyerFinalAcceptResolution = value;
    }
    /**
     * Sets the buyerInitExpectResolution property value. This string value indicates what the buyer initially agreed to with the seller to resolve the case.
     * @param value Value to set for the buyerInitExpectResolution property.
     */
    public void setBuyerInitExpectResolution(@jakarta.annotation.Nullable final String value) {
        this.buyerInitExpectResolution = value;
    }
    /**
     * Sets the creationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final DateTime value) {
        this.creationDate = value;
    }
    /**
     * Sets the escalationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the escalationDate property.
     */
    public void setEscalationDate(@jakarta.annotation.Nullable final DateTime value) {
        this.escalationDate = value;
    }
    /**
     * Sets the expirationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final DateTime value) {
        this.expirationDate = value;
    }
    /**
     * Sets the lastBuyerRespDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the lastBuyerRespDate property.
     */
    public void setLastBuyerRespDate(@jakarta.annotation.Nullable final DateTime value) {
        this.lastBuyerRespDate = value;
    }
    /**
     * Sets the lastSellerRespDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the lastSellerRespDate property.
     */
    public void setLastSellerRespDate(@jakarta.annotation.Nullable final DateTime value) {
        this.lastSellerRespDate = value;
    }
    /**
     * Sets the paypalPaid property value. &lt;b&gt;THIS FIELD IS DEPRECATED&lt;/b&gt;.
     * @param value Value to set for the paypalPaid property.
     */
    public void setPaypalPaid(@jakarta.annotation.Nullable final Boolean value) {
        this.paypalPaid = value;
    }
    /**
     * Sets the refundAmounts property value. This type provided details related to the expected and actual buyer refund amounts associated with an INR inquiry or case.
     * @param value Value to set for the refundAmounts property.
     */
    public void setRefundAmounts(@jakarta.annotation.Nullable final RefundAmounts value) {
        this.refundAmounts = value;
    }
    /**
     * Sets the refundChargeAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the refundChargeAmount property.
     */
    public void setRefundChargeAmount(@jakarta.annotation.Nullable final Amount value) {
        this.refundChargeAmount = value;
    }
    /**
     * Sets the refundDeadlineDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the refundDeadlineDate property.
     */
    public void setRefundDeadlineDate(@jakarta.annotation.Nullable final DateTime value) {
        this.refundDeadlineDate = value;
    }
    /**
     * Sets the refundType property value. This enumeration type contains the possible types of refunds - partial or full.
     * @param value Value to set for the refundType property.
     */
    public void setRefundType(@jakarta.annotation.Nullable final RefundType value) {
        this.refundType = value;
    }
}
