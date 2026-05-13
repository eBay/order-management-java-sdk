package com.ebay.ordermanagement.exceptions;

import java.util.List;

/**
 * Exception thrown when a GraphQL request returns errors.
 */
public class GraphQLException extends OrderManagementException {
    private final List<String> errors;

    public GraphQLException(List<String> errors) {
        super("GraphQL errors: " + String.join(", ", errors));
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
