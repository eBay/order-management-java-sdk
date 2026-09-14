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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item;

import com.ebay.ordermanagement.generated.postorderapi.models.CaseDetailsResponse;
import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.appeal.AppealRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.close.CloseRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.issue_refund.IssueRefundRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.provide_return_address.ProvideReturnAddressRequestBuilder;
import com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.provide_shipment_info.ProvideShipmentInfoRequestBuilder;
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
 * Builds and executes requests for operations under /post-order/v2/casemanagement/{caseId}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithCaseItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The appeal property
     * @return a {@link AppealRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public AppealRequestBuilder appeal() {
        return new AppealRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The close property
     * @return a {@link CloseRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public CloseRequestBuilder close() {
        return new CloseRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The issue_refund property
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder issueRefund() {
        return new IssueRefundRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The provide_return_address property
     * @return a {@link ProvideReturnAddressRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvideReturnAddressRequestBuilder provideReturnAddress() {
        return new ProvideReturnAddressRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The provide_shipment_info property
     * @return a {@link ProvideShipmentInfoRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public ProvideShipmentInfoRequestBuilder provideShipmentInfo() {
        return new ProvideShipmentInfoRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new {@link WithCaseItemRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCaseItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}", pathParameters);
    }
    /**
     * Instantiates a new {@link WithCaseItemRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithCaseItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}", rawUrl);
    }
    /**
     * This method can be used on behalf of buyers and sellers to retrieve detailed information on a case, including case history and (if applicable) refund information, appeal information, and shipment tracking information. &lt;br/&gt;&lt;br/&gt;The case is identified by the &lt;code&gt;caseId&lt;/code&gt; value that is passed in as part of the call URI. You must be involved in the case in order to retrieve the case details.&lt;br&gt;
     * @return a {@link CaseDetailsResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CaseDetailsResponse get() {
        return get(null);
    }
    /**
     * This method can be used on behalf of buyers and sellers to retrieve detailed information on a case, including case history and (if applicable) refund information, appeal information, and shipment tracking information. &lt;br/&gt;&lt;br/&gt;The case is identified by the &lt;code&gt;caseId&lt;/code&gt; value that is passed in as part of the call URI. You must be involved in the case in order to retrieve the case details.&lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link CaseDetailsResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public CaseDetailsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, CaseDetailsResponse::createFromDiscriminatorValue);
    }
    /**
     * This method can be used on behalf of buyers and sellers to retrieve detailed information on a case, including case history and (if applicable) refund information, appeal information, and shipment tracking information. &lt;br/&gt;&lt;br/&gt;The case is identified by the &lt;code&gt;caseId&lt;/code&gt; value that is passed in as part of the call URI. You must be involved in the case in order to retrieve the case details.&lt;br&gt;
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * This method can be used on behalf of buyers and sellers to retrieve detailed information on a case, including case history and (if applicable) refund information, appeal information, and shipment tracking information. &lt;br/&gt;&lt;br/&gt;The case is identified by the &lt;code&gt;caseId&lt;/code&gt; value that is passed in as part of the call URI. You must be involved in the case in order to retrieve the case details.&lt;br&gt;
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a {@link WithCaseItemRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public WithCaseItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithCaseItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
