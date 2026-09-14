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
 * This type is used by the &lt;strong&gt;files&lt;/strong&gt; array, which shows the name, ID, file type, and upload date for each provided evidential file.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileInfo implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier of the evidence file.
     */
    private String fileId;
    /**
     * The type of file uploaded. Supported file extensions are .JPEG, .JPG, and .PNG., and maximum file size allowed is 1.5 MB.
     */
    private String fileType;
    /**
     * The seller-provided name of the evidence file.
     */
    private String name;
    /**
     * The timestamp in this field shows the date/time when the seller uploaded the evidential document to eBay. &lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     */
    private String uploadedDate;
    /**
     * Instantiates a new {@link FileInfo} and sets the default values.
     */
    public FileInfo() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileInfo}
     */
    @jakarta.annotation.Nonnull
    public static FileInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileInfo();
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
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("uploadedDate", (n) -> { this.setUploadedDate(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileId property value. The unique identifier of the evidence file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.fileId;
    }
    /**
     * Gets the fileType property value. The type of file uploaded. Supported file extensions are .JPEG, .JPG, and .PNG., and maximum file size allowed is 1.5 MB.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.fileType;
    }
    /**
     * Gets the name property value. The seller-provided name of the evidence file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the uploadedDate property value. The timestamp in this field shows the date/time when the seller uploaded the evidential document to eBay. &lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUploadedDate() {
        return this.uploadedDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileId", this.getFileId());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("uploadedDate", this.getUploadedDate());
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
     * Sets the fileId property value. The unique identifier of the evidence file.
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
    /**
     * Sets the fileType property value. The type of file uploaded. Supported file extensions are .JPEG, .JPG, and .PNG., and maximum file size allowed is 1.5 MB.
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.fileType = value;
    }
    /**
     * Sets the name property value. The seller-provided name of the evidence file.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the uploadedDate property value. The timestamp in this field shows the date/time when the seller uploaded the evidential document to eBay. &lt;br&gt;&lt;br&gt;The timestamps returned here use the &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html&quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO&amp;nbsp;8601&lt;/a&gt; 24-hour date and time format, and the time zone used is Universal Coordinated Time (UTC), also known as Greenwich Mean Time (GMT), or Zulu. The ISO 8601 format looks like this: &lt;em&gt;yyyy-MM-ddThh:mm.ss.sssZ&lt;/em&gt;. An example would be &lt;code&gt;2019-08-04T19:09:02.768Z&lt;/code&gt;.
     * @param value Value to set for the uploadedDate property.
     */
    public void setUploadedDate(@jakarta.annotation.Nullable final String value) {
        this.uploadedDate = value;
    }
}
