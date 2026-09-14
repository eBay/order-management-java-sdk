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
 * This complex type defines a shipment for a specific package (for example, a box or letter). Shipments are always linked to a purchased shipping label. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Shipment implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Cancellation status for the package, if one exists.
     */
    private ShipmentCancellation cancellation;
    /**
     * The date and time the shipment was created, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     */
    private String creationDate;
    /**
     * If supported by the selected shipping carrier, this field can contain optional seller text to be printed on the shipping label.
     */
    private String labelCustomMessage;
    /**
     * The direct URL the seller can use to download an image of the shipping label. By default, the file format is PDF. See &lt;a href=&quot;/api-docs/sell/logistics/resources/shipment/methods/downloadLabelFile&quot;&gt;downloadLabelFile&lt;/a&gt; for requesting different response file formats.
     */
    private String labelDownloadUrl;
    /**
     * The seller&apos;s desired label size. The support for multi-sized labels is shipping-carrier specific and if the size requested in the &lt;strong&gt;createFromShippingQuote&lt;/strong&gt; call matches a size the carrier supports, the value will be represented here in the shipment. &lt;br&gt;&lt;br&gt;Currently, the only valid value is: &lt;code&gt;4&quot;x6&quot;&lt;/code&gt;
     */
    private String labelSize;
    /**
     * A list of one or more orders that will be shipped in the shipping package.
     */
    private java.util.List<Order> orders;
    /**
     * The weight and dimensions of the package.
     */
    private PackageSpecification packageSpecification;
    /**
     * The shipping rate that the seller has chosen to purchase for this shipment. Each rate, identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains the offered base service, options, and shipping parameters that were selected for the package shipment.
     */
    private PurchasedRate rate;
    /**
     * The address and contact details that should be used for item returns. Sellers have the option to define a return address that is different from their &lt;strong&gt;shipFrom&lt;/strong&gt; address. If not specified, the return address defaults to the &lt;strong&gt;shipFrom&lt;/strong&gt; address in the shipping quote.
     */
    private Contact returnTo;
    /**
     * The address and contact details for the origin of the package shipment.
     */
    private Contact shipFrom;
    /**
     * The unique eBay-assigned ID for the shipment. The ID is generated when the shipment is created by a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     */
    private String shipmentId;
    /**
     * A unique carrier-assigned ID string that can be used to track the shipment.
     */
    private String shipmentTrackingNumber;
    /**
     * The address and contact details for the destination of the shipment.
     */
    private Contact shipTo;
    /**
     * Instantiates a new {@link Shipment} and sets the default values.
     */
    public Shipment() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Shipment}
     */
    @jakarta.annotation.Nonnull
    public static Shipment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Shipment();
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
     * Gets the cancellation property value. Cancellation status for the package, if one exists.
     * @return a {@link ShipmentCancellation}
     */
    @jakarta.annotation.Nullable
    public ShipmentCancellation getCancellation() {
        return this.cancellation;
    }
    /**
     * Gets the creationDate property value. The date and time the shipment was created, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(13);
        deserializerMap.put("cancellation", (n) -> { this.setCancellation(n.getObjectValue(ShipmentCancellation::createFromDiscriminatorValue)); });
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("labelCustomMessage", (n) -> { this.setLabelCustomMessage(n.getStringValue()); });
        deserializerMap.put("labelDownloadUrl", (n) -> { this.setLabelDownloadUrl(n.getStringValue()); });
        deserializerMap.put("labelSize", (n) -> { this.setLabelSize(n.getStringValue()); });
        deserializerMap.put("orders", (n) -> { this.setOrders(n.getCollectionOfObjectValues(Order::createFromDiscriminatorValue)); });
        deserializerMap.put("packageSpecification", (n) -> { this.setPackageSpecification(n.getObjectValue(PackageSpecification::createFromDiscriminatorValue)); });
        deserializerMap.put("rate", (n) -> { this.setRate(n.getObjectValue(PurchasedRate::createFromDiscriminatorValue)); });
        deserializerMap.put("returnTo", (n) -> { this.setReturnTo(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("shipFrom", (n) -> { this.setShipFrom(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("shipmentId", (n) -> { this.setShipmentId(n.getStringValue()); });
        deserializerMap.put("shipmentTrackingNumber", (n) -> { this.setShipmentTrackingNumber(n.getStringValue()); });
        deserializerMap.put("shipTo", (n) -> { this.setShipTo(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labelCustomMessage property value. If supported by the selected shipping carrier, this field can contain optional seller text to be printed on the shipping label.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelCustomMessage() {
        return this.labelCustomMessage;
    }
    /**
     * Gets the labelDownloadUrl property value. The direct URL the seller can use to download an image of the shipping label. By default, the file format is PDF. See &lt;a href=&quot;/api-docs/sell/logistics/resources/shipment/methods/downloadLabelFile&quot;&gt;downloadLabelFile&lt;/a&gt; for requesting different response file formats.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelDownloadUrl() {
        return this.labelDownloadUrl;
    }
    /**
     * Gets the labelSize property value. The seller&apos;s desired label size. The support for multi-sized labels is shipping-carrier specific and if the size requested in the &lt;strong&gt;createFromShippingQuote&lt;/strong&gt; call matches a size the carrier supports, the value will be represented here in the shipment. &lt;br&gt;&lt;br&gt;Currently, the only valid value is: &lt;code&gt;4&quot;x6&quot;&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLabelSize() {
        return this.labelSize;
    }
    /**
     * Gets the orders property value. A list of one or more orders that will be shipped in the shipping package.
     * @return a {@link java.util.List<Order>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Order> getOrders() {
        return this.orders;
    }
    /**
     * Gets the packageSpecification property value. The weight and dimensions of the package.
     * @return a {@link PackageSpecification}
     */
    @jakarta.annotation.Nullable
    public PackageSpecification getPackageSpecification() {
        return this.packageSpecification;
    }
    /**
     * Gets the rate property value. The shipping rate that the seller has chosen to purchase for this shipment. Each rate, identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains the offered base service, options, and shipping parameters that were selected for the package shipment.
     * @return a {@link PurchasedRate}
     */
    @jakarta.annotation.Nullable
    public PurchasedRate getRate() {
        return this.rate;
    }
    /**
     * Gets the returnTo property value. The address and contact details that should be used for item returns. Sellers have the option to define a return address that is different from their &lt;strong&gt;shipFrom&lt;/strong&gt; address. If not specified, the return address defaults to the &lt;strong&gt;shipFrom&lt;/strong&gt; address in the shipping quote.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getReturnTo() {
        return this.returnTo;
    }
    /**
     * Gets the shipFrom property value. The address and contact details for the origin of the package shipment.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getShipFrom() {
        return this.shipFrom;
    }
    /**
     * Gets the shipmentId property value. The unique eBay-assigned ID for the shipment. The ID is generated when the shipment is created by a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Gets the shipmentTrackingNumber property value. A unique carrier-assigned ID string that can be used to track the shipment.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShipmentTrackingNumber() {
        return this.shipmentTrackingNumber;
    }
    /**
     * Gets the shipTo property value. The address and contact details for the destination of the shipment.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getShipTo() {
        return this.shipTo;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("cancellation", this.getCancellation());
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("labelCustomMessage", this.getLabelCustomMessage());
        writer.writeStringValue("labelDownloadUrl", this.getLabelDownloadUrl());
        writer.writeStringValue("labelSize", this.getLabelSize());
        writer.writeCollectionOfObjectValues("orders", this.getOrders());
        writer.writeObjectValue("packageSpecification", this.getPackageSpecification());
        writer.writeObjectValue("rate", this.getRate());
        writer.writeObjectValue("returnTo", this.getReturnTo());
        writer.writeObjectValue("shipFrom", this.getShipFrom());
        writer.writeStringValue("shipmentId", this.getShipmentId());
        writer.writeStringValue("shipmentTrackingNumber", this.getShipmentTrackingNumber());
        writer.writeObjectValue("shipTo", this.getShipTo());
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
     * Sets the cancellation property value. Cancellation status for the package, if one exists.
     * @param value Value to set for the cancellation property.
     */
    public void setCancellation(@jakarta.annotation.Nullable final ShipmentCancellation value) {
        this.cancellation = value;
    }
    /**
     * Sets the creationDate property value. The date and time the shipment was created, formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org&quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Format:&lt;/strong&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br&gt;&lt;strong&gt;Example:&lt;/strong&gt; &lt;code&gt;2018-08-20T07:09:00.000Z&lt;/code&gt;
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the labelCustomMessage property value. If supported by the selected shipping carrier, this field can contain optional seller text to be printed on the shipping label.
     * @param value Value to set for the labelCustomMessage property.
     */
    public void setLabelCustomMessage(@jakarta.annotation.Nullable final String value) {
        this.labelCustomMessage = value;
    }
    /**
     * Sets the labelDownloadUrl property value. The direct URL the seller can use to download an image of the shipping label. By default, the file format is PDF. See &lt;a href=&quot;/api-docs/sell/logistics/resources/shipment/methods/downloadLabelFile&quot;&gt;downloadLabelFile&lt;/a&gt; for requesting different response file formats.
     * @param value Value to set for the labelDownloadUrl property.
     */
    public void setLabelDownloadUrl(@jakarta.annotation.Nullable final String value) {
        this.labelDownloadUrl = value;
    }
    /**
     * Sets the labelSize property value. The seller&apos;s desired label size. The support for multi-sized labels is shipping-carrier specific and if the size requested in the &lt;strong&gt;createFromShippingQuote&lt;/strong&gt; call matches a size the carrier supports, the value will be represented here in the shipment. &lt;br&gt;&lt;br&gt;Currently, the only valid value is: &lt;code&gt;4&quot;x6&quot;&lt;/code&gt;
     * @param value Value to set for the labelSize property.
     */
    public void setLabelSize(@jakarta.annotation.Nullable final String value) {
        this.labelSize = value;
    }
    /**
     * Sets the orders property value. A list of one or more orders that will be shipped in the shipping package.
     * @param value Value to set for the orders property.
     */
    public void setOrders(@jakarta.annotation.Nullable final java.util.List<Order> value) {
        this.orders = value;
    }
    /**
     * Sets the packageSpecification property value. The weight and dimensions of the package.
     * @param value Value to set for the packageSpecification property.
     */
    public void setPackageSpecification(@jakarta.annotation.Nullable final PackageSpecification value) {
        this.packageSpecification = value;
    }
    /**
     * Sets the rate property value. The shipping rate that the seller has chosen to purchase for this shipment. Each rate, identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains the offered base service, options, and shipping parameters that were selected for the package shipment.
     * @param value Value to set for the rate property.
     */
    public void setRate(@jakarta.annotation.Nullable final PurchasedRate value) {
        this.rate = value;
    }
    /**
     * Sets the returnTo property value. The address and contact details that should be used for item returns. Sellers have the option to define a return address that is different from their &lt;strong&gt;shipFrom&lt;/strong&gt; address. If not specified, the return address defaults to the &lt;strong&gt;shipFrom&lt;/strong&gt; address in the shipping quote.
     * @param value Value to set for the returnTo property.
     */
    public void setReturnTo(@jakarta.annotation.Nullable final Contact value) {
        this.returnTo = value;
    }
    /**
     * Sets the shipFrom property value. The address and contact details for the origin of the package shipment.
     * @param value Value to set for the shipFrom property.
     */
    public void setShipFrom(@jakarta.annotation.Nullable final Contact value) {
        this.shipFrom = value;
    }
    /**
     * Sets the shipmentId property value. The unique eBay-assigned ID for the shipment. The ID is generated when the shipment is created by a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     * @param value Value to set for the shipmentId property.
     */
    public void setShipmentId(@jakarta.annotation.Nullable final String value) {
        this.shipmentId = value;
    }
    /**
     * Sets the shipmentTrackingNumber property value. A unique carrier-assigned ID string that can be used to track the shipment.
     * @param value Value to set for the shipmentTrackingNumber property.
     */
    public void setShipmentTrackingNumber(@jakarta.annotation.Nullable final String value) {
        this.shipmentTrackingNumber = value;
    }
    /**
     * Sets the shipTo property value. The address and contact details for the destination of the shipment.
     * @param value Value to set for the shipTo property.
     */
    public void setShipTo(@jakarta.annotation.Nullable final Contact value) {
        this.shipTo = value;
    }
}
