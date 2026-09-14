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
 * This type shows the seller&apos;s funding source used for the buyer refund, or in the case where eBay issued the refund to the buyer, the seller&apos;s funding source used by eBay to recoup this refund money from the seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FundingSource implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration type lists the possible credit card brands that can be used by eBay to fund a seller&apos;s refund to a buyer. This type is only applicable if a buyer refund will be funded using a seller&apos;s credit card as the funding source.
     */
    private FundingMethodBrandEnum brand;
    /**
     * This provides a note about the funding source. This field is only returned if available, or it might get returned as an empty string.
     */
    private String memo;
    /**
     * This enumeration type lists the possible funding methods that can be used by eBay to fund a seller&apos;s refund to a buyer.
     */
    private FundingMethodTypeEnum type;
    /**
     * Instantiates a new {@link FundingSource} and sets the default values.
     */
    public FundingSource() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FundingSource}
     */
    @jakarta.annotation.Nonnull
    public static FundingSource createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FundingSource();
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
     * Gets the brand property value. This enumeration type lists the possible credit card brands that can be used by eBay to fund a seller&apos;s refund to a buyer. This type is only applicable if a buyer refund will be funded using a seller&apos;s credit card as the funding source.
     * @return a {@link FundingMethodBrandEnum}
     */
    @jakarta.annotation.Nullable
    public FundingMethodBrandEnum getBrand() {
        return this.brand;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("brand", (n) -> { this.setBrand(n.getEnumValue(FundingMethodBrandEnum::forValue)); });
        deserializerMap.put("memo", (n) -> { this.setMemo(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(FundingMethodTypeEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the memo property value. This provides a note about the funding source. This field is only returned if available, or it might get returned as an empty string.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMemo() {
        return this.memo;
    }
    /**
     * Gets the type property value. This enumeration type lists the possible funding methods that can be used by eBay to fund a seller&apos;s refund to a buyer.
     * @return a {@link FundingMethodTypeEnum}
     */
    @jakarta.annotation.Nullable
    public FundingMethodTypeEnum getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("brand", this.getBrand());
        writer.writeStringValue("memo", this.getMemo());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the brand property value. This enumeration type lists the possible credit card brands that can be used by eBay to fund a seller&apos;s refund to a buyer. This type is only applicable if a buyer refund will be funded using a seller&apos;s credit card as the funding source.
     * @param value Value to set for the brand property.
     */
    public void setBrand(@jakarta.annotation.Nullable final FundingMethodBrandEnum value) {
        this.brand = value;
    }
    /**
     * Sets the memo property value. This provides a note about the funding source. This field is only returned if available, or it might get returned as an empty string.
     * @param value Value to set for the memo property.
     */
    public void setMemo(@jakarta.annotation.Nullable final String value) {
        this.memo = value;
    }
    /**
     * Sets the type property value. This enumeration type lists the possible funding methods that can be used by eBay to fund a seller&apos;s refund to a buyer.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final FundingMethodTypeEnum value) {
        this.type = value;
    }
}
