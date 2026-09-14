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
 * Type used by the &lt;b&gt;inquiryDetails&lt;/b&gt; container of the &lt;b&gt;GET /post-order/v2/inquiry/{inquiryId}&lt;/b&gt; response. The &lt;b&gt;inquiryDetails&lt;/b&gt; container provides details about a specific INR inquiry that is identified through a path parameter in the request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InquiryDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type provides information related to the appeal of a case decision.
     */
    private AppealDetails appealDetails;
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
     * This type defines whether a provisional refund was issued to the buyer and whether the provisional refund was later reversed.
     */
    private ProvisionalRefund provisionalRefund;
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
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount totalAmount;
    /**
     * Instantiates a new {@link InquiryDetails} and sets the default values.
     */
    public InquiryDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InquiryDetails}
     */
    @jakarta.annotation.Nonnull
    public static InquiryDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InquiryDetails();
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
     * Gets the appealDetails property value. This type provides information related to the appeal of a case decision.
     * @return a {@link AppealDetails}
     */
    @jakarta.annotation.Nullable
    public AppealDetails getAppealDetails() {
        return this.appealDetails;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("appealDetails", (n) -> { this.setAppealDetails(n.getObjectValue(AppealDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("escalationDate", (n) -> { this.setEscalationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("lastBuyerRespDate", (n) -> { this.setLastBuyerRespDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("provisionalRefund", (n) -> { this.setProvisionalRefund(n.getObjectValue(ProvisionalRefund::createFromDiscriminatorValue)); });
        deserializerMap.put("refundAmounts", (n) -> { this.setRefundAmounts(n.getObjectValue(RefundAmounts::createFromDiscriminatorValue)); });
        deserializerMap.put("refundChargeAmount", (n) -> { this.setRefundChargeAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundDeadlineDate", (n) -> { this.setRefundDeadlineDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("totalAmount", (n) -> { this.setTotalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
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
     * Gets the provisionalRefund property value. This type defines whether a provisional refund was issued to the buyer and whether the provisional refund was later reversed.
     * @return a {@link ProvisionalRefund}
     */
    @jakarta.annotation.Nullable
    public ProvisionalRefund getProvisionalRefund() {
        return this.provisionalRefund;
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
     * Gets the totalAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalAmount() {
        return this.totalAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appealDetails", this.getAppealDetails());
        writer.writeObjectValue("creationDate", this.getCreationDate());
        writer.writeObjectValue("escalationDate", this.getEscalationDate());
        writer.writeObjectValue("expirationDate", this.getExpirationDate());
        writer.writeObjectValue("lastBuyerRespDate", this.getLastBuyerRespDate());
        writer.writeObjectValue("provisionalRefund", this.getProvisionalRefund());
        writer.writeObjectValue("refundAmounts", this.getRefundAmounts());
        writer.writeObjectValue("refundChargeAmount", this.getRefundChargeAmount());
        writer.writeObjectValue("refundDeadlineDate", this.getRefundDeadlineDate());
        writer.writeObjectValue("totalAmount", this.getTotalAmount());
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
     * Sets the appealDetails property value. This type provides information related to the appeal of a case decision.
     * @param value Value to set for the appealDetails property.
     */
    public void setAppealDetails(@jakarta.annotation.Nullable final AppealDetails value) {
        this.appealDetails = value;
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
     * Sets the provisionalRefund property value. This type defines whether a provisional refund was issued to the buyer and whether the provisional refund was later reversed.
     * @param value Value to set for the provisionalRefund property.
     */
    public void setProvisionalRefund(@jakarta.annotation.Nullable final ProvisionalRefund value) {
        this.provisionalRefund = value;
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
     * Sets the totalAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the totalAmount property.
     */
    public void setTotalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalAmount = value;
    }
}
