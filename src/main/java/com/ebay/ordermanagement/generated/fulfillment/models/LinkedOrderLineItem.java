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
 * This type contains data on a line item that is related to, but not a part of the order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LinkedOrderLineItem implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains the complete set of items aspects for the linked line item. For example:&lt;br&gt;&lt;pre&gt;&quot;lineItemAspects&quot;: [&lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Tire Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;All Season&quot;&lt;br&gt;    },&lt;br&gt;&lt;br&gt;    ...&lt;br&gt; &lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Car Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;Performance&quot;&lt;br&gt;    }&lt;br&gt;]&lt;/pre&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All item specifics for the listing are returned. The name/value pairs returned are in the language of the linked line item&apos;s listing site, which may vary from the seller&apos;s language.&lt;/span&gt;
     */
    private java.util.List<NameValuePair> lineItemAspects;
    /**
     * The unique identifier of the linked order line item.
     */
    private String lineItemId;
    /**
     * The end of the date range in which the linked line item is expected to be delivered to the shipping address.
     */
    private String maxEstimatedDeliveryDate;
    /**
     * The beginning of the date range in which the linked line item is expected to be delivered to the shipping address.
     */
    private String minEstimatedDeliveryDate;
    /**
     * The unique identifier of the order to which the linked line item belongs.
     */
    private String orderId;
    /**
     * The eBay user ID of the seller who sold the linked line item. For example, the user ID of the tire seller.
     */
    private String sellerId;
    /**
     * An array containing any shipment tracking information available for the linked line item.
     */
    private java.util.List<TrackingInfo> shipments;
    /**
     * The listing title of the linked line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     */
    private String title;
    /**
     * Instantiates a new {@link LinkedOrderLineItem} and sets the default values.
     */
    public LinkedOrderLineItem() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LinkedOrderLineItem}
     */
    @jakarta.annotation.Nonnull
    public static LinkedOrderLineItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LinkedOrderLineItem();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("lineItemAspects", (n) -> { this.setLineItemAspects(n.getCollectionOfObjectValues(NameValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItemId", (n) -> { this.setLineItemId(n.getStringValue()); });
        deserializerMap.put("maxEstimatedDeliveryDate", (n) -> { this.setMaxEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("minEstimatedDeliveryDate", (n) -> { this.setMinEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("orderId", (n) -> { this.setOrderId(n.getStringValue()); });
        deserializerMap.put("sellerId", (n) -> { this.setSellerId(n.getStringValue()); });
        deserializerMap.put("shipments", (n) -> { this.setShipments(n.getCollectionOfObjectValues(TrackingInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("title", (n) -> { this.setTitle(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineItemAspects property value. This array contains the complete set of items aspects for the linked line item. For example:&lt;br&gt;&lt;pre&gt;&quot;lineItemAspects&quot;: [&lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Tire Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;All Season&quot;&lt;br&gt;    },&lt;br&gt;&lt;br&gt;    ...&lt;br&gt; &lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Car Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;Performance&quot;&lt;br&gt;    }&lt;br&gt;]&lt;/pre&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All item specifics for the listing are returned. The name/value pairs returned are in the language of the linked line item&apos;s listing site, which may vary from the seller&apos;s language.&lt;/span&gt;
     * @return a {@link java.util.List<NameValuePair>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<NameValuePair> getLineItemAspects() {
        return this.lineItemAspects;
    }
    /**
     * Gets the lineItemId property value. The unique identifier of the linked order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }
    /**
     * Gets the maxEstimatedDeliveryDate property value. The end of the date range in which the linked line item is expected to be delivered to the shipping address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxEstimatedDeliveryDate() {
        return this.maxEstimatedDeliveryDate;
    }
    /**
     * Gets the minEstimatedDeliveryDate property value. The beginning of the date range in which the linked line item is expected to be delivered to the shipping address.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinEstimatedDeliveryDate() {
        return this.minEstimatedDeliveryDate;
    }
    /**
     * Gets the orderId property value. The unique identifier of the order to which the linked line item belongs.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOrderId() {
        return this.orderId;
    }
    /**
     * Gets the sellerId property value. The eBay user ID of the seller who sold the linked line item. For example, the user ID of the tire seller.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSellerId() {
        return this.sellerId;
    }
    /**
     * Gets the shipments property value. An array containing any shipment tracking information available for the linked line item.
     * @return a {@link java.util.List<TrackingInfo>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrackingInfo> getShipments() {
        return this.shipments;
    }
    /**
     * Gets the title property value. The listing title of the linked line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTitle() {
        return this.title;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("lineItemAspects", this.getLineItemAspects());
        writer.writeStringValue("lineItemId", this.getLineItemId());
        writer.writeStringValue("maxEstimatedDeliveryDate", this.getMaxEstimatedDeliveryDate());
        writer.writeStringValue("minEstimatedDeliveryDate", this.getMinEstimatedDeliveryDate());
        writer.writeStringValue("orderId", this.getOrderId());
        writer.writeStringValue("sellerId", this.getSellerId());
        writer.writeCollectionOfObjectValues("shipments", this.getShipments());
        writer.writeStringValue("title", this.getTitle());
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
     * Sets the lineItemAspects property value. This array contains the complete set of items aspects for the linked line item. For example:&lt;br&gt;&lt;pre&gt;&quot;lineItemAspects&quot;: [&lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Tire Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;All Season&quot;&lt;br&gt;    },&lt;br&gt;&lt;br&gt;    ...&lt;br&gt; &lt;br&gt;    {&lt;br&gt;        &quot;name&quot;: &quot;Car Type&quot;,&lt;br&gt;        &quot;value&quot;: &quot;Performance&quot;&lt;br&gt;    }&lt;br&gt;]&lt;/pre&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; All item specifics for the listing are returned. The name/value pairs returned are in the language of the linked line item&apos;s listing site, which may vary from the seller&apos;s language.&lt;/span&gt;
     * @param value Value to set for the lineItemAspects property.
     */
    public void setLineItemAspects(@jakarta.annotation.Nullable final java.util.List<NameValuePair> value) {
        this.lineItemAspects = value;
    }
    /**
     * Sets the lineItemId property value. The unique identifier of the linked order line item.
     * @param value Value to set for the lineItemId property.
     */
    public void setLineItemId(@jakarta.annotation.Nullable final String value) {
        this.lineItemId = value;
    }
    /**
     * Sets the maxEstimatedDeliveryDate property value. The end of the date range in which the linked line item is expected to be delivered to the shipping address.
     * @param value Value to set for the maxEstimatedDeliveryDate property.
     */
    public void setMaxEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.maxEstimatedDeliveryDate = value;
    }
    /**
     * Sets the minEstimatedDeliveryDate property value. The beginning of the date range in which the linked line item is expected to be delivered to the shipping address.
     * @param value Value to set for the minEstimatedDeliveryDate property.
     */
    public void setMinEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.minEstimatedDeliveryDate = value;
    }
    /**
     * Sets the orderId property value. The unique identifier of the order to which the linked line item belongs.
     * @param value Value to set for the orderId property.
     */
    public void setOrderId(@jakarta.annotation.Nullable final String value) {
        this.orderId = value;
    }
    /**
     * Sets the sellerId property value. The eBay user ID of the seller who sold the linked line item. For example, the user ID of the tire seller.
     * @param value Value to set for the sellerId property.
     */
    public void setSellerId(@jakarta.annotation.Nullable final String value) {
        this.sellerId = value;
    }
    /**
     * Sets the shipments property value. An array containing any shipment tracking information available for the linked line item.
     * @param value Value to set for the shipments property.
     */
    public void setShipments(@jakarta.annotation.Nullable final java.util.List<TrackingInfo> value) {
        this.shipments = value;
    }
    /**
     * Sets the title property value. The listing title of the linked line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The Item ID value for the listing will be returned in this field instead of the actual title if this particular listing is on-hold due to an eBay policy violation.&lt;/span&gt;
     * @param value Value to set for the title property.
     */
    public void setTitle(@jakarta.annotation.Nullable final String value) {
        this.title = value;
    }
}
