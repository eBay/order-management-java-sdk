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
 * This is the base request type of the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/escalate&lt;/b&gt; method, which is used to escalate an INR inquiry into a case.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EscalateInquiryRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This type is used by all containers that consist of text that is input by the buyer or seller.
     */
    private Text comments;
    /**
     * This field is used to specify the reason why the buyer or seller is escalating the specified INR inquiry into a case. &lt;br/&gt;&lt;br/&gt;One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition must be used here. Some values are only applicable to the buyer escalating the inquiry, some values are only applicable to the seller escalating the inquiry, and some values are relevant to either party.
     */
    private String escalateInquiryReason;
    /**
     * Instantiates a new {@link EscalateInquiryRequest} and sets the default values.
     */
    public EscalateInquiryRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EscalateInquiryRequest}
     */
    @jakarta.annotation.Nonnull
    public static EscalateInquiryRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EscalateInquiryRequest();
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
     * Gets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @return a {@link Text}
     */
    @jakarta.annotation.Nullable
    public Text getComments() {
        return this.comments;
    }
    /**
     * Gets the escalateInquiryReason property value. This field is used to specify the reason why the buyer or seller is escalating the specified INR inquiry into a case. &lt;br/&gt;&lt;br/&gt;One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition must be used here. Some values are only applicable to the buyer escalating the inquiry, some values are only applicable to the seller escalating the inquiry, and some values are relevant to either party.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEscalateInquiryReason() {
        return this.escalateInquiryReason;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("comments", (n) -> { this.setComments(n.getObjectValue(Text::createFromDiscriminatorValue)); });
        deserializerMap.put("escalateInquiryReason", (n) -> { this.setEscalateInquiryReason(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("comments", this.getComments());
        writer.writeStringValue("escalateInquiryReason", this.getEscalateInquiryReason());
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
     * Sets the comments property value. This type is used by all containers that consist of text that is input by the buyer or seller.
     * @param value Value to set for the comments property.
     */
    public void setComments(@jakarta.annotation.Nullable final Text value) {
        this.comments = value;
    }
    /**
     * Sets the escalateInquiryReason property value. This field is used to specify the reason why the buyer or seller is escalating the specified INR inquiry into a case. &lt;br/&gt;&lt;br/&gt;One of the enumeration values defined in the &lt;a href=&quot;/devzone/post-order/types/InquiryEscalationReasonEnum.html&quot;&gt;InquiryEscalationReasonEnum&lt;/a&gt; type definition must be used here. Some values are only applicable to the buyer escalating the inquiry, some values are only applicable to the seller escalating the inquiry, and some values are relevant to either party.
     * @param value Value to set for the escalateInquiryReason property.
     */
    public void setEscalateInquiryReason(@jakarta.annotation.Nullable final String value) {
        this.escalateInquiryReason = value;
    }
}
