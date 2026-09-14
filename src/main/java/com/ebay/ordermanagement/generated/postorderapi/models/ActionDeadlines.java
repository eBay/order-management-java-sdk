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
 * This type is used by the &lt;b&gt;actionDeadlines&lt;/b&gt; container, which  provides the number of remaining days that a buyer or seller has before being required to take action on an INR or Return case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActionDeadlines implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This integer value indicates the number of days that the buyer has to provide proof of return shipment before the case expires. This field is only returned for a Return case.
     */
    private Integer daysForBuyerToProvideProofOfShipment;
    /**
     * This integer value indicates the number of days that a user (buyer or seller) has to make a required response on the case before the case expires.
     */
    private Integer daysToExpireWithoutResponse;
    /**
     * This integer value indicates the number of days that remain before the case expires.
     */
    private Integer daysToExpireWithResponse;
    /**
     * This integer value indicates the number of remaining days that the buyer has to return an item and still expect a refund from the seller. This field is only returned for a Return case.
     */
    private Integer daysToReturnItem;
    /**
     * This integer value indicates the number of remaining days that the buyer has to file a claim.
     */
    private Integer maxDaysToFileClaim;
    /**
     * Instantiates a new {@link ActionDeadlines} and sets the default values.
     */
    public ActionDeadlines() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ActionDeadlines}
     */
    @jakarta.annotation.Nonnull
    public static ActionDeadlines createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ActionDeadlines();
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
     * Gets the daysForBuyerToProvideProofOfShipment property value. This integer value indicates the number of days that the buyer has to provide proof of return shipment before the case expires. This field is only returned for a Return case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDaysForBuyerToProvideProofOfShipment() {
        return this.daysForBuyerToProvideProofOfShipment;
    }
    /**
     * Gets the daysToExpireWithoutResponse property value. This integer value indicates the number of days that a user (buyer or seller) has to make a required response on the case before the case expires.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDaysToExpireWithoutResponse() {
        return this.daysToExpireWithoutResponse;
    }
    /**
     * Gets the daysToExpireWithResponse property value. This integer value indicates the number of days that remain before the case expires.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDaysToExpireWithResponse() {
        return this.daysToExpireWithResponse;
    }
    /**
     * Gets the daysToReturnItem property value. This integer value indicates the number of remaining days that the buyer has to return an item and still expect a refund from the seller. This field is only returned for a Return case.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDaysToReturnItem() {
        return this.daysToReturnItem;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("daysForBuyerToProvideProofOfShipment", (n) -> { this.setDaysForBuyerToProvideProofOfShipment(n.getIntegerValue()); });
        deserializerMap.put("daysToExpireWithoutResponse", (n) -> { this.setDaysToExpireWithoutResponse(n.getIntegerValue()); });
        deserializerMap.put("daysToExpireWithResponse", (n) -> { this.setDaysToExpireWithResponse(n.getIntegerValue()); });
        deserializerMap.put("daysToReturnItem", (n) -> { this.setDaysToReturnItem(n.getIntegerValue()); });
        deserializerMap.put("maxDaysToFileClaim", (n) -> { this.setMaxDaysToFileClaim(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxDaysToFileClaim property value. This integer value indicates the number of remaining days that the buyer has to file a claim.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaxDaysToFileClaim() {
        return this.maxDaysToFileClaim;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("daysForBuyerToProvideProofOfShipment", this.getDaysForBuyerToProvideProofOfShipment());
        writer.writeIntegerValue("daysToExpireWithoutResponse", this.getDaysToExpireWithoutResponse());
        writer.writeIntegerValue("daysToExpireWithResponse", this.getDaysToExpireWithResponse());
        writer.writeIntegerValue("daysToReturnItem", this.getDaysToReturnItem());
        writer.writeIntegerValue("maxDaysToFileClaim", this.getMaxDaysToFileClaim());
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
     * Sets the daysForBuyerToProvideProofOfShipment property value. This integer value indicates the number of days that the buyer has to provide proof of return shipment before the case expires. This field is only returned for a Return case.
     * @param value Value to set for the daysForBuyerToProvideProofOfShipment property.
     */
    public void setDaysForBuyerToProvideProofOfShipment(@jakarta.annotation.Nullable final Integer value) {
        this.daysForBuyerToProvideProofOfShipment = value;
    }
    /**
     * Sets the daysToExpireWithoutResponse property value. This integer value indicates the number of days that a user (buyer or seller) has to make a required response on the case before the case expires.
     * @param value Value to set for the daysToExpireWithoutResponse property.
     */
    public void setDaysToExpireWithoutResponse(@jakarta.annotation.Nullable final Integer value) {
        this.daysToExpireWithoutResponse = value;
    }
    /**
     * Sets the daysToExpireWithResponse property value. This integer value indicates the number of days that remain before the case expires.
     * @param value Value to set for the daysToExpireWithResponse property.
     */
    public void setDaysToExpireWithResponse(@jakarta.annotation.Nullable final Integer value) {
        this.daysToExpireWithResponse = value;
    }
    /**
     * Sets the daysToReturnItem property value. This integer value indicates the number of remaining days that the buyer has to return an item and still expect a refund from the seller. This field is only returned for a Return case.
     * @param value Value to set for the daysToReturnItem property.
     */
    public void setDaysToReturnItem(@jakarta.annotation.Nullable final Integer value) {
        this.daysToReturnItem = value;
    }
    /**
     * Sets the maxDaysToFileClaim property value. This integer value indicates the number of remaining days that the buyer has to file a claim.
     * @param value Value to set for the maxDaysToFileClaim property.
     */
    public void setMaxDaysToFileClaim(@jakarta.annotation.Nullable final Integer value) {
        this.maxDaysToFileClaim = value;
    }
}
