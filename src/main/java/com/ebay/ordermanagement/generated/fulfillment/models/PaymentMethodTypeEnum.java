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
 * The payment method used to pay for the order. See the &lt;strong&gt;PaymentMethodTypeEnum&lt;/strong&gt; type for more information on the payment methods.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Effective September 26, 2025, access to buyer payment details for U.S. users will be limited to select developers. All other developers will receive a value of &quot;CustomCode&quot; in place of buyer payment details. For more information, please refer to &lt;a href=&quot;/api-docs/static/data-handling-update.html&quot; target=&quot;_blank&quot;&gt;Data Handling Compliance&lt;/a&gt;.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PaymentMethodTypeEnum implements ValuedEnum {
    CREDIT_CARD("CREDIT_CARD"),
    PAYPAL("PAYPAL"),
    CASHIER_CHECK("CASHIER_CHECK"),
    PERSONAL_CHECK("PERSONAL_CHECK"),
    CASH_ON_PICKUP("CASH_ON_PICKUP"),
    EFT("EFT"),
    EBAY("EBAY"),
    ESCROW("ESCROW");
    public final String value;
    PaymentMethodTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PaymentMethodTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "CREDIT_CARD": return CREDIT_CARD;
            case "PAYPAL": return PAYPAL;
            case "CASHIER_CHECK": return CASHIER_CHECK;
            case "PERSONAL_CHECK": return PERSONAL_CHECK;
            case "CASH_ON_PICKUP": return CASH_ON_PICKUP;
            case "EFT": return EFT;
            case "EBAY": return EBAY;
            case "ESCROW": return ESCROW;
            default: return null;
        }
    }
}
