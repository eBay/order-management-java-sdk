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
 * This type is used by the &lt;b&gt;refundResult&lt;/b&gt; container, which shows the payment source used and status of the refund to the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VoluntaryRefundResult implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumerated type lists the methods that can be used to issue a buyer refund.
     */
    private RefundPaymentTypeEnum refundSource;
    /**
     * This enumeration type contains the possible outcomes of a refund action initiated through the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/issue_refund&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund &lt;/b&gt; methods.
     */
    private RefundStatusEnum refundStatus;
    /**
     * Instantiates a new {@link VoluntaryRefundResult} and sets the default values.
     */
    public VoluntaryRefundResult() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VoluntaryRefundResult}
     */
    @jakarta.annotation.Nonnull
    public static VoluntaryRefundResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VoluntaryRefundResult();
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
        deserializerMap.put("refundSource", (n) -> { this.setRefundSource(n.getEnumValue(RefundPaymentTypeEnum::forValue)); });
        deserializerMap.put("refundStatus", (n) -> { this.setRefundStatus(n.getEnumValue(RefundStatusEnum::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the refundSource property value. This enumerated type lists the methods that can be used to issue a buyer refund.
     * @return a {@link RefundPaymentTypeEnum}
     */
    @jakarta.annotation.Nullable
    public RefundPaymentTypeEnum getRefundSource() {
        return this.refundSource;
    }
    /**
     * Gets the refundStatus property value. This enumeration type contains the possible outcomes of a refund action initiated through the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/issue_refund&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund &lt;/b&gt; methods.
     * @return a {@link RefundStatusEnum}
     */
    @jakarta.annotation.Nullable
    public RefundStatusEnum getRefundStatus() {
        return this.refundStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("refundSource", this.getRefundSource());
        writer.writeEnumValue("refundStatus", this.getRefundStatus());
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
     * Sets the refundSource property value. This enumerated type lists the methods that can be used to issue a buyer refund.
     * @param value Value to set for the refundSource property.
     */
    public void setRefundSource(@jakarta.annotation.Nullable final RefundPaymentTypeEnum value) {
        this.refundSource = value;
    }
    /**
     * Sets the refundStatus property value. This enumeration type contains the possible outcomes of a refund action initiated through the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/issue_refund&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund &lt;/b&gt; methods.
     * @param value Value to set for the refundStatus property.
     */
    public void setRefundStatus(@jakarta.annotation.Nullable final RefundStatusEnum value) {
        this.refundStatus = value;
    }
}
