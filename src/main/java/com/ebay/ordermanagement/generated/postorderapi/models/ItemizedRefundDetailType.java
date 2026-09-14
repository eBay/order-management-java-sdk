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
 * This type is used by the &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container to provide details about a refund that was issued, or is in the process of being issued to the buyer. An &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container is required for each different refund type, such as purchase price and original shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemizedRefundDetailType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount refundAmount;
    /**
     * This enumerated value indicates the type of refund. When issuing a refund through the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method, or if marking a refund as sent with the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method, the seller must use a separate &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type, such as one for the purchase price, and one for original shipping.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing refund fee types are defined in the &lt;a href=&quot;/devzone/post-order/types/RefundFeeTypeEnum.html&quot;&gt;RefundFeeTypeEnum&lt;/a&gt; type definition.
     */
    private String refundFeeType;
    /**
     * &lt;b&gt;THIS FIELD IS DEPRECATED. DO NOT USE.
     */
    private String restockingFeePercentage;
    /**
     * Instantiates a new {@link ItemizedRefundDetailType} and sets the default values.
     */
    public ItemizedRefundDetailType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemizedRefundDetailType}
     */
    @jakarta.annotation.Nonnull
    public static ItemizedRefundDetailType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemizedRefundDetailType();
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
        deserializerMap.put("refundAmount", (n) -> { this.setRefundAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("refundFeeType", (n) -> { this.setRefundFeeType(n.getStringValue()); });
        deserializerMap.put("restockingFeePercentage", (n) -> { this.setRestockingFeePercentage(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the refundFeeType property value. This enumerated value indicates the type of refund. When issuing a refund through the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method, or if marking a refund as sent with the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method, the seller must use a separate &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type, such as one for the purchase price, and one for original shipping.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing refund fee types are defined in the &lt;a href=&quot;/devzone/post-order/types/RefundFeeTypeEnum.html&quot;&gt;RefundFeeTypeEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRefundFeeType() {
        return this.refundFeeType;
    }
    /**
     * Gets the restockingFeePercentage property value. &lt;b&gt;THIS FIELD IS DEPRECATED. DO NOT USE.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestockingFeePercentage() {
        return this.restockingFeePercentage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("refundAmount", this.getRefundAmount());
        writer.writeStringValue("refundFeeType", this.getRefundFeeType());
        writer.writeStringValue("restockingFeePercentage", this.getRestockingFeePercentage());
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
     * Sets the refundAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the refundAmount property.
     */
    public void setRefundAmount(@jakarta.annotation.Nullable final Amount value) {
        this.refundAmount = value;
    }
    /**
     * Sets the refundFeeType property value. This enumerated value indicates the type of refund. When issuing a refund through the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method, or if marking a refund as sent with the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method, the seller must use a separate &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type, such as one for the purchase price, and one for original shipping.&lt;br/&gt;&lt;br/&gt;The supported enumeration values representing refund fee types are defined in the &lt;a href=&quot;/devzone/post-order/types/RefundFeeTypeEnum.html&quot;&gt;RefundFeeTypeEnum&lt;/a&gt; type definition.
     * @param value Value to set for the refundFeeType property.
     */
    public void setRefundFeeType(@jakarta.annotation.Nullable final String value) {
        this.refundFeeType = value;
    }
    /**
     * Sets the restockingFeePercentage property value. &lt;b&gt;THIS FIELD IS DEPRECATED. DO NOT USE.
     * @param value Value to set for the restockingFeePercentage property.
     */
    public void setRestockingFeePercentage(@jakarta.annotation.Nullable final String value) {
        this.restockingFeePercentage = value;
    }
}
