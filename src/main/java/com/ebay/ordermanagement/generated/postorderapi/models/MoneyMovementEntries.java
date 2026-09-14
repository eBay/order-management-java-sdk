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
 * This type is used to provide details on any monetary transactions that occur in association with an INR inquiry or a case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MoneyMovementEntries implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array contains details about one or more monetary transactions associated with an INR inquiry or a case. This array is only returned if monetary transactions have occurred with the INR inquiry or case.
     */
    private java.util.List<MoneyMovementEntry> moneyMovementEntryList;
    /**
     * Instantiates a new {@link MoneyMovementEntries} and sets the default values.
     */
    public MoneyMovementEntries() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MoneyMovementEntries}
     */
    @jakarta.annotation.Nonnull
    public static MoneyMovementEntries createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoneyMovementEntries();
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
        deserializerMap.put("moneyMovementEntryList", (n) -> { this.setMoneyMovementEntryList(n.getCollectionOfObjectValues(MoneyMovementEntry::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the moneyMovementEntryList property value. This array contains details about one or more monetary transactions associated with an INR inquiry or a case. This array is only returned if monetary transactions have occurred with the INR inquiry or case.
     * @return a {@link java.util.List<MoneyMovementEntry>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MoneyMovementEntry> getMoneyMovementEntryList() {
        return this.moneyMovementEntryList;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("moneyMovementEntryList", this.getMoneyMovementEntryList());
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
     * Sets the moneyMovementEntryList property value. This array contains details about one or more monetary transactions associated with an INR inquiry or a case. This array is only returned if monetary transactions have occurred with the INR inquiry or case.
     * @param value Value to set for the moneyMovementEntryList property.
     */
    public void setMoneyMovementEntryList(@jakarta.annotation.Nullable final java.util.List<MoneyMovementEntry> value) {
        this.moneyMovementEntryList = value;
    }
}
