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
 * This type is used to provide a summary of information on each case that is returned in the &lt;b&gt;GET /post-order/v2/casemanagement/search&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CaseSummaryType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay user ID of the buyer involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String buyer;
    /**
     * The unique identifier of the case.
     */
    private Integer caseId;
    /**
     * This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     */
    private String caseStatusEnum;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount claimAmount;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime creationDate;
    /**
     * The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     */
    private Integer itemId;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime lastModifiedDate;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime respondByDate;
    /**
     * The eBay user ID of the seller involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String seller;
    /**
     * The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     */
    private Integer transactionId;
    /**
     * Instantiates a new {@link CaseSummaryType} and sets the default values.
     */
    public CaseSummaryType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CaseSummaryType}
     */
    @jakarta.annotation.Nonnull
    public static CaseSummaryType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CaseSummaryType();
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
     * Gets the buyer property value. The eBay user ID of the buyer involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyer() {
        return this.buyer;
    }
    /**
     * Gets the caseId property value. The unique identifier of the case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCaseId() {
        return this.caseId;
    }
    /**
     * Gets the caseStatusEnum property value. This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCaseStatusEnum() {
        return this.caseStatusEnum;
    }
    /**
     * Gets the claimAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getClaimAmount() {
        return this.claimAmount;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("buyer", (n) -> { this.setBuyer(n.getStringValue()); });
        deserializerMap.put("caseId", (n) -> { this.setCaseId(n.getIntegerValue()); });
        deserializerMap.put("caseStatusEnum", (n) -> { this.setCaseStatusEnum(n.getStringValue()); });
        deserializerMap.put("claimAmount", (n) -> { this.setClaimAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getIntegerValue()); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("respondByDate", (n) -> { this.setRespondByDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("seller", (n) -> { this.setSeller(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getItemId() {
        return this.itemId;
    }
    /**
     * Gets the lastModifiedDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * Gets the respondByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getRespondByDate() {
        return this.respondByDate;
    }
    /**
     * Gets the seller property value. The eBay user ID of the seller involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeller() {
        return this.seller;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTransactionId() {
        return this.transactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("buyer", this.getBuyer());
        writer.writeIntegerValue("caseId", this.getCaseId());
        writer.writeStringValue("caseStatusEnum", this.getCaseStatusEnum());
        writer.writeObjectValue("claimAmount", this.getClaimAmount());
        writer.writeObjectValue("creationDate", this.getCreationDate());
        writer.writeIntegerValue("itemId", this.getItemId());
        writer.writeObjectValue("lastModifiedDate", this.getLastModifiedDate());
        writer.writeObjectValue("respondByDate", this.getRespondByDate());
        writer.writeStringValue("seller", this.getSeller());
        writer.writeIntegerValue("transactionId", this.getTransactionId());
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
     * Sets the buyer property value. The eBay user ID of the buyer involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final String value) {
        this.buyer = value;
    }
    /**
     * Sets the caseId property value. The unique identifier of the case.
     * @param value Value to set for the caseId property.
     */
    public void setCaseId(@jakarta.annotation.Nullable final Integer value) {
        this.caseId = value;
    }
    /**
     * Sets the caseStatusEnum property value. This enumeration value indicates the current status of the case.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/CaseStatusEnum.html&quot;&gt;CaseStatusEnum&lt;/a&gt; type definition.
     * @param value Value to set for the caseStatusEnum property.
     */
    public void setCaseStatusEnum(@jakarta.annotation.Nullable final String value) {
        this.caseStatusEnum = value;
    }
    /**
     * Sets the claimAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the claimAmount property.
     */
    public void setClaimAmount(@jakarta.annotation.Nullable final Amount value) {
        this.claimAmount = value;
    }
    /**
     * Sets the creationDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final DateTime value) {
        this.creationDate = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that is associated with the case.
     * @param value Value to set for the itemId property.
     */
    public void setItemId(@jakarta.annotation.Nullable final Integer value) {
        this.itemId = value;
    }
    /**
     * Sets the lastModifiedDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the lastModifiedDate property.
     */
    public void setLastModifiedDate(@jakarta.annotation.Nullable final DateTime value) {
        this.lastModifiedDate = value;
    }
    /**
     * Sets the respondByDate property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the respondByDate property.
     */
    public void setRespondByDate(@jakarta.annotation.Nullable final DateTime value) {
        this.respondByDate = value;
    }
    /**
     * Sets the seller property value. The eBay user ID of the seller involved in the case.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the seller property.
     */
    public void setSeller(@jakarta.annotation.Nullable final String value) {
        this.seller = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify the line item that is associated with the case.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final Integer value) {
        this.transactionId = value;
    }
}
