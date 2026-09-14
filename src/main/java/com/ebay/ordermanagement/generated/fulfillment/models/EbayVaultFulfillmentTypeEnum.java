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
 * This field specifies how an eBay vault order will be fulfilled. Supported options are:&lt;ul&gt;&lt;li&gt;&lt;strong&gt;Seller to Vault&lt;/strong&gt;: The order will be shipped by the seller to an authenticator.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;Vault to Vault&lt;/strong&gt;: The order will be shipped from an eBay vault to the buyer&apos;s vault.&lt;/li&gt;&lt;li&gt;&lt;strong&gt;Vault to Buyer&lt;/strong&gt;: The order will be shipped from an eBay vault to the buyer&apos;s shipping address.&lt;/li&gt;&lt;/ul&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EbayVaultFulfillmentTypeEnum implements ValuedEnum {
    SELLER_TO_VAULT("SELLER_TO_VAULT"),
    VAULT_TO_VAULT("VAULT_TO_VAULT"),
    VAULT_TO_BUYER("VAULT_TO_BUYER");
    public final String value;
    EbayVaultFulfillmentTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EbayVaultFulfillmentTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "SELLER_TO_VAULT": return SELLER_TO_VAULT;
            case "VAULT_TO_VAULT": return VAULT_TO_VAULT;
            case "VAULT_TO_BUYER": return VAULT_TO_BUYER;
            default: return null;
        }
    }
}
