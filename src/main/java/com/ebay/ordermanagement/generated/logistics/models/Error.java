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

package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A container that defines the elements of error and warning message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Error implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The category type for this error or warning. It takes a string that can have one of three values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Application&lt;/code&gt;: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service&apos;s business logic, system failures, or request errors from a dependency.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Business&lt;/code&gt;: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as &quot;Seller does not ship item to Antarctica&quot; or &quot;Buyer ineligible to purchase an alcoholic item&quot;. Business errors are not syntactical input errors.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Request&lt;/code&gt;: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.&lt;/li&gt;&lt;/ul&gt;
     */
    private String category;
    /**
     * Name of the domain containing the service or application.
     */
    private String domain;
    /**
     * A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
     */
    private Integer errorId;
    /**
     * Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For JSON, use &lt;i&gt;JSONPath&lt;/i&gt; notation.
     */
    private java.util.List<String> inputRefIds;
    /**
     * An expanded version of message that should be around 100-200 characters long, but is not required to be such.
     */
    private String longMessage;
    /**
     * An end user and app-developer friendly device agnostic message. It explains what the error or warning is, and how to fix it (in a general sense). Its value is at most 50 characters long. If applicable, the value is localized in the end user&apos;s requested locale.
     */
    private String message;
    /**
     * Identifies specific response elements associated with the error, if any. Path format is the same as &lt;code&gt;inputRefId&lt;/code&gt;.
     */
    private java.util.List<String> outputRefIds;
    /**
     * This optional complex field type contains a list of one or more context-specific &lt;code&gt;ErrorParameter&lt;/code&gt; objects, with each item in the list entry being a parameter (or input field name) that caused an error condition. Each &lt;code&gt;ErrorParameter&lt;/code&gt; object consists of two fields, a &lt;code&gt;name&lt;/code&gt; and a &lt;code&gt;value&lt;/code&gt;.
     */
    private java.util.List<ErrorParameter> parameters;
    /**
     * Name of the domain&apos;s subsystem or subdivision. For example, checkout is a subdomain in the buying domain.
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
     * Gets the category property value. The category type for this error or warning. It takes a string that can have one of three values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Application&lt;/code&gt;: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service&apos;s business logic, system failures, or request errors from a dependency.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Business&lt;/code&gt;: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as &quot;Seller does not ship item to Antarctica&quot; or &quot;Buyer ineligible to purchase an alcoholic item&quot;. Business errors are not syntactical input errors.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Request&lt;/code&gt;: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.&lt;/li&gt;&lt;/ul&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCategory() {
        return this.category;
    }
    /**
     * Gets the domain property value. Name of the domain containing the service or application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomain() {
        return this.domain;
    }
    /**
     * Gets the errorId property value. A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
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
     * Gets the inputRefIds property value. Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For JSON, use &lt;i&gt;JSONPath&lt;/i&gt; notation.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getInputRefIds() {
        return this.inputRefIds;
    }
    /**
     * Gets the longMessage property value. An expanded version of message that should be around 100-200 characters long, but is not required to be such.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLongMessage() {
        return this.longMessage;
    }
    /**
     * Gets the message property value. An end user and app-developer friendly device agnostic message. It explains what the error or warning is, and how to fix it (in a general sense). Its value is at most 50 characters long. If applicable, the value is localized in the end user&apos;s requested locale.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the outputRefIds property value. Identifies specific response elements associated with the error, if any. Path format is the same as &lt;code&gt;inputRefId&lt;/code&gt;.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOutputRefIds() {
        return this.outputRefIds;
    }
    /**
     * Gets the parameters property value. This optional complex field type contains a list of one or more context-specific &lt;code&gt;ErrorParameter&lt;/code&gt; objects, with each item in the list entry being a parameter (or input field name) that caused an error condition. Each &lt;code&gt;ErrorParameter&lt;/code&gt; object consists of two fields, a &lt;code&gt;name&lt;/code&gt; and a &lt;code&gt;value&lt;/code&gt;.
     * @return a {@link java.util.List<ErrorParameter>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ErrorParameter> getParameters() {
        return this.parameters;
    }
    /**
     * Gets the subdomain property value. Name of the domain&apos;s subsystem or subdivision. For example, checkout is a subdomain in the buying domain.
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
     * Sets the category property value. The category type for this error or warning. It takes a string that can have one of three values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Application&lt;/code&gt;: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service&apos;s business logic, system failures, or request errors from a dependency.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Business&lt;/code&gt;: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as &quot;Seller does not ship item to Antarctica&quot; or &quot;Buyer ineligible to purchase an alcoholic item&quot;. Business errors are not syntactical input errors.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Request&lt;/code&gt;: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.&lt;/li&gt;&lt;/ul&gt;
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final String value) {
        this.category = value;
    }
    /**
     * Sets the domain property value. Name of the domain containing the service or application.
     * @param value Value to set for the domain property.
     */
    public void setDomain(@jakarta.annotation.Nullable final String value) {
        this.domain = value;
    }
    /**
     * Sets the errorId property value. A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
     * @param value Value to set for the errorId property.
     */
    public void setErrorId(@jakarta.annotation.Nullable final Integer value) {
        this.errorId = value;
    }
    /**
     * Sets the inputRefIds property value. Identifies specific request elements associated with the error, if any. inputRefId&apos;s response is format specific. For JSON, use &lt;i&gt;JSONPath&lt;/i&gt; notation.
     * @param value Value to set for the inputRefIds property.
     */
    public void setInputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.inputRefIds = value;
    }
    /**
     * Sets the longMessage property value. An expanded version of message that should be around 100-200 characters long, but is not required to be such.
     * @param value Value to set for the longMessage property.
     */
    public void setLongMessage(@jakarta.annotation.Nullable final String value) {
        this.longMessage = value;
    }
    /**
     * Sets the message property value. An end user and app-developer friendly device agnostic message. It explains what the error or warning is, and how to fix it (in a general sense). Its value is at most 50 characters long. If applicable, the value is localized in the end user&apos;s requested locale.
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the outputRefIds property value. Identifies specific response elements associated with the error, if any. Path format is the same as &lt;code&gt;inputRefId&lt;/code&gt;.
     * @param value Value to set for the outputRefIds property.
     */
    public void setOutputRefIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.outputRefIds = value;
    }
    /**
     * Sets the parameters property value. This optional complex field type contains a list of one or more context-specific &lt;code&gt;ErrorParameter&lt;/code&gt; objects, with each item in the list entry being a parameter (or input field name) that caused an error condition. Each &lt;code&gt;ErrorParameter&lt;/code&gt; object consists of two fields, a &lt;code&gt;name&lt;/code&gt; and a &lt;code&gt;value&lt;/code&gt;.
     * @param value Value to set for the parameters property.
     */
    public void setParameters(@jakarta.annotation.Nullable final java.util.List<ErrorParameter> value) {
        this.parameters = value;
    }
    /**
     * Sets the subdomain property value. Name of the domain&apos;s subsystem or subdivision. For example, checkout is a subdomain in the buying domain.
     * @param value Value to set for the subdomain property.
     */
    public void setSubdomain(@jakarta.annotation.Nullable final String value) {
        this.subdomain = value;
    }
}
