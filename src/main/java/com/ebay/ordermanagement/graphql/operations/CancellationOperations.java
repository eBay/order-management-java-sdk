package com.ebay.ordermanagement.graphql.operations;

/**
 * GraphQL query and mutation constants for Cancellation operations.
 *
 * Contains 7 cancellation-related operations:
 * - APPROVE_CONTRACT_CANCELLATION
 * - CONTRACT_CANCELLATION
 * - CREATE_ITEM_COMMITMENT_CANCELLATION
 * - CREATE_ORDER_CANCELLATION
 * - CREATE_PURCHASE_QUOTE_CANCELLATION
 * - DECLINE_CONTRACT_CANCELLATION
 * - SELLER_CONTRACT_CANCELLATIONS
 */
public final class CancellationOperations {

    public static final String APPROVE_CONTRACT_CANCELLATION = """
        mutation ApproveContractCancellation($input: ApproveContractCancellationInput!) {
            approveContractCancellation(input: $input) {
                __typename
                ... on ApproveContractCancellationSuccess {
                    contractCancellation {
                        __typename
                        cancellationId
                        status {
                            __typename
                            code
                            displayText
                        }
                    }
                }
                ... on ContractCancellationActionNotPermittedError {
                    errorCode
                    errorMessage
                    availableActions {
                        __typename
                        code
                        displayText
                    }
                }
                ... on ContractCancellationNotFoundError {
                    errorCode
                    errorMessage
                    requestedContractCancellationId
                }
                ... on RefundAuthorizationFailedError { errorCode errorMessage }
                ... on RefundBlockedByPaymentDisputeError { errorCode errorMessage }
                ... on RefundInstrumentDeclinedError { errorCode errorMessage }
                ... on RefundInstrumentInsufficientFundsError { errorCode errorMessage }
                ... on RefundInstrumentInvalidError { errorCode errorMessage }
                ... on RefundProcessingError { errorCode errorMessage }
            }
        }
        """;

    public static final String CONTRACT_CANCELLATION = """
        query ContractCancellation($input: ContractCancellationInput!) {
            contractCancellation(input: $input) {
                __typename
                ... on ContractCancellationSuccess {
                    contractCancellation {
                        __typename
                        cancellationId
                        lineItems {
                            __typename
                            cancellationLineItemId
                            requestedQuantity
                            cancelledQuantity
                            listingRestockTasks {
                                __typename
                                ... on PostPurchaseListingRelistTask {
                                    relistStatus {
                                        __typename
                                        code
                                        displayText
                                    }
                                    relistedListing { listingId }
                                }
                            }
                            ... on OrderCancellationLineItem {
                                orderLineItem { orderLineItemId }
                            }
                        }
                        requestedAt
                        reason { code displayText }
                        requesterNote
                        requester
                        status {
                            __typename
                            code
                            displayText
                        }
                        closedAt
                        refunds { refundId }
                        sellerAvailableActions {
                            primaryActions {
                                __typename
                                code
                                displayText
                            }
                            responseDueAt
                        }
                        ... on OrderCancellation {
                            lineItems { __typename }
                        }
                    }
                }
                ... on ContractCancellationNotFoundError {
                    errorCode
                    errorMessage
                    requestedContractCancellationId
                }
            }
        }
        """;

    public static final String CREATE_ITEM_COMMITMENT_CANCELLATION = """
        mutation CreateItemCommitmentCancellation($input: CreateItemCommitmentCancellationInput!) {
            createItemCommitmentCancellation(input: $input) {
                __typename
                ... on CreateItemCommitmentCancellationSuccess {
                    itemCommitmentCancellation {
                        __typename
                        cancellationId
                        status {
                            __typename
                            code
                            displayText
                        }
                    }
                }
                ... on ItemCommitmentCancellationEligibilityError {
                    errorCode
                    errorMessage
                    ineligibilityReasons {
                        __typename
                        code
                        displayMessage
                        itemCommitmentId
                        ... on ItemCommitmentCancellationReasonNotAllowed {
                            availableReasons { code displayText }
                        }
                    }
                }
                ... on ItemCommitmentNotFoundError {
                    errorCode
                    errorMessage
                    itemCommitmentId
                }
            }
        }
        """;

    public static final String CREATE_ORDER_CANCELLATION = """
        mutation CreateOrderCancellation($input: CreateOrderCancellationInput!) {
            createOrderCancellation(input: $input) {
                __typename
                ... on CreateOrderCancellationSuccess {
                    orderCancellation {
                        __typename
                        cancellationId
                        status {
                            __typename
                            code
                            displayText
                        }
                    }
                }
                ... on OrderCancellationEligibilityError {
                    errorCode
                    errorMessage
                    orderIneligibilityReasons: ineligibilityReasons {
                        __typename
                        code
                        displayMessage
                        orderId
                        ... on OrderCancellationReasonNotAllowed {
                            availableReasons { code displayText }
                        }
                    }
                }
                ... on OrderLineItemCancellationEligibilityError {
                    errorCode
                    errorMessage
                    lineItemIneligibilityReasons: ineligibilityReasons {
                        __typename
                        code
                        displayMessage
                        orderLineItemIds
                    }
                }
                ... on OrderNotFoundError {
                    errorCode
                    errorMessage
                    orderId
                }
                ... on RefundAuthorizationFailedError { errorCode errorMessage }
                ... on RefundBlockedByPaymentDisputeError { errorCode errorMessage }
                ... on RefundInstrumentDeclinedError { errorCode errorMessage }
                ... on RefundInstrumentInsufficientFundsError { errorCode errorMessage }
                ... on RefundInstrumentInvalidError { errorCode errorMessage }
                ... on RefundProcessingError { errorCode errorMessage }
            }
        }
        """;

    public static final String CREATE_PURCHASE_QUOTE_CANCELLATION = """
        mutation CreatePurchaseQuoteCancellation($input: CreatePurchaseQuoteCancellationInput!) {
            createPurchaseQuoteCancellation(input: $input) {
                __typename
                ... on CreatePurchaseQuoteCancellationSuccess {
                    purchaseQuoteCancellation {
                        __typename
                        cancellationId
                        status {
                            __typename
                            code
                            displayText
                        }
                    }
                }
                ... on PurchaseQuoteCancellationEligibilityError {
                    errorCode
                    errorMessage
                    ineligibilityReasons {
                        __typename
                        code
                        displayMessage
                        purchaseQuoteId
                        ... on PurchaseQuoteCancellationReasonNotAllowed {
                            availableReasons { code displayText }
                        }
                    }
                }
                ... on PurchaseQuoteNotFoundError {
                    errorCode
                    errorMessage
                    purchaseQuoteId
                }
            }
        }
        """;

    public static final String DECLINE_CONTRACT_CANCELLATION = """
        mutation DeclineContractCancellation($input: DeclineContractCancellationInput!) {
            declineContractCancellation(input: $input) {
                __typename
                ... on DeclineContractCancellationSuccess {
                    contractCancellation {
                        __typename
                        cancellationId
                        status {
                            __typename
                            code
                            displayText
                        }
                    }
                }
                ... on ContractCancellationActionNotPermittedError {
                    errorCode
                    errorMessage
                    availableActions {
                        __typename
                        code
                        displayText
                    }
                }
                ... on ContractCancellationNotFoundError {
                    errorCode
                    errorMessage
                    requestedContractCancellationId
                }
                ... on DeclineCancellationInputValidationError {
                    errorCode
                    errorMessage
                    violations {
                        __typename
                        code
                        displayMessage
                        ... on CancellationTrackingNumberViolation {
                            constraint {
                                characterLimit { minLength maxLength }
                            }
                            exceededLength
                            containsInvalidCharacters
                        }
                        ... on CancellationShippingCarrierCodeViolation {
                            constraint {
                                characterLimit { minLength maxLength }
                            }
                            exceededLength
                            containsInvalidCharacters
                        }
                        ... on CancellationShippedDateViolation {
                            constraint { fromDate toDate }
                        }
                    }
                }
            }
        }
        """;

    public static final String SELLER_CONTRACT_CANCELLATIONS = """
        query SellerContractCancellations($input: SellerContractCancellationsInput!) {
            sellerContractCancellations(input: $input) {
                __typename
                ... on SellerContractCancellationsSuccess {
                    contractCancellations {
                        __typename
                        cancellationId
                        lineItems {
                            __typename
                            cancellationLineItemId
                            requestedQuantity
                            cancelledQuantity
                            listingRestockTasks {
                                __typename
                                ... on PostPurchaseListingRelistTask {
                                    relistStatus {
                                        __typename
                                        code
                                        displayText
                                    }
                                    relistedListing { listingId }
                                }
                            }
                            ... on OrderCancellationLineItem {
                                orderLineItem { orderLineItemId }
                            }
                            ... on PurchaseQuoteCancellationLineItem {
                                purchaseQuoteLineItem { purchaseQuoteLineItemId }
                            }
                        }
                        requestedAt
                        reason {
                            __typename
                            code
                            displayText
                        }
                        requesterNote
                        requester
                        status {
                            __typename
                            code
                            displayText
                        }
                        closedAt
                        refunds { refundId }
                        sellerAvailableActions {
                            primaryActions {
                                __typename
                                code
                                displayText
                            }
                            responseDueAt
                        }
                        ... on ItemCommitmentCancellation {
                            itemCommitment { itemCommitmentId }
                        }
                        ... on PurchaseQuoteCancellation {
                            purchaseQuote { purchaseQuoteId }
                        }
                    }
                    pagination {
                        nextCursor
                        previousCursor
                    }
                }
                ... on ContractCancellationInvalidDateRangeError {
                    errorCode
                    errorMessage
                }
                ... on ContractCancellationInvalidPageSizeError {
                    errorCode
                    errorMessage
                    maxAllowedPageSize
                }
                ... on ContractCancellationInvalidSearchInputError {
                    errorCode
                    errorMessage
                }
            }
        }
        """;

    private CancellationOperations() {
        // Utility class
    }
}
