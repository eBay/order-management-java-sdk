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

package com.ebay.ordermanagement.generated.fulfillment.payment_dispute.item.upload_evidence_file;

import com.ebay.ordermanagement.generated.fulfillment.models.FileEvidence;
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
 * Builds and executes requests for operations under /payment_dispute/{payment_dispute_id}/upload_evidence_file
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UploadEvidenceFileRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new {@link UploadEvidenceFileRequestBuilder} and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadEvidenceFileRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/upload_evidence_file", pathParameters);
    }
    /**
     * Instantiates a new {@link UploadEvidenceFileRequestBuilder} and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public UploadEvidenceFileRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/payment_dispute/{payment_dispute_id}/upload_evidence_file", rawUrl);
    }
    /**
     * This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;uploadEvidenceFile&lt;/strong&gt; only uploads an encrypted, binary image file (using &lt;strong&gt;multipart/form-data&lt;/strong&gt; HTTP request header), and does not have a JSON-based request payload.&lt;br&gt;&lt;br&gt;Use &apos;file&apos; as the name of the key that you use to upload the image file. The upload will not be successful if a different key name is used.&lt;br&gt;&lt;br&gt;The three image formats supported at this time are &lt;strong&gt;.JPEG&lt;/strong&gt;, &lt;strong&gt;.JPG&lt;/strong&gt;, and &lt;strong&gt;.PNG&lt;/strong&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;After the file is successfully uploaded, the seller will need to grab the &lt;strong&gt;fileId&lt;/strong&gt; value in the response payload to add this file to a new evidence set using the &lt;strong&gt;addEvidence&lt;/strong&gt; method, or to add this file to an existing evidence set using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method.
     * @return a {@link FileEvidence}
     */
    @jakarta.annotation.Nullable
    public FileEvidence post() {
        return post(null);
    }
    /**
     * This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;uploadEvidenceFile&lt;/strong&gt; only uploads an encrypted, binary image file (using &lt;strong&gt;multipart/form-data&lt;/strong&gt; HTTP request header), and does not have a JSON-based request payload.&lt;br&gt;&lt;br&gt;Use &apos;file&apos; as the name of the key that you use to upload the image file. The upload will not be successful if a different key name is used.&lt;br&gt;&lt;br&gt;The three image formats supported at this time are &lt;strong&gt;.JPEG&lt;/strong&gt;, &lt;strong&gt;.JPG&lt;/strong&gt;, and &lt;strong&gt;.PNG&lt;/strong&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;After the file is successfully uploaded, the seller will need to grab the &lt;strong&gt;fileId&lt;/strong&gt; value in the response payload to add this file to a new evidence set using the &lt;strong&gt;addEvidence&lt;/strong&gt; method, or to add this file to an existing evidence set using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a {@link FileEvidence}
     */
    @jakarta.annotation.Nullable
    public FileEvidence post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FileEvidence::createFromDiscriminatorValue);
    }
    /**
     * This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;uploadEvidenceFile&lt;/strong&gt; only uploads an encrypted, binary image file (using &lt;strong&gt;multipart/form-data&lt;/strong&gt; HTTP request header), and does not have a JSON-based request payload.&lt;br&gt;&lt;br&gt;Use &apos;file&apos; as the name of the key that you use to upload the image file. The upload will not be successful if a different key name is used.&lt;br&gt;&lt;br&gt;The three image formats supported at this time are &lt;strong&gt;.JPEG&lt;/strong&gt;, &lt;strong&gt;.JPG&lt;/strong&gt;, and &lt;strong&gt;.PNG&lt;/strong&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;After the file is successfully uploaded, the seller will need to grab the &lt;strong&gt;fileId&lt;/strong&gt; value in the response payload to add this file to a new evidence set using the &lt;strong&gt;addEvidence&lt;/strong&gt; method, or to add this file to an existing evidence set using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method.
     * @return a {@link RequestInformation}
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the &lt;strong&gt;getPaymentDisputeSummaries&lt;/strong&gt; method.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; The &lt;strong&gt;uploadEvidenceFile&lt;/strong&gt; only uploads an encrypted, binary image file (using &lt;strong&gt;multipart/form-data&lt;/strong&gt; HTTP request header), and does not have a JSON-based request payload.&lt;br&gt;&lt;br&gt;Use &apos;file&apos; as the name of the key that you use to upload the image file. The upload will not be successful if a different key name is used.&lt;br&gt;&lt;br&gt;The three image formats supported at this time are &lt;strong&gt;.JPEG&lt;/strong&gt;, &lt;strong&gt;.JPG&lt;/strong&gt;, and &lt;strong&gt;.PNG&lt;/strong&gt;.&lt;/span&gt;&lt;br&gt;&lt;br&gt;After the file is successfully uploaded, the seller will need to grab the &lt;strong&gt;fileId&lt;/strong&gt; value in the response payload to add this file to a new evidence set using the &lt;strong&gt;addEvidence&lt;/strong&gt; method, or to add this file to an existing evidence set using the &lt;strong&gt;updateEvidence&lt;/strong&gt; method.
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
     * @return a {@link UploadEvidenceFileRequestBuilder}
     */
    @jakarta.annotation.Nonnull
    public UploadEvidenceFileRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new UploadEvidenceFileRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
