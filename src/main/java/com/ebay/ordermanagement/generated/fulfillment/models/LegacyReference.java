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
 * Type defining the legacyReference container. This container is needed if the seller is issuing a refund for an individual order line item, and wishes to use an item ID and transaction ID to identify the order line item.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LegacyReference implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of a listing. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     */
    private String legacyItemId;
    /**
     * The unique identifier of a sale/transaction in legacy/Trading API format. A &apos;transaction ID&apos; is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     */
    private String legacyTransactionId;
    /**
     * Instantiates a new {@link LegacyReference} and sets the default values.
     */
    public LegacyReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link LegacyReference}
     */
    @jakarta.annotation.Nonnull
    public static LegacyReference createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LegacyReference();
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
        deserializerMap.put("legacyItemId", (n) -> { this.setLegacyItemId(n.getStringValue()); });
        deserializerMap.put("legacyTransactionId", (n) -> { this.setLegacyTransactionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the legacyItemId property value. The unique identifier of a listing. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLegacyItemId() {
        return this.legacyItemId;
    }
    /**
     * Gets the legacyTransactionId property value. The unique identifier of a sale/transaction in legacy/Trading API format. A &apos;transaction ID&apos; is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLegacyTransactionId() {
        return this.legacyTransactionId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("legacyItemId", this.getLegacyItemId());
        writer.writeStringValue("legacyTransactionId", this.getLegacyTransactionId());
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
     * Sets the legacyItemId property value. The unique identifier of a listing. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     * @param value Value to set for the legacyItemId property.
     */
    public void setLegacyItemId(@jakarta.annotation.Nullable final String value) {
        this.legacyItemId = value;
    }
    /**
     * Sets the legacyTransactionId property value. The unique identifier of a sale/transaction in legacy/Trading API format. A &apos;transaction ID&apos; is created once a buyer purchases a &apos;Buy It Now&apos; item or if an auction listing ends with a winning bidder. This value can be found in the Transaction container in the response of the getOrder call of the Trading API. Note: Both legacyItemId and legacyTransactionId are needed to identify an order line item.
     * @param value Value to set for the legacyTransactionId property.
     */
    public void setLegacyTransactionId(@jakarta.annotation.Nullable final String value) {
        this.legacyTransactionId = value;
    }
}
