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
 * This type identifies the line item and quantity of that line item that comprises one fulfillment, such as a shipping package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LineItemReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This is the unique identifier of the eBay order line item that is part of the shipping fulfillment.&lt;br&gt;&lt;br&gt;Line item Ids can be found in the lineItems.&lt;b&gt;lineItemId&lt;/b&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; response.
     */
    private String lineItemId;
    /**
     * This is the number of lineItems associated with the &lt;a href=&quot;#request.trackingNumber&quot;&gt;trackingNumber&lt;/a&gt; specified by the seller. This must be a whole number greater than zero (0).&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 1
     */
    private Integer quantity;
    /**
     * Instantiates a new {@link LineItemReference} and sets the default values.
     */
    public LineItemReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LineItemReference}
     */
    @jakarta.annotation.Nonnull
    public static LineItemReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LineItemReference();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("lineItemId", (n) -> { this.setLineItemId(n.getStringValue()); });
        deserializerMap.put("quantity", (n) -> { this.setQuantity(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lineItemId property value. This is the unique identifier of the eBay order line item that is part of the shipping fulfillment.&lt;br&gt;&lt;br&gt;Line item Ids can be found in the lineItems.&lt;b&gt;lineItemId&lt;/b&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; response.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }
    /**
     * Gets the quantity property value. This is the number of lineItems associated with the &lt;a href=&quot;#request.trackingNumber&quot;&gt;trackingNumber&lt;/a&gt; specified by the seller. This must be a whole number greater than zero (0).&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 1
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getQuantity() {
        return this.quantity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("lineItemId", this.getLineItemId());
        writer.writeIntegerValue("quantity", this.getQuantity());
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
     * Sets the lineItemId property value. This is the unique identifier of the eBay order line item that is part of the shipping fulfillment.&lt;br&gt;&lt;br&gt;Line item Ids can be found in the lineItems.&lt;b&gt;lineItemId&lt;/b&gt; field of the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/order/methods/getOrders&quot; target=&quot;_blank&quot;&gt;getOrders&lt;/a&gt; response.
     * @param value Value to set for the lineItemId property.
     */
    public void setLineItemId(@jakarta.annotation.Nullable final String value) {
        this.lineItemId = value;
    }
    /**
     * Sets the quantity property value. This is the number of lineItems associated with the &lt;a href=&quot;#request.trackingNumber&quot;&gt;trackingNumber&lt;/a&gt; specified by the seller. This must be a whole number greater than zero (0).&lt;br&gt;&lt;br&gt;&lt;b&gt;Default:&lt;/b&gt; 1
     * @param value Value to set for the quantity property.
     */
    public void setQuantity(@jakarta.annotation.Nullable final Integer value) {
        this.quantity = value;
    }
}
