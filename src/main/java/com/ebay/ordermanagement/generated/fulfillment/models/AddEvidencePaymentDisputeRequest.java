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
 * This type is used by the request payload of the &lt;strong&gt;addEvidence&lt;/strong&gt; method. The &lt;strong&gt;addEvidence&lt;/strong&gt; method is used to create a new evidence set against a payment dispute with one or more evidence files.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AddEvidencePaymentDisputeRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&quot; target=&quot;_blank &quot;&gt;EvidenceTypeEnum&lt;/a&gt; type for the supported evidence types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String evidenceType;
    /**
     * This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the &lt;strong&gt;files&lt;/strong&gt; array.
     */
    private java.util.List<FileEvidence> files;
    /**
     * This array identifies the order line item(s) for which the evidence file(s) will be applicable.&lt;br&gt;&lt;Br&gt;These values are returned under the &lt;strong&gt;evidenceRequests.lineItems&lt;/strong&gt; array in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
     */
    private java.util.List<OrderLineItems> lineItems;
    /**
     * Instantiates a new {@link AddEvidencePaymentDisputeRequest} and sets the default values.
     */
    public AddEvidencePaymentDisputeRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AddEvidencePaymentDisputeRequest}
     */
    @jakarta.annotation.Nonnull
    public static AddEvidencePaymentDisputeRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AddEvidencePaymentDisputeRequest();
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
     * Gets the evidenceType property value. This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&quot; target=&quot;_blank &quot;&gt;EvidenceTypeEnum&lt;/a&gt; type for the supported evidence types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEvidenceType() {
        return this.evidenceType;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("evidenceType", (n) -> { this.setEvidenceType(n.getStringValue()); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getCollectionOfObjectValues(FileEvidence::createFromDiscriminatorValue)); });
        deserializerMap.put("lineItems", (n) -> { this.setLineItems(n.getCollectionOfObjectValues(OrderLineItems::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the &lt;strong&gt;files&lt;/strong&gt; array.
     * @return a {@link java.util.List<FileEvidence>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileEvidence> getFiles() {
        return this.files;
    }
    /**
     * Gets the lineItems property value. This array identifies the order line item(s) for which the evidence file(s) will be applicable.&lt;br&gt;&lt;Br&gt;These values are returned under the &lt;strong&gt;evidenceRequests.lineItems&lt;/strong&gt; array in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
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
        writer.writeStringValue("evidenceType", this.getEvidenceType());
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
     * Sets the evidenceType property value. This field is used to indicate the type of evidence being provided through one or more evidence files. All evidence files (if more than one) should be associated with the evidence type passed in this field.&lt;br&gt;&lt;br&gt;See the &lt;a href=&quot;/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&quot; target=&quot;_blank &quot;&gt;EvidenceTypeEnum&lt;/a&gt; type for the supported evidence types. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/fulfillment/types/api:EvidenceTypeEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the evidenceType property.
     */
    public void setEvidenceType(@jakarta.annotation.Nullable final String value) {
        this.evidenceType = value;
    }
    /**
     * Sets the files property value. This array is used to specify one or more evidence files that will become part of a new evidence set associated with a payment dispute. At least one evidence file must be specified in the &lt;strong&gt;files&lt;/strong&gt; array.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final java.util.List<FileEvidence> value) {
        this.files = value;
    }
    /**
     * Sets the lineItems property value. This array identifies the order line item(s) for which the evidence file(s) will be applicable.&lt;br&gt;&lt;Br&gt;These values are returned under the &lt;strong&gt;evidenceRequests.lineItems&lt;/strong&gt; array in the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDispute&quot; target=&quot;_blank &quot;&gt;getPaymentDispute&lt;/a&gt; response.
     * @param value Value to set for the lineItems property.
     */
    public void setLineItems(@jakarta.annotation.Nullable final java.util.List<OrderLineItems> value) {
        this.lineItems = value;
    }
}
