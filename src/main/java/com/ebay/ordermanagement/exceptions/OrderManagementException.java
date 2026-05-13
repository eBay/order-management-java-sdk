package com.ebay.ordermanagement.exceptions;

/**
 * Base exception for Order Management SDK errors.
 */
public class OrderManagementException extends RuntimeException {
    public OrderManagementException(String message) {
        super(message);
    }

    public OrderManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
