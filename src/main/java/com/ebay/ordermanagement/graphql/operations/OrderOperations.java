package com.ebay.ordermanagement.graphql.operations;

/**
 * GraphQL query and mutation constants for Item Commitment & Order operations.
 *
 * Contains 10 operations:
 * - BULK_UPDATE_ITEM_COMMITMENT_TAGS
 * - BULK_UPDATE_ORDER_TAGS
 * - COMMIT_TO_PURCHASE
 * - ITEM_COMMITMENTS
 * - ITEM_COMMITMENTS_BY_IDS
 * - MARK_ITEM_COMMITMENTS_PAID
 * - MARK_ORDERS_PAID
 * - ORDER_LINE_ITEMS_BY_IDS
 * - ORDERS
 * - ORDERS_BY_IDS
 */
public final class OrderOperations {

    public static final String ORDERS = """
        query Orders($input: OrdersInput!) {
            orders {
                sellerOrders(input: $input) {
                    orders {
                        orderId
                        placedAt
                        updatedAt
                        logistics {
                            fulfillmentPlan {
                                planType
                                logisticsPlanSteps {
                                    methodName { id displayName }
                                }
                            }
                        }
                        orderState {
                            __typename
                            ... on OrderAbandoned { label }
                            ... on OrderCancelled { label }
                            ... on OrderConfirmed {
                                label
                                fundingState {
                                    __typename
                                    ... on PaymentsCompleted { label }
                                    ... on PaymentsFailure { label }
                                    ... on PaymentsInProgress { label }
                                    ... on PaymentsNotStarted { label }
                                }
                            }
                            ... on OrderPlaced { label }
                        }
                    }
                    pagination {
                        nextCursor
                        previousCursor
                    }
                }
            }
        }
        """;

    public static final String BULK_UPDATE_ORDER_TAGS = """
        mutation BulkUpdateOrderTags($input: BulkUpdateOrderTagsInput!) {
          bulkUpdateOrderTags(input: $input) {
            __typename
            ... on BulkUpdateOrderTagsCompleteFailure {
              errorCode
              errorMessage
              failures {
                displayMessage
                errorCode
                inputOrderId
                retryable
              }
            }
            ... on BulkUpdateOrderTagsPartialFailure {
              errorCode
              errorMessage
              failures {
                displayMessage
                errorCode
                inputOrderId
                retryable
              }
              updatedOrders {
                orderId
                orderTags {
                  tags
                  sellerAcknowledged
                }
              }
            }
            ... on BulkUpdateOrderTagsSuccess {
              updatedOrders {
                orderId
                orderTags {
                  sellerAcknowledged
                  tags
                }
              }
            }
          }
        }
        """;

    public static final String COMMIT_TO_PURCHASE = """
        mutation CommitToPurchase($input: CommitToPurchaseInput!) {
          commitToPurchase(input: $input) {
            __typename
            ... on CommitToPurchaseBusinessRulesViolated {
              errorCode
              errorMessage
              violations {
                ruleDescription
              }
            }
            ... on CommitToPurchaseSuccess {
              commitment {
                itemCommitmentId
              }
            }
            ... on ReferenceArgumentsNotFound {
              argumentNames
              errorCode
              errorMessage
            }
          }
        }
        """;

    public static final String BULK_UPDATE_ITEM_COMMITMENT_TAGS = """
        mutation BulkUpdateItemCommitmentTags($input: BulkUpdateItemCommitmentTagsInput!) {
            bulkUpdateItemCommitmentTags(input: $input) {
                __typename
                ... on BulkUpdateItemCommitmentTagsSuccess {
                    updatedItemCommitments { itemCommitmentId }
                }
                ... on BulkUpdateItemCommitmentTagsPartialFailure {
                    errorCode
                    errorMessage
                    updatedItemCommitments { itemCommitmentId }
                    failures { inputItemCommitmentId errorCode displayMessage retryable }
                }
                ... on BulkUpdateItemCommitmentTagsCompleteFailure {
                    errorCode
                    errorMessage
                    failures { inputItemCommitmentId errorCode displayMessage retryable }
                }
            }
        }
        """;

    public static final String ITEM_COMMITMENTS = """
        query ItemCommitments($input: ItemCommitmentsInput!) {
            itemCommitments {
                buyerItemCommitments(input: $input) {
                    itemCommitments {
                        itemCommitmentId
                        createdAt
                        updatedAt
                        committedMarketplace
                        state {
                            ... on ItemCommitmentActive { label }
                            ... on ItemCommitmentCancelled { label cancelledAt reason }
                            ... on ItemCommitmentLocked { label }
                            ... on ItemCommitmentCompleted { label }
                            ... on ItemCommitmentAbandoned { label }
                        }
                        cancellation { cancellationId }
                        refunds { refundId }
                        buyer { userId }
                        seller { userId }
                        totals {
                            committedTotal {
                                original { value currency }
                            }
                        }
                        lineItem {
                            quantity
                            item { itemId }
                            purchaseFlow {
                                ... on PurchaseFlowBuyItNow { label }
                                ... on PurchaseFlowAuction { label }
                                ... on PurchaseFlowCommitToBuy { label }
                                ... on PurchaseFlowSellerInitiatedOffer { label }
                                ... on PurchaseFlowBestOffer { label }
                                ... on PurchaseFlowRequestTotal { label }
                            }
                        }
                    }
                    pagination {
                        nextCursor
                        previousCursor
                    }
                }
            }
        }
        """;

    public static final String ITEM_COMMITMENTS_BY_IDS = """
        query ItemCommitmentsByIds($input: ItemCommitmentsByIdsInput!) {
            itemCommitmentsByIds(input: $input) {
                __typename
                ... on ItemCommitmentsByIdsSuccess {
                    itemCommitments {
                        itemCommitmentId
                        createdAt
                        updatedAt
                        state {
                            ... on ItemCommitmentActive {
                                label
                                fundingState {
                                    ... on PaymentsNotStarted { label }
                                    ... on PaymentsInProgress { label }
                                    ... on PaymentsCompleted { label }
                                    ... on PaymentsFailure { label }
                                }
                                fulfillmentState {
                                    ... on FulfillmentNotStarted { label }
                                    ... on FulfillmentInProgress { label startedAt }
                                    ... on FulfillmentCompleted { label completedAt }
                                }
                                cancelState {
                                    ... on ContractCancelRequested { label requestedAt }
                                    ... on ContractCancelRejected { label rejectedAt reason }
                                    ... on ContractCancelPending { label startedAt }
                                    ... on ContractCancelCompleted { label completedAt refundOutcome }
                                }
                                returnState {
                                    ... on ItemCommitmentReturnRequested { label }
                                    ... on ItemCommitmentReturnClosed { label }
                                }
                            }
                            ... on ItemCommitmentCancelled {
                                label
                                cancelledAt
                                reason
                                cancelState {
                                    ... on ContractCancelRequested { label requestedAt }
                                    ... on ContractCancelRejected { label rejectedAt reason }
                                    ... on ContractCancelPending { label startedAt }
                                    ... on ContractCancelCompleted { label completedAt refundOutcome }
                                }
                            }
                            ... on ItemCommitmentLocked { label }
                            ... on ItemCommitmentCompleted { label }
                            ... on ItemCommitmentAbandoned { label }
                        }
                    }
                }
                ... on ItemCommitmentsByIdsPartialFailure {
                    itemCommitments {
                        itemCommitmentId
                        createdAt
                        updatedAt
                    }
                    failures { errorCode displayMessage inputItemCommitmentId retryable }
                }
                ... on ItemCommitmentsByIdsCompleteFailure {
                    failures { errorCode displayMessage inputItemCommitmentId retryable }
                }
            }
        }
        """;

    public static final String MARK_ITEM_COMMITMENTS_PAID = """
        mutation MarkItemCommitmentsPaid($input: MarkItemCommitmentsPaidInput!) {
            markItemCommitmentsPaid(input: $input) {
                __typename
                ... on MarkItemCommitmentsPaidSuccess {
                    markPaidItemCommitments { itemCommitmentId }
                }
                ... on MarkItemCommitmentsPaidPartialFailure {
                    errorCode
                    errorMessage
                    markPaidItemCommitments { itemCommitmentId }
                    failures { inputItemCommitmentId errorCode displayMessage retryable }
                }
                ... on MarkItemCommitmentsPaidCompleteFailure {
                    errorCode
                    errorMessage
                    failures { inputItemCommitmentId errorCode displayMessage retryable }
                }
            }
        }
        """;

    public static final String MARK_ORDERS_PAID = """
        mutation MarkOrdersPaid($input: MarkOrdersPaidInput!) {
            markOrdersPaid(input: $input) {
                __typename
                ... on MarkOrdersPaidSuccess {
                    markPaidOrders {
                        orderId placedAt updatedAt
                        logistics {
                            fulfillmentPlan {
                                planType
                                logisticsPlanSteps {
                                    methodName { id displayName }
                                }
                            }
                        }
                        orderState {
                            __typename
                            ... on OrderAbandoned { label }
                            ... on OrderCancelled { label }
                            ... on OrderConfirmed {
                                label
                                fundingState {
                                    __typename
                                    ... on PaymentsCompleted { label }
                                    ... on PaymentsFailure { label }
                                    ... on PaymentsInProgress { label }
                                    ... on PaymentsNotStarted { label }
                                }
                            }
                            ... on OrderPlaced { label }
                        }
                    }
                }
                ... on MarkOrdersPaidPartialFailure {
                    errorCode
                    errorMessage
                    markPaidOrders {
                        orderId placedAt updatedAt
                        logistics {
                            fulfillmentPlan {
                                planType
                                logisticsPlanSteps {
                                    methodName { id displayName }
                                }
                            }
                        }
                        orderState {
                            __typename
                            ... on OrderAbandoned { label }
                            ... on OrderCancelled { label }
                            ... on OrderConfirmed {
                                label
                                fundingState {
                                    __typename
                                    ... on PaymentsCompleted { label }
                                    ... on PaymentsFailure { label }
                                    ... on PaymentsInProgress { label }
                                    ... on PaymentsNotStarted { label }
                                }
                            }
                            ... on OrderPlaced { label }
                        }
                    }
                    failures { errorCode displayMessage inputOrderId retryable }
                }
                ... on MarkOrdersPaidCompleteFailure {
                    failures { errorCode displayMessage inputOrderId retryable }
                }
            }
        }
        """;

    public static final String ORDER_LINE_ITEMS_BY_IDS = """
        query OrderLineItemsByIds($input: OrderLineItemsByIdsInput!) {
            orderLineItemsByIds(input: $input) {
                __typename
                ... on OrderLineItemsByIdsSuccess {
                    lineItems {
                        orderLineItemId
                        createdAt
                        updatedAt
                    }
                }
                ... on OrderLineItemsByIdsPartialFailure {
                    lineItems {
                        orderLineItemId
                        createdAt
                        updatedAt
                    }
                    failures { errorCode displayMessage inputLineItemId retryable }
                }
                ... on OrderLineItemsByIdsCompleteFailure {
                    failures { errorCode displayMessage inputLineItemId retryable }
                }
            }
        }
        """;

    public static final String ORDERS_BY_IDS = """
        query OrdersByIds($input: OrdersByIdsInput!) {
            ordersByIds(input: $input) {
                __typename
                ... on OrdersByIdsSuccess {
                    orders {
                        orderId
                        placedAt
                        updatedAt
                        logistics {
                            fulfillmentPlan {
                                planType
                                logisticsPlanSteps {
                                    methodName { id displayName }
                                }
                            }
                        }
                    }
                }
                ... on OrdersByIdsPartialFailure {
                    orders {
                        orderId
                        placedAt
                        updatedAt
                        logistics {
                            fulfillmentPlan {
                                planType
                                logisticsPlanSteps {
                                    methodName { id displayName }
                                }
                            }
                        }
                    }
                    failures { errorCode displayMessage inputOrderId retryable }
                }
                ... on OrdersByIdsCompleteFailure {
                    failures { errorCode displayMessage inputOrderId retryable }
                }
            }
        }
        """;

    private OrderOperations() {
        // Utility class
    }
}
