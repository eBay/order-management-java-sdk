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
 * This type contains the complete details of an existing fulfillment for an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingFulfillment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the fulfillment; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. This eBay-generated value is created with a successful &lt;b&gt;createShippingFulfillment&lt;/b&gt; call.
     */
    private String fulfillmentId;
    /**
     * This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies.
     */
    private java.util.List<LineItemReference> lineItems;
    /**
     * The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available.
     */
    private String shipmentTrackingNumber;
    /**
     * The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String shippedDate;
    /**
     * The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;b&gt;ShippingCarrierCodeType&lt;/b&gt; enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See &lt;a href=&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html &quot; target=&quot;_blank&quot;&gt;ShippingCarrierCodeType&lt;/a&gt;.&lt;/span&gt;
     */
    private String shippingCarrierCode;
    /**
     * Instantiates a new {@link ShippingFulfillment} and sets the default values.
     */
    public ShippingFulfillment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingFulfillment}
     */
    @jakarta.annotation.Nonnull
    public static ShippingFulfillment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingFulfillment();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("fulfillmentId", (n) -> { this.setFulfillmentId(n.getStringValue()); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(LineItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentTrackingNumber", (n) -> { this.setShipmentTrackingNumber(n.getStringValue()); });
        deserializerMap.put("shippedDate", (n) -> { this.setShippedDate(n.getStringValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentId property value. The unique identifier of the fulfillment; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. This eBay-generated value is created with a successful &lt;b&gt;createShippingFulfillment&lt;/b&gt; call.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFulfillmentId() {
        return this.fulfillmentId;
    }
    /**
     * Gets the lineItems property value. This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies.
     * @return a {@link java.util.List<LineItemReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LineItemReference> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the shipmentTrackingNumber property value. The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipmentTrackingNumber() {
        return this.shipmentTrackingNumber;
    }
    /**
     * Gets the shippedDate property value. The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippedDate() {
        return this.shippedDate;
    }
    /**
     * Gets the shippingCarrierCode property value. The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;b&gt;ShippingCarrierCodeType&lt;/b&gt; enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See &lt;a href=&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html &quot; target=&quot;_blank&quot;&gt;ShippingCarrierCodeType&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fulfillmentId", this.getFulfillmentId());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeStringValue("shipmentTrackingNumber", this.getShipmentTrackingNumber());
        writer.writeStringValue("shippedDate", this.getShippedDate());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
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
     * Sets the fulfillmentId property value. The unique identifier of the fulfillment; for example, &lt;code&gt;9405509699937003457459&lt;/code&gt;. This eBay-generated value is created with a successful &lt;b&gt;createShippingFulfillment&lt;/b&gt; call.
     * @param value Value to set for the fulfillmentId property.
     */
    public void setFulfillmentId(@jakarta.annotation.Nullable final String value) {
        this.fulfillmentId = value;
    }
    /**
     * Sets the lineItems property value. This array contains a list of one or more line items (and purchased quantity) to which the fulfillment applies.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<LineItemReference> value) {
        this.lineItems = value;
    }
    /**
     * Sets the shipmentTrackingNumber property value. The tracking number provided by the shipping carrier for the package shipped in this fulfillment. This field is returned if available.
     * @param value Value to set for the shipmentTrackingNumber property.
     */
    public void setShipmentTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.shipmentTrackingNumber = value;
    }
    /**
     * Sets the shippedDate property value. The date and time that the fulfillment package was shipped. This timestamp is in ISO 8601 format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field should only be returned if the package has been shipped.&lt;br&gt;&lt;br&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the shippedDate property.
     */
    public void setShippedDate(@jakarta.annotation.Nullable final String value) {
        this.shippedDate = value;
    }
    /**
     * Sets the shippingCarrierCode property value. The eBay code identifying the shipping carrier for this fulfillment. This field is returned if available. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;b&gt;ShippingCarrierCodeType&lt;/b&gt; enumeration type contains the most current list of eBay shipping carrier codes and the countries served by each carrier. See &lt;a href=&quot;https://developer.ebay.com/Devzone/XML/docs/Reference/eBay/types/ShippingCarrierCodeType.html &quot; target=&quot;_blank&quot;&gt;ShippingCarrierCodeType&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
}
