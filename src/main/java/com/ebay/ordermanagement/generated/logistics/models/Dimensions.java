package com.ebay.ordermanagement.generated.logistics.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This complex type defines the dimensions of a package to be shipped.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dimensions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The numeric value of the height of the package.
     */
    private String height;
    /**
     * The numeric value of the length of the package.
     */
    private String length;
    /**
     * The unit of measure used to express the height, length, and width of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:LengthUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     */
    private String unit;
    /**
     * The numeric value of the width of the package.
     */
    private String width;
    /**
     * Instantiates a new {@link Dimensions} and sets the default values.
     */
    public Dimensions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dimensions}
     */
    @jakarta.annotation.Nonnull
    public static Dimensions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dimensions();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("height", (n) -> { this.setHeight(n.getStringValue()); });
        deserializerMap.put("length", (n) -> { this.setLength(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getStringValue()); });
        deserializerMap.put("width", (n) -> { this.setWidth(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the height property value. The numeric value of the height of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHeight() {
        return this.height;
    }
    /**
     * Gets the length property value. The numeric value of the length of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLength() {
        return this.length;
    }
    /**
     * Gets the unit property value. The unit of measure used to express the height, length, and width of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:LengthUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUnit() {
        return this.unit;
    }
    /**
     * Gets the width property value. The numeric value of the width of the package.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWidth() {
        return this.width;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("height", this.getHeight());
        writer.writeStringValue("length", this.getLength());
        writer.writeStringValue("unit", this.getUnit());
        writer.writeStringValue("width", this.getWidth());
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
     * Sets the height property value. The numeric value of the height of the package.
     * @param value Value to set for the height property.
     */
    public void setHeight(@jakarta.annotation.Nullable final String value) {
        this.height = value;
    }
    /**
     * Sets the length property value. The numeric value of the length of the package.
     * @param value Value to set for the length property.
     */
    public void setLength(@jakarta.annotation.Nullable final String value) {
        this.length = value;
    }
    /**
     * Sets the unit property value. The unit of measure used to express the height, length, and width of the package. For implementation help, refer to &lt;a href=&apos;https://developer.ebay.com/api-docs/sell/logistics/types/api:LengthUnitOfMeasureEnum&apos;&gt;eBay API documentation&lt;/a&gt;
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final String value) {
        this.unit = value;
    }
    /**
     * Sets the width property value. The numeric value of the width of the package.
     * @param value Value to set for the width property.
     */
    public void setWidth(@jakarta.annotation.Nullable final String value) {
        this.width = value;
    }
}
