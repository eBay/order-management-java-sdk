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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.send_message;

import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.SendMessageRequest;
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
 * Builds and executes requests for operations under /post-order/v2/inquiry/{inquiryId}/send_message
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SendMessageRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link SendMessageRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendMessageRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/send_message", pathParameters);
    }
    /**
     * Instantiates a new {@link SendMessageRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SendMessageRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry/{inquiryId}/send_message", rawUrl);
    }
    /**
     * This method allows a buyer or seller to send a message to their order partner in regards to an INR inquiry.&lt;br&gt;
     * @param body This type is used by the request payload for the Inquiry and Return &apos;send message&apos; methods.
     * @return a {@link SendMessagePostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SendMessagePostResponse post(@jakarta.annotation.Nonnull final SendMessageRequest body) {
        return post(body, null);
    }
    /**
     * This method allows a buyer or seller to send a message to their order partner in regards to an INR inquiry.&lt;br&gt;
     * @param body This type is used by the request payload for the Inquiry and Return &apos;send message&apos; methods.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link SendMessagePostResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public SendMessagePostResponse post(@jakarta.annotation.Nonnull final SendMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SendMessagePostResponse::createFromDiscriminatorValue);
    }
    /**
     * This method allows a buyer or seller to send a message to their order partner in regards to an INR inquiry.&lt;br&gt;
     * @param body This type is used by the request payload for the Inquiry and Return &apos;send message&apos; methods.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendMessageRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This method allows a buyer or seller to send a message to their order partner in regards to an INR inquiry.&lt;br&gt;
     * @param body This type is used by the request payload for the Inquiry and Return &apos;send message&apos; methods.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SendMessageRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link SendMessageRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SendMessageRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SendMessageRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
