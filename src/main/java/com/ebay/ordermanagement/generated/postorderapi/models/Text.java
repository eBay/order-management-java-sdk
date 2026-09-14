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
 * This type is used by all containers that consist of text that is input by the buyer or seller.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Text implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field displays the actual textual content in the language specified in the &lt;b&gt;language&lt;/b&gt; field. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.
     */
    private String content;
    /**
     * This two-letter code indicates the language used to display the content in the &lt;b&gt;content&lt;/b&gt; field. The language will default to the language used on the eBay site if a specific language is not specified through the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP header. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     */
    private String language;
    /**
     * If language translation/localization is required, this field displays the actual textual content in the language specified in the &lt;b&gt;translatedFromLanguage&lt;/b&gt; field. If language translation was not required, this field is not applicable. 
     */
    private String translatedFromContent;
    /**
     * If language translation/localization is required, this two-letter code indicates the language used to display the content in the &lt;b&gt;translatedFromContent&lt;/b&gt; field. If language translation was not required, this field is not applicable. &lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     */
    private String translatedFromLanguage;
    /**
     * Instantiates a new {@link Text} and sets the default values.
     */
    public Text() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Text}
     */
    @jakarta.annotation.Nonnull
    public static Text createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Text();
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
     * Gets the content property value. This field displays the actual textual content in the language specified in the &lt;b&gt;language&lt;/b&gt; field. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("translatedFromContent", (n) -> { this.setTranslatedFromContent(n.getStringValue()); });
        deserializerMap.put("translatedFromLanguage", (n) -> { this.setTranslatedFromLanguage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. This two-letter code indicates the language used to display the content in the &lt;b&gt;content&lt;/b&gt; field. The language will default to the language used on the eBay site if a specific language is not specified through the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP header. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.language;
    }
    /**
     * Gets the translatedFromContent property value. If language translation/localization is required, this field displays the actual textual content in the language specified in the &lt;b&gt;translatedFromLanguage&lt;/b&gt; field. If language translation was not required, this field is not applicable. 
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTranslatedFromContent() {
        return this.translatedFromContent;
    }
    /**
     * Gets the translatedFromLanguage property value. If language translation/localization is required, this two-letter code indicates the language used to display the content in the &lt;b&gt;translatedFromContent&lt;/b&gt; field. If language translation was not required, this field is not applicable. &lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTranslatedFromLanguage() {
        return this.translatedFromLanguage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeStringValue("translatedFromContent", this.getTranslatedFromContent());
        writer.writeStringValue("translatedFromLanguage", this.getTranslatedFromLanguage());
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
     * Sets the content property value. This field displays the actual textual content in the language specified in the &lt;b&gt;language&lt;/b&gt; field. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the language property value. This two-letter code indicates the language used to display the content in the &lt;b&gt;content&lt;/b&gt; field. The language will default to the language used on the eBay site if a specific language is not specified through the &lt;b&gt;Accept-Language&lt;/b&gt; HTTP header. This field is always used for containers using the &lt;b&gt;Text&lt;/b&gt; type.&lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.language = value;
    }
    /**
     * Sets the translatedFromContent property value. If language translation/localization is required, this field displays the actual textual content in the language specified in the &lt;b&gt;translatedFromLanguage&lt;/b&gt; field. If language translation was not required, this field is not applicable. 
     * @param value Value to set for the translatedFromContent property.
     */
    public void setTranslatedFromContent(@jakarta.annotation.Nullable final String value) {
        this.translatedFromContent = value;
    }
    /**
     * Sets the translatedFromLanguage property value. If language translation/localization is required, this two-letter code indicates the language used to display the content in the &lt;b&gt;translatedFromContent&lt;/b&gt; field. If language translation was not required, this field is not applicable. &lt;br/&gt;&lt;br/&gt;The full list of language enumeration values are defined in the &lt;a href=&quot;/devzone/post-order/types/LanguageEnum.html&quot;&gt;LanguageEnum&lt;/a&gt; type definition.
     * @param value Value to set for the translatedFromLanguage property.
     */
    public void setTranslatedFromLanguage(@jakarta.annotation.Nullable final String value) {
        this.translatedFromLanguage = value;
    }
}
