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
 * The base response type of the &lt;b&gt;GET /post-order/v2/inquiry/search&lt;/b&gt; method, which is used to retrieve INR inquiries based on filter criteria in the request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InquirySearchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of one or more INR inquiries that match the filter criteria in request.
     */
    private java.util.List<InquirySummaryType> members;
    /**
     * This type contains information about the pagination of a  response payload. The entries (data records) returned by the request are grouped into &lt;i&gt;pages&lt;/i&gt;, which are limited in size according to the number of entries per page as specified by the &lt;b&gt;limit&lt;/b&gt; field.
     */
    private PaginationOutput paginationOutput;
    /**
     * This integer value indicates the total number of INR inquiries that were found based on the input filter(s) in the request.
     */
    private Integer totalNumberOfInquiries;
    /**
     * Instantiates a new {@link InquirySearchResponse} and sets the default values.
     */
    public InquirySearchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InquirySearchResponse}
     */
    @jakarta.annotation.Nonnull
    public static InquirySearchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InquirySearchResponse();
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
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(InquirySummaryType::createFromDiscriminatorValue)); });
        deserializerMap.put("paginationOutput", (n) -> { this.setPaginationOutput(n.getObjectValue(PaginationOutput::createFromDiscriminatorValue)); });
        deserializerMap.put("totalNumberOfInquiries", (n) -> { this.setTotalNumberOfInquiries(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. An array of one or more INR inquiries that match the filter criteria in request.
     * @return a {@link java.util.List<InquirySummaryType>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<InquirySummaryType> getMembers() {
        return this.members;
    }
    /**
     * Gets the paginationOutput property value. This type contains information about the pagination of a  response payload. The entries (data records) returned by the request are grouped into &lt;i&gt;pages&lt;/i&gt;, which are limited in size according to the number of entries per page as specified by the &lt;b&gt;limit&lt;/b&gt; field.
     * @return a {@link PaginationOutput}
     */
    @jakarta.annotation.Nullable
    public PaginationOutput getPaginationOutput() {
        return this.paginationOutput;
    }
    /**
     * Gets the totalNumberOfInquiries property value. This integer value indicates the total number of INR inquiries that were found based on the input filter(s) in the request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalNumberOfInquiries() {
        return this.totalNumberOfInquiries;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeObjectValue("paginationOutput", this.getPaginationOutput());
        writer.writeIntegerValue("totalNumberOfInquiries", this.getTotalNumberOfInquiries());
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
     * Sets the members property value. An array of one or more INR inquiries that match the filter criteria in request.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<InquirySummaryType> value) {
        this.members = value;
    }
    /**
     * Sets the paginationOutput property value. This type contains information about the pagination of a  response payload. The entries (data records) returned by the request are grouped into &lt;i&gt;pages&lt;/i&gt;, which are limited in size according to the number of entries per page as specified by the &lt;b&gt;limit&lt;/b&gt; field.
     * @param value Value to set for the paginationOutput property.
     */
    public void setPaginationOutput(@jakarta.annotation.Nullable final PaginationOutput value) {
        this.paginationOutput = value;
    }
    /**
     * Sets the totalNumberOfInquiries property value. This integer value indicates the total number of INR inquiries that were found based on the input filter(s) in the request.
     * @param value Value to set for the totalNumberOfInquiries property.
     */
    public void setTotalNumberOfInquiries(@jakarta.annotation.Nullable final Integer value) {
        this.totalNumberOfInquiries = value;
    }
}
