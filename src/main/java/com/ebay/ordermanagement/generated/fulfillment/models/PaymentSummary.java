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
 * This type contains information about the various monetary exchanges that apply to the net balance due for the order.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     */
    private java.util.List<Payment> payments;
    /**
     * This array is always returned, but is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     */
    private java.util.List<OrderRefund> refunds;
    /**
     * This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     */
    private Amount totalDueSeller;
    /**
     * Instantiates a new {@link PaymentSummary} and sets the default values.
     */
    public PaymentSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentSummary}
     */
    @jakarta.annotation.Nonnull
    public static PaymentSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentSummary();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("payments", (n) -> { this.setPayments(n.getCollectionOfObjectValues(Payment::createFromDiscriminatorValue)); });
        deserializerMap.put("refunds", (n) -> { this.setRefunds(n.getCollectionOfObjectValues(OrderRefund::createFromDiscriminatorValue)); });
        deserializerMap.put("totalDueSeller", (n) -> { this.setTotalDueSeller(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the payments property value. This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     * @return a {@link java.util.List<Payment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Payment> getPayments() {
        return this.payments;
    }
    /**
     * Gets the refunds property value. This array is always returned, but is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @return a {@link java.util.List<OrderRefund>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderRefund> getRefunds() {
        return this.refunds;
    }
    /**
     * Gets the totalDueSeller property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getTotalDueSeller() {
        return this.totalDueSeller;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("payments", this.getPayments());
        writer.writeCollectionOfObjectValues("refunds", this.getRefunds());
        writer.writeObjectValue("totalDueSeller", this.getTotalDueSeller());
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
     * Sets the payments property value. This array consists of payment information for the order, including payment status, payment method, payment amount, and payment date. This array is always returned, although some of the fields under this container will not be returned until payment has been made.
     * @param value Value to set for the payments property.
     */
    public void setPayments(@jakarta.annotation.Nullable final java.util.List<Payment> value) {
        this.payments = value;
    }
    /**
     * Sets the refunds property value. This array is always returned, but is returned as an empty array unless the seller has submitted a partial or full refund to the buyer for the order. If a refund has occurred, the refund amount and refund date will be shown for each refund.
     * @param value Value to set for the refunds property.
     */
    public void setRefunds(@jakarta.annotation.Nullable final java.util.List<OrderRefund> value) {
        this.refunds = value;
    }
    /**
     * Sets the totalDueSeller property value. This type defines the monetary value of an amount. It can provide the amount in both the currency used on the eBay site where an item is being offered and the conversion of that value into another currency, if applicable.
     * @param value Value to set for the totalDueSeller property.
     */
    public void setTotalDueSeller(@jakarta.annotation.Nullable final Amount value) {
        this.totalDueSeller = value;
    }
}
