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
 * This type contains a error or warning related to a call request. 
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Error implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The context or source of this error or warning.
     */
    private String category;
    /**
     * The name of the domain containing the service or application. For example, &lt;code&gt;sell&lt;/code&gt; is a domain.
     */
    private String domain;
    /**
     * A positive integer that uniquely identifies the specific error condition that occurred. Your application can use these values as error code identifiers in your customized error-handling algorithms.
     */
    private Integer errorId;
    /**
     * A list of one or more specific request elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     */
    private java.util.List<String> inputRefIds;
    /**
     * An expanded version of the &lt;b&gt;message&lt;/b&gt; field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 200 characters
     */
    private String longMessage;
    /**
     * A message about the error or warning which is device agnostic and readable by end users and application developers. It explains what the error or warning is, and how to fix it (in a general sense). If applicable, the value is localized to the end user&apos;s requested locale. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 50 characters
     */
    private String message;
    /**
     * A list of one or more specific response elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     */
    private java.util.List<String> outputRefIds;
    /**
     * Contains a list of name-value pairs that provide additional information concerning this error or warning. Each item in the list is an input parameter that contributed to the error or warning condition.
     */
    private java.util.List<ErrorParameter> parameters;
    /**
     * The name of the domain&apos;s subsystem or subdivision. For example, &lt;code&gt;fulfillment&lt;/code&gt; is a subdomain in the &lt;code&gt;sell&lt;/code&gt; domain.
     */
    private String subdomain;
    /**
     * Instantiates a new {@link Error} and sets the default values.
     */
    public Error() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Error}
     */
    @jakarta.annotation.Nonnull
    public static Error createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Error();
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
     * Gets the category property value. The context or source of this error or warning.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the domain property value. The name of the domain containing the service or application. For example, &lt;code&gt;sell&lt;/code&gt; is a domain.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the errorId property value. A positive integer that uniquely identifies the specific error condition that occurred. Your application can use these values as error code identifiers in your customized error-handling algorithms.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorId() {
        return this.errorId;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("category", (n) -> { this.setCategory(n.getStringValue()); });
        deserializerMap.put("domain", (n) -> { this.setDomain(n.getStringValue()); });
        deserializerMap.put("errorId", (n) -> { this.setErrorId(n.getIntegerValue()); });
        deserializerMap.put("inputRefIds", (n) -> { this.setInputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("longMessage", (n) -> { this.setLongMessage(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("outputRefIds", (n) -> { this.setOutputRefIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("parameters", (n) -> { this.setParameters(n.getCollectionOfObjectValues(ErrorParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("subdomain", (n) -> { this.setSubdomain(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inputRefIds property value. A list of one or more specific request elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputRefIds() {
        return this.inputRefIds;
    }
    /**
     * Gets the longMessage property value. An expanded version of the &lt;b&gt;message&lt;/b&gt; field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 200 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongMessage() {
        return this.longMessage;
    }
    /**
     * Gets the message property value. A message about the error or warning which is device agnostic and readable by end users and application developers. It explains what the error or warning is, and how to fix it (in a general sense). If applicable, the value is localized to the end user&apos;s requested locale. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 50 characters
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the outputRefIds property value. A list of one or more specific response elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputRefIds() {
        return this.outputRefIds;
    }
    /**
     * Gets the parameters property value. Contains a list of name-value pairs that provide additional information concerning this error or warning. Each item in the list is an input parameter that contributed to the error or warning condition.
     * @return a {@link java.util.List<ErrorParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorParameter> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the subdomain property value. The name of the domain&apos;s subsystem or subdivision. For example, &lt;code&gt;fulfillment&lt;/code&gt; is a subdomain in the &lt;code&gt;sell&lt;/code&gt; domain.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubdomain() {
        return this.subdomain;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("category", this.getCategory());
        writer.writeStringValue("domain", this.getDomain());
        writer.writeIntegerValue("errorId", this.getErrorId());
        writer.writeCollectionOfPrimitiveValues("inputRefIds", this.getInputRefIds());
        writer.writeStringValue("longMessage", this.getLongMessage());
        writer.writeStringValue("message", this.getMessage());
        writer.writeCollectionOfPrimitiveValues("outputRefIds", this.getOutputRefIds());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeStringValue("subdomain", this.getSubdomain());
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
     * Sets the category property value. The context or source of this error or warning.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the domain property value. The name of the domain containing the service or application. For example, &lt;code&gt;sell&lt;/code&gt; is a domain.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the errorId property value. A positive integer that uniquely identifies the specific error condition that occurred. Your application can use these values as error code identifiers in your customized error-handling algorithms.
     * @param value Value to set for the errorId property.
     */
    public void setErrorId(@jakarta.annotation.Nullable final Integer value) {
        this.errorId = value;
    }
    /**
     * Sets the inputRefIds property value. A list of one or more specific request elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     * @param value Value to set for the inputRefIds property.
     */
    public void setInputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inputRefIds = value;
    }
    /**
     * Sets the longMessage property value. An expanded version of the &lt;b&gt;message&lt;/b&gt; field. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 200 characters
     * @param value Value to set for the longMessage property.
     */
    public void setLongMessage(@jakarta.annotation.Nullable final String value) {
        this.longMessage = value;
    }
    /**
     * Sets the message property value. A message about the error or warning which is device agnostic and readable by end users and application developers. It explains what the error or warning is, and how to fix it (in a general sense). If applicable, the value is localized to the end user&apos;s requested locale. &lt;br&gt;&lt;br&gt;&lt;b&gt;Maximum length:&lt;/b&gt; 50 characters
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the outputRefIds property value. A list of one or more specific response elements (if any) associated with the error or warning. The format of these strings depends on the request payload format. For JSON, use JSONPath notation.
     * @param value Value to set for the outputRefIds property.
     */
    public void setOutputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.outputRefIds = value;
    }
    /**
     * Sets the parameters property value. Contains a list of name-value pairs that provide additional information concerning this error or warning. Each item in the list is an input parameter that contributed to the error or warning condition.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<ErrorParameter> value) {
        this.parameters = value;
    }
    /**
     * Sets the subdomain property value. The name of the domain&apos;s subsystem or subdivision. For example, &lt;code&gt;fulfillment&lt;/code&gt; is a subdomain in the &lt;code&gt;sell&lt;/code&gt; domain.
     * @param value Value to set for the subdomain property.
     */
    public void setSubdomain(@jakarta.annotation.Nullable final String value) {
        this.subdomain = value;
    }
}
