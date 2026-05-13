package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type contains information about a shipping option that can be purchased in addition to the base shipping cost of a recommended rate. Additional options for each rate are defined, named, and offered by the selected shipping carrier. Examples include shipping insurance or the requirement for a recipient signature.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AdditionalOption implements AdditionalDataHolder, Parsable {
    /**
     * A complex type that describes the value of a monetary amount as represented by a global currency.
     */
    private Amount additionalCost;
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The name of a shipping option that can be purchased in addition to the base shipping cost of this rate. The value supplied in this field must match exactly the option name as supplied by the selected rate.
     */
    private String optionType;
    /**
     * Instantiates a new {@link AdditionalOption} and sets the default values.
     */
    public AdditionalOption() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AdditionalOption}
     */
    @jakarta.annotation.Nonnull
    public static AdditionalOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdditionalOption();
    }
    /**
     * Gets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @return a {@link Amount}
     */
    @jakarta.annotation.Nullable
    public Amount getAdditionalCost() {
        return this.additionalCost;
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
        deserializerMap.put("additionalCost", (n) -> { this.setAdditionalCost(n.getObjectValue(Amount::createFromDiscriminatorValue)); });
        deserializerMap.put("optionType", (n) -> { this.setOptionType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the optionType property value. The name of a shipping option that can be purchased in addition to the base shipping cost of this rate. The value supplied in this field must match exactly the option name as supplied by the selected rate.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOptionType() {
        return this.optionType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("additionalCost", this.getAdditionalCost());
        writer.writeStringValue("optionType", this.getOptionType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalCost property value. A complex type that describes the value of a monetary amount as represented by a global currency.
     * @param value Value to set for the additionalCost property.
     */
    public void setAdditionalCost(@jakarta.annotation.Nullable final Amount value) {
        this.additionalCost = value;
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the optionType property value. The name of a shipping option that can be purchased in addition to the base shipping cost of this rate. The value supplied in this field must match exactly the option name as supplied by the selected rate.
     * @param value Value to set for the optionType property.
     */
    public void setOptionType(@jakarta.annotation.Nullable final String value) {
        this.optionType = value;
    }
}
