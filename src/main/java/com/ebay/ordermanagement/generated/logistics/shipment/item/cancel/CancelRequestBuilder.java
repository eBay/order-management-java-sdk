package com.ebay.ordermanagement.generated.logistics.shipment.item.cancel;

import com.ebay.ordermanagement.generated.logistics.models.Shipment;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /shipment/{shipmentId}/cancel
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CancelRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link CancelRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}/cancel", pathParameters);
    }
    /**
     * Instantiates a new {@link CancelRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CancelRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/shipment/{shipmentId}/cancel", rawUrl);
    }
    /**
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&apos;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @return a {@link Shipment}
     */
    @jakarta.annotation.Nullable
    public Shipment post() {
        return post(null);
    }
    /**
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&apos;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link Shipment}
     */
    @jakarta.annotation.Nullable
    public Shipment post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Shipment::createFromDiscriminatorValue);
    }
    /**
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&apos;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method cancels the shipment associated with the specified shipment ID and the associated shipping label is deleted. When you cancel a shipment, the &lt;b&gt;totalShippingCost&lt;/b&gt; of the canceled shipment is refunded to the account established by the user&apos;s billing agreement.  &lt;br&gt;&lt;br&gt;Note that you cannot cancel a shipment if you have used the associated shipping label.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link CancelRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new CancelRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
