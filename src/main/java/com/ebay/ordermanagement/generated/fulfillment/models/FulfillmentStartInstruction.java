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
 * This type contains a set of specifications for processing a fulfillment of an order, including the type of fulfillment, shipping carrier and service, addressing details, and estimated delivery window. These instructions are derived from the buyer&apos;s and seller&apos;s eBay account preferences, the listing parameters, and the buyer&apos;s checkout selections. The seller can use them as a starting point for packaging, addressing, and shipping the order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FulfillmentStartInstruction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container provides information used by the installation provider concerning appointment details selected by the buyer.
     */
    private AppointmentDetails appointment;
    /**
     * This field is reserved for internal or future use. &lt;!-- Destination time zone. This is time zone id from Olson database. Example: America/Los_Angeles. Delivery dates are calculated relative to this time zone. --&gt;
     */
    private String destinationTimeZone;
    /**
     * This field is only returned if its value is &lt;code&gt;true&lt;/code&gt; and indicates that the fulfillment will be shipped via eBay&apos;s Global Shipping Program, eBay International Shipping, or the Authenticity Guarantee service program. &lt;br&gt;&lt;br&gt;For more information, see the &lt;a href=&quot;https://www.ebay.com/help/selling/shipping-items/setting-shipping-options/global-shipping-program?id=4646 &quot; target=&quot;_blank&quot;&gt;Global Shipping Program&lt;/a&gt; help topic.
     */
    private Boolean ebaySupportedFulfillment;
    /**
     * This container is only returned if the value of &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This is the final destination address for a Global Shipping Program shipment or an eBay International Shipping shipment, which is usually the recipient&apos;s home. Sellers should not ship directly to this address; instead they should ship this package to their international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address.&lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Authenticity Guarantee program shipment, this is the address of the authenticator&apos;s warehouse. The authenticator is responsible for delivery to the buyer shipping address.&lt;/span&gt;&lt;/p&gt;
     */
    private Address finalDestinationAddress;
    /**
     * The enumeration value returned in this field indicates the method of fulfillment that will be used to deliver this set of line items (this package) to the buyer. This field will have a value of &lt;code&gt;SHIP_TO&lt;/code&gt; if the &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is returned with a value of &lt;code&gt;true&lt;/code&gt;. See the &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; definition for more information about different fulfillment types.
     */
    private FulfillmentInstructionsType fulfillmentInstructionsType;
    /**
     * This is the estimated latest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned ifthe value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String maxEstimatedDeliveryDate;
    /**
     * This is the estimated earliest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned if  the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     */
    private String minEstimatedDeliveryDate;
    /**
     * This container is only returned for In-Store Pickup orders, and it indicates the specific merchant&apos;s store where the buyer will pick up the order. The In-Store Pickup feature is supported in the US, Canada, UK, Germany, and Australia marketplaces.
     */
    private PickupStep pickupStep;
    /**
     * This container consists of shipping information for this fulfillment, including the shipping carrier, the shipping service option, and the shipment destination. This container is not returned if the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt;, or for In-Store Pickup orders. &lt;br&gt;&lt;br&gt; For Click and Collect orders, the shipping destination will be a brick-and-mortar store where the buyer will pick up the order.
     */
    private ShippingStep shippingStep;
    /**
     * Instantiates a new {@link FulfillmentStartInstruction} and sets the default values.
     */
    public FulfillmentStartInstruction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FulfillmentStartInstruction}
     */
    @jakarta.annotation.Nonnull
    public static FulfillmentStartInstruction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FulfillmentStartInstruction();
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
     * Gets the appointment property value. This container provides information used by the installation provider concerning appointment details selected by the buyer.
     * @return a {@link AppointmentDetails}
     */
    @jakarta.annotation.Nullable
    public AppointmentDetails getAppointment() {
        return this.appointment;
    }
    /**
     * Gets the destinationTimeZone property value. This field is reserved for internal or future use. &lt;!-- Destination time zone. This is time zone id from Olson database. Example: America/Los_Angeles. Delivery dates are calculated relative to this time zone. --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationTimeZone() {
        return this.destinationTimeZone;
    }
    /**
     * Gets the ebaySupportedFulfillment property value. This field is only returned if its value is &lt;code&gt;true&lt;/code&gt; and indicates that the fulfillment will be shipped via eBay&apos;s Global Shipping Program, eBay International Shipping, or the Authenticity Guarantee service program. &lt;br&gt;&lt;br&gt;For more information, see the &lt;a href=&quot;https://www.ebay.com/help/selling/shipping-items/setting-shipping-options/global-shipping-program?id=4646 &quot; target=&quot;_blank&quot;&gt;Global Shipping Program&lt;/a&gt; help topic.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getEbaySupportedFulfillment() {
        return this.ebaySupportedFulfillment;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("appointment", (n) -> { this.setAppointment(n.getObjectValue(AppointmentDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationTimeZone", (n) -> { this.setDestinationTimeZone(n.getStringValue()); });
        deserializerMap.put("ebaySupportedFulfillment", (n) -> { this.setEbaySupportedFulfillment(n.getBooleanValue()); });
        deserializerMap.put("finalDestinationAddress", (n) -> { this.setFinalDestinationAddress(n.getObjectValue(Address::createFromDiscriminatorValue)); });
        deserializerMap.put("fulfillmentInstructionsType", (n) -> { this.setFulfillmentInstructionsType(n.getEnumValue(FulfillmentInstructionsType::forValue)); });
        deserializerMap.put("maxEstimatedDeliveryDate", (n) -> { this.setMaxEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("minEstimatedDeliveryDate", (n) -> { this.setMinEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("pickupStep", (n) -> { this.setPickupStep(n.getObjectValue(PickupStep::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingStep", (n) -> { this.setShippingStep(n.getObjectValue(ShippingStep::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the finalDestinationAddress property value. This container is only returned if the value of &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This is the final destination address for a Global Shipping Program shipment or an eBay International Shipping shipment, which is usually the recipient&apos;s home. Sellers should not ship directly to this address; instead they should ship this package to their international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address.&lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Authenticity Guarantee program shipment, this is the address of the authenticator&apos;s warehouse. The authenticator is responsible for delivery to the buyer shipping address.&lt;/span&gt;&lt;/p&gt;
     * @return a {@link Address}
     */
    @jakarta.annotation.Nullable
    public Address getFinalDestinationAddress() {
        return this.finalDestinationAddress;
    }
    /**
     * Gets the fulfillmentInstructionsType property value. The enumeration value returned in this field indicates the method of fulfillment that will be used to deliver this set of line items (this package) to the buyer. This field will have a value of &lt;code&gt;SHIP_TO&lt;/code&gt; if the &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is returned with a value of &lt;code&gt;true&lt;/code&gt;. See the &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; definition for more information about different fulfillment types.
     * @return a {@link FulfillmentInstructionsType}
     */
    @jakarta.annotation.Nullable
    public FulfillmentInstructionsType getFulfillmentInstructionsType() {
        return this.fulfillmentInstructionsType;
    }
    /**
     * Gets the maxEstimatedDeliveryDate property value. This is the estimated latest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned ifthe value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxEstimatedDeliveryDate() {
        return this.maxEstimatedDeliveryDate;
    }
    /**
     * Gets the minEstimatedDeliveryDate property value. This is the estimated earliest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned if  the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinEstimatedDeliveryDate() {
        return this.minEstimatedDeliveryDate;
    }
    /**
     * Gets the pickupStep property value. This container is only returned for In-Store Pickup orders, and it indicates the specific merchant&apos;s store where the buyer will pick up the order. The In-Store Pickup feature is supported in the US, Canada, UK, Germany, and Australia marketplaces.
     * @return a {@link PickupStep}
     */
    @jakarta.annotation.Nullable
    public PickupStep getPickupStep() {
        return this.pickupStep;
    }
    /**
     * Gets the shippingStep property value. This container consists of shipping information for this fulfillment, including the shipping carrier, the shipping service option, and the shipment destination. This container is not returned if the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt;, or for In-Store Pickup orders. &lt;br&gt;&lt;br&gt; For Click and Collect orders, the shipping destination will be a brick-and-mortar store where the buyer will pick up the order.
     * @return a {@link ShippingStep}
     */
    @jakarta.annotation.Nullable
    public ShippingStep getShippingStep() {
        return this.shippingStep;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appointment", this.getAppointment());
        writer.writeStringValue("destinationTimeZone", this.getDestinationTimeZone());
        writer.writeBooleanValue("ebaySupportedFulfillment", this.getEbaySupportedFulfillment());
        writer.writeObjectValue("finalDestinationAddress", this.getFinalDestinationAddress());
        writer.writeEnumValue("fulfillmentInstructionsType", this.getFulfillmentInstructionsType());
        writer.writeStringValue("maxEstimatedDeliveryDate", this.getMaxEstimatedDeliveryDate());
        writer.writeStringValue("minEstimatedDeliveryDate", this.getMinEstimatedDeliveryDate());
        writer.writeObjectValue("pickupStep", this.getPickupStep());
        writer.writeObjectValue("shippingStep", this.getShippingStep());
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
     * Sets the appointment property value. This container provides information used by the installation provider concerning appointment details selected by the buyer.
     * @param value Value to set for the appointment property.
     */
    public void setAppointment(@jakarta.annotation.Nullable final AppointmentDetails value) {
        this.appointment = value;
    }
    /**
     * Sets the destinationTimeZone property value. This field is reserved for internal or future use. &lt;!-- Destination time zone. This is time zone id from Olson database. Example: America/Los_Angeles. Delivery dates are calculated relative to this time zone. --&gt;
     * @param value Value to set for the destinationTimeZone property.
     */
    public void setDestinationTimeZone(@jakarta.annotation.Nullable final String value) {
        this.destinationTimeZone = value;
    }
    /**
     * Sets the ebaySupportedFulfillment property value. This field is only returned if its value is &lt;code&gt;true&lt;/code&gt; and indicates that the fulfillment will be shipped via eBay&apos;s Global Shipping Program, eBay International Shipping, or the Authenticity Guarantee service program. &lt;br&gt;&lt;br&gt;For more information, see the &lt;a href=&quot;https://www.ebay.com/help/selling/shipping-items/setting-shipping-options/global-shipping-program?id=4646 &quot; target=&quot;_blank&quot;&gt;Global Shipping Program&lt;/a&gt; help topic.
     * @param value Value to set for the ebaySupportedFulfillment property.
     */
    public void setEbaySupportedFulfillment(@jakarta.annotation.Nullable final Boolean value) {
        this.ebaySupportedFulfillment = value;
    }
    /**
     * Sets the finalDestinationAddress property value. This container is only returned if the value of &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is &lt;code&gt;true&lt;/code&gt;. &lt;br&gt;&lt;br&gt;This is the final destination address for a Global Shipping Program shipment or an eBay International Shipping shipment, which is usually the recipient&apos;s home. Sellers should not ship directly to this address; instead they should ship this package to their international shipping provider&apos;s domestic warehouse. The international shipping provider is responsible for delivery to the final destination address.&lt;br&gt;&lt;br&gt;For more information, see &lt;a href=&quot;/api-docs/user-guides/static/trading-user-guide/global-shipping-addressing.html&quot; target=&quot;_blank&quot;&gt;Addressing Shipments&lt;/a&gt;.&lt;p&gt; &lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; For Authenticity Guarantee program shipment, this is the address of the authenticator&apos;s warehouse. The authenticator is responsible for delivery to the buyer shipping address.&lt;/span&gt;&lt;/p&gt;
     * @param value Value to set for the finalDestinationAddress property.
     */
    public void setFinalDestinationAddress(@jakarta.annotation.Nullable final Address value) {
        this.finalDestinationAddress = value;
    }
    /**
     * Sets the fulfillmentInstructionsType property value. The enumeration value returned in this field indicates the method of fulfillment that will be used to deliver this set of line items (this package) to the buyer. This field will have a value of &lt;code&gt;SHIP_TO&lt;/code&gt; if the &lt;strong&gt;ebaySupportedFulfillment&lt;/strong&gt; field is returned with a value of &lt;code&gt;true&lt;/code&gt;. See the &lt;strong&gt;FulfillmentInstructionsType&lt;/strong&gt; definition for more information about different fulfillment types.
     * @param value Value to set for the fulfillmentInstructionsType property.
     */
    public void setFulfillmentInstructionsType(@jakarta.annotation.Nullable final FulfillmentInstructionsType value) {
        this.fulfillmentInstructionsType = value;
    }
    /**
     * Sets the maxEstimatedDeliveryDate property value. This is the estimated latest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned ifthe value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the maxEstimatedDeliveryDate property.
     */
    public void setMaxEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.maxEstimatedDeliveryDate = value;
    }
    /**
     * Sets the minEstimatedDeliveryDate property value. This is the estimated earliest date that the fulfillment will be completed. This timestamp is in &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; format, which uses the 24-hour Universal Coordinated Time (UTC) clock. This field is not returned if  the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt; or &lt;code&gt;PREPARE_FOR_PICKUP&lt;/code&gt;.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;
     * @param value Value to set for the minEstimatedDeliveryDate property.
     */
    public void setMinEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.minEstimatedDeliveryDate = value;
    }
    /**
     * Sets the pickupStep property value. This container is only returned for In-Store Pickup orders, and it indicates the specific merchant&apos;s store where the buyer will pick up the order. The In-Store Pickup feature is supported in the US, Canada, UK, Germany, and Australia marketplaces.
     * @param value Value to set for the pickupStep property.
     */
    public void setPickupStep(@jakarta.annotation.Nullable final PickupStep value) {
        this.pickupStep = value;
    }
    /**
     * Sets the shippingStep property value. This container consists of shipping information for this fulfillment, including the shipping carrier, the shipping service option, and the shipment destination. This container is not returned if the value of the &lt;strong&gt;fulfillmentInstructionsType&lt;/strong&gt; field is &lt;code&gt;DIGITAL&lt;/code&gt;, or for In-Store Pickup orders. &lt;br&gt;&lt;br&gt; For Click and Collect orders, the shipping destination will be a brick-and-mortar store where the buyer will pick up the order.
     * @param value Value to set for the shippingStep property.
     */
    public void setShippingStep(@jakarta.annotation.Nullable final ShippingStep value) {
        this.shippingStep = value;
    }
}
