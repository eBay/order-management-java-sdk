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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry;

import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.item.WithInquiryItemRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.search.SearchRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/inquiry
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InquiryRequestBuilder extends BaseRequestBuilder {
    /**
     * The EmptyPathSegment property
     * @return a {@link EmptyPathSegmentRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public EmptyPathSegmentRequestBuilder emptyPathSegment() {
        return new EmptyPathSegmentRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.postorderapi.postOrder.v2.inquiry.item collection
     * @param inquiryId The unique ID of the inquiry for which details and history are to be retrieved. The inquiry ID value is passed in as part of the call URI.
     * @return a {@link WithInquiryItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithInquiryItemRequestBuilder byInquiryId(@jakarta.annotation.Nonnull final String inquiryId) {
        Objects.requireNonNull(inquiryId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("inquiryId", inquiryId);
        return new WithInquiryItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link InquiryRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InquiryRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry", pathParameters);
    }
    /**
     * Instantiates a new {@link InquiryRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public InquiryRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/inquiry", rawUrl);
    }
}
