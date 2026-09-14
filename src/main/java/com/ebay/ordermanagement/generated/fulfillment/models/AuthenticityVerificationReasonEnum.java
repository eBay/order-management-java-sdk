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
 * This field indicates the result of the authenticity verification inspection on an order line item. This field is not returned when the status value of the order line item is &lt;code&gt;PENDING&lt;/code&gt; or &lt;code&gt;PASSED&lt;/code&gt;. The possible values returned here are &lt;code&gt;NOT_AUTHENTIC&lt;/code&gt;, &lt;code&gt;NOT_AS_DESCRIBED&lt;/code&gt;, &lt;code&gt;CUSTOMIZED&lt;/code&gt;, &lt;code&gt;MISCATEGORIZED&lt;/code&gt;, or &lt;code&gt;NOT_AUTHENTIC_NO_RETURN&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticityVerificationReasonEnum implements ValuedEnum {
    NOT_AUTHENTIC("NOT_AUTHENTIC"),
    NOT_AS_DESCRIBED("NOT_AS_DESCRIBED"),
    CUSTOMIZED("CUSTOMIZED"),
    MISCATEGORIZED("MISCATEGORIZED"),
    NOT_AUTHENTIC_NO_RETURN("NOT_AUTHENTIC_NO_RETURN");
    public final String value;
    AuthenticityVerificationReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticityVerificationReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "NOT_AUTHENTIC": return NOT_AUTHENTIC;
            case "NOT_AS_DESCRIBED": return NOT_AS_DESCRIBED;
            case "CUSTOMIZED": return CUSTOMIZED;
            case "MISCATEGORIZED": return MISCATEGORIZED;
            case "NOT_AUTHENTIC_NO_RETURN": return NOT_AUTHENTIC_NO_RETURN;
            default: return null;
        }
    }
}
