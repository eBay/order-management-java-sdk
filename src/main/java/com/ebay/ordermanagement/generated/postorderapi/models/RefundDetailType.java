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
 * This type is used by &lt;b&gt;refundDetail&lt;/b&gt; container in the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; and &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; methods to specify the total amount of the refund, as well as an &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container for each refund type (refund on purchase price, refund on original shipping, or any other costs paid by the buyer). The amount(s) in the &lt;b&gt;itemizedRefundDetail.amount&lt;/b&gt; field(s) should equal the amount in the &lt;b&gt;refundDetail.totalAmount&lt;/b&gt; field. This type is also used by the &lt;b&gt;actualRefund&lt;/b&gt; container in the response of a &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; method to provide information about a successful refund for a return.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RefundDetailType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount donationAmount;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount feeCreditAmount;
    /**
     * This container is used to declare a refund that is being issued, or has been issued to the buyer. An &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container is required for each different refund type, such as purchase price and original shipping. This container is required when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method to issue a refund, or when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method to mark a refund as sent. In the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; and &lt;b&gt;GET /post-order/v2/return/{returnId}&lt;/b&gt; methods, this container will be returned under the &lt;b&gt;actualRefund&lt;/b&gt; container if a refund has occurred.
     */
    private java.util.List<ItemizedRefundDetailType> itemizedRefundDetail;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount totalAmount;
    /**
     * Instantiates a new {@link RefundDetailType} and sets the default values.
     */
    public RefundDetailType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RefundDetailType}
     */
    @jakarta.annotation.Nonnull
    public static RefundDetailType createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RefundDetailType();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("donationAmount", (n) -> { this.setDonationAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("feeCreditAmount", (n) -> { this.setFeeCreditAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("itemizedRefundDetail", (n) -> { this.setItemizedRefundDetail(n.getCollectionOfObjectValues(ItemizedRefundDetailType::createFromDiscriminatorValue)); });
        deserializerMap.put("totalAmount", (n) -> { this.setTotalAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the itemizedRefundDetail property value. This container is used to declare a refund that is being issued, or has been issued to the buyer. An &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container is required for each different refund type, such as purchase price and original shipping. This container is required when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method to issue a refund, or when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method to mark a refund as sent. In the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; and &lt;b&gt;GET /post-order/v2/return/{returnId}&lt;/b&gt; methods, this container will be returned under the &lt;b&gt;actualRefund&lt;/b&gt; container if a refund has occurred.
     * @return a {@link java.util.List<ItemizedRefundDetailType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ItemizedRefundDetailType> getItemizedRefundDetail() {
        return this.itemizedRefundDetail;
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
        writer.writeObjectValue("donationAmount", this.getDonationAmount());
        writer.writeObjectValue("feeCreditAmount", this.getFeeCreditAmount());
        writer.writeCollectionOfObjectValues("itemizedRefundDetail", this.getItemizedRefundDetail());
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
     * Sets the itemizedRefundDetail property value. This container is used to declare a refund that is being issued, or has been issued to the buyer. An &lt;b&gt;itemizedRefundDetail&lt;/b&gt; container is required for each different refund type, such as purchase price and original shipping. This container is required when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/issue_refund&lt;/b&gt; method to issue a refund, or when using the &lt;b&gt;POST /post-order/v2/return/{returnId}/mark_refund_sent&lt;/b&gt; method to mark a refund as sent. In the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; and &lt;b&gt;GET /post-order/v2/return/{returnId}&lt;/b&gt; methods, this container will be returned under the &lt;b&gt;actualRefund&lt;/b&gt; container if a refund has occurred.
     * @param value Value to set for the itemizedRefundDetail property.
     */
    public void setItemizedRefundDetail(@jakarta.annotation.Nullable final java.util.List<ItemizedRefundDetailType> value) {
        this.itemizedRefundDetail = value;
    }
    /**
     * Sets the totalAmount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the totalAmount property.
     */
    public void setTotalAmount(@jakarta.annotation.Nullable final Amount value) {
        this.totalAmount = value;
    }
}
