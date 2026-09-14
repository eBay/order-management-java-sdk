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
 * The vase type for evidence processing requests.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProcessEvidencePaymentDisputeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This enumeration type defines the different types of evidential documentation. | - **PROOF_OF_DELIVERY**: &lt;strong&gt;Important!&lt;/strong&gt; This enum value is currently not supported for adding shipment tracking information for proof of delivery. Instead, use the createShippingFulfillment method to provide shipment tracking information evidence for a dispute.&lt;br&gt;This enumeration value indicates that the evidential documentation is for proof of order delivery. An example is shipment tracking information from a shipping carrier. A PROOF_OF_DELIVERY document might be needed if the buyer initiated the payment dispute for not receiving the item. - **PROOF_OF_AUTHENTICITY**: This enumeration value indicates that the evidential documentation is for proof of item authenticity. A PROOF_OF_AUTHENTICITY document/image might be needed if the buyer initiated the payment dispute due to suspecting that the item may be counterfeit. - **PROOF_OF_ITEM_AS_DESCRIBED**: This enumeration value indicates that the evidential documentation is to show that the item is as described. This document may be a photo. A PROOF_OF_ITEM_AS_DESCRIBED document might be needed if the buyer initiated the payment dispute because they thought the item was not as subscribed. - **PROOF_OF_CREDIT_NOT_DUE**: This enumeration value indicates that the evidential documentation is for proof of credit not due. A PROOF_OF_CREDIT_NOT_DUE document/image might be needed if the buyer initiated the payment dispute due to expecting a credit. - **PROOF_OF_RETURN_NOT_RECEIVED**: This enumeration value indicates that the evidential documentation is for proof that a return item has not been received by the seller, so a refund has not yet been issued. - **PROOF_OF_DELIVERY_AS_FILE**: This enumeration value indicates that the evidential documentation is a file that is proof of order delivery. - **PROOF_OF_DELIVERY_SIGNATURE**: This enumeration value indicates that the evidential documentation is a delivery signature file. - **PROOF_OF_PICKUP**: This enumeration value indicates that the evidential documentation is for buy online, pick up in store. - **OPTIONAL_SUPPORTING_DOCUMENTS**: This enumeration value indicates that the evidential documentation is optional.
     */
    private EvidenceTypeEnum evidenceType;
    /**
     * This array is used to specify one or more evidence files that will be added to or update the evidence set associated with a payment dispute.
     */
    private java.util.List<FileEvidence> files;
    /**
     * This array identifies the order line item(s) for which the evidence file(s) will be applicable. These values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.
     */
    private java.util.List<OrderLineItems> lineItems;
    /**
     * Instantiates a new {@link ProcessEvidencePaymentDisputeRequest} and sets the default values.
     */
    public ProcessEvidencePaymentDisputeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProcessEvidencePaymentDisputeRequest}
     */
    @jakarta.annotation.Nonnull
    public static ProcessEvidencePaymentDisputeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProcessEvidencePaymentDisputeRequest();
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
     * Gets the evidenceType property value. This enumeration type defines the different types of evidential documentation. | - **PROOF_OF_DELIVERY**: &lt;strong&gt;Important!&lt;/strong&gt; This enum value is currently not supported for adding shipment tracking information for proof of delivery. Instead, use the createShippingFulfillment method to provide shipment tracking information evidence for a dispute.&lt;br&gt;This enumeration value indicates that the evidential documentation is for proof of order delivery. An example is shipment tracking information from a shipping carrier. A PROOF_OF_DELIVERY document might be needed if the buyer initiated the payment dispute for not receiving the item. - **PROOF_OF_AUTHENTICITY**: This enumeration value indicates that the evidential documentation is for proof of item authenticity. A PROOF_OF_AUTHENTICITY document/image might be needed if the buyer initiated the payment dispute due to suspecting that the item may be counterfeit. - **PROOF_OF_ITEM_AS_DESCRIBED**: This enumeration value indicates that the evidential documentation is to show that the item is as described. This document may be a photo. A PROOF_OF_ITEM_AS_DESCRIBED document might be needed if the buyer initiated the payment dispute because they thought the item was not as subscribed. - **PROOF_OF_CREDIT_NOT_DUE**: This enumeration value indicates that the evidential documentation is for proof of credit not due. A PROOF_OF_CREDIT_NOT_DUE document/image might be needed if the buyer initiated the payment dispute due to expecting a credit. - **PROOF_OF_RETURN_NOT_RECEIVED**: This enumeration value indicates that the evidential documentation is for proof that a return item has not been received by the seller, so a refund has not yet been issued. - **PROOF_OF_DELIVERY_AS_FILE**: This enumeration value indicates that the evidential documentation is a file that is proof of order delivery. - **PROOF_OF_DELIVERY_SIGNATURE**: This enumeration value indicates that the evidential documentation is a delivery signature file. - **PROOF_OF_PICKUP**: This enumeration value indicates that the evidential documentation is for buy online, pick up in store. - **OPTIONAL_SUPPORTING_DOCUMENTS**: This enumeration value indicates that the evidential documentation is optional.
     * @return a {@link EvidenceTypeEnum}
     */
    @jakarta.annotation.Nullable
    public EvidenceTypeEnum getEvidenceType() {
        return this.evidenceType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("evidenceType", (n) -> { this.setEvidenceType(n.getEnumValue(EvidenceTypeEnum::forValue)); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(FileEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(OrderLineItems::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. This array is used to specify one or more evidence files that will be added to or update the evidence set associated with a payment dispute.
     * @return a {@link java.util.List<FileEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileEvidence> getFiles() {
        return this.files;
    }
    /**
     * Gets the lineItems property value. This array identifies the order line item(s) for which the evidence file(s) will be applicable. These values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.
     * @return a {@link java.util.List<OrderLineItems>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OrderLineItems> getLineItems() {
        return this.lineItems;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("evidenceType", this.getEvidenceType());
        writer.writeCollectionOfObjectValues("files", this.getFiles());
        writer.writeCollectionOfObjectValues("lineItems", this.getLineItems());
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
     * Sets the evidenceType property value. This enumeration type defines the different types of evidential documentation. | - **PROOF_OF_DELIVERY**: &lt;strong&gt;Important!&lt;/strong&gt; This enum value is currently not supported for adding shipment tracking information for proof of delivery. Instead, use the createShippingFulfillment method to provide shipment tracking information evidence for a dispute.&lt;br&gt;This enumeration value indicates that the evidential documentation is for proof of order delivery. An example is shipment tracking information from a shipping carrier. A PROOF_OF_DELIVERY document might be needed if the buyer initiated the payment dispute for not receiving the item. - **PROOF_OF_AUTHENTICITY**: This enumeration value indicates that the evidential documentation is for proof of item authenticity. A PROOF_OF_AUTHENTICITY document/image might be needed if the buyer initiated the payment dispute due to suspecting that the item may be counterfeit. - **PROOF_OF_ITEM_AS_DESCRIBED**: This enumeration value indicates that the evidential documentation is to show that the item is as described. This document may be a photo. A PROOF_OF_ITEM_AS_DESCRIBED document might be needed if the buyer initiated the payment dispute because they thought the item was not as subscribed. - **PROOF_OF_CREDIT_NOT_DUE**: This enumeration value indicates that the evidential documentation is for proof of credit not due. A PROOF_OF_CREDIT_NOT_DUE document/image might be needed if the buyer initiated the payment dispute due to expecting a credit. - **PROOF_OF_RETURN_NOT_RECEIVED**: This enumeration value indicates that the evidential documentation is for proof that a return item has not been received by the seller, so a refund has not yet been issued. - **PROOF_OF_DELIVERY_AS_FILE**: This enumeration value indicates that the evidential documentation is a file that is proof of order delivery. - **PROOF_OF_DELIVERY_SIGNATURE**: This enumeration value indicates that the evidential documentation is a delivery signature file. - **PROOF_OF_PICKUP**: This enumeration value indicates that the evidential documentation is for buy online, pick up in store. - **OPTIONAL_SUPPORTING_DOCUMENTS**: This enumeration value indicates that the evidential documentation is optional.
     * @param value Value to set for the evidenceType property.
     */
    public void setEvidenceType(@jakarta.annotation.Nullable final EvidenceTypeEnum value) {
        this.evidenceType = value;
    }
    /**
     * Sets the files property value. This array is used to specify one or more evidence files that will be added to or update the evidence set associated with a payment dispute.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<FileEvidence> value) {
        this.files = value;
    }
    /**
     * Sets the lineItems property value. This array identifies the order line item(s) for which the evidence file(s) will be applicable. These values are returned under the evidenceRequests.lineItems array in the getPaymentDispute response.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<OrderLineItems> value) {
        this.lineItems = value;
    }
}
