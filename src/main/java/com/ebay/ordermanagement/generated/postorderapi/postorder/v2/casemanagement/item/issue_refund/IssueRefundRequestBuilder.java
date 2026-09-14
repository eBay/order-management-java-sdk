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

package com.ebay.ordermanagement.generated.postorderapi.postorder.v2.casemanagement.item.issue_refund;

import com.ebay.ordermanagement.generated.postorderapi.models.CaseVoluntaryRefundRequest;
import com.ebay.ordermanagement.generated.postorderapi.models.Error;
import com.ebay.ordermanagement.generated.postorderapi.models.VoluntaryRefundResponse;
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
 * Builds and executes requests for operations under /post-order/v2/casemanagement/{caseId}/issue_refund
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IssueRefundRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link IssueRefundRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IssueRefundRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}/issue_refund", pathParameters);
    }
    /**
     * Instantiates a new {@link IssueRefundRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public IssueRefundRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/post-order/v2/casemanagement/{caseId}/issue_refund", rawUrl);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to issue a full refund to the buyer to resolve an INR or Return case that was filed against the seller. The seller can voluntarily use this method before eBay customer support makes a decision on the case, or after, when and if eBay customer supports rules in favor of the buyer and forces the seller to issue a refund to the buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;&lt;/p&gt;
     * @param body This type is used if the seller would like to provide a comment when voluntarily issuing a refund through the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund&lt;/b&gt; request.
     * @return a {@link VoluntaryRefundResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VoluntaryRefundResponse post(@jakarta.annotation.Nonnull final CaseVoluntaryRefundRequest body) {
        return post(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to issue a full refund to the buyer to resolve an INR or Return case that was filed against the seller. The seller can voluntarily use this method before eBay customer support makes a decision on the case, or after, when and if eBay customer supports rules in favor of the buyer and forces the seller to issue a refund to the buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;&lt;/p&gt;
     * @param body This type is used if the seller would like to provide a comment when voluntarily issuing a refund through the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link VoluntaryRefundResponse}
     * @throws Error When receiving a 500 status code
     */
    @jakarta.annotation.Nullable
    public VoluntaryRefundResponse post(@jakarta.annotation.Nonnull final CaseVoluntaryRefundRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", Error::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VoluntaryRefundResponse::createFromDiscriminatorValue);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to issue a full refund to the buyer to resolve an INR or Return case that was filed against the seller. The seller can voluntarily use this method before eBay customer support makes a decision on the case, or after, when and if eBay customer supports rules in favor of the buyer and forces the seller to issue a refund to the buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;&lt;/p&gt;
     * @param body This type is used if the seller would like to provide a comment when voluntarily issuing a refund through the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund&lt;/b&gt; request.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CaseVoluntaryRefundRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * &lt;span class=&quot;tablenote&quot;&gt;&lt;span style=&quot;color:#004680&quot;&gt;&lt;strong&gt;Note: &lt;/strong&gt;This call has been deprecated and will be decommissioned on March 2, 2026. &lt;/span&gt;&lt;p&gt;This method can be used on behalf of sellers to issue a full refund to the buyer to resolve an INR or Return case that was filed against the seller. The seller can voluntarily use this method before eBay customer support makes a decision on the case, or after, when and if eBay customer supports rules in favor of the buyer and forces the seller to issue a refund to the buyer.&lt;span class=&quot;tablenote&quot;&gt;&lt;b&gt;Important!&lt;/b&gt; Due to EU &amp;amp; UK Payments regulatory requirements, an additional security verification via Digital Signatures is required for certain API calls that are made on behalf of EU/UK sellers, including this method. Please refer to &lt;a href=&quot;/develop/guides/digital-signatures-for-apis&quot; target=&quot;_blank&quot;&gt;Digital Signatures for APIs&lt;/a&gt; to learn more on the impacted APIs and the process to create signature to be included in the HTTP payload. &lt;/span&gt;&lt;/p&gt;
     * @param body This type is used if the seller would like to provide a comment when voluntarily issuing a refund through the &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund&lt;/b&gt; request.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CaseVoluntaryRefundRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a {@link IssueRefundRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public IssueRefundRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new IssueRefundRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
