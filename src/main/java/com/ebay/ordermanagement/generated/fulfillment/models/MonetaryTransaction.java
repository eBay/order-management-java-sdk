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
 * This type is used to provide details about one or more monetary transactions that occur as part of a payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MonetaryTransaction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private DisputeAmount amount;
    /**
     * This timestamp indicates when the monetary transaction occurred. A date is returned for all monetary transactions.&lt;br&gt;&lt;br&gt; The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String date;
    /**
     * This enumeration value indicates the reason for the monetary transaction. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String reason;
    /**
     * This enumeration value indicates whether the monetary transaction is a charge or a credit to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String type;
    /**
     * Instantiates a new {@link MonetaryTransaction} and sets the default values.
     */
    public MonetaryTransaction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MonetaryTransaction}
     */
    @jakarta.annotation.Nonnull
    public static MonetaryTransaction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MonetaryTransaction();
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
     * Gets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link DisputeAmount}
     */
    @jakarta.annotation.Nullable
    public DisputeAmount getAmount() {
        return this.amount;
    }
    /**
     * Gets the date property value. This timestamp indicates when the monetary transaction occurred. A date is returned for all monetary transactions.&lt;br&gt;&lt;br&gt; The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDate() {
        return this.date;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("amount", (n) -> { this.setAmount(n.getObjectValue(DisputeAmount::createFromDiscriminatorValue)); });
        deserializerMap.put("date", (n) -> { this.setDate(n.getStringValue()); });
        deserializerMap.put("reason", (n) -> { this.setReason(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the reason property value. This enumeration value indicates the reason for the monetary transaction. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReason() {
        return this.reason;
    }
    /**
     * Gets the type property value. This enumeration value indicates whether the monetary transaction is a charge or a credit to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
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
        writer.writeStringValue("date", this.getDate());
        writer.writeStringValue("reason", this.getReason());
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
     * Sets the amount property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the amount property.
     */
    public void setAmount(@jakarta.annotation.Nullable final DisputeAmount value) {
        this.amount = value;
    }
    /**
     * Sets the date property value. This timestamp indicates when the monetary transaction occurred. A date is returned for all monetary transactions.&lt;br&gt;&lt;br&gt; The following format is used: &lt;code&gt;YYYY-MM-DDTHH:MM:SS.SSSZ&lt;/code&gt;. For example, &lt;code&gt;2015-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final String value) {
        this.date = value;
    }
    /**
     * Sets the reason property value. This enumeration value indicates the reason for the monetary transaction. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionReasonEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the reason property.
     */
    public void setReason(@jakarta.annotation.Nullable final String value) {
        this.reason = value;
    }
    /**
     * Sets the type property value. This enumeration value indicates whether the monetary transaction is a charge or a credit to the seller. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:MonetaryTransactionTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.type = value;
    }
}
