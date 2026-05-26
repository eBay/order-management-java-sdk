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
 * This type contains information about the management of the shipping for the order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EbayShipping implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field contains the shipping label provider. If &lt;code&gt;EBAY&lt;/code&gt;, this order is managed by eBay shipping and a free shipping label by eBay is downloadable by the seller via the eBay website.
     */
    private String shippingLabelProvidedBy;
    /**
     * Instantiates a new {@link EbayShipping} and sets the default values.
     */
    public EbayShipping() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EbayShipping}
     */
    @jakarta.annotation.Nonnull
    public static EbayShipping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EbayShipping();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("shippingLabelProvidedBy", (n) -> { this.setShippingLabelProvidedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the shippingLabelProvidedBy property value. This field contains the shipping label provider. If &lt;code&gt;EBAY&lt;/code&gt;, this order is managed by eBay shipping and a free shipping label by eBay is downloadable by the seller via the eBay website.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getShippingLabelProvidedBy() {
        return this.shippingLabelProvidedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("shippingLabelProvidedBy", this.getShippingLabelProvidedBy());
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
     * Sets the shippingLabelProvidedBy property value. This field contains the shipping label provider. If &lt;code&gt;EBAY&lt;/code&gt;, this order is managed by eBay shipping and a free shipping label by eBay is downloadable by the seller via the eBay website.
     * @param value Value to set for the shippingLabelProvidedBy property.
     */
    public void setShippingLabelProvidedBy(@jakarta.annotation.Nullable final String value) {
        this.shippingLabelProvidedBy = value;
    }
}
