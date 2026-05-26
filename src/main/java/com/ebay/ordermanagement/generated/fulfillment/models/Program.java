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
 * This type is returned for order line items eligible for the Authenticity Guarantee service and/or for order line items fulfilled by the eBay Fulfillment program or eBay shipping.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Program implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to provide the status and outcome of an order line item going through the Authenticity Guarantee verification process.
     */
    private PostSaleAuthenticationProgram authenticityVerification;
    /**
     * This type is used to provide details about an order line item being managed through eBay International Shipping.
     */
    private EbayInternationalShipping ebayInternationalShipping;
    /**
     * This type contains information about the management of the shipping for the order.
     */
    private EbayShipping ebayShipping;
    /**
     * The ebayVault property
     */
    private EbayVaultProgram ebayVault;
    /**
     * This type is used to provide details about an order line item being fulfilled by eBay or an eBay fulfillment partner.
     */
    private EbayFulfillmentProgram fulfillmentProgram;
    /**
     * Instantiates a new {@link Program} and sets the default values.
     */
    public Program() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Program}
     */
    @jakarta.annotation.Nonnull
    public static Program createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Program();
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
     * Gets the authenticityVerification property value. This type is used to provide the status and outcome of an order line item going through the Authenticity Guarantee verification process.
     * @return a {@link PostSaleAuthenticationProgram}
     */
    @jakarta.annotation.Nullable
    public PostSaleAuthenticationProgram getAuthenticityVerification() {
        return this.authenticityVerification;
    }
    /**
     * Gets the ebayInternationalShipping property value. This type is used to provide details about an order line item being managed through eBay International Shipping.
     * @return a {@link EbayInternationalShipping}
     */
    @jakarta.annotation.Nullable
    public EbayInternationalShipping getEbayInternationalShipping() {
        return this.ebayInternationalShipping;
    }
    /**
     * Gets the ebayShipping property value. This type contains information about the management of the shipping for the order.
     * @return a {@link EbayShipping}
     */
    @jakarta.annotation.Nullable
    public EbayShipping getEbayShipping() {
        return this.ebayShipping;
    }
    /**
     * Gets the ebayVault property value. The ebayVault property
     * @return a {@link EbayVaultProgram}
     */
    @jakarta.annotation.Nullable
    public EbayVaultProgram getEbayVault() {
        return this.ebayVault;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("authenticityVerification", (n) -> { this.setAuthenticityVerification(n.getObjectValue(PostSaleAuthenticationProgram::createFromDiscriminatorValue)); });
        deserializerMap.put("ebayInternationalShipping", (n) -> { this.setEbayInternationalShipping(n.getObjectValue(EbayInternationalShipping::createFromDiscriminatorValue)); });
        deserializerMap.put("ebayShipping", (n) -> { this.setEbayShipping(n.getObjectValue(EbayShipping::createFromDiscriminatorValue)); });
        deserializerMap.put("ebayVault", (n) -> { this.setEbayVault(n.getObjectValue(EbayVaultProgram::createFromDiscriminatorValue)); });
        deserializerMap.put("fulfillmentProgram", (n) -> { this.setFulfillmentProgram(n.getObjectValue(EbayFulfillmentProgram::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fulfillmentProgram property value. This type is used to provide details about an order line item being fulfilled by eBay or an eBay fulfillment partner.
     * @return a {@link EbayFulfillmentProgram}
     */
    @jakarta.annotation.Nullable
    public EbayFulfillmentProgram getFulfillmentProgram() {
        return this.fulfillmentProgram;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("authenticityVerification", this.getAuthenticityVerification());
        writer.writeObjectValue("ebayInternationalShipping", this.getEbayInternationalShipping());
        writer.writeObjectValue("ebayShipping", this.getEbayShipping());
        writer.writeObjectValue("ebayVault", this.getEbayVault());
        writer.writeObjectValue("fulfillmentProgram", this.getFulfillmentProgram());
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
     * Sets the authenticityVerification property value. This type is used to provide the status and outcome of an order line item going through the Authenticity Guarantee verification process.
     * @param value Value to set for the authenticityVerification property.
     */
    public void setAuthenticityVerification(@jakarta.annotation.Nullable final PostSaleAuthenticationProgram value) {
        this.authenticityVerification = value;
    }
    /**
     * Sets the ebayInternationalShipping property value. This type is used to provide details about an order line item being managed through eBay International Shipping.
     * @param value Value to set for the ebayInternationalShipping property.
     */
    public void setEbayInternationalShipping(@jakarta.annotation.Nullable final EbayInternationalShipping value) {
        this.ebayInternationalShipping = value;
    }
    /**
     * Sets the ebayShipping property value. This type contains information about the management of the shipping for the order.
     * @param value Value to set for the ebayShipping property.
     */
    public void setEbayShipping(@jakarta.annotation.Nullable final EbayShipping value) {
        this.ebayShipping = value;
    }
    /**
     * Sets the ebayVault property value. The ebayVault property
     * @param value Value to set for the ebayVault property.
     */
    public void setEbayVault(@jakarta.annotation.Nullable final EbayVaultProgram value) {
        this.ebayVault = value;
    }
    /**
     * Sets the fulfillmentProgram property value. This type is used to provide details about an order line item being fulfilled by eBay or an eBay fulfillment partner.
     * @param value Value to set for the fulfillmentProgram property.
     */
    public void setFulfillmentProgram(@jakarta.annotation.Nullable final EbayFulfillmentProgram value) {
        this.fulfillmentProgram = value;
    }
}
