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
 * This type contains information about the pagination of a  response payload. The entries (data records) returned by the request are grouped into &lt;i&gt;pages&lt;/i&gt;, which are limited in size according to the number of entries per page as specified by the &lt;b&gt;limit&lt;/b&gt; field.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaginationOutput implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The maximum number of entries to return per request. This value is set through the &lt;b&gt;limit&lt;/b&gt; query parameter in the request (or the default value is used if this query parameter is omitted). &lt;br/&gt;&lt;br/&gt;The value of the &lt;b&gt;totalEntries&lt;/b&gt; field divided by the value of this field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field. 
     */
    private Integer limit;
    /**
     * The offset value indicates the number of entries to skip in the results set before returning the first entry in the paginated response. The &lt;b&gt;offset&lt;/b&gt; query parameter is paired with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the number of entries returned in the response, and which entries appear on that page of data. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 entries from the results set. If the &lt;b&gt;offset&lt;/b&gt; was set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; was set to &lt;code&gt;20&lt;/code&gt;, the first page of the results set would contain entries 11-30. &lt;br/&gt;&lt;br/&gt;The &lt;b&gt;offset&lt;/b&gt; value defaults to &lt;code&gt;0&lt;/code&gt; if the &lt;b&gt;offset&lt;/b&gt; query parameter is omitted from the request.
     */
    private Integer offset;
    /**
     * The total number of entries that match the current input criteria of the request. This value divided by the value of the &lt;b&gt;limit&lt;/b&gt; field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field.
     */
    private Integer totalEntries;
    /**
     * The total number of pages of entries that match the current input criteria of the request.  &lt;br/&gt;&lt;br/&gt;This value is determined by dividing the value of the &lt;b&gt;totalEntries&lt;/b&gt; field by the value of the &lt;b&gt;limit&lt;/b&gt; field. If &lt;b&gt;totalPages&lt;/b&gt; is more than &lt;code&gt;1&lt;/code&gt;, subsequent calls must be used to view subsequent pages in the results set.
     */
    private Integer totalPages;
    /**
     * Instantiates a new {@link PaginationOutput} and sets the default values.
     */
    public PaginationOutput() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaginationOutput}
     */
    @jakarta.annotation.Nonnull
    public static PaginationOutput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaginationOutput();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("limit", (n) -> { this.setLimit(n.getIntegerValue()); });
        deserializerMap.put("offset", (n) -> { this.setOffset(n.getIntegerValue()); });
        deserializerMap.put("totalEntries", (n) -> { this.setTotalEntries(n.getIntegerValue()); });
        deserializerMap.put("totalPages", (n) -> { this.setTotalPages(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the limit property value. The maximum number of entries to return per request. This value is set through the &lt;b&gt;limit&lt;/b&gt; query parameter in the request (or the default value is used if this query parameter is omitted). &lt;br/&gt;&lt;br/&gt;The value of the &lt;b&gt;totalEntries&lt;/b&gt; field divided by the value of this field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field. 
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLimit() {
        return this.limit;
    }
    /**
     * Gets the offset property value. The offset value indicates the number of entries to skip in the results set before returning the first entry in the paginated response. The &lt;b&gt;offset&lt;/b&gt; query parameter is paired with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the number of entries returned in the response, and which entries appear on that page of data. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 entries from the results set. If the &lt;b&gt;offset&lt;/b&gt; was set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; was set to &lt;code&gt;20&lt;/code&gt;, the first page of the results set would contain entries 11-30. &lt;br/&gt;&lt;br/&gt;The &lt;b&gt;offset&lt;/b&gt; value defaults to &lt;code&gt;0&lt;/code&gt; if the &lt;b&gt;offset&lt;/b&gt; query parameter is omitted from the request.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOffset() {
        return this.offset;
    }
    /**
     * Gets the totalEntries property value. The total number of entries that match the current input criteria of the request. This value divided by the value of the &lt;b&gt;limit&lt;/b&gt; field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalEntries() {
        return this.totalEntries;
    }
    /**
     * Gets the totalPages property value. The total number of pages of entries that match the current input criteria of the request.  &lt;br/&gt;&lt;br/&gt;This value is determined by dividing the value of the &lt;b&gt;totalEntries&lt;/b&gt; field by the value of the &lt;b&gt;limit&lt;/b&gt; field. If &lt;b&gt;totalPages&lt;/b&gt; is more than &lt;code&gt;1&lt;/code&gt;, subsequent calls must be used to view subsequent pages in the results set.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalPages() {
        return this.totalPages;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("limit", this.getLimit());
        writer.writeIntegerValue("offset", this.getOffset());
        writer.writeIntegerValue("totalEntries", this.getTotalEntries());
        writer.writeIntegerValue("totalPages", this.getTotalPages());
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
     * Sets the limit property value. The maximum number of entries to return per request. This value is set through the &lt;b&gt;limit&lt;/b&gt; query parameter in the request (or the default value is used if this query parameter is omitted). &lt;br/&gt;&lt;br/&gt;The value of the &lt;b&gt;totalEntries&lt;/b&gt; field divided by the value of this field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field. 
     * @param value Value to set for the limit property.
     */
    public void setLimit(@jakarta.annotation.Nullable final Integer value) {
        this.limit = value;
    }
    /**
     * Sets the offset property value. The offset value indicates the number of entries to skip in the results set before returning the first entry in the paginated response. The &lt;b&gt;offset&lt;/b&gt; query parameter is paired with the &lt;b&gt;limit&lt;/b&gt; query parameter to control the number of entries returned in the response, and which entries appear on that page of data. For example, if you supply an &lt;b&gt;offset&lt;/b&gt; of &lt;code&gt;0&lt;/code&gt; and a &lt;b&gt;limit&lt;/b&gt; of &lt;code&gt;10&lt;/code&gt;, the first page of the response contains the first 10 entries from the results set. If the &lt;b&gt;offset&lt;/b&gt; was set to &lt;code&gt;10&lt;/code&gt; and the &lt;b&gt;limit&lt;/b&gt; was set to &lt;code&gt;20&lt;/code&gt;, the first page of the results set would contain entries 11-30. &lt;br/&gt;&lt;br/&gt;The &lt;b&gt;offset&lt;/b&gt; value defaults to &lt;code&gt;0&lt;/code&gt; if the &lt;b&gt;offset&lt;/b&gt; query parameter is omitted from the request.
     * @param value Value to set for the offset property.
     */
    public void setOffset(@jakarta.annotation.Nullable final Integer value) {
        this.offset = value;
    }
    /**
     * Sets the totalEntries property value. The total number of entries that match the current input criteria of the request. This value divided by the value of the &lt;b&gt;limit&lt;/b&gt; field determines the value of the &lt;b&gt;totalPages&lt;/b&gt; field.
     * @param value Value to set for the totalEntries property.
     */
    public void setTotalEntries(@jakarta.annotation.Nullable final Integer value) {
        this.totalEntries = value;
    }
    /**
     * Sets the totalPages property value. The total number of pages of entries that match the current input criteria of the request.  &lt;br/&gt;&lt;br/&gt;This value is determined by dividing the value of the &lt;b&gt;totalEntries&lt;/b&gt; field by the value of the &lt;b&gt;limit&lt;/b&gt; field. If &lt;b&gt;totalPages&lt;/b&gt; is more than &lt;code&gt;1&lt;/code&gt;, subsequent calls must be used to view subsequent pages in the results set.
     * @param value Value to set for the totalPages property.
     */
    public void setTotalPages(@jakarta.annotation.Nullable final Integer value) {
        this.totalPages = value;
    }
}
