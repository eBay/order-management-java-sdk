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
 * This type is used to provide information about each event or action that has occurred with a particular INR inquiry or case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClaimHistoryEventModel implements AdditionalDataHolder, Parsable {
    /**
     * This string value indicates the action initiated by one of the parties involved with the INR inquiry or case.
     */
    private String action;
    /**
     * This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     */
    private UserPartyEnum actor;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime date;
    /**
     * A text-based description of this event or action. This field is returned if available.
     */
    private String description;
    /**
     * This type is used to provide details on any monetary transactions that occur in association with an INR inquiry or a case.
     */
    private MoneyMovementEntries moneyMovement;
    /**
     * Instantiates a new {@link ClaimHistoryEventModel} and sets the default values.
     */
    public ClaimHistoryEventModel() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClaimHistoryEventModel}
     */
    @jakarta.annotation.Nonnull
    public static ClaimHistoryEventModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClaimHistoryEventModel();
    }
    /**
     * Gets the action property value. This string value indicates the action initiated by one of the parties involved with the INR inquiry or case.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAction() {
        return this.action;
    }
    /**
     * Gets the actor property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @return a {@link UserPartyEnum}
     */
    @jakarta.annotation.Nullable
    public UserPartyEnum getActor() {
        return this.actor;
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
     * Gets the date property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nullable
    public DateTime getDate() {
        return this.date;
    }
    /**
     * Gets the description property value. A text-based description of this event or action. This field is returned if available.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("action", (n) -> { this.setAction(n.getStringValue()); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getEnumValue(UserPartyEnum::forValue)); });
        deserializerMap.put("date", (n) -> { this.setDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("moneyMovement", (n) -> { this.setMoneyMovement(n.getObjectValue(MoneyMovementEntries::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the moneyMovement property value. This type is used to provide details on any monetary transactions that occur in association with an INR inquiry or a case.
     * @return a {@link MoneyMovementEntries}
     */
    @jakarta.annotation.Nullable
    public MoneyMovementEntries getMoneyMovement() {
        return this.moneyMovement;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("action", this.getAction());
        writer.writeEnumValue("actor", this.getActor());
        writer.writeObjectValue("date", this.getDate());
        writer.writeStringValue("description", this.getDescription());
        writer.writeObjectValue("moneyMovement", this.getMoneyMovement());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the action property value. This string value indicates the action initiated by one of the parties involved with the INR inquiry or case.
     * @param value Value to set for the action property.
     */
    public void setAction(@jakarta.annotation.Nullable final String value) {
        this.action = value;
    }
    /**
     * Sets the actor property value. This enumerated type lists the types of users who can possibly perform an action on an INR inquiry or a case.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final UserPartyEnum value) {
        this.actor = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the date property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final DateTime value) {
        this.date = value;
    }
    /**
     * Sets the description property value. A text-based description of this event or action. This field is returned if available.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the moneyMovement property value. This type is used to provide details on any monetary transactions that occur in association with an INR inquiry or a case.
     * @param value Value to set for the moneyMovement property.
     */
    public void setMoneyMovement(@jakarta.annotation.Nullable final MoneyMovementEntries value) {
        this.moneyMovement = value;
    }
}
