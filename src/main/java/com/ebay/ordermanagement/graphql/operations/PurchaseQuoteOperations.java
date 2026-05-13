package com.ebay.ordermanagement.graphql.operations;

/**
 * GraphQL query and mutation constants for Purchase Quote operations.
 *
 * Contains 5 purchase quote operations:
 * - BULK_UPDATE_PURCHASE_QUOTES
 * - CREATE_PURCHASE_QUOTE
 * - PURCHASE_QUOTE_LINE_ITEMS_BY_IDS
 * - PURCHASE_QUOTES
 * - PURCHASE_QUOTES_BY_IDS
 */
public final class PurchaseQuoteOperations {

    public static final String BULK_UPDATE_PURCHASE_QUOTES = """
mutation BulkUpdatePurchaseQuotes($input: BulkUpdatePurchaseQuotesInput!) {
    bulkUpdatePurchaseQuotes(input: $input) {
        __typename
        ... on BulkUpdatePurchaseQuotesSuccess {
            updatedPurchaseQuotes { purchaseQuoteId }
        }
        ... on BulkUpdatePurchaseQuotesPartialFailure {
            errorCode
            errorMessage
            updatedPurchaseQuotes { purchaseQuoteId }
            failures { inputPurchaseQuoteId errorCode displayMessage retryable }
        }
        ... on BulkUpdatePurchaseQuotesCompleteFailure {
            errorCode
            errorMessage
            failures { inputPurchaseQuoteId errorCode displayMessage retryable }
        }
    }
}
        """;

    public static final String CREATE_PURCHASE_QUOTE = """
mutation CreatePurchaseQuote($input: CreatePurchaseQuoteInput!) {
    createPurchaseQuote(input: $input) {
        __typename
        ... on CreatePurchaseQuoteSuccess {
            purchaseQuote { purchaseQuoteId }
        }
        ... on CreatePurchaseQuoteBusinessError {
            errorCode
            errorMessage
            retryable
        }
    }
}
        """;

    public static final String PURCHASE_QUOTE_LINE_ITEMS_BY_IDS = """
query PurchaseQuoteLineItemsByIds($input: PurchaseQuoteLineItemsByIdsInput!) {
    purchaseQuoteLineItemsByIds(input: $input) {
        __typename
        ... on PurchaseQuoteLineItemsByIdsSuccess {
            purchaseQuoteLineItems {
                purchaseQuoteLineItemId
                lineItemSource {
                    ... on ItemCommitment { itemCommitmentId }
                }
                totals {
                    total {
                        original { value currency }
                    }
                }
            }
        }
        ... on PurchaseQuoteLineItemsByIdsPartialFailure {
            purchaseQuoteLineItems {
                purchaseQuoteLineItemId
            }
            failures { errorCode displayMessage inputPurchaseQuoteLineItemId retryable }
        }
        ... on PurchaseQuoteLineItemsByIdsCompleteFailure {
            failures { errorCode displayMessage inputPurchaseQuoteLineItemId retryable }
        }
    }
}
        """;

    public static final String PURCHASE_QUOTES = """
query PurchaseQuotes {
    purchaseQuotes {
        sellerPurchaseQuotes(input: {}) {
            pagination {
                nextCursor
                previousCursor
            }
            purchaseQuotes {
                purchaseQuoteId
                createdAt
                updatedAt
                state {
                    ... on PurchaseQuoteRequested { label }
                    ... on PurchaseQuoteActive { label }
                    ... on PurchaseQuoteCancelled {
                        label
                        cancelledAt
                        reason { displayName id }
                    }
                    ... on PurchaseQuoteCompleted { label }
                    ... on PurchaseQuoteLocked { label }
                    ... on PurchaseQuoteInvalid {
                        label
                        reason { displayName id }
                    }
                }
            }
        }
    }
}
        """;

    public static final String PURCHASE_QUOTES_BY_IDS = """
query PurchaseQuotesByIds($input: PurchaseQuotesByIdsInput!) {
    purchaseQuotesByIds(input: $input) {
        __typename
        ... on PurchaseQuotesByIdsSuccess {
            purchaseQuotes {
                purchaseQuoteId
                createdAt
                updatedAt
                state {
                    ... on PurchaseQuoteRequested { label }
                    ... on PurchaseQuoteActive { label }
                    ... on PurchaseQuoteCancelled {
                        label
                        cancelledAt
                        reason { displayName id }
                    }
                    ... on PurchaseQuoteInvalid {
                        label
                        reason { displayName id }
                    }
                    ... on PurchaseQuoteLocked { label }
                    ... on PurchaseQuoteCompleted { label }
                }
                cancellation { cancellationId }
                buyer { legacyUserId dataAccessLevel }
                seller { legacyUserId dataAccessLevel }
                lineItems {
                    purchaseQuoteLineItemId
                    lineItemSource {
                        ... on ItemCommitment { itemCommitmentId }
                    }
                    cancellation { cancellationId }
                    return {
                        return { returnId }
                    }
                    totals {
                        taxes {
                            taxAddress {
                                addressId
                                addressLine1
                                addressLine2
                                city
                                stateOrProvince
                                country
                                postalCode
                                phone
                                email
                            }
                        }
                        total {
                            original { value currency }
                        }
                    }
                }
            }
        }
        ... on PurchaseQuotesByIdsPartialFailure {
            purchaseQuotes {
                purchaseQuoteId
                createdAt
                updatedAt
            }
            failures { errorCode displayMessage inputPurchaseQuoteId retryable }
        }
        ... on PurchaseQuotesByIdsCompleteFailure {
            failures { errorCode displayMessage inputPurchaseQuoteId retryable }
        }
    }
}
        """;

    private PurchaseQuoteOperations() {
        // Utility class
    }
}
