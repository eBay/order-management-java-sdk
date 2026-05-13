package com.ebay.ordermanagement.clients.graphql;

import com.ebay.ordermanagement.configuration.RequestOptions;
import com.ebay.ordermanagement.graphql.operations.*;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Typed GraphQL client for Order Management operations.
 *
 * This client provides access to 52 GraphQL operations across:
 * - Cancellations (7 operations)
 * - Item Commitments & Orders (8 operations)
 * - Inquiries (6 operations)
 * - Purchase Quotes (5 operations)
 * - Returns (26 operations)
 *
 * All methods accept:
 * - input: Map<String, Object> with operation variables
 * - accessToken: Optional per-call auth token
 * - requestOptions: Optional custom headers
 *
 * Example usage:
 * <pre>{@code
 * var input = Map.of("orderId", "123", "limit", 10);
 * JsonNode result = client.ordersAsync(input, token, null).join();
 * }</pre>
 */
public final class OrderManagementGraphQLClient {
    private final DynamicGraphQLClient dynamic;

    public OrderManagementGraphQLClient(DynamicGraphQLClient dynamic) {
        this.dynamic = dynamic;
    }

    /**
     * Escape hatch — execute any raw GraphQL query.
     *
     * @param query GraphQL query string
     * @param variables Variables map (can be null)
     * @param accessToken Per-call access token (optional)
     * @param requestOptions Optional custom headers
     * @return CompletableFuture with raw response data as JsonNode
     */
    public CompletableFuture<JsonNode> executeRawAsync(
            String query,
            Map<String, Object> variables,
            String accessToken,
            RequestOptions requestOptions) {
        return CompletableFuture.supplyAsync(() ->
            dynamic.execute(query, variables, accessToken, requestOptions)
        );
    }

    // ── Cancellations ─────────────────────────────────────────────────────────

    /**
     * Approve a contract cancellation request.
     */
    public CompletableFuture<JsonNode> approveContractCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.APPROVE_CONTRACT_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get details of a specific contract cancellation.
     */
    public CompletableFuture<JsonNode> contractCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.CONTRACT_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create an item commitment cancellation.
     */
    public CompletableFuture<JsonNode> createItemCommitmentCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.CREATE_ITEM_COMMITMENT_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create an order cancellation.
     */
    public CompletableFuture<JsonNode> createOrderCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.CREATE_ORDER_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create a purchase quote cancellation.
     */
    public CompletableFuture<JsonNode> createPurchaseQuoteCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.CREATE_PURCHASE_QUOTE_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Decline a contract cancellation request.
     */
    public CompletableFuture<JsonNode> declineContractCancellationAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.DECLINE_CONTRACT_CANCELLATION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get seller's contract cancellations (item commitments, orders, purchase quotes).
     */
    public CompletableFuture<JsonNode> sellerContractCancellationsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            CancellationOperations.SELLER_CONTRACT_CANCELLATIONS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    // ── Item Commitments & Orders ─────────────────────────────────────────────

    /**
     * Bulk update item commitment tags.
     */
    public CompletableFuture<JsonNode> bulkUpdateItemCommitmentTagsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.BULK_UPDATE_ITEM_COMMITMENT_TAGS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get buyer's item commitments.
     */
    public CompletableFuture<JsonNode> itemCommitmentsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.ITEM_COMMITMENTS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get item commitments by IDs.
     */
    public CompletableFuture<JsonNode> itemCommitmentsByIdsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.ITEM_COMMITMENTS_BY_IDS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Mark item commitments as paid.
     */
    public CompletableFuture<JsonNode> markItemCommitmentsPaidAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.MARK_ITEM_COMMITMENTS_PAID,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Mark orders as paid.
     */
    public CompletableFuture<JsonNode> markOrdersPaidAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.MARK_ORDERS_PAID,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get order line items by IDs.
     */
    public CompletableFuture<JsonNode> orderLineItemsByIdsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.ORDER_LINE_ITEMS_BY_IDS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get seller orders.
     */
    public CompletableFuture<JsonNode> ordersAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.ORDERS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get orders by IDs.
     */
    public CompletableFuture<JsonNode> ordersByIdsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            OrderOperations.ORDERS_BY_IDS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    // ── Inquiries ─────────────────────────────────────────────────────────────

    /**
     * Get details of a specific order inquiry.
     */
    public CompletableFuture<JsonNode> orderInquiryAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.ORDER_INQUIRY,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Process refund for an order inquiry.
     */
    public CompletableFuture<JsonNode> processOrderInquiryRefundAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.PROCESS_ORDER_INQUIRY_REFUND,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Provide shipment info for item-not-received inquiry.
     */
    public CompletableFuture<JsonNode> provideShipmentInfoForItemNotReceivedInquiryAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.PROVIDE_SHIPMENT_INFO_FOR_ITEM_NOT_RECEIVED_INQUIRY,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get seller's order inquiries.
     */
    public CompletableFuture<JsonNode> sellerOrderInquiriesAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.SELLER_ORDER_INQUIRIES,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Send a message in an order inquiry.
     */
    public CompletableFuture<JsonNode> sendOrderInquiryMessageAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.SEND_ORDER_INQUIRY_MESSAGE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Submit an order inquiry referral.
     */
    public CompletableFuture<JsonNode> submitOrderInquiryReferralAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            InquiryOperations.SUBMIT_ORDER_INQUIRY_REFERRAL,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    // ── Purchase Quotes ───────────────────────────────────────────────────────

    /**
     * Bulk update purchase quotes.
     */
    public CompletableFuture<JsonNode> bulkUpdatePurchaseQuotesAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            PurchaseQuoteOperations.BULK_UPDATE_PURCHASE_QUOTES,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create a new purchase quote.
     */
    public CompletableFuture<JsonNode> createPurchaseQuoteAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            PurchaseQuoteOperations.CREATE_PURCHASE_QUOTE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get purchase quote line items by IDs.
     */
    public CompletableFuture<JsonNode> purchaseQuoteLineItemsByIdsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            PurchaseQuoteOperations.PURCHASE_QUOTE_LINE_ITEMS_BY_IDS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get all purchase quotes (no input required).
     */
    public CompletableFuture<JsonNode> purchaseQuotesAsync(
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            PurchaseQuoteOperations.PURCHASE_QUOTES,
            null,
            accessToken,
            requestOptions
        );
    }

    /**
     * Get purchase quotes by IDs.
     */
    public CompletableFuture<JsonNode> purchaseQuotesByIdsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            PurchaseQuoteOperations.PURCHASE_QUOTES_BY_IDS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    // ── Returns ───────────────────────────────────────────────────────────────

    /**
     * Approve a return request.
     */
    public CompletableFuture<JsonNode> approveReturnAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.APPROVE_RETURN,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Attach a return shipment label.
     */
    public CompletableFuture<JsonNode> attachReturnShipmentLabelAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.ATTACH_RETURN_SHIPMENT_LABEL,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create an in-store return.
     */
    public CompletableFuture<JsonNode> createInStoreReturnAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.CREATE_IN_STORE_RETURN,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Decline a return request.
     */
    public CompletableFuture<JsonNode> declineReturnAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.DECLINE_RETURN,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get details of a specific order return.
     */
    public CompletableFuture<JsonNode> orderReturnAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.ORDER_RETURN,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Process refund for a return.
     */
    public CompletableFuture<JsonNode> processReturnRefundAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.PROCESS_RETURN_REFUND,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Propose keeping item with partial refund.
     */
    public CompletableFuture<JsonNode> proposeKeepItemWithPartialRefundAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.PROPOSE_KEEP_ITEM_WITH_PARTIAL_REFUND,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Provide RMA number for a return.
     */
    public CompletableFuture<JsonNode> provideRmaNumberAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.PROVIDE_RMA_NUMBER,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Record that return label was sent offline.
     */
    public CompletableFuture<JsonNode> recordReturnLabelSentOfflineAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.RECORD_RETURN_LABEL_SENT_OFFLINE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Record that return was received.
     */
    public CompletableFuture<JsonNode> recordReturnReceivedAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.RECORD_RETURN_RECEIVED,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get seller's order returns.
     */
    public CompletableFuture<JsonNode> sellerOrderReturnsAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.SELLER_ORDER_RETURNS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get seller return preference.
     */
    public CompletableFuture<JsonNode> sellerReturnPreferenceAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.SELLER_RETURN_PREFERENCE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Send a message in a return.
     */
    public CompletableFuture<JsonNode> sendReturnMessageAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.SEND_RETURN_MESSAGE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Submit a return referral.
     */
    public CompletableFuture<JsonNode> submitReturnReferralAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.SUBMIT_RETURN_REFERRAL,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller RMA preference.
     */
    public CompletableFuture<JsonNode> updateSellerRmaPreferenceAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RMA_PREFERENCE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    // ── Return Rules ──────────────────────────────────────────────────────────

    /**
     * Add listings to a return rule listing group.
     */
    public CompletableFuture<JsonNode> addListingsToReturnRuleListingGroupAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.ADD_LISTINGS_TO_RETURN_RULE_LISTING_GROUP,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Append seller return response rule.
     */
    public CompletableFuture<JsonNode> appendSellerReturnResponseRuleAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.APPEND_SELLER_RETURN_RESPONSE_RULE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Append seller return to-address rule.
     */
    public CompletableFuture<JsonNode> appendSellerReturnToAddressRuleAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.APPEND_SELLER_RETURN_TO_ADDRESS_RULE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Create a return rule listing group.
     */
    public CompletableFuture<JsonNode> createReturnRuleListingGroupAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.CREATE_RETURN_RULE_LISTING_GROUP,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Delete a return rule listing group.
     */
    public CompletableFuture<JsonNode> deleteReturnRuleListingGroupAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.DELETE_RETURN_RULE_LISTING_GROUP,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Delete a seller return rule.
     */
    public CompletableFuture<JsonNode> deleteSellerReturnRuleAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.DELETE_SELLER_RETURN_RULE,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Get a return rule listing group.
     */
    public CompletableFuture<JsonNode> returnRuleListingGroupAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.RETURN_RULE_LISTING_GROUP,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller return response rule condition.
     */
    public CompletableFuture<JsonNode> updateSellerReturnResponseRuleConditionAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RETURN_RESPONSE_RULE_CONDITION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller return response rules priorities.
     */
    public CompletableFuture<JsonNode> updateSellerReturnResponseRulesPrioritiesAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RETURN_RESPONSE_RULES_PRIORITIES,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller return rule status.
     */
    public CompletableFuture<JsonNode> updateSellerReturnRuleStatusAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RETURN_RULE_STATUS,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller return to-address rule condition.
     */
    public CompletableFuture<JsonNode> updateSellerReturnToAddressRuleConditionAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RETURN_TO_ADDRESS_RULE_CONDITION,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }

    /**
     * Update seller return to-address rules priorities.
     */
    public CompletableFuture<JsonNode> updateSellerReturnToAddressRulesPrioritiesAsync(
            Map<String, Object> input,
            String accessToken,
            RequestOptions requestOptions) {
        return executeRawAsync(
            ReturnOperations.UPDATE_SELLER_RETURN_TO_ADDRESS_RULES_PRIORITIES,
            Map.of("input", input),
            accessToken,
            requestOptions
        );
    }
}
