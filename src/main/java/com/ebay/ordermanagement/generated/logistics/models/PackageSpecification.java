package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type specifies the dimensions and weight of a package.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PackageSpecification implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * This complex type defines the dimensions of a package to be shipped.
     */
    private Dimensions dimensions;
    /**
     * This complex type contains information about the weight of an object such as a shipping package.
     */
    private Weight weight;
    /**
     * Instantiates a new {@link PackageSpecification} and sets the default values.
     */
    public PackageSpecification() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PackageSpecification}
     */
    @jakarta.annotation.Nonnull
    public static PackageSpecification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PackageSpecification();
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
     * Gets the dimensions property value. This complex type defines the dimensions of a package to be shipped.
     * @return a {@link Dimensions}
     */
    @jakarta.annotation.Nullable
    public Dimensions getDimensions() {
        return this.dimensions;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getObjectValue(Dimensions::createFromDiscriminatorValue)); });
        deserializerMap.put("weight", (n) -> { this.setWeight(n.getObjectValue(Weight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the weight property value. This complex type contains information about the weight of an object such as a shipping package.
     * @return a {@link Weight}
     */
    @jakarta.annotation.Nullable
    public Weight getWeight() {
        return this.weight;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("dimensions", this.getDimensions());
        writer.writeObjectValue("weight", this.getWeight());
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
     * Sets the dimensions property value. This complex type defines the dimensions of a package to be shipped.
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final Dimensions value) {
        this.dimensions = value;
    }
    /**
     * Sets the weight property value. This complex type contains information about the weight of an object such as a shipping package.
     * @param value Value to set for the weight property.
     */
    public void setWeight(@jakarta.annotation.Nullable final Weight value) {
        this.weight = value;
    }
}
