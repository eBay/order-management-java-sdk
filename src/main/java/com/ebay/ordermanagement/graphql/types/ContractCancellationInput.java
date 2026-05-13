package com.ebay.ordermanagement.graphql.types;

import java.util.HashMap;
import java.util.Map;

/**
 * Input type for contractCancellation GraphQL query.
 */
public final class ContractCancellationInput {
    private String cancellationId;

    public ContractCancellationInput() {}

    public ContractCancellationInput(String cancellationId) {
        this.cancellationId = cancellationId;
    }

    public String getCancellationId() {
        return cancellationId;
    }

    public void setCancellationId(String cancellationId) {
        this.cancellationId = cancellationId;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        if (cancellationId != null) {
            map.put("cancellationId", cancellationId);
        }
        return map;
    }
}
