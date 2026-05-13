package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This type is used by the base response of the &lt;strong&gt;getActivities&lt;/strong&gt; method, and includes a log of all activities of a payment dispute, from creation to resolution.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PaymentDisputeActivityHistory implements AdditionalDataHolder, Parsable {
    /**
     * This array holds all activities of a payment dispute, from creation to resolution. For each activity, the activity type, the actor, and a timestamp is shown. The &lt;strong&gt;getActivities&lt;/strong&gt; response is dynamic, and grows with each recorded activity.
     */
    private java.util.List<PaymentDisputeActivity> activity;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Instantiates a new {@link PaymentDisputeActivityHistory} and sets the default values.
     */
    public PaymentDisputeActivityHistory() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PaymentDisputeActivityHistory}
     */
    @jakarta.annotation.Nonnull
    public static PaymentDisputeActivityHistory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PaymentDisputeActivityHistory();
    }
    /**
     * Gets the activity property value. This array holds all activities of a payment dispute, from creation to resolution. For each activity, the activity type, the actor, and a timestamp is shown. The &lt;strong&gt;getActivities&lt;/strong&gt; response is dynamic, and grows with each recorded activity.
     * @return a {@link java.util.List<PaymentDisputeActivity>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PaymentDisputeActivity> getActivity() {
        return this.activity;
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
        deserializerMap.put("activity", (n) -> { this.setActivity(n.getCollectionOfObjectValues(PaymentDisputeActivity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("activity", this.getActivity());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the activity property value. This array holds all activities of a payment dispute, from creation to resolution. For each activity, the activity type, the actor, and a timestamp is shown. The &lt;strong&gt;getActivities&lt;/strong&gt; response is dynamic, and grows with each recorded activity.
     * @param value Value to set for the activity property.
     */
    public void setActivity(@jakarta.annotation.Nullable final java.util.List<PaymentDisputeActivity> value) {
        this.activity = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
}
