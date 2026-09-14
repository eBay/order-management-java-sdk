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
 * This enumerated type lists the possible values that a seller  can provide in the &lt;b&gt;noLabelReason&lt;/b&gt; field of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; to indicate the reason why a shipping label is not being supplied to the buyer.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum NoSellerUploadLabelReasonEnum implements ValuedEnum {
    ITEM_TOO_LARGE("ITEM_TOO_LARGE"),
    RETURN_TO_INTL_LOCATION("RETURN_TO_INTL_LOCATION"),
    OTHER("OTHER"),
    REIMBURSE("REIMBURSE"),
    WORK_WITH_BUYER("WORK_WITH_BUYER"),
    RETURN_TO_STORE("RETURN_TO_STORE");
    public final String value;
    NoSellerUploadLabelReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NoSellerUploadLabelReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ITEM_TOO_LARGE": return ITEM_TOO_LARGE;
            case "RETURN_TO_INTL_LOCATION": return RETURN_TO_INTL_LOCATION;
            case "OTHER": return OTHER;
            case "REIMBURSE": return REIMBURSE;
            case "WORK_WITH_BUYER": return WORK_WITH_BUYER;
            case "RETURN_TO_STORE": return RETURN_TO_STORE;
            default: return null;
        }
    }
}
