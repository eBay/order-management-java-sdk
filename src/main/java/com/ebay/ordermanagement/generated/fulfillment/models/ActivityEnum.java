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
 * This enumeration value indicates the type of activity that occured on the payment dispute. For example, a value of &lt;code&gt;DISPUTE_OPENED&lt;/code&gt; is returned when a payment disute is first created,  a value indicating the seller&apos;s decision on the dispute, such as &lt;code&gt;SELLER_CONTEST&lt;/code&gt;, is returned when seller makes a decision to accept or contest dispute, and a value of &lt;code&gt;DISPUTE_CLOSED&lt;/code&gt; is returned when a payment disute is resolved. See &lt;strong&gt;ActivityEnum&lt;/strong&gt; for an explanation of each of the values that may be returned here.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ActivityEnum implements ValuedEnum {
    DISPUTE_OPENED("DISPUTE_OPENED"),
    ADDITIONAL_EVIDENCE_REQUEST("ADDITIONAL_EVIDENCE_REQUEST"),
    EVIDENCE_PROVIDED("EVIDENCE_PROVIDED"),
    EVIDENCE_REQUEST_OVERDUE("EVIDENCE_REQUEST_OVERDUE"),
    DEFENCE_EXECUTED("DEFENCE_EXECUTED"),
    DISPUTE_CLOSED("DISPUTE_CLOSED"),
    SELLER_ACCEPT("SELLER_ACCEPT"),
    SELLER_ACCEPT_WITH_RETURN("SELLER_ACCEPT_WITH_RETURN"),
    SELLER_CONTEST("SELLER_CONTEST"),
    DISPUTE_UPDATED("DISPUTE_UPDATED"),
    SELLER_RESPONSE_OVERDUE("SELLER_RESPONSE_OVERDUE"),
    DISPUTE_REOPENED("DISPUTE_REOPENED"),
    DISPUTE_REVERSED("DISPUTE_REVERSED"),
    APPEAL_DENIED("APPEAL_DENIED"),
    APPEAL_GRANTED("APPEAL_GRANTED");
    public final String value;
    ActivityEnum(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActivityEnum forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "DISPUTE_OPENED": return DISPUTE_OPENED;
            case "ADDITIONAL_EVIDENCE_REQUEST": return ADDITIONAL_EVIDENCE_REQUEST;
            case "EVIDENCE_PROVIDED": return EVIDENCE_PROVIDED;
            case "EVIDENCE_REQUEST_OVERDUE": return EVIDENCE_REQUEST_OVERDUE;
            case "DEFENCE_EXECUTED": return DEFENCE_EXECUTED;
            case "DISPUTE_CLOSED": return DISPUTE_CLOSED;
            case "SELLER_ACCEPT": return SELLER_ACCEPT;
            case "SELLER_ACCEPT_WITH_RETURN": return SELLER_ACCEPT_WITH_RETURN;
            case "SELLER_CONTEST": return SELLER_CONTEST;
            case "DISPUTE_UPDATED": return DISPUTE_UPDATED;
            case "SELLER_RESPONSE_OVERDUE": return SELLER_RESPONSE_OVERDUE;
            case "DISPUTE_REOPENED": return DISPUTE_REOPENED;
            case "DISPUTE_REVERSED": return DISPUTE_REVERSED;
            case "APPEAL_DENIED": return APPEAL_DENIED;
            case "APPEAL_GRANTED": return APPEAL_GRANTED;
            default: return null;
        }
    }
}
