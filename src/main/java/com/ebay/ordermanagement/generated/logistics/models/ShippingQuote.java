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
 * This complex type describes a &quot;shipping quote,&quot; which contains the parameters for a package shipment. The shipping quote contains a list of &quot;live quotes&quot; or &lt;i&gt;rates&lt;/i&gt; for the shipment. Rates are offered by a carrier for a particular service, or set of services, for shipping the package. Included in the shipping quote are the package specifications, the shipment&apos;s origin and destination addresses, and the shipping parameters specified by the seller.  &lt;br&gt;&lt;br&gt;Use the &lt;strong&gt;rateId&lt;/strong&gt; value to select the specific service you want when you create a shipment by calling &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingQuote implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The date and time this quote was created, expressed as an ISO 8601 UTC string.
     */
    private String creationDate;
    /**
     * The last date and time that this quote will be honored, expressed as an ISO 8601 UTC string. After this time the quote expires and the expressed rates can no longer be purchased.
     */
    private String expirationDate;
    /**
     * A list of one or more orders that will be shipped in the shipping package.
     */
    private java.util.List<Order> orders;
    /**
     * The weight and dimensions of the package covered by this shipping quote.
     */
    private PackageSpecification packageSpecification;
    /**
     * A list of &lt;i&gt;rates&lt;/i&gt; where each rate, as identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains information about a specific shipping service offered by a carrier.  Rates include shipping carrier and service, the to and from locations, the pickup and delivery windows, the seller&apos;s shipping parameters, the service constraints, and the cost for the base service and a list of additional shipping options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate offered is supported by a label service where you can purchase the rate, and associated shipping label, via a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     */
    private java.util.List<Rate> rates;
    /**
     * The address and contact details for the origin of the shipment.
     */
    private Contact shipFrom;
    /**
     * The unique eBay-assigned ID for this shipping quote. The value of this field is associated with a specific package, based on its origin, destination, and size.
     */
    private String shippingQuoteId;
    /**
     * The address and contact details for the destination of the shipment.
     */
    private Contact shipTo;
    /**
     * A list of any warnings triggered by the request.
     */
    private java.util.List<ErrorDetailV3> warnings;
    /**
     * Instantiates a new {@link ShippingQuote} and sets the default values.
     */
    public ShippingQuote() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingQuote}
     */
    @jakarta.annotation.Nonnull
    public static ShippingQuote createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingQuote();
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
     * Gets the creationDate property value. The date and time this quote was created, expressed as an ISO 8601 UTC string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Gets the expirationDate property value. The last date and time that this quote will be honored, expressed as an ISO 8601 UTC string. After this time the quote expires and the expressed rates can no longer be purchased.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("creationDate", (n) -> { this.setCreationDate(n.getStringValue()); });
        deserializerMap.put("expirationDate", (n) -> { this.setExpirationDate(n.getStringValue()); });
        deserializerMap.put("orders", (n) -> { this.setOrders(n.getCollectionOfObjectValues(Order::createFromDiscriminatorValue)); });
        deserializerMap.put("packageSpecification", (n) -> { this.setPackageSpecification(n.getObjectValue(PackageSpecification::createFromDiscriminatorValue)); });
        deserializerMap.put("rates", (n) -> { this.setRates(n.getCollectionOfObjectValues(Rate::createFromDiscriminatorValue)); });
        deserializerMap.put("shipFrom", (n) -> { this.setShipFrom(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("shippingQuoteId", (n) -> { this.setShippingQuoteId(n.getStringValue()); });
        deserializerMap.put("shipTo", (n) -> { this.setShipTo(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("warnings", (n) -> { this.setWarnings(n.getCollectionOfObjectValues(ErrorDetailV3::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the packageSpecification property value. The weight and dimensions of the package covered by this shipping quote.
     * @return a {@link PackageSpecification}
     */
    @jakarta.annotation.Nullable
    public PackageSpecification getPackageSpecification() {
        return this.packageSpecification;
    }
    /**
     * Gets the rates property value. A list of &lt;i&gt;rates&lt;/i&gt; where each rate, as identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains information about a specific shipping service offered by a carrier.  Rates include shipping carrier and service, the to and from locations, the pickup and delivery windows, the seller&apos;s shipping parameters, the service constraints, and the cost for the base service and a list of additional shipping options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate offered is supported by a label service where you can purchase the rate, and associated shipping label, via a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     * @return a {@link java.util.List<Rate>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Rate> getRates() {
        return this.rates;
    }
    /**
     * Gets the shipFrom property value. The address and contact details for the origin of the shipment.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getShipFrom() {
        return this.shipFrom;
    }
    /**
     * Gets the shippingQuoteId property value. The unique eBay-assigned ID for this shipping quote. The value of this field is associated with a specific package, based on its origin, destination, and size.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingQuoteId() {
        return this.shippingQuoteId;
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
     * Gets the warnings property value. A list of any warnings triggered by the request.
     * @return a {@link java.util.List<ErrorDetailV3>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorDetailV3> getWarnings() {
        return this.warnings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("creationDate", this.getCreationDate());
        writer.writeStringValue("expirationDate", this.getExpirationDate());
        writer.writeCollectionOfObjectValues("orders", this.getOrders());
        writer.writeObjectValue("packageSpecification", this.getPackageSpecification());
        writer.writeCollectionOfObjectValues("rates", this.getRates());
        writer.writeObjectValue("shipFrom", this.getShipFrom());
        writer.writeStringValue("shippingQuoteId", this.getShippingQuoteId());
        writer.writeObjectValue("shipTo", this.getShipTo());
        writer.writeCollectionOfObjectValues("warnings", this.getWarnings());
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
     * Sets the creationDate property value. The date and time this quote was created, expressed as an ISO 8601 UTC string.
     * @param value Value to set for the creationDate property.
     */
    public void setCreationDate(@jakarta.annotation.Nullable final String value) {
        this.creationDate = value;
    }
    /**
     * Sets the expirationDate property value. The last date and time that this quote will be honored, expressed as an ISO 8601 UTC string. After this time the quote expires and the expressed rates can no longer be purchased.
     * @param value Value to set for the expirationDate property.
     */
    public void setExpirationDate(@jakarta.annotation.Nullable final String value) {
        this.expirationDate = value;
    }
    /**
     * Sets the orders property value. A list of one or more orders that will be shipped in the shipping package.
     * @param value Value to set for the orders property.
     */
    public void setOrders(@jakarta.annotation.Nullable final java.util.List<Order> value) {
        this.orders = value;
    }
    /**
     * Sets the packageSpecification property value. The weight and dimensions of the package covered by this shipping quote.
     * @param value Value to set for the packageSpecification property.
     */
    public void setPackageSpecification(@jakarta.annotation.Nullable final PackageSpecification value) {
        this.packageSpecification = value;
    }
    /**
     * Sets the rates property value. A list of &lt;i&gt;rates&lt;/i&gt; where each rate, as identified by a &lt;strong&gt;rateId&lt;/strong&gt;, contains information about a specific shipping service offered by a carrier.  Rates include shipping carrier and service, the to and from locations, the pickup and delivery windows, the seller&apos;s shipping parameters, the service constraints, and the cost for the base service and a list of additional shipping options.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The Logistics API only supports USPS shipping rates and labels.&lt;/span&gt;&lt;br&gt;Each rate offered is supported by a label service where you can purchase the rate, and associated shipping label, via a call to &lt;strong&gt;createFromShippingQuote&lt;/strong&gt;.
     * @param value Value to set for the rates property.
     */
    public void setRates(@jakarta.annotation.Nullable final java.util.List<Rate> value) {
        this.rates = value;
    }
    /**
     * Sets the shipFrom property value. The address and contact details for the origin of the shipment.
     * @param value Value to set for the shipFrom property.
     */
    public void setShipFrom(@jakarta.annotation.Nullable final Contact value) {
        this.shipFrom = value;
    }
    /**
     * Sets the shippingQuoteId property value. The unique eBay-assigned ID for this shipping quote. The value of this field is associated with a specific package, based on its origin, destination, and size.
     * @param value Value to set for the shippingQuoteId property.
     */
    public void setShippingQuoteId(@jakarta.annotation.Nullable final String value) {
        this.shippingQuoteId = value;
    }
    /**
     * Sets the shipTo property value. The address and contact details for the destination of the shipment.
     * @param value Value to set for the shipTo property.
     */
    public void setShipTo(@jakarta.annotation.Nullable final Contact value) {
        this.shipTo = value;
    }
    /**
     * Sets the warnings property value. A list of any warnings triggered by the request.
     * @param value Value to set for the warnings property.
     */
    public void setWarnings(@jakarta.annotation.Nullable final java.util.List<ErrorDetailV3> value) {
        this.warnings = value;
    }
}
