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
 * This type contains shipping information for a fulfillment, including the shipping carrier, the shipping service option, the shipment destination, and the Global Shipping Program reference ID.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingStep implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the shipping carrier being used to ship the line item. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;a href=&quot;https://developer.ebay.com/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call can be used to retrieve the latest shipping carrier and shipping service option enumeration values.&lt;/span&gt;
     */
    private String shippingCarrierCode;
    /**
     * The unique identifier of the shipping service option being used to ship the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier and shipping service option enumeration values. When making the &lt;a href=&quot;/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. Each valid shipping service option (returned in &lt;strong&gt;ShippingServiceDetails.ShippingService&lt;/strong&gt; field) and corresponding shipping carrier (returned in &lt;strong&gt;ShippingServiceDetails.ShippingCarrier&lt;/strong&gt; field) is returned in response payload.&lt;/span&gt;
     */
    private String shippingServiceCode;
    /**
     * This container consists of shipping and contact information about the individual or organization to whom the fulfillment package will be shipped.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; is &lt;code&gt;FULFILLED_BY_EBAY&lt;/code&gt;, there will be no &lt;strong&gt;shipTo&lt;/strong&gt; address displayed.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Digitally Delivered Goods (DDG), this address is the same as the Buyer&apos;s Registration Address.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For a Global Shipping Program shipment, this is the address of the international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;/span&gt;
     */
    private ExtendedContact shipTo;
    /**
     * This is the unique identifer of the Global Shipping Program (GSP) shipment. This field is only returned if the line item is being shipped via GSP (the value of the &lt;strong&gt;fulfillmentStartInstructions.ebaySupportedFulfillment&lt;/strong&gt; field will be &lt;code&gt;true&lt;/code&gt;. The international shipping provider uses the &lt;strong&gt;shipToReferenceId&lt;/strong&gt; value as the primary reference number to retrieve the relevant details about the buyer, the order, and the fulfillment, so the shipment can be completed. &lt;br&gt;&lt;br&gt;Sellers must include this value on the shipping label immediately above the street address of the international shipping provider. &lt;br&gt;&lt;br&gt;Example: &quot;Reference #1234567890123456&quot; &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is the same as the &lt;strong&gt;ShipToAddress.ReferenceID&lt;/strong&gt; value returned by the Trading API&apos;s GetOrders call.&lt;/span&gt;
     */
    private String shipToReferenceId;
    /**
     * Instantiates a new {@link ShippingStep} and sets the default values.
     */
    public ShippingStep() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingStep}
     */
    @jakarta.annotation.Nonnull
    public static ShippingStep createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingStep();
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
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("shippingServiceCode", (n) -> { this.setShippingServiceCode(n.getStringValue()); });
        deserializerMap.put("shipTo", (n) -> { this.setShipTo(n.getObjectValue(ExtendedContact::createFromDiscriminatorValue)); });
        deserializerMap.put("shipToReferenceId", (n) -> { this.setShipToReferenceId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shippingCarrierCode property value. The unique identifier of the shipping carrier being used to ship the line item. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;a href=&quot;https://developer.ebay.com/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call can be used to retrieve the latest shipping carrier and shipping service option enumeration values.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the shippingServiceCode property value. The unique identifier of the shipping service option being used to ship the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier and shipping service option enumeration values. When making the &lt;a href=&quot;/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. Each valid shipping service option (returned in &lt;strong&gt;ShippingServiceDetails.ShippingService&lt;/strong&gt; field) and corresponding shipping carrier (returned in &lt;strong&gt;ShippingServiceDetails.ShippingCarrier&lt;/strong&gt; field) is returned in response payload.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceCode() {
        return this.shippingServiceCode;
    }
    /**
     * Gets the shipTo property value. This container consists of shipping and contact information about the individual or organization to whom the fulfillment package will be shipped.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; is &lt;code&gt;FULFILLED_BY_EBAY&lt;/code&gt;, there will be no &lt;strong&gt;shipTo&lt;/strong&gt; address displayed.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Digitally Delivered Goods (DDG), this address is the same as the Buyer&apos;s Registration Address.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For a Global Shipping Program shipment, this is the address of the international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link ExtendedContact}
     */
    @jakarta.annotation.Nullable
    public ExtendedContact getShipTo() {
        return this.shipTo;
    }
    /**
     * Gets the shipToReferenceId property value. This is the unique identifer of the Global Shipping Program (GSP) shipment. This field is only returned if the line item is being shipped via GSP (the value of the &lt;strong&gt;fulfillmentStartInstructions.ebaySupportedFulfillment&lt;/strong&gt; field will be &lt;code&gt;true&lt;/code&gt;. The international shipping provider uses the &lt;strong&gt;shipToReferenceId&lt;/strong&gt; value as the primary reference number to retrieve the relevant details about the buyer, the order, and the fulfillment, so the shipment can be completed. &lt;br&gt;&lt;br&gt;Sellers must include this value on the shipping label immediately above the street address of the international shipping provider. &lt;br&gt;&lt;br&gt;Example: &quot;Reference #1234567890123456&quot; &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is the same as the &lt;strong&gt;ShipToAddress.ReferenceID&lt;/strong&gt; value returned by the Trading API&apos;s GetOrders call.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipToReferenceId() {
        return this.shipToReferenceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
        writer.writeStringValue("shippingServiceCode", this.getShippingServiceCode());
        writer.writeObjectValue("shipTo", this.getShipTo());
        writer.writeStringValue("shipToReferenceId", this.getShipToReferenceId());
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
     * Sets the shippingCarrierCode property value. The unique identifier of the shipping carrier being used to ship the line item. &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Trading API&apos;s &lt;a href=&quot;https://developer.ebay.com/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call can be used to retrieve the latest shipping carrier and shipping service option enumeration values.&lt;/span&gt;
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the shippingServiceCode property value. The unique identifier of the shipping service option being used to ship the line item.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Use the Trading API&apos;s &lt;strong&gt;GeteBayDetails&lt;/strong&gt; call to retrieve the latest shipping carrier and shipping service option enumeration values. When making the &lt;a href=&quot;/devzone/XML/docs/Reference/eBay/GeteBayDetails.html &quot; target=&quot;_blank&quot;&gt;GeteBayDetails&lt;/a&gt; call, include the &lt;strong&gt;DetailName&lt;/strong&gt; field in the request payload and set its value to &lt;code&gt;ShippingServiceDetails&lt;/code&gt;. Each valid shipping service option (returned in &lt;strong&gt;ShippingServiceDetails.ShippingService&lt;/strong&gt; field) and corresponding shipping carrier (returned in &lt;strong&gt;ShippingServiceDetails.ShippingCarrier&lt;/strong&gt; field) is returned in response payload.&lt;/span&gt;
     * @param value Value to set for the shippingServiceCode property.
     */
    public void setShippingServiceCode(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceCode = value;
    }
    /**
     * Sets the shipTo property value. This container consists of shipping and contact information about the individual or organization to whom the fulfillment package will be shipped.&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; is &lt;code&gt;FULFILLED_BY_EBAY&lt;/code&gt;, there will be no &lt;strong&gt;shipTo&lt;/strong&gt; address displayed.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Digitally Delivered Goods (DDG), this address is the same as the Buyer&apos;s Registration Address.&lt;/span&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For a Global Shipping Program shipment, this is the address of the international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address. For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the shipTo property.
     */
    public void setShipTo(@jakarta.annotation.Nullable final ExtendedContact value) {
        this.shipTo = value;
    }
    /**
     * Sets the shipToReferenceId property value. This is the unique identifer of the Global Shipping Program (GSP) shipment. This field is only returned if the line item is being shipped via GSP (the value of the &lt;strong&gt;fulfillmentStartInstructions.ebaySupportedFulfillment&lt;/strong&gt; field will be &lt;code&gt;true&lt;/code&gt;. The international shipping provider uses the &lt;strong&gt;shipToReferenceId&lt;/strong&gt; value as the primary reference number to retrieve the relevant details about the buyer, the order, and the fulfillment, so the shipment can be completed. &lt;br&gt;&lt;br&gt;Sellers must include this value on the shipping label immediately above the street address of the international shipping provider. &lt;br&gt;&lt;br&gt;Example: &quot;Reference #1234567890123456&quot; &lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; This value is the same as the &lt;strong&gt;ShipToAddress.ReferenceID&lt;/strong&gt; value returned by the Trading API&apos;s GetOrders call.&lt;/span&gt;
     * @param value Value to set for the shipToReferenceId property.
     */
    public void setShipToReferenceId(@jakarta.annotation.Nullable final String value) {
        this.shipToReferenceId = value;
    }
}
