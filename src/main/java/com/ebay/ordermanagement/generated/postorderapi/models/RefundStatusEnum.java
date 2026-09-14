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

package com.ebay.ordermanagement.generated.postorderapi.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enumeration type contains the possible outcomes of a refund action initiated through the &lt;b&gt;POST /post-order/v2/inquiry/{inquiryId}/issue_refund&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/casemanagement/{caseId}/issue_refund &lt;/b&gt; methods.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RefundStatusEnum implements ValuedEnum {
    PENDING("PENDING"),
    SUCCESS("SUCCESS"),
    FAILED("FAILED"),
    OTHER("OTHER");
    public final String value;
    RefundStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RefundStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING": return PENDING;
            case "SUCCESS": return SUCCESS;
            case "FAILED": return FAILED;
            case "OTHER": return OTHER;
            default: return null;
        }
    }
}
