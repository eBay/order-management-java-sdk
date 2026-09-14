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
 * This field indicates the collection method used to collect the &apos;Collect and Remit&apos; tax for the order. This field is always returned for orders subject to &apos;Collect and Remit&apos; tax, and its value is always &lt;code&gt;NET&lt;/code&gt;.&lt;br&gt;&lt;br&gt;&lt;span class=&quot;tablenote&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Although the &lt;strong&gt;collectionMethod&lt;/strong&gt; field is returned for all orders subject to &apos;Collect and Remit&apos; tax, the &lt;strong&gt;collectionMethod&lt;/strong&gt; field and the &lt;strong&gt;CollectionMethodEnum&lt;/strong&gt; type are not currently of any practical use, although this field may have use in the future. If and when the logic of this field is changed, this note will be updated and a note will also be added to the Release Notes.&lt;/span&gt;
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CollectionMethodEnum implements ValuedEnum {
    INVOICE("INVOICE"),
    NET("NET");
    public final String value;
    CollectionMethodEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CollectionMethodEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "INVOICE": return INVOICE;
            case "NET": return NET;
            default: return null;
        }
    }
}
