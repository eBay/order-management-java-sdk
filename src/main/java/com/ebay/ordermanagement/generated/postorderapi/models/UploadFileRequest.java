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
import com.microsoft.kiota.serialization.UntypedNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The base request type for the &lt;b&gt;POST /post-order/v2/return/{returnId}/file/upload&lt;/b&gt; and &lt;b&gt;POST /post-order/v2/return/draft/{draftId}/file/upload&lt;/b&gt; methods.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadFileRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The input for this field is a base64-encoded binary representation of the file you are uploading.&lt;br/&gt;&lt;br/&gt;For images, the system accepts BMP, GIF, JPEG, and PNG files. For shipping labels, the system accepts either an image (BMP, GIF, JPEG, and PNG files) or a PDF file.&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;data&lt;/b&gt; field supports single-time base64 encoding. For backward compatibility, the data field also presently supports double base64 encoding.&lt;/p&gt;
     */
    private String data;
    /**
     * This field is used to name the file that is being uploaded. Naming a file may make it easier for the buyer or seller to keep track of their files, instead of having to remember the &lt;b&gt;fileId&lt;/b&gt; value (which is returned in the response) of each file.
     */
    private String fileName;
    /**
     * The filePurpose property
     */
    private UntypedNode filePurpose;
    /**
     * Instantiates a new {@link UploadFileRequest} and sets the default values.
     */
    public UploadFileRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UploadFileRequest}
     */
    @jakarta.annotation.Nonnull
    public static UploadFileRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UploadFileRequest();
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
     * Gets the data property value. The input for this field is a base64-encoded binary representation of the file you are uploading.&lt;br/&gt;&lt;br/&gt;For images, the system accepts BMP, GIF, JPEG, and PNG files. For shipping labels, the system accepts either an image (BMP, GIF, JPEG, and PNG files) or a PDF file.&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;data&lt;/b&gt; field supports single-time base64 encoding. For backward compatibility, the data field also presently supports double base64 encoding.&lt;/p&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("data", (n) -> { this.setData(n.getStringValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        deserializerMap.put("filePurpose", (n) -> { this.setFilePurpose(n.getObjectValue(UntypedNode::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. This field is used to name the file that is being uploaded. Naming a file may make it easier for the buyer or seller to keep track of their files, instead of having to remember the &lt;b&gt;fileId&lt;/b&gt; value (which is returned in the response) of each file.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.fileName;
    }
    /**
     * Gets the filePurpose property value. The filePurpose property
     * @return a {@link UntypedNode}
     */
    @jakarta.annotation.Nullable
    public UntypedNode getFilePurpose() {
        return this.filePurpose;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("data", this.getData());
        writer.writeStringValue("fileName", this.getFileName());
        writer.writeObjectValue("filePurpose", this.getFilePurpose());
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
     * Sets the data property value. The input for this field is a base64-encoded binary representation of the file you are uploading.&lt;br/&gt;&lt;br/&gt;For images, the system accepts BMP, GIF, JPEG, and PNG files. For shipping labels, the system accepts either an image (BMP, GIF, JPEG, and PNG files) or a PDF file.&lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; The &lt;b&gt;data&lt;/b&gt; field supports single-time base64 encoding. For backward compatibility, the data field also presently supports double base64 encoding.&lt;/p&gt;
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final String value) {
        this.data = value;
    }
    /**
     * Sets the fileName property value. This field is used to name the file that is being uploaded. Naming a file may make it easier for the buyer or seller to keep track of their files, instead of having to remember the &lt;b&gt;fileId&lt;/b&gt; value (which is returned in the response) of each file.
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.fileName = value;
    }
    /**
     * Sets the filePurpose property value. The filePurpose property
     * @param value Value to set for the filePurpose property.
     */
    public void setFilePurpose(@jakarta.annotation.Nullable final UntypedNode value) {
        this.filePurpose = value;
    }
}
