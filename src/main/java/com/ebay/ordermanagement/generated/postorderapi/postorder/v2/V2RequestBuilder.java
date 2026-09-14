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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2;

import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.cancellation.CancellationRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.CasemanagementRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.inquiry.InquiryRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.returnescaped.ReturnRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class V2RequestBuilder extends BaseRequestBuilder {
    /**
     * The cancellation property
     * @return a {@link CancellationRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CancellationRequestBuilder cancellation() {
        return new CancellationRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The casemanagement property
     * @return a {@link CasemanagementRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CasemanagementRequestBuilder casemanagement() {
        return new CasemanagementRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The inquiry property
     * @return a {@link InquiryRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public InquiryRequestBuilder inquiry() {
        return new InquiryRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The return property
     * @return a {@link ReturnRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ReturnRequestBuilder returnEscaped() {
        return new ReturnRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link V2RequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V2RequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2", pathParameters);
    }
    /**
     * Instantiates a new {@link V2RequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public V2RequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2", rawUrl);
    }
}
