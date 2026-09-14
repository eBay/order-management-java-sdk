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
 * This type contains the details for creating a fulfillment for an order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingFulfillmentDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains a list of or more line items and the quantity that will be shipped in the same package.
     */
    private java.util.List<LineItemReference> lineItems;
    /**
     * This is the actual date and time that the fulfillment package was shipped. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. The seller should use the actual date/time that the package was shipped, but if this field is omitted, it will default to the current date/time.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The current date and time.
     */
    private String shippedDate;
    /**
     * The unique identifier of the shipping carrier being used to ship the line item(s). Technically, the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; and &lt;strong&gt;trackingNumber&lt;/strong&gt; fields are optional, but generally these fields will be provided if the shipping carrier and tracking number are known. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier enumeration values. When making the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. Each valid shipping carrier enumeration value is returned in a &lt;strong&gt;ShippingCarrierDetails.ShippingCarrier&lt;/strong&gt; field in the response payload.&lt;/span&gt;
     */
    private String shippingCarrierCode;
    /**
     * The tracking number provided by the shipping carrier for this fulfillment. The seller should be careful that this tracking number is accurate since the buyer will use this tracking number to track shipment, and eBay has no way to verify the accuracy of this number.&lt;br&gt;&lt;br&gt;This field and the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; field are mutually dependent. If you include one, you must also include the other.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If you include &lt;strong&gt;trackingNumber&lt;/strong&gt; (and &lt;strong&gt;shippingCarrierCode&lt;/strong&gt;) in the request, the resulting fulfillment&apos;s ID (returned in the HTTP location response header) is the tracking number. If you do not include shipment tracking information, the resulting fulfillment ID will default to an arbitrary number such as &lt;code&gt;999&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Only alphanumeric characters are supported for shipment tracking numbers. Spaces, hyphens, and all other special characters are not supported. Do not include a space in the tracking number even if a space appears in the tracking number on the shipping label.&lt;/span&gt;
     */
    private String trackingNumber;
    /**
     * Instantiates a new {@link ShippingFulfillmentDetails} and sets the default values.
     */
    public ShippingFulfillmentDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingFulfillmentDetails}
     */
    @jakarta.annotation.Nonnull
    public static ShippingFulfillmentDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingFulfillmentDetails();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(LineItemReference::createFromDiscriminatorValue)); });
        deserializerMap.put("shippedDate", (n) -> { this.setShippedDate(n.getStringValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("trackingNumber", (n) -> { this.setTrackingNumber(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineItems property value. This array contains a list of or more line items and the quantity that will be shipped in the same package.
     * @return a {@link java.util.List<LineItemReference>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<LineItemReference> getLineItems() {
        return this.lineItems;
    }
    /**
     * Gets the shippedDate property value. This is the actual date and time that the fulfillment package was shipped. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. The seller should use the actual date/time that the package was shipped, but if this field is omitted, it will default to the current date/time.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The current date and time.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippedDate() {
        return this.shippedDate;
    }
    /**
     * Gets the shippingCarrierCode property value. The unique identifier of the shipping carrier being used to ship the line item(s). Technically, the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; and &lt;strong&gt;trackingNumber&lt;/strong&gt; fields are optional, but generally these fields will be provided if the shipping carrier and tracking number are known. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier enumeration values. When making the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. Each valid shipping carrier enumeration value is returned in a &lt;strong&gt;ShippingCarrierDetails.ShippingCarrier&lt;/strong&gt; field in the response payload.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the trackingNumber property value. The tracking number provided by the shipping carrier for this fulfillment. The seller should be careful that this tracking number is accurate since the buyer will use this tracking number to track shipment, and eBay has no way to verify the accuracy of this number.&lt;br&gt;&lt;br&gt;This field and the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; field are mutually dependent. If you include one, you must also include the other.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If you include &lt;strong&gt;trackingNumber&lt;/strong&gt; (and &lt;strong&gt;shippingCarrierCode&lt;/strong&gt;) in the request, the resulting fulfillment&apos;s ID (returned in the HTTP location response header) is the tracking number. If you do not include shipment tracking information, the resulting fulfillment ID will default to an arbitrary number such as &lt;code&gt;999&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Only alphanumeric characters are supported for shipment tracking numbers. Spaces, hyphens, and all other special characters are not supported. Do not include a space in the tracking number even if a space appears in the tracking number on the shipping label.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTrackingNumber() {
        return this.trackingNumber;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
        writer.writeStringValue("shippedDate", this.getShippedDate());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
        writer.writeStringValue("trackingNumber", this.getTrackingNumber());
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
     * Sets the lineItems property value. This array contains a list of or more line items and the quantity that will be shipped in the same package.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<LineItemReference> value) {
        this.lineItems = value;
    }
    /**
     * Sets the shippedDate property value. This is the actual date and time that the fulfillment package was shipped. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. The seller should use the actual date/time that the package was shipped, but if this field is omitted, it will default to the current date/time.&lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;&lt;br&gt;&lt;br&gt;&lt;strong&gt;Default:&lt;/strong&gt; The current date and time.
     * @param value Value to set for the shippedDate property.
     */
    public void setShippedDate(@jakarta.annotation.Nullable final String value) {
        this.shippedDate = value;
    }
    /**
     * Sets the shippingCarrierCode property value. The unique identifier of the shipping carrier being used to ship the line item(s). Technically, the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; and &lt;strong&gt;trackingNumber&lt;/strong&gt; fields are optional, but generally these fields will be provided if the shipping carrier and tracking number are known. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier enumeration values. When making the &lt;a href=&quot;https://developer.ebay.com/devzone/xml/docs/reference/ebay/GeteBayDetails.html&quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingCarrierDetails&lt;/code&gt;. Each valid shipping carrier enumeration value is returned in a &lt;strong&gt;ShippingCarrierDetails.ShippingCarrier&lt;/strong&gt; field in the response payload.&lt;/span&gt;
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the trackingNumber property value. The tracking number provided by the shipping carrier for this fulfillment. The seller should be careful that this tracking number is accurate since the buyer will use this tracking number to track shipment, and eBay has no way to verify the accuracy of this number.&lt;br&gt;&lt;br&gt;This field and the &lt;strong&gt;shippingCarrierCode&lt;/strong&gt; field are mutually dependent. If you include one, you must also include the other.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; If you include &lt;strong&gt;trackingNumber&lt;/strong&gt; (and &lt;strong&gt;shippingCarrierCode&lt;/strong&gt;) in the request, the resulting fulfillment&apos;s ID (returned in the HTTP location response header) is the tracking number. If you do not include shipment tracking information, the resulting fulfillment ID will default to an arbitrary number such as &lt;code&gt;999&lt;/code&gt;.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Only alphanumeric characters are supported for shipment tracking numbers. Spaces, hyphens, and all other special characters are not supported. Do not include a space in the tracking number even if a space appears in the tracking number on the shipping label.&lt;/span&gt;
     * @param value Value to set for the trackingNumber property.
     */
    public void setTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.trackingNumber = value;
    }
}
