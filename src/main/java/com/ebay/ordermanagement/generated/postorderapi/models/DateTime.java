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
 * This type is used by all fields that require a timestamp, both in UTC and as a formatted value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DateTime implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Reserved for future use. &lt;!-- Gets a date value that is formatted as defined in the ISO-8601 internationalization standard.  &lt;br/&gt;&lt;br/&gt;This value is returned only if the client specifies which format to return by populating the &lt;code&gt;X-EBAY-C-CULTRUREPREF&lt;/code&gt; HTTP header. --&gt;
     */
    private String formattedValue;
    /**
     * This timestamp indicates the date and time when an action or event occurred.   &lt;br/&gt;&lt;br/&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br/&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-03-20T00:00:00.000Z&lt;/code&gt;
     */
    private String value;
    /**
     * Instantiates a new {@link DateTime} and sets the default values.
     */
    public DateTime() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DateTime}
     */
    @jakarta.annotation.Nonnull
    public static DateTime createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateTime();
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
        deserializerMap.put("formattedValue", (n) -> { this.setFormattedValue(n.getStringValue()); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the formattedValue property value. Reserved for future use. &lt;!-- Gets a date value that is formatted as defined in the ISO-8601 internationalization standard.  &lt;br/&gt;&lt;br/&gt;This value is returned only if the client specifies which format to return by populating the &lt;code&gt;X-EBAY-C-CULTRUREPREF&lt;/code&gt; HTTP header. --&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFormattedValue() {
        return this.formattedValue;
    }
    /**
     * Gets the value property value. This timestamp indicates the date and time when an action or event occurred.   &lt;br/&gt;&lt;br/&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br/&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-03-20T00:00:00.000Z&lt;/code&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("formattedValue", this.getFormattedValue());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the formattedValue property value. Reserved for future use. &lt;!-- Gets a date value that is formatted as defined in the ISO-8601 internationalization standard.  &lt;br/&gt;&lt;br/&gt;This value is returned only if the client specifies which format to return by populating the &lt;code&gt;X-EBAY-C-CULTRUREPREF&lt;/code&gt; HTTP header. --&gt;
     * @param value Value to set for the formattedValue property.
     */
    public void setFormattedValue(@jakarta.annotation.Nullable final String value) {
        this.formattedValue = value;
    }
    /**
     * Sets the value property value. This timestamp indicates the date and time when an action or event occurred.   &lt;br/&gt;&lt;br/&gt;The timestamp is formatted as an &lt;a href=&quot;https://www.iso.org/iso-8601-date-and-time-format.html &quot; title=&quot;https://www.iso.org &quot; target=&quot;_blank&quot;&gt;ISO 8601&lt;/a&gt; string, which is based on the 24-hour Coordinated Universal Time (UTC) clock.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Format:&lt;/b&gt; &lt;code&gt;[YYYY]-[MM]-[DD]T[hh]:[mm]:[ss].[sss]Z&lt;/code&gt; &lt;br/&gt;&lt;b&gt;Example:&lt;/b&gt; &lt;code&gt;2022-03-20T00:00:00.000Z&lt;/code&gt;
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
}
