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
 * This type is used to provide details about an order line item being fulfilled by eBay or an eBay fulfillment partner.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EbayFulfillmentProgram implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The value returned in this field indicates the party that is handling fulfillment of the order line item. &lt;br&gt;&lt;br&gt;Valid value: &lt;code&gt;EBAY&lt;/code&gt;
     */
    private String fulfilledBy;
    /**
     * Instantiates a new {@link EbayFulfillmentProgram} and sets the default values.
     */
    public EbayFulfillmentProgram() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EbayFulfillmentProgram}
     */
    @jakarta.annotation.Nonnull
    public static EbayFulfillmentProgram createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EbayFulfillmentProgram();
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
        deserializerMap.put("fulfilledBy", (n) -> { this.setFulfilledBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fulfilledBy property value. The value returned in this field indicates the party that is handling fulfillment of the order line item. &lt;br&gt;&lt;br&gt;Valid value: &lt;code&gt;EBAY&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFulfilledBy() {
        return this.fulfilledBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fulfilledBy", this.getFulfilledBy());
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
     * Sets the fulfilledBy property value. The value returned in this field indicates the party that is handling fulfillment of the order line item. &lt;br&gt;&lt;br&gt;Valid value: &lt;code&gt;EBAY&lt;/code&gt;
     * @param value Value to set for the fulfilledBy property.
     */
    public void setFulfilledBy(@jakarta.annotation.Nullable final String value) {
        this.fulfilledBy = value;
    }
}
