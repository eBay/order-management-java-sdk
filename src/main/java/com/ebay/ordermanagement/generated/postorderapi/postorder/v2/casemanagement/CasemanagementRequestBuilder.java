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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement;

import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.WithCaseItemRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.search.SearchRequestBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /post-order/v2/casemanagement
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CasemanagementRequestBuilder extends BaseRequestBuilder {
    /**
     * The search property
     * @return a {@link SearchRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public SearchRequestBuilder search() {
        return new SearchRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Gets an item from the com.ebay.ordermanagement.generated.postorderapi.postOrder.v2.casemanagement.item collection
     * @param caseId The unique identifier of a case. This URI parameter is required in order to identify the case to retrieve. The case ID value is passed in as part of the call URI. The buyer or seller must be involved in the case in order to retrieve details on the specified case.
     * @return a {@link WithCaseItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCaseItemRequestBuilder byCaseId(@jakarta.annotation.Nonnull final String caseId) {
        Objects.requireNonNull(caseId);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("caseId", caseId);
        return new WithCaseItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new {@link CasemanagementRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CasemanagementRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement", pathParameters);
    }
    /**
     * Instantiates a new {@link CasemanagementRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public CasemanagementRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement", rawUrl);
    }
}
