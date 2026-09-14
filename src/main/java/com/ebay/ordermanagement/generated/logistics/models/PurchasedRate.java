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

package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The &quot;rate&quot; that has been selected and purchased for the shipment, as referenced by the &lt;strong&gt;rateId&lt;/strong&gt; value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PurchasedRate implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of additional, optional features that have been purchased for the shipment.
     */
    private java.util.List<AdditionalOption> additionalOptions;
    /**
     * The amount of the &quot;base cost&quot; for the shipment as set by the given carrier for the specified service. This cost excludes any additional costs accrued from the addition of any optional shipping options.
     */
    private Amount baseShippingCost;
    /**
     * The time zone of the destination according to &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt;. For example, &quot;America/Los_Angeles&quot;.
     */
    private String destinationTimeZone;
    /**
     * A string value representing maximum (latest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String maxEstimatedDeliveryDate;
    /**
     * A string value representing minimum (earliest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     */
    private String minEstimatedDeliveryDate;
    /**
     * A list of pickup networks compatible with the shipping service.
     */
    private java.util.List<String> pickupNetworks;
    /**
     * This unique eBay-assigned ID value is returned only if the shipment has been configured for a scheduled pickup.
     */
    private String pickupSlotId;
    /**
     * The type of pickup or drop-off configured for the shipment.
     */
    private PickupTypeEnum pickupType;
    /**
     * The eBay-generated ID of the shipping rate that the seller has chosen to purchase for the shipment.
     */
    private String rateId;
    /**
     * The ID code for the carrier that was selected for the package shipment.
     */
    private String shippingCarrierCode;
    /**
     * The name of the shipping carrier.
     */
    private String shippingCarrierName;
    /**
     * The unique eBay-generated ID of the &lt;i&gt;shipping quote&lt;/i&gt; from which the seller selected a shipping rate (&lt;strong&gt;rateId&lt;/strong&gt;).
     */
    private String shippingQuoteId;
    /**
     * String ID code for the shipping service selected for the package shipment. This is a service that the shipping carrier supplies.
     */
    private String shippingServiceCode;
    /**
     * The name of the shipping service.
     */
    private String shippingServiceName;
    /**
     * The total shipping cost, which is the sum cost of the base shipping cost and the cost of all the selected shipping options.
     */
    private Amount totalShippingCost;
    /**
     * Instantiates a new {@link PurchasedRate} and sets the default values.
     */
    public PurchasedRate() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PurchasedRate}
     */
    @jakarta.annotation.Nonnull
    public static PurchasedRate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PurchasedRate();
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
     * Gets the additionalOptions property value. A list of additional, optional features that have been purchased for the shipment.
     * @return a {@link java.util.List<AdditionalOption>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AdditionalOption> getAdditionalOptions() {
        return this.additionalOptions;
    }
    /**
     * Gets the baseShippingCost property value. The amount of the &quot;base cost&quot; for the shipment as set by the given carrier for the specified service. This cost excludes any additional costs accrued from the addition of any optional shipping options.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getBaseShippingCost() {
        return this.baseShippingCost;
    }
    /**
     * Gets the destinationTimeZone property value. The time zone of the destination according to &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt;. For example, &quot;America/Los_Angeles&quot;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDestinationTimeZone() {
        return this.destinationTimeZone;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("additionalOptions", (n) -> { this.setAdditionalOptions(n.getCollectionOfObjectValues(AdditionalOption::createFromDiscriminatorValue)); });
        deserializerMap.put("baseShippingCost", (n) -> { this.setBaseShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("destinationTimeZone", (n) -> { this.setDestinationTimeZone(n.getStringValue()); });
        deserializerMap.put("maxEstimatedDeliveryDate", (n) -> { this.setMaxEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("minEstimatedDeliveryDate", (n) -> { this.setMinEstimatedDeliveryDate(n.getStringValue()); });
        deserializerMap.put("pickupNetworks", (n) -> { this.setPickupNetworks(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("pickupSlotId", (n) -> { this.setPickupSlotId(n.getStringValue()); });
        deserializerMap.put("pickupType", (n) -> { this.setPickupType(n.getEnumValue(PickupTypeEnum::forValue)); });
        deserializerMap.put("rateId", (n) -> { this.setRateId(n.getStringValue()); });
        deserializerMap.put("shippingCarrierCode", (n) -> { this.setShippingCarrierCode(n.getStringValue()); });
        deserializerMap.put("shippingCarrierName", (n) -> { this.setShippingCarrierName(n.getStringValue()); });
        deserializerMap.put("shippingQuoteId", (n) -> { this.setShippingQuoteId(n.getStringValue()); });
        deserializerMap.put("shippingServiceCode", (n) -> { this.setShippingServiceCode(n.getStringValue()); });
        deserializerMap.put("shippingServiceName", (n) -> { this.setShippingServiceName(n.getStringValue()); });
        deserializerMap.put("totalShippingCost", (n) -> { this.setTotalShippingCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the maxEstimatedDeliveryDate property value. A string value representing maximum (latest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMaxEstimatedDeliveryDate() {
        return this.maxEstimatedDeliveryDate;
    }
    /**
     * Gets the minEstimatedDeliveryDate property value. A string value representing minimum (earliest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMinEstimatedDeliveryDate() {
        return this.minEstimatedDeliveryDate;
    }
    /**
     * Gets the pickupNetworks property value. A list of pickup networks compatible with the shipping service.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPickupNetworks() {
        return this.pickupNetworks;
    }
    /**
     * Gets the pickupSlotId property value. This unique eBay-assigned ID value is returned only if the shipment has been configured for a scheduled pickup.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPickupSlotId() {
        return this.pickupSlotId;
    }
    /**
     * Gets the pickupType property value. The type of pickup or drop-off configured for the shipment.
     * @return a {@link PickupTypeEnum}
     */
    @jakarta.annotation.Nullable
    public PickupTypeEnum getPickupType() {
        return this.pickupType;
    }
    /**
     * Gets the rateId property value. The eBay-generated ID of the shipping rate that the seller has chosen to purchase for the shipment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRateId() {
        return this.rateId;
    }
    /**
     * Gets the shippingCarrierCode property value. The ID code for the carrier that was selected for the package shipment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierCode() {
        return this.shippingCarrierCode;
    }
    /**
     * Gets the shippingCarrierName property value. The name of the shipping carrier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingCarrierName() {
        return this.shippingCarrierName;
    }
    /**
     * Gets the shippingQuoteId property value. The unique eBay-generated ID of the &lt;i&gt;shipping quote&lt;/i&gt; from which the seller selected a shipping rate (&lt;strong&gt;rateId&lt;/strong&gt;).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingQuoteId() {
        return this.shippingQuoteId;
    }
    /**
     * Gets the shippingServiceCode property value. String ID code for the shipping service selected for the package shipment. This is a service that the shipping carrier supplies.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceCode() {
        return this.shippingServiceCode;
    }
    /**
     * Gets the shippingServiceName property value. The name of the shipping service.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingServiceName() {
        return this.shippingServiceName;
    }
    /**
     * Gets the totalShippingCost property value. The total shipping cost, which is the sum cost of the base shipping cost and the cost of all the selected shipping options.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalShippingCost() {
        return this.totalShippingCost;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("additionalOptions", this.getAdditionalOptions());
        writer.writeObjectValue("baseShippingCost", this.getBaseShippingCost());
        writer.writeStringValue("destinationTimeZone", this.getDestinationTimeZone());
        writer.writeStringValue("maxEstimatedDeliveryDate", this.getMaxEstimatedDeliveryDate());
        writer.writeStringValue("minEstimatedDeliveryDate", this.getMinEstimatedDeliveryDate());
        writer.writeCollectionOfPrimitiveValues("pickupNetworks", this.getPickupNetworks());
        writer.writeStringValue("pickupSlotId", this.getPickupSlotId());
        writer.writeEnumValue("pickupType", this.getPickupType());
        writer.writeStringValue("rateId", this.getRateId());
        writer.writeStringValue("shippingCarrierCode", this.getShippingCarrierCode());
        writer.writeStringValue("shippingCarrierName", this.getShippingCarrierName());
        writer.writeStringValue("shippingQuoteId", this.getShippingQuoteId());
        writer.writeStringValue("shippingServiceCode", this.getShippingServiceCode());
        writer.writeStringValue("shippingServiceName", this.getShippingServiceName());
        writer.writeObjectValue("totalShippingCost", this.getTotalShippingCost());
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
     * Sets the additionalOptions property value. A list of additional, optional features that have been purchased for the shipment.
     * @param value Value to set for the additionalOptions property.
     */
    public void setAdditionalOptions(@jakarta.annotation.Nullable final java.util.List<AdditionalOption> value) {
        this.additionalOptions = value;
    }
    /**
     * Sets the baseShippingCost property value. The amount of the &quot;base cost&quot; for the shipment as set by the given carrier for the specified service. This cost excludes any additional costs accrued from the addition of any optional shipping options.
     * @param value Value to set for the baseShippingCost property.
     */
    public void setBaseShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.baseShippingCost = value;
    }
    /**
     * Sets the destinationTimeZone property value. The time zone of the destination according to &lt;a href=&quot;https://www.iana.org/time-zones &quot; target=&quot;_blank&quot;&gt;Time Zone Database&lt;/a&gt;. For example, &quot;America/Los_Angeles&quot;.
     * @param value Value to set for the destinationTimeZone property.
     */
    public void setDestinationTimeZone(@jakarta.annotation.Nullable final String value) {
        this.destinationTimeZone = value;
    }
    /**
     * Sets the maxEstimatedDeliveryDate property value. A string value representing maximum (latest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the maxEstimatedDeliveryDate property.
     */
    public void setMaxEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.maxEstimatedDeliveryDate = value;
    }
    /**
     * Sets the minEstimatedDeliveryDate property value. A string value representing minimum (earliest) estimated delivery time, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; UTC string.
     * @param value Value to set for the minEstimatedDeliveryDate property.
     */
    public void setMinEstimatedDeliveryDate(@jakarta.annotation.Nullable final String value) {
        this.minEstimatedDeliveryDate = value;
    }
    /**
     * Sets the pickupNetworks property value. A list of pickup networks compatible with the shipping service.
     * @param value Value to set for the pickupNetworks property.
     */
    public void setPickupNetworks(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.pickupNetworks = value;
    }
    /**
     * Sets the pickupSlotId property value. This unique eBay-assigned ID value is returned only if the shipment has been configured for a scheduled pickup.
     * @param value Value to set for the pickupSlotId property.
     */
    public void setPickupSlotId(@jakarta.annotation.Nullable final String value) {
        this.pickupSlotId = value;
    }
    /**
     * Sets the pickupType property value. The type of pickup or drop-off configured for the shipment.
     * @param value Value to set for the pickupType property.
     */
    public void setPickupType(@jakarta.annotation.Nullable final PickupTypeEnum value) {
        this.pickupType = value;
    }
    /**
     * Sets the rateId property value. The eBay-generated ID of the shipping rate that the seller has chosen to purchase for the shipment.
     * @param value Value to set for the rateId property.
     */
    public void setRateId(@jakarta.annotation.Nullable final String value) {
        this.rateId = value;
    }
    /**
     * Sets the shippingCarrierCode property value. The ID code for the carrier that was selected for the package shipment.
     * @param value Value to set for the shippingCarrierCode property.
     */
    public void setShippingCarrierCode(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierCode = value;
    }
    /**
     * Sets the shippingCarrierName property value. The name of the shipping carrier.
     * @param value Value to set for the shippingCarrierName property.
     */
    public void setShippingCarrierName(@jakarta.annotation.Nullable final String value) {
        this.shippingCarrierName = value;
    }
    /**
     * Sets the shippingQuoteId property value. The unique eBay-generated ID of the &lt;i&gt;shipping quote&lt;/i&gt; from which the seller selected a shipping rate (&lt;strong&gt;rateId&lt;/strong&gt;).
     * @param value Value to set for the shippingQuoteId property.
     */
    public void setShippingQuoteId(@jakarta.annotation.Nullable final String value) {
        this.shippingQuoteId = value;
    }
    /**
     * Sets the shippingServiceCode property value. String ID code for the shipping service selected for the package shipment. This is a service that the shipping carrier supplies.
     * @param value Value to set for the shippingServiceCode property.
     */
    public void setShippingServiceCode(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceCode = value;
    }
    /**
     * Sets the shippingServiceName property value. The name of the shipping service.
     * @param value Value to set for the shippingServiceName property.
     */
    public void setShippingServiceName(@jakarta.annotation.Nullable final String value) {
        this.shippingServiceName = value;
    }
    /**
     * Sets the totalShippingCost property value. The total shipping cost, which is the sum cost of the base shipping cost and the cost of all the selected shipping options.
     * @param value Value to set for the totalShippingCost property.
     */
    public void setTotalShippingCost(@jakarta.annotation.Nullable final Amount value) {
        this.totalShippingCost = value;
    }
}
