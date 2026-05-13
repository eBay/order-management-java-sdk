package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used to store the unique identifier of an evidence file. Evidence files are used by seller to contest a payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileEvidence implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This field is used to identify the evidence file to be uploaded to the evidence set.&lt;br&gt;&lt;br&gt; This file is created with the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/uploadEvidenceFile&quot; target=&quot;_blank &quot;&gt;uploadEvidenceFile&lt;/a&gt; method and can be retrieved using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDisputes&quot; target=&quot;_blank &quot;&gt;getPaymentDisputes&lt;/a&gt; method.
     */
    private String fileId;
    /**
     * Instantiates a new {@link FileEvidence} and sets the default values.
     */
    public FileEvidence() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link FileEvidence}
     */
    @jakarta.annotation.Nonnull
    public static FileEvidence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEvidence();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("fileId", (n) -> { this.setFileId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileId property value. This field is used to identify the evidence file to be uploaded to the evidence set.&lt;br&gt;&lt;br&gt; This file is created with the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/uploadEvidenceFile&quot; target=&quot;_blank &quot;&gt;uploadEvidenceFile&lt;/a&gt; method and can be retrieved using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDisputes&quot; target=&quot;_blank &quot;&gt;getPaymentDisputes&lt;/a&gt; method.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.fileId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("fileId", this.getFileId());
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
     * Sets the fileId property value. This field is used to identify the evidence file to be uploaded to the evidence set.&lt;br&gt;&lt;br&gt; This file is created with the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/uploadEvidenceFile&quot; target=&quot;_blank &quot;&gt;uploadEvidenceFile&lt;/a&gt; method and can be retrieved using the &lt;a href=&quot;/api-docs/sell/fulfillment/resources/payment_dispute/methods/getPaymentDisputes&quot; target=&quot;_blank &quot;&gt;getPaymentDisputes&lt;/a&gt; method.
     * @param value Value to set for the fileId property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
}
