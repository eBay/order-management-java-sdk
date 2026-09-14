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
 * The enumeration value in this field gives the reason why the buyer initiated the payment dispute. See &lt;strong&gt;DisputeReasonEnum&lt;/strong&gt; type for a description of the supported reasons that buyers can give for initiating a payment dispute.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DisputeReasonEnum implements ValuedEnum {
    TRANSACTION_ISSUE("TRANSACTION_ISSUE"),
    FRAUD("FRAUD"),
    ITEM_NOT_RECEIVED("ITEM_NOT_RECEIVED"),
    SIGNIFICANTLY_NOT_AS_DESCRIBED("SIGNIFICANTLY_NOT_AS_DESCRIBED"),
    CREDIT_NOT_PROCESSED("CREDIT_NOT_PROCESSED"),
    COUNTERFEIT("COUNTERFEIT"),
    DUPLICATE_AMOUNT("DUPLICATE_AMOUNT"),
    INCORRECT_AMOUNT("INCORRECT_AMOUNT"),
    CANCELLATION("CANCELLATION"),
    RETURN_REFUND_NOT_PROCESSED("RETURN_REFUND_NOT_PROCESSED"),
    AUTHORIZATION_FAILED("AUTHORIZATION_FAILED");
    public final String value;
    DisputeReasonEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DisputeReasonEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "TRANSACTION_ISSUE": return TRANSACTION_ISSUE;
            case "FRAUD": return FRAUD;
            case "ITEM_NOT_RECEIVED": return ITEM_NOT_RECEIVED;
            case "SIGNIFICANTLY_NOT_AS_DESCRIBED": return SIGNIFICANTLY_NOT_AS_DESCRIBED;
            case "CREDIT_NOT_PROCESSED": return CREDIT_NOT_PROCESSED;
            case "COUNTERFEIT": return COUNTERFEIT;
            case "DUPLICATE_AMOUNT": return DUPLICATE_AMOUNT;
            case "INCORRECT_AMOUNT": return INCORRECT_AMOUNT;
            case "CANCELLATION": return CANCELLATION;
            case "RETURN_REFUND_NOT_PROCESSED": return RETURN_REFUND_NOT_PROCESSED;
            case "AUTHORIZATION_FAILED": return AUTHORIZATION_FAILED;
            default: return null;
        }
    }
}
