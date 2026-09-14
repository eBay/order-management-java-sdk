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
 * This type is used to provide details on every monetary transaction that occurs in regards to an Item Not Received inquiry or eBay case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MoneyMovementEntry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used to expressed dollar amounts and the currency used.
     */
    private Amount amount;
    /**
     * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     */
    private DateTime date;
    /**
     * This type shows the seller&apos;s funding source used for the buyer refund, or in the case where eBay issued the refund to the buyer, the seller&apos;s funding source used by eBay to recoup this refund money from the seller.
     */
    private FundingSource fundingSource;
    /**
     * This enumerated type is used to indicate if eBay was able to successfully &apos;fund&apos; a refund to the buyer using the seller&apos;s preferred method of payment for refunds.
     */
    private FundingStatusEnum fundingStatus;
    /**
     * This string value indicates the type of monetary transaction, such as a refund.
     */
    private String type;
    /**
     * Instantiates a new {@link MoneyMovementEntry} and sets the default values.
     */
    public MoneyMovementEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MoneyMovementEntry}
     */
    @jakarta.annotation.Nonnull
    public static MoneyMovementEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MoneyMovementEntry();
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
     * Gets the amount property value. This type is used to expressed dollar amounts and the currency used.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAmount() {
        return this.amount;
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
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("date", (n) -> { this.setDate(n.getObjectValue(DateTime::createFromDiscriminatorValue)); });
        deserializerMap.put("fundingSource", (n) -> { this.setFundingSource(n.getObjectValue(FundingSource::createFromDiscriminatorValue)); });
        deserializerMap.put("fundingStatus", (n) -> { this.setFundingStatus(n.getEnumValue(FundingStatusEnum::forValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fundingSource property value. This type shows the seller&apos;s funding source used for the buyer refund, or in the case where eBay issued the refund to the buyer, the seller&apos;s funding source used by eBay to recoup this refund money from the seller.
     * @return a {@link FundingSource}
     */
    @jakarta.annotation.Nullable
    public FundingSource getFundingSource() {
        return this.fundingSource;
    }
    /**
     * Gets the fundingStatus property value. This enumerated type is used to indicate if eBay was able to successfully &apos;fund&apos; a refund to the buyer using the seller&apos;s preferred method of payment for refunds.
     * @return a {@link FundingStatusEnum}
     */
    @jakarta.annotation.Nullable
    public FundingStatusEnum getFundingStatus() {
        return this.fundingStatus;
    }
    /**
     * Gets the type property value. This string value indicates the type of monetary transaction, such as a refund.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("amount", this.getAmount());
        writer.writeObjectValue("date", this.getDate());
        writer.writeObjectValue("fundingSource", this.getFundingSource());
        writer.writeEnumValue("fundingStatus", this.getFundingStatus());
        writer.writeStringValue("type", this.getType());
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
     * Sets the amount property value. This type is used to expressed dollar amounts and the currency used.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final Amount value) {
        this.amount = value;
    }
    /**
     * Sets the date property value. This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final DateTime value) {
        this.date = value;
    }
    /**
     * Sets the fundingSource property value. This type shows the seller&apos;s funding source used for the buyer refund, or in the case where eBay issued the refund to the buyer, the seller&apos;s funding source used by eBay to recoup this refund money from the seller.
     * @param value Value to set for the fundingSource property.
     */
    public void setFundingSource(@jakarta.annotation.Nullable final FundingSource value) {
        this.fundingSource = value;
    }
    /**
     * Sets the fundingStatus property value. This enumerated type is used to indicate if eBay was able to successfully &apos;fund&apos; a refund to the buyer using the seller&apos;s preferred method of payment for refunds.
     * @param value Value to set for the fundingStatus property.
     */
    public void setFundingStatus(@jakarta.annotation.Nullable final FundingStatusEnum value) {
        this.fundingStatus = value;
    }
    /**
     * Sets the type property value. This string value indicates the type of monetary transaction, such as a refund.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
