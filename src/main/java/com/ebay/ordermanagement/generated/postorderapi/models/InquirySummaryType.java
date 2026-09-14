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
 * This type is used to provide a summary of information on each INR inquiry that is returned in the &lt;b&gt;GET /post-order/v2/inquiry/search&lt;/b&gt; response.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InquirySummaryType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The eBay user ID of the buyer involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String buyer;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount claimAmount;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime creationDate;
    /**
     * The unique identifier of the INR inquiry.
     */
    private Integer inquiryId;
    /**
     * This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt; If the value is &lt;code&gt;WAITING_SELLER_RESPONSE&lt;/code&gt; or &lt;code&gt;WAITING_BUYER_RESPONSE&lt;/code&gt;, the seller or buyer, respectively, should make sure they respond no later than the date and time found in the &lt;b&gt;respondByDate&lt;/b&gt; container.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     */
    private String inquiryStatusEnum;
    /**
     * The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
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
     * The eBay user ID of the seller involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     */
    private String seller;
    /**
     * The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
     */
    private Integer transactionId;
    /**
     * Instantiates a new {@link InquirySummaryType} and sets the default values.
     */
    public InquirySummaryType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InquirySummaryType}
     */
    @jakarta.annotation.Nonnull
    public static InquirySummaryType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InquirySummaryType();
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
     * Gets the buyer property value. The eBay user ID of the buyer involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBuyer() {
        return this.buyer;
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
        deserializerMap.put("claimAmount", (n) -> { this.setClaimAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("inquiryId", (n) -> { this.setInquiryId(n.getIntegerValue()); });
        deserializerMap.put("inquiryStatusEnum", (n) -> { this.setInquiryStatusEnum(n.getStringValue()); });
        deserializerMap.put("itemId", (n) -> { this.setItemId(n.getIntegerValue()); });
        deserializerMap.put("lastModifiedDate", (n) -> { this.setLastModifiedDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("respondByDate", (n) -> { this.setRespondByDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("seller", (n) -> { this.setSeller(n.getStringValue()); });
        deserializerMap.put("transactionId", (n) -> { this.setTransactionId(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inquiryId property value. The unique identifier of the INR inquiry.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getInquiryId() {
        return this.inquiryId;
    }
    /**
     * Gets the inquiryStatusEnum property value. This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt; If the value is &lt;code&gt;WAITING_SELLER_RESPONSE&lt;/code&gt; or &lt;code&gt;WAITING_BUYER_RESPONSE&lt;/code&gt;, the seller or buyer, respectively, should make sure they respond no later than the date and time found in the &lt;b&gt;respondByDate&lt;/b&gt; container.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInquiryStatusEnum() {
        return this.inquiryStatusEnum;
    }
    /**
     * Gets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
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
     * Gets the seller property value. The eBay user ID of the seller involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSeller() {
        return this.seller;
    }
    /**
     * Gets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
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
        writer.writeObjectValue("claimAmount", this.getClaimAmount());
        writer.writeObjectValue("creationDate", this.getCreationDate());
        writer.writeIntegerValue("inquiryId", this.getInquiryId());
        writer.writeStringValue("inquiryStatusEnum", this.getInquiryStatusEnum());
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
     * Sets the buyer property value. The eBay user ID of the buyer involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the buyer property.
     */
    public void setBuyer(@jakarta.annotation.Nullable final String value) {
        this.buyer = value;
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
     * Sets the inquiryId property value. The unique identifier of the INR inquiry.
     * @param value Value to set for the inquiryId property.
     */
    public void setInquiryId(@jakarta.annotation.Nullable final Integer value) {
        this.inquiryId = value;
    }
    /**
     * Sets the inquiryStatusEnum property value. This enumeration value indicates the current status of the INR inquiry.&lt;br/&gt;&lt;br/&gt; If the value is &lt;code&gt;WAITING_SELLER_RESPONSE&lt;/code&gt; or &lt;code&gt;WAITING_BUYER_RESPONSE&lt;/code&gt;, the seller or buyer, respectively, should make sure they respond no later than the date and time found in the &lt;b&gt;respondByDate&lt;/b&gt; container.&lt;br/&gt;&lt;br/&gt;The list of enumeration values that may be returned in this field are defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryStatusEnum.html&quot;&gt;InquiryStatusEnum&lt;/a&gt; type definition.
     * @param value Value to set for the inquiryStatusEnum property.
     */
    public void setInquiryStatusEnum(@jakarta.annotation.Nullable final String value) {
        this.inquiryStatusEnum = value;
    }
    /**
     * Sets the itemId property value. The unique identifier of the eBay listing where the line item was purchased. This field is used in conjunction with the &lt;b&gt;transactionId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
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
     * Sets the seller property value. The eBay user ID of the seller involved in the INR inquiry.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot;&gt;Data Handling Compliance&lt;/a&gt;. &lt;/span&gt;
     * @param value Value to set for the seller property.
     */
    public void setSeller(@jakarta.annotation.Nullable final String value) {
        this.seller = value;
    }
    /**
     * Sets the transactionId property value. The unique identifier of the purchase transaction. This value is created right when the buyer is committed to buying the item, whether that  buyer uses a &apos;Buy it Now&apos; capability, is the winning bidder of an auction, or the buyer&apos;s Best Offer is accepted by the seller. This field is used in conjunction with the &lt;b&gt;itemId&lt;/b&gt; field to identify a line item that has not been received by the buyer.
     * @param value Value to set for the transactionId property.
     */
    public void setTransactionId(@jakarta.annotation.Nullable final Integer value) {
        this.transactionId = value;
    }
}
