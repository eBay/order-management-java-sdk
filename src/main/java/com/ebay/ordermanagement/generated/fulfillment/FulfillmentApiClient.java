package com.ebay.ordermanagement.generated.fulfillment;

import com.ebay.ordermanagement.generated.fulfillment.order.OrderRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute_summary.PaymentDisputeSummaryRequestBuilder;
import com.ebay.ordermanagement.generated.fulfillment.payment_dispute.PaymentDisputeRequestBuilder;
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
public class FulfillmentApiClient extends BaseRequestBuilder {
    /**
     * The order property
     * @return a {@link OrderRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public OrderRequestBuilder order() {
        return new OrderRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payment_dispute property
     * @return a {@link PaymentDisputeRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentDisputeRequestBuilder paymentDispute() {
        return new PaymentDisputeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The payment_dispute_summary property
     * @return a {@link PaymentDisputeSummaryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public PaymentDisputeSummaryRequestBuilder paymentDisputeSummary() {
        return new PaymentDisputeSummaryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link FulfillmentApiClient} and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FulfillmentApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
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
