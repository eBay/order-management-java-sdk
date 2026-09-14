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
 * This type contains information about the order&apos;s buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Buyer implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This container is the buyer&apos;s contact information that includes the buyer&apos;s name, email, phone number, and address.
     */
    private ExtendedContact buyerRegistrationAddress;
    /**
     * This container consists of address information that can be used by sellers for tax purpose.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When using the eBay vault program, if an item is shipped to a vault, the tax address will be the vault address.&lt;/span&gt;
     */
    private TaxAddress taxAddress;
    /**
     * This container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, the &lt;strong&gt;taxIdentifier&lt;/strong&gt; container is only returned in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and not in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt;. So, if a seller wants to view a buyer&apos;s tax information for a particular order returned in &lt;strong&gt;getOrders&lt;/strong&gt;, that seller would need to use the &lt;strong&gt;orderId&lt;/strong&gt; value for that particular order and then run a &lt;strong&gt;getOrder&lt;/strong&gt; call against that order ID. &lt;/span&gt;
     */
    private TaxIdentifier taxIdentifier;
    /**
     * The buyer&apos;s eBay user ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     */
    private String username;
    /**
     * Instantiates a new {@link Buyer} and sets the default values.
     */
    public Buyer() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Buyer}
     */
    @jakarta.annotation.Nonnull
    public static Buyer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Buyer();
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
     * Gets the buyerRegistrationAddress property value. This container is the buyer&apos;s contact information that includes the buyer&apos;s name, email, phone number, and address.
     * @return a {@link ExtendedContact}
     */
    @jakarta.annotation.Nullable
    public ExtendedContact getBuyerRegistrationAddress() {
        return this.buyerRegistrationAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("buyerRegistrationAddress", (n) -> { this.setBuyerRegistrationAddress(n.getObjectValue(ExtendedContact::createFromDiscriminatorValue)); });
        deserializerMap.put("taxAddress", (n) -> { this.setTaxAddress(n.getObjectValue(TaxAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("taxIdentifier", (n) -> { this.setTaxIdentifier(n.getObjectValue(TaxIdentifier::createFromDiscriminatorValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the taxAddress property value. This container consists of address information that can be used by sellers for tax purpose.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When using the eBay vault program, if an item is shipped to a vault, the tax address will be the vault address.&lt;/span&gt;
     * @return a {@link TaxAddress}
     */
    @jakarta.annotation.Nullable
    public TaxAddress getTaxAddress() {
        return this.taxAddress;
    }
    /**
     * Gets the taxIdentifier property value. This container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, the &lt;strong&gt;taxIdentifier&lt;/strong&gt; container is only returned in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and not in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt;. So, if a seller wants to view a buyer&apos;s tax information for a particular order returned in &lt;strong&gt;getOrders&lt;/strong&gt;, that seller would need to use the &lt;strong&gt;orderId&lt;/strong&gt; value for that particular order and then run a &lt;strong&gt;getOrder&lt;/strong&gt; call against that order ID. &lt;/span&gt;
     * @return a {@link TaxIdentifier}
     */
    @jakarta.annotation.Nullable
    public TaxIdentifier getTaxIdentifier() {
        return this.taxIdentifier;
    }
    /**
     * Gets the username property value. The buyer&apos;s eBay user ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("buyerRegistrationAddress", this.getBuyerRegistrationAddress());
        writer.writeObjectValue("taxAddress", this.getTaxAddress());
        writer.writeObjectValue("taxIdentifier", this.getTaxIdentifier());
        writer.writeStringValue("username", this.getUsername());
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
     * Sets the buyerRegistrationAddress property value. This container is the buyer&apos;s contact information that includes the buyer&apos;s name, email, phone number, and address.
     * @param value Value to set for the buyerRegistrationAddress property.
     */
    public void setBuyerRegistrationAddress(@jakarta.annotation.Nullable final ExtendedContact value) {
        this.buyerRegistrationAddress = value;
    }
    /**
     * Sets the taxAddress property value. This container consists of address information that can be used by sellers for tax purpose.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; When using the eBay vault program, if an item is shipped to a vault, the tax address will be the vault address.&lt;/span&gt;
     * @param value Value to set for the taxAddress property.
     */
    public void setTaxAddress(@jakarta.annotation.Nullable final TaxAddress value) {
        this.taxAddress = value;
    }
    /**
     * Sets the taxIdentifier property value. This container consists of taxpayer identification information for buyers from Italy, Spain, or Guatemala. It is currently only returned for orders occurring on the eBay Italy or eBay Spain marketplaces.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, the &lt;strong&gt;taxIdentifier&lt;/strong&gt; container is only returned in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorder&quot; target=&quot;_blank&quot;&gt;getOrder&lt;/a&gt; and not in &lt;a href=&quot;/develop/api/sell/fulfillment_api#sell-fulfillment_api-order-getorders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt;. So, if a seller wants to view a buyer&apos;s tax information for a particular order returned in &lt;strong&gt;getOrders&lt;/strong&gt;, that seller would need to use the &lt;strong&gt;orderId&lt;/strong&gt; value for that particular order and then run a &lt;strong&gt;getOrder&lt;/strong&gt; call against that order ID. &lt;/span&gt;
     * @param value Value to set for the taxIdentifier property.
     */
    public void setTaxIdentifier(@jakarta.annotation.Nullable final TaxIdentifier value) {
        this.taxIdentifier = value;
    }
    /**
     * Sets the username property value. The buyer&apos;s eBay user ID.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, select developers will no longer receive username data for U.S. users through this field. Instead, an immutable user ID will be returned in its place. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
