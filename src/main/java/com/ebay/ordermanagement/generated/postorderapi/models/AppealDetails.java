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
 * This type provides information related to the appeal of a case decision.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppealDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration value indicates why the appeal on the case decision was closed. This field will only be returned if an appeal was made on a case decision and this appeal has been closed.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealCloseReasonEnum.html&quot;&gt;AppealCloseReasonEnum&lt;/a&gt; type definition.
     */
    private String appealCloseReasonEnum;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime appealDate;
    /**
     * This string value is a string representation of why the buyer or seller appealed the case decision. This field is only returned if the buyer or seller made an appeal on the case decision.
     */
    private String appealReasonCode;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount appealRefundAmount;
    /**
     * This enumeration type contains the possible outcomes of a case decision that has been appealed by the buyer or seller.
     */
    private AppealGrantStatusEnum appealStatus;
    /**
     * This enumeration value indicates the current status of the appeal against the case decision.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealStatusEnum.html&quot;&gt;AppealStatusEnum&lt;/a&gt; type definition.
     */
    private String appealStatusEnum;
    /**
     * This boolean field will be returned as &lt;code&gt;true&lt;/code&gt; if the buyer or seller is eligible to appeal the decision on the case.
     */
    private Boolean eligibleForAppeal;
    /**
     * Instantiates a new {@link AppealDetails} and sets the default values.
     */
    public AppealDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppealDetails}
     */
    @jakarta.annotation.Nonnull
    public static AppealDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppealDetails();
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
     * Gets the appealCloseReasonEnum property value. This enumeration value indicates why the appeal on the case decision was closed. This field will only be returned if an appeal was made on a case decision and this appeal has been closed.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealCloseReasonEnum.html&quot;&gt;AppealCloseReasonEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppealCloseReasonEnum() {
        return this.appealCloseReasonEnum;
    }
    /**
     * Gets the appealDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getAppealDate() {
        return this.appealDate;
    }
    /**
     * Gets the appealReasonCode property value. This string value is a string representation of why the buyer or seller appealed the case decision. This field is only returned if the buyer or seller made an appeal on the case decision.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppealReasonCode() {
        return this.appealReasonCode;
    }
    /**
     * Gets the appealRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAppealRefundAmount() {
        return this.appealRefundAmount;
    }
    /**
     * Gets the appealStatus property value. This enumeration type contains the possible outcomes of a case decision that has been appealed by the buyer or seller.
     * @return a {@link AppealGrantStatusEnum}
     */
    @jakarta.annotation.Nullable
    public AppealGrantStatusEnum getAppealStatus() {
        return this.appealStatus;
    }
    /**
     * Gets the appealStatusEnum property value. This enumeration value indicates the current status of the appeal against the case decision.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealStatusEnum.html&quot;&gt;AppealStatusEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppealStatusEnum() {
        return this.appealStatusEnum;
    }
    /**
     * Gets the eligibleForAppeal property value. This boolean field will be returned as &lt;code&gt;true&lt;/code&gt; if the buyer or seller is eligible to appeal the decision on the case.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEligibleForAppeal() {
        return this.eligibleForAppeal;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("appealCloseReasonEnum", (n) -> { this.setAppealCloseReasonEnum(n.getStringValue()); });
        deserializerMap.put("appealDate", (n) -> { this.setAppealDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("appealReasonCode", (n) -> { this.setAppealReasonCode(n.getStringValue()); });
        deserializerMap.put("appealRefundAmount", (n) -> { this.setAppealRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("appealStatus", (n) -> { this.setAppealStatus(n.getEnumValue(AppealGrantStatusEnum::forValue)); });
        deserializerMap.put("appealStatusEnum", (n) -> { this.setAppealStatusEnum(n.getStringValue()); });
        deserializerMap.put("eligibleForAppeal", (n) -> { this.setEligibleForAppeal(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appealCloseReasonEnum", this.getAppealCloseReasonEnum());
        writer.writeObjectValue("appealDate", this.getAppealDate());
        writer.writeStringValue("appealReasonCode", this.getAppealReasonCode());
        writer.writeObjectValue("appealRefundAmount", this.getAppealRefundAmount());
        writer.writeEnumValue("appealStatus", this.getAppealStatus());
        writer.writeStringValue("appealStatusEnum", this.getAppealStatusEnum());
        writer.writeBooleanValue("eligibleForAppeal", this.getEligibleForAppeal());
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
     * Sets the appealCloseReasonEnum property value. This enumeration value indicates why the appeal on the case decision was closed. This field will only be returned if an appeal was made on a case decision and this appeal has been closed.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealCloseReasonEnum.html&quot;&gt;AppealCloseReasonEnum&lt;/a&gt; type definition.
     * @param value Value to set for the appealCloseReasonEnum property.
     */
    public void setAppealCloseReasonEnum(@jakarta.annotation.Nullable final String value) {
        this.appealCloseReasonEnum = value;
    }
    /**
     * Sets the appealDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the appealDate property.
     */
    public void setAppealDate(@jakarta.annotation.Nullable final DateTime value) {
        this.appealDate = value;
    }
    /**
     * Sets the appealReasonCode property value. This string value is a string representation of why the buyer or seller appealed the case decision. This field is only returned if the buyer or seller made an appeal on the case decision.
     * @param value Value to set for the appealReasonCode property.
     */
    public void setAppealReasonCode(@jakarta.annotation.Nullable final String value) {
        this.appealReasonCode = value;
    }
    /**
     * Sets the appealRefundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the appealRefundAmount property.
     */
    public void setAppealRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.appealRefundAmount = value;
    }
    /**
     * Sets the appealStatus property value. This enumeration type contains the possible outcomes of a case decision that has been appealed by the buyer or seller.
     * @param value Value to set for the appealStatus property.
     */
    public void setAppealStatus(@jakarta.annotation.Nullable final AppealGrantStatusEnum value) {
        this.appealStatus = value;
    }
    /**
     * Sets the appealStatusEnum property value. This enumeration value indicates the current status of the appeal against the case decision.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/AppealStatusEnum.html&quot;&gt;AppealStatusEnum&lt;/a&gt; type definition.
     * @param value Value to set for the appealStatusEnum property.
     */
    public void setAppealStatusEnum(@jakarta.annotation.Nullable final String value) {
        this.appealStatusEnum = value;
    }
    /**
     * Sets the eligibleForAppeal property value. This boolean field will be returned as &lt;code&gt;true&lt;/code&gt; if the buyer or seller is eligible to appeal the decision on the case.
     * @param value Value to set for the eligibleForAppeal property.
     */
    public void setEligibleForAppeal(@jakarta.annotation.Nullable final Boolean value) {
        this.eligibleForAppeal = value;
    }
}
