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

package com.ebay.ordermanagement.generated.fulfillment.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This field shows the type of buyer charge. &lt;br&gt; &lt;br&gt; &lt;span class=&quot;tablenote&quot;&gt; &lt;strong&gt; Note: &lt;/strong&gt; Currently, the only supported charge type is &lt;code&gt;BUYER_PROTECTION&lt;/code&gt;. &lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChargeTypeEnum implements ValuedEnum {
    BUYER_PROTECTION("BUYER_PROTECTION");
    public final String value;
    ChargeTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChargeTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "BUYER_PROTECTION": return BUYER_PROTECTION;
            default: return null;
        }
    }
}
