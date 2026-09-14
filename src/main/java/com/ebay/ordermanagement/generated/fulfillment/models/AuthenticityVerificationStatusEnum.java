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
 * The value in this field indicates whether the order line item has passed or failed the authenticity verification inspection, or if the inspection and/or results are still pending. The possible values returned here are &lt;code&gt;PENDING&lt;/code&gt;, &lt;code&gt;PASSED&lt;/code&gt;, &lt;code&gt;FAILED&lt;/code&gt;, or &lt;code&gt;PASSED_WITH_EXCEPTION&lt;/code&gt;.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticityVerificationStatusEnum implements ValuedEnum {
    PENDING("PENDING"),
    PASSED("PASSED"),
    FAILED("FAILED"),
    PASSED_WITH_EXCEPTION("PASSED_WITH_EXCEPTION");
    public final String value;
    AuthenticityVerificationStatusEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticityVerificationStatusEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PENDING": return PENDING;
            case "PASSED": return PASSED;
            case "FAILED": return FAILED;
            case "PASSED_WITH_EXCEPTION": return PASSED_WITH_EXCEPTION;
            default: return null;
        }
    }
}
