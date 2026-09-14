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
 * This enumerated type lists the actions that may be specified in the &lt;b&gt;labelAction&lt;/b&gt; field in the request of the &lt;b&gt;POST /post-order/v2/return/{returnId}/add_shipping_label&lt;/b&gt; method.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LabelActionEnum implements ValuedEnum {
    NO_LABEL("NO_LABEL"),
    UPLOAD_LABEL("UPLOAD_LABEL"),
    MARK_AS_SENT("MARK_AS_SENT"),
    EBAY_LABEL("EBAY_LABEL"),
    PURCHASE_LABEL("PURCHASE_LABEL"),
    AU_LABEL("AU_LABEL"),
    UNKNOWN("UNKNOWN");
    public final String value;
    LabelActionEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LabelActionEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NO_LABEL": return NO_LABEL;
            case "UPLOAD_LABEL": return UPLOAD_LABEL;
            case "MARK_AS_SENT": return MARK_AS_SENT;
            case "EBAY_LABEL": return EBAY_LABEL;
            case "PURCHASE_LABEL": return PURCHASE_LABEL;
            case "AU_LABEL": return AU_LABEL;
            case "UNKNOWN": return UNKNOWN;
            default: return null;
        }
    }
}
