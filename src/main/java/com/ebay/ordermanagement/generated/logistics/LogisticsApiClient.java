package com.ebay.ordermanagement.generated.logistics;

import com.ebay.ordermanagement.generated.logistics.shipment.ShipmentRequestBuilder;
import com.ebay.ordermanagement.generated.logistics.shipping_quote.ShippingQuoteRequestBuilder;
import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LogisticsApiClient extends BaseRequestBuilder {
    /**
     * The shipment property
     * @return a {@link ShipmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShipmentRequestBuilder shipment() {
        return new ShipmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The shipping_quote property
     * @return a {@link ShippingQuoteRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ShippingQuoteRequestBuilder shippingQuote() {
        return new ShippingQuoteRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link LogisticsApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LogisticsApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.ebay.com{basePath}");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
