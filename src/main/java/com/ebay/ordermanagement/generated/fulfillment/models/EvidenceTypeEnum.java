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
 * This enumeration value shows the type of evidential file provided.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EvidenceTypeEnum implements ValuedEnum {
    PROOF_OF_DELIVERY("PROOF_OF_DELIVERY"),
    PROOF_OF_AUTHENTICITY("PROOF_OF_AUTHENTICITY"),
    PROOF_OF_ITEM_AS_DESCRIBED("PROOF_OF_ITEM_AS_DESCRIBED"),
    PROOF_OF_CREDIT_NOT_DUE("PROOF_OF_CREDIT_NOT_DUE"),
    PROOF_OF_RETURN_NOT_RECEIVED("PROOF_OF_RETURN_NOT_RECEIVED"),
    PROOF_OF_DELIVERY_AS_FILE("PROOF_OF_DELIVERY_AS_FILE"),
    PROOF_OF_DELIVERY_SIGNATURE("PROOF_OF_DELIVERY_SIGNATURE"),
    PROOF_OF_PICKUP("PROOF_OF_PICKUP"),
    OPTIONAL_SUPPORTING_DOCUMENTS("OPTIONAL_SUPPORTING_DOCUMENTS");
    public final String value;
    EvidenceTypeEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EvidenceTypeEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "PROOF_OF_DELIVERY": return PROOF_OF_DELIVERY;
            case "PROOF_OF_AUTHENTICITY": return PROOF_OF_AUTHENTICITY;
            case "PROOF_OF_ITEM_AS_DESCRIBED": return PROOF_OF_ITEM_AS_DESCRIBED;
            case "PROOF_OF_CREDIT_NOT_DUE": return PROOF_OF_CREDIT_NOT_DUE;
            case "PROOF_OF_RETURN_NOT_RECEIVED": return PROOF_OF_RETURN_NOT_RECEIVED;
            case "PROOF_OF_DELIVERY_AS_FILE": return PROOF_OF_DELIVERY_AS_FILE;
            case "PROOF_OF_DELIVERY_SIGNATURE": return PROOF_OF_DELIVERY_SIGNATURE;
            case "PROOF_OF_PICKUP": return PROOF_OF_PICKUP;
            case "OPTIONAL_SUPPORTING_DOCUMENTS": return OPTIONAL_SUPPORTING_DOCUMENTS;
            default: return null;
        }
    }
}
