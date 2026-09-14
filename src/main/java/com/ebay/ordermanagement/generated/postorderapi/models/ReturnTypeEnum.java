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
 * This enumerated type lists the possible values that the buyer can pass in the &lt;b&gt;type&lt;/b&gt; field when the buyer is creating a return request or draft with the &lt;b&gt;POST /post-order/v2/return&lt;/b&gt; or &lt;b&gt;POST /post-order/v2/return/draft&lt;/b&gt; methods. &lt;p class=&quot;tablenote&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Currently, &lt;code&gt;MONEY_BACK&lt;/code&gt; is the only supported value.&lt;/p&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ReturnTypeEnum implements ValuedEnum {
    MONEY_BACK("MONEY_BACK"),
    REPLACEMENT("REPLACEMENT"),
    EXCHANGE("EXCHANGE"),
    UNKNOWN("UNKNOWN");
    public final String value;
    ReturnTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReturnTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "MONEY_BACK": return MONEY_BACK;
            case "REPLACEMENT": return REPLACEMENT;
            case "EXCHANGE": return EXCHANGE;
            case "UNKNOWN": return UNKNOWN;
            default: return null;
        }
    }
}
