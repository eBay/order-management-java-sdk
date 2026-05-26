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
 * This type is used if the seller is issuing a refund for one or more individual order line items in a multiple line item order. Otherwise, the seller just uses the &lt;b&gt;orderLevelRefundAmount&lt;/b&gt; container to specify the amount of the refund for the entire order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RefundItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Type defining the &lt;b&gt;legacyReference&lt;/b&gt; container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.
     */
    private LegacyReference legacyReference;
    /**
     * The unique identifier of an order line item. This identifier is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder.&lt;br&gt;&lt;br&gt;Either this field or the &lt;b&gt;legacyReference&lt;/b&gt; container is needed to identify an individual order line item that will receive a refund.&lt;br&gt;&lt;br&gt; This value is returned using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank &quot;&gt;getOrders&lt;/a&gt; method.
     */
    private String lineItemId;
    /**
     * This type defines the monetary value of the payment dispute, and the currency used.
     */
    private SimpleAmount refundAmount;
    /**
     * Instantiates a new {@link RefundItem} and sets the default values.
     */
    public RefundItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RefundItem}
     */
    @jakarta.annotation.Nonnull
    public static RefundItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RefundItem();
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
        deserializerMap.put("legacyReference", (n) -> { this.setLegacyReference(n.getObjectValue(LegacyReference::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItemId", (n) -> { this.setLineItemId(n.getStringValue()); });
        deserializerMap.put("refundAmount", (n) -> { this.setRefundAmount(n.getObjectValue(SimpleAmount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the legacyReference property value. Type defining the &lt;b&gt;legacyReference&lt;/b&gt; container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.
     * @return a {@link LegacyReference}
     */
    @jakarta.annotation.Nullable
    public LegacyReference getLegacyReference() {
        return this.legacyReference;
    }
    /**
     * Gets the lineItemId property value. The unique identifier of an order line item. This identifier is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder.&lt;br&gt;&lt;br&gt;Either this field or the &lt;b&gt;legacyReference&lt;/b&gt; container is needed to identify an individual order line item that will receive a refund.&lt;br&gt;&lt;br&gt; This value is returned using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank &quot;&gt;getOrders&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }
    /**
     * Gets the refundAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @return a {@link SimpleAmount}
     */
    @jakarta.annotation.Nullable
    public SimpleAmount getRefundAmount() {
        return this.refundAmount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("legacyReference", this.getLegacyReference());
        writer.writeStringValue("lineItemId", this.getLineItemId());
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
     * Sets the legacyReference property value. Type defining the &lt;b&gt;legacyReference&lt;/b&gt; container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.
     * @param value Value to set for the legacyReference property.
     */
    public void setLegacyReference(@jakarta.annotation.Nullable final LegacyReference value) {
        this.legacyReference = value;
    }
    /**
     * Sets the lineItemId property value. The unique identifier of an order line item. This identifier is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder.&lt;br&gt;&lt;br&gt;Either this field or the &lt;b&gt;legacyReference&lt;/b&gt; container is needed to identify an individual order line item that will receive a refund.&lt;br&gt;&lt;br&gt; This value is returned using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank &quot;&gt;getOrders&lt;/a&gt; method.
     * @param value Value to set for the lineItemId property.
     */
    public void setLineItemId(@jakarta.annotation.Nullable final String value) {
        this.lineItemId = value;
    }
    /**
     * Sets the refundAmount property value. This type defines the monetary value of the payment dispute, and the currency used.
     * @param value Value to set for the refundAmount property.
     */
    public void setRefundAmount(@jakarta.annotation.Nullable final SimpleAmount value) {
        this.refundAmount = value;
    }
}
