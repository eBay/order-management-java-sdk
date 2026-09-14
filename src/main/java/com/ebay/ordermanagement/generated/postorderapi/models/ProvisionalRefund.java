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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type defines whether a provisional refund was issued to the buyer and whether the provisional refund was later reversed.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProvisionalRefund implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This value indicates whether a provisional refund was issued to the buyer.
     */
    private Boolean refundProvided;
    /**
     * This value indicates whether the provisional refund was later reversed.
     */
    private Boolean refundReversed;
    /**
     * Instantiates a new {@link ProvisionalRefund} and sets the default values.
     */
    public ProvisionalRefund() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProvisionalRefund}
     */
    @jakarta.annotation.Nonnull
    public static ProvisionalRefund createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProvisionalRefund();
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
        deserializerMap.put("refundProvided", (n) -> { this.setRefundProvided(n.getBooleanValue()); });
        deserializerMap.put("refundReversed", (n) -> { this.setRefundReversed(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the refundProvided property value. This value indicates whether a provisional refund was issued to the buyer.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRefundProvided() {
        return this.refundProvided;
    }
    /**
     * Gets the refundReversed property value. This value indicates whether the provisional refund was later reversed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getRefundReversed() {
        return this.refundReversed;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("refundProvided", this.getRefundProvided());
        writer.writeBooleanValue("refundReversed", this.getRefundReversed());
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
     * Sets the refundProvided property value. This value indicates whether a provisional refund was issued to the buyer.
     * @param value Value to set for the refundProvided property.
     */
    public void setRefundProvided(@jakarta.annotation.Nullable final Boolean value) {
        this.refundProvided = value;
    }
    /**
     * Sets the refundReversed property value. This value indicates whether the provisional refund was later reversed.
     * @param value Value to set for the refundReversed property.
     */
    public void setRefundReversed(@jakarta.annotation.Nullable final Boolean value) {
        this.refundReversed = value;
    }
}
