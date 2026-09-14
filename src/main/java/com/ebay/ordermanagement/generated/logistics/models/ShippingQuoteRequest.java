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
 * This complex type defines the request body for &lt;strong&gt;createShippingQuote&lt;/strong&gt;. Sellers &lt;i&gt;request a quote&lt;/i&gt; for a shipment by defining the &quot;To&quot; and &quot;From&quot; addresses for the package, plus the package&apos;s size.  &lt;br&gt;&lt;br&gt;Carriers respond by offering up a &quot;rate&quot; for the service that best fits the seller&apos;s needs.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ShippingQuoteRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * In this array, the seller specifies one or more orders that will be shipped in the shipping package. &lt;br&gt;&lt;br&gt;A shipping package can contain any number of line items from one or more orders, providing they all ship in the same package.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum list size:&lt;/strong&gt; 10
     */
    private java.util.List<Order> orders;
    /**
     * Declares the weight and dimensions of the package.
     */
    private PackageSpecification packageSpecification;
    /**
     * The address and contact details pertaining to the origin of the shipment.
     */
    private Contact shipFrom;
    /**
     * The address and contact details pertaining to the shipment&apos;s destination.
     */
    private Contact shipTo;
    /**
     * Instantiates a new {@link ShippingQuoteRequest} and sets the default values.
     */
    public ShippingQuoteRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ShippingQuoteRequest}
     */
    @jakarta.annotation.Nonnull
    public static ShippingQuoteRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ShippingQuoteRequest();
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
        deserializerMap.put("orders", (n) -> { this.setOrders(n.getCollectionOfObjectValues(Order::createFromDiscriminatorValue)); });
        deserializerMap.put("packageSpecification", (n) -> { this.setPackageSpecification(n.getObjectValue(PackageSpecification::createFromDiscriminatorValue)); });
        deserializerMap.put("shipFrom", (n) -> { this.setShipFrom(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        deserializerMap.put("shipTo", (n) -> { this.setShipTo(n.getObjectValue(Contact::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the orders property value. In this array, the seller specifies one or more orders that will be shipped in the shipping package. &lt;br&gt;&lt;br&gt;A shipping package can contain any number of line items from one or more orders, providing they all ship in the same package.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum list size:&lt;/strong&gt; 10
     * @return a {@link java.util.List<Order>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Order> getOrders() {
        return this.orders;
    }
    /**
     * Gets the packageSpecification property value. Declares the weight and dimensions of the package.
     * @return a {@link PackageSpecification}
     */
    @jakarta.annotation.Nullable
    public PackageSpecification getPackageSpecification() {
        return this.packageSpecification;
    }
    /**
     * Gets the shipFrom property value. The address and contact details pertaining to the origin of the shipment.
     * @return a {@link Contact}
     */
    @jakarta.annotation.Nullable
    public Contact getShipFrom() {
        return this.shipFrom;
    }
    /**
     * Gets the shipTo property value. The address and contact details pertaining to the shipment&apos;s destination.
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
        writer.writeCollectionOfObjectValues("orders", this.getOrders());
        writer.writeObjectValue("packageSpecification", this.getPackageSpecification());
        writer.writeObjectValue("shipFrom", this.getShipFrom());
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
     * Sets the orders property value. In this array, the seller specifies one or more orders that will be shipped in the shipping package. &lt;br&gt;&lt;br&gt;A shipping package can contain any number of line items from one or more orders, providing they all ship in the same package.  &lt;br&gt;&lt;br&gt;&lt;strong&gt;Maximum list size:&lt;/strong&gt; 10
     * @param value Value to set for the orders property.
     */
    public void setOrders(@jakarta.annotation.Nullable final java.util.List<Order> value) {
        this.orders = value;
    }
    /**
     * Sets the packageSpecification property value. Declares the weight and dimensions of the package.
     * @param value Value to set for the packageSpecification property.
     */
    public void setPackageSpecification(@jakarta.annotation.Nullable final PackageSpecification value) {
        this.packageSpecification = value;
    }
    /**
     * Sets the shipFrom property value. The address and contact details pertaining to the origin of the shipment.
     * @param value Value to set for the shipFrom property.
     */
    public void setShipFrom(@jakarta.annotation.Nullable final Contact value) {
        this.shipFrom = value;
    }
    /**
     * Sets the shipTo property value. The address and contact details pertaining to the shipment&apos;s destination.
     * @param value Value to set for the shipTo property.
     */
    public void setShipTo(@jakarta.annotation.Nullable final Contact value) {
        this.shipTo = value;
    }
}
