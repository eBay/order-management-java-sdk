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

package com.ebay.ordermanagement.clients.graphql

import com.ebay.ordermanagement.configuration.OrderManagementConfiguration
import com.ebay.ordermanagement.configuration.TokenContext
import com.ebay.ordermanagement.configuration.RequestOptions
import com.ebay.ordermanagement.exceptions.GraphQLException
import com.ebay.ordermanagement.generated.graphql.*
import com.ebay.ordermanagement.generated.graphql.type.*
import com.apollographql.apollo.ApolloClient
import kotlinx.coroutines.future.future
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import java.util.concurrent.CompletableFuture

/**
 * Typed GraphQL client for Order Management operations using Apollo Kotlin.
 * Provides strongly-typed access to all 53 GraphQL operations.
 *
 * Operations organized by domain:
 * - Cancellations (7 operations)
 * - Inquiries (6 operations)
 * - Orders & Item Commitments (8 operations)
 * - Purchase Quotes (5 operations)
 * - Returns (27 operations)
 */
class OrderManagementGraphQLClient @JvmOverloads internal constructor(
    private val apolloClient: ApolloClient,
    private val dynamicClient: DynamicGraphQLClient,
    private val config: OrderManagementConfiguration,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {

    // ══════════════════════════════════════════════════════════════════════════
    // CANCELLATIONS (7 operations)
    // ══════════════════════════════════════════════════════════════════════════

    suspend fun approveContractCancellationAsync(
        input: ApproveContractCancellationInput,
        accessToken: String? = null
    ): ApproveContractCancellationMutation.ApproveContractCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ApproveContractCancellationMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.approveContractCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun contractCancellationAsync(
        input: ContractCancellationInput,
        accessToken: String? = null
    ): ContractCancellationQuery.ContractCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ContractCancellationQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.contractCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createItemCommitmentCancellationAsync(
        input: CreateItemCommitmentCancellationInput,
        accessToken: String? = null
    ): CreateItemCommitmentCancellationMutation.CreateItemCommitmentCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateItemCommitmentCancellationMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createItemCommitmentCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createOrderCancellationAsync(
        input: CreateOrderCancellationInput,
        accessToken: String? = null
    ): CreateOrderCancellationMutation.CreateOrderCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateOrderCancellationMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createOrderCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createPurchaseQuoteCancellationAsync(
        input: CreatePurchaseQuoteCancellationInput,
        accessToken: String? = null
    ): CreatePurchaseQuoteCancellationMutation.CreatePurchaseQuoteCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreatePurchaseQuoteCancellationMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createPurchaseQuoteCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun declineContractCancellationAsync(
        input: DeclineContractCancellationInput,
        accessToken: String? = null
    ): DeclineContractCancellationMutation.DeclineContractCancellation? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(DeclineContractCancellationMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.declineContractCancellation
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sellerContractCancellationsAsync(
        input: SellerContractCancellationsInput,
        accessToken: String? = null
    ): SellerContractCancellationsQuery.SellerContractCancellations? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerContractCancellationsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerContractCancellations
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // INQUIRIES (6 operations)
    // ══════════════════════════════════════════════════════════════════════════

    suspend fun orderInquiryAsync(
        input: OrderInquiryInput,
        accessToken: String? = null
    ): OrderInquiryQuery.OrderInquiry? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(OrderInquiryQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.orderInquiry
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun processOrderInquiryRefundAsync(
        input: ProcessOrderInquiryRefundInput,
        accessToken: String? = null
    ): ProcessOrderInquiryRefundMutation.ProcessOrderInquiryRefund? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ProcessOrderInquiryRefundMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.processOrderInquiryRefund
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun provideShipmentInfoForItemNotReceivedInquiryAsync(
        input: ProvideShipmentInfoForItemNotReceivedInquiryInput,
        accessToken: String? = null
    ): ProvideShipmentInfoForItemNotReceivedInquiryMutation.ProvideShipmentInfoForItemNotReceivedInquiry? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ProvideShipmentInfoForItemNotReceivedInquiryMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.provideShipmentInfoForItemNotReceivedInquiry
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sellerOrderInquiriesAsync(
        input: SellerOrderInquiriesInput,
        accessToken: String? = null
    ): SellerOrderInquiriesQuery.SellerOrderInquiries? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerOrderInquiriesQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerOrderInquiries
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sendOrderInquiryMessageAsync(
        input: SendOrderInquiryMessageInput,
        accessToken: String? = null
    ): SendOrderInquiryMessageMutation.SendOrderInquiryMessage? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(SendOrderInquiryMessageMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sendOrderInquiryMessage
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun submitOrderInquiryReferralAsync(
        input: SubmitOrderInquiryReferralInput,
        accessToken: String? = null
    ): SubmitOrderInquiryReferralMutation.SubmitOrderInquiryReferral? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(SubmitOrderInquiryReferralMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.submitOrderInquiryReferral
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // ORDERS & ITEM COMMITMENTS (8 operations)
    // ══════════════════════════════════════════════════════════════════════════

    suspend fun bulkUpdateItemCommitmentTagsAsync(
        input: BulkUpdateItemCommitmentTagsInput,
        accessToken: String? = null
    ): BulkUpdateItemCommitmentTagsMutation.BulkUpdateItemCommitmentTags? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(BulkUpdateItemCommitmentTagsMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.bulkUpdateItemCommitmentTags
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun itemCommitmentsAsync(
        input: ItemCommitmentsInput,
        accessToken: String? = null
    ): ItemCommitmentsQuery.ItemCommitments? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ItemCommitmentsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.itemCommitments
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun itemCommitmentsByIdsAsync(
        input: ItemCommitmentsByIdsInput,
        accessToken: String? = null
    ): ItemCommitmentsByIdsQuery.ItemCommitmentsByIds? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ItemCommitmentsByIdsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.itemCommitmentsByIds
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun markItemCommitmentsPaidAsync(
        input: MarkItemCommitmentsPaidInput,
        accessToken: String? = null
    ): MarkItemCommitmentsPaidMutation.MarkItemCommitmentsPaid? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(MarkItemCommitmentsPaidMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.markItemCommitmentsPaid
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun markOrdersPaidAsync(
        input: MarkOrdersPaidInput,
        accessToken: String? = null
    ): MarkOrdersPaidMutation.MarkOrdersPaid? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(MarkOrdersPaidMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.markOrdersPaid
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun orderLineItemsByIdsAsync(
        input: OrderLineItemsByIdsInput,
        accessToken: String? = null
    ): OrderLineItemsByIdsQuery.OrderLineItemsByIds? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(OrderLineItemsByIdsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.orderLineItemsByIds
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun ordersAsync(
        input: OrdersInput,
        accessToken: String? = null
    ): OrdersQuery.Orders? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(OrdersQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.orders
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun ordersByIdsAsync(
        input: OrdersByIdsInput,
        accessToken: String? = null
    ): OrdersByIdsQuery.OrdersByIds? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(OrdersByIdsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.ordersByIds
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // PURCHASE QUOTES (5 operations)
    // ══════════════════════════════════════════════════════════════════════════

    suspend fun bulkUpdatePurchaseQuotesAsync(
        input: BulkUpdatePurchaseQuotesInput,
        accessToken: String? = null
    ): BulkUpdatePurchaseQuotesMutation.BulkUpdatePurchaseQuotes? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(BulkUpdatePurchaseQuotesMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.bulkUpdatePurchaseQuotes
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createPurchaseQuoteAsync(
        input: CreatePurchaseQuoteInput,
        accessToken: String? = null
    ): CreatePurchaseQuoteMutation.CreatePurchaseQuote? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreatePurchaseQuoteMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createPurchaseQuote
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun purchaseQuoteLineItemsByIdsAsync(
        input: PurchaseQuoteLineItemsByIdsInput,
        accessToken: String? = null
    ): PurchaseQuoteLineItemsByIdsQuery.PurchaseQuoteLineItemsByIds? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(PurchaseQuoteLineItemsByIdsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.purchaseQuoteLineItemsByIds
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun purchaseQuotesAsync(
        input: PurchaseQuotesInput,
        accessToken: String? = null
    ): PurchaseQuotesQuery.PurchaseQuotes? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(PurchaseQuotesQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.purchaseQuotes
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun purchaseQuotesByIdsAsync(
        input: PurchaseQuotesByIdsInput,
        accessToken: String? = null
    ): PurchaseQuotesByIdsQuery.PurchaseQuotesByIds? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(PurchaseQuotesByIdsQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.purchaseQuotesByIds
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // RETURNS (27 operations)
    // ══════════════════════════════════════════════════════════════════════════

    suspend fun addListingsToReturnRuleListingGroupAsync(
        input: AddListingsToReturnRuleListingGroupInput,
        accessToken: String? = null
    ): AddListingsToReturnRuleListingGroupMutation.AddListingsToReturnRuleListingGroup? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(AddListingsToReturnRuleListingGroupMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.addListingsToReturnRuleListingGroup
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun appendSellerReturnResponseRuleAsync(
        input: AppendSellerReturnResponseRuleInput,
        accessToken: String? = null
    ): AppendSellerReturnResponseRuleMutation.AppendSellerReturnResponseRule? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(AppendSellerReturnResponseRuleMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.appendSellerReturnResponseRule
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun appendSellerReturnToAddressRuleAsync(
        input: AppendSellerReturnToAddressRuleInput,
        accessToken: String? = null
    ): AppendSellerReturnToAddressRuleMutation.AppendSellerReturnToAddressRule? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(AppendSellerReturnToAddressRuleMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.appendSellerReturnToAddressRule
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun approveReturnAsync(
        input: ApproveReturnInput,
        accessToken: String? = null
    ): ApproveReturnMutation.ApproveReturn? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ApproveReturnMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.approveReturn
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun attachReturnShipmentLabelAsync(
        input: AttachReturnShipmentLabelInput,
        accessToken: String? = null
    ): AttachReturnShipmentLabelMutation.AttachReturnShipmentLabel? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(AttachReturnShipmentLabelMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.attachReturnShipmentLabel
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createInStoreReturnAsync(
        input: CreateInStoreReturnInput,
        accessToken: String? = null
    ): CreateInStoreReturnMutation.CreateInStoreReturn? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateInStoreReturnMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createInStoreReturn
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun createReturnRuleListingGroupAsync(
        input: CreateReturnRuleListingGroupInput,
        accessToken: String? = null
    ): CreateReturnRuleListingGroupMutation.CreateReturnRuleListingGroup? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(CreateReturnRuleListingGroupMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.createReturnRuleListingGroup
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun declineReturnAsync(
        input: DeclineReturnInput,
        accessToken: String? = null
    ): DeclineReturnMutation.DeclineReturn? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(DeclineReturnMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.declineReturn
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun deleteReturnRuleListingGroupAsync(
        input: DeleteReturnRuleListingGroupInput,
        accessToken: String? = null
    ): DeleteReturnRuleListingGroupMutation.DeleteReturnRuleListingGroup? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(DeleteReturnRuleListingGroupMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.deleteReturnRuleListingGroup
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun deleteSellerReturnRuleAsync(
        input: DeleteSellerReturnRuleInput,
        accessToken: String? = null
    ): DeleteSellerReturnRuleMutation.DeleteSellerReturnRule? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(DeleteSellerReturnRuleMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.deleteSellerReturnRule
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun orderReturnAsync(
        input: OrderReturnInput,
        scenario: ExchangeAmountScenario,
        accessToken: String? = null
    ): OrderReturnQuery.OrderReturn? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(OrderReturnQuery(input, scenario)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.orderReturn
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun processReturnRefundAsync(
        input: ProcessReturnRefundInput,
        accessToken: String? = null
    ): ProcessReturnRefundMutation.ProcessReturnRefund? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ProcessReturnRefundMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.processReturnRefund
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun proposeKeepItemWithPartialRefundAsync(
        input: ProposeKeepItemWithPartialRefundInput,
        scenario: ExchangeAmountScenario,
        accessToken: String? = null
    ): ProposeKeepItemWithPartialRefundMutation.ProposeKeepItemWithPartialRefund? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ProposeKeepItemWithPartialRefundMutation(input, scenario)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.proposeKeepItemWithPartialRefund
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun provideRmaNumberAsync(
        input: ProvideRmaNumberInput,
        accessToken: String? = null
    ): ProvideRmaNumberMutation.ProvideRmaNumber? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(ProvideRmaNumberMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.provideRmaNumber
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun recordReturnLabelSentOfflineAsync(
        input: RecordReturnLabelSentOfflineInput,
        accessToken: String? = null
    ): RecordReturnLabelSentOfflineMutation.RecordReturnLabelSentOffline? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(RecordReturnLabelSentOfflineMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.recordReturnLabelSentOffline
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun recordReturnReceivedAsync(
        input: RecordReturnReceivedInput,
        accessToken: String? = null
    ): RecordReturnReceivedMutation.RecordReturnReceived? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(RecordReturnReceivedMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.recordReturnReceived
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun returnRuleListingGroupAsync(
        input: ReturnRuleListingGroupInput,
        accessToken: String? = null
    ): ReturnRuleListingGroupQuery.ReturnRuleListingGroup? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(ReturnRuleListingGroupQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.returnRuleListingGroup
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sellerOrderReturnsAsync(
        input: SellerOrderReturnsInput,
        scenario: ExchangeAmountScenario,
        accessToken: String? = null
    ): SellerOrderReturnsQuery.SellerOrderReturns? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerOrderReturnsQuery(input, scenario)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerOrderReturns
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sellerReturnPreferenceAsync(
        input: SellerReturnPreferenceInput,
        accessToken: String? = null
    ): SellerReturnPreferenceQuery.SellerReturnPreference? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.query(SellerReturnPreferenceQuery(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sellerReturnPreference
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun sendReturnMessageAsync(
        input: SendReturnMessageInput,
        accessToken: String? = null
    ): SendReturnMessageMutation.SendReturnMessage? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(SendReturnMessageMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.sendReturnMessage
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun submitReturnReferralAsync(
        input: SubmitReturnReferralInput,
        accessToken: String? = null
    ): SubmitReturnReferralMutation.SubmitReturnReferral? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(SubmitReturnReferralMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.submitReturnReferral
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerReturnResponseRuleConditionAsync(
        input: UpdateSellerReturnResponseRuleConditionInput,
        accessToken: String? = null
    ): UpdateSellerReturnResponseRuleConditionMutation.UpdateSellerReturnResponseRuleCondition? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerReturnResponseRuleConditionMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerReturnResponseRuleCondition
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerReturnResponseRulesPrioritiesAsync(
        input: UpdateSellerReturnResponseRulesPrioritiesInput,
        accessToken: String? = null
    ): UpdateSellerReturnResponseRulesPrioritiesMutation.UpdateSellerReturnResponseRulesPriorities? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerReturnResponseRulesPrioritiesMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerReturnResponseRulesPriorities
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerReturnRuleStatusAsync(
        input: UpdateSellerReturnRuleStatusInput,
        accessToken: String? = null
    ): UpdateSellerReturnRuleStatusMutation.UpdateSellerReturnRuleStatus? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerReturnRuleStatusMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerReturnRuleStatus
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerReturnToAddressRuleConditionAsync(
        input: UpdateSellerReturnToAddressRuleConditionInput,
        accessToken: String? = null
    ): UpdateSellerReturnToAddressRuleConditionMutation.UpdateSellerReturnToAddressRuleCondition? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerReturnToAddressRuleConditionMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerReturnToAddressRuleCondition
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerReturnToAddressRulesPrioritiesAsync(
        input: UpdateSellerReturnToAddressRulesPrioritiesInput,
        accessToken: String? = null
    ): UpdateSellerReturnToAddressRulesPrioritiesMutation.UpdateSellerReturnToAddressRulesPriorities? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerReturnToAddressRulesPrioritiesMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerReturnToAddressRulesPriorities
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    suspend fun updateSellerRmaPreferenceAsync(
        input: UpdateSellerRmaPreferenceInput,
        accessToken: String? = null
    ): UpdateSellerRmaPreferenceMutation.UpdateSellerRmaPreference? {
        val prev = TokenContext.CURRENT.get()
        TokenContext.CURRENT.set(accessToken ?: prev)
        try {
            val response = apolloClient.mutation(UpdateSellerRmaPreferenceMutation(input)).execute()
            if (response.hasErrors()) {
                throw GraphQLException(response.errors!!.map { it.message })
            }
            return response.dataAssertNoErrors.updateSellerRmaPreference
        } finally {
            TokenContext.CURRENT.set(prev)
        }
    }

    // ══════════════════════════════════════════════════════════════════════════
    // JAVA-FRIENDLY COMPLETABLE FUTURE WRAPPERS
    // ══════════════════════════════════════════════════════════════════════════

    // Cancellations
    fun approveContractCancellationFuture(input: ApproveContractCancellationInput, accessToken: String?) =
        scope.future { approveContractCancellationAsync(input, accessToken) }
    fun contractCancellationFuture(input: ContractCancellationInput, accessToken: String?) =
        scope.future { contractCancellationAsync(input, accessToken) }
    fun createItemCommitmentCancellationFuture(input: CreateItemCommitmentCancellationInput, accessToken: String?) =
        scope.future { createItemCommitmentCancellationAsync(input, accessToken) }
    fun createOrderCancellationFuture(input: CreateOrderCancellationInput, accessToken: String?) =
        scope.future { createOrderCancellationAsync(input, accessToken) }
    fun createPurchaseQuoteCancellationFuture(input: CreatePurchaseQuoteCancellationInput, accessToken: String?) =
        scope.future { createPurchaseQuoteCancellationAsync(input, accessToken) }
    fun declineContractCancellationFuture(input: DeclineContractCancellationInput, accessToken: String?) =
        scope.future { declineContractCancellationAsync(input, accessToken) }
    fun sellerContractCancellationsFuture(input: SellerContractCancellationsInput, accessToken: String?) =
        scope.future { sellerContractCancellationsAsync(input, accessToken) }

    // Inquiries
    fun orderInquiryFuture(input: OrderInquiryInput, accessToken: String?) =
        scope.future { orderInquiryAsync(input, accessToken) }
    fun processOrderInquiryRefundFuture(input: ProcessOrderInquiryRefundInput, accessToken: String?) =
        scope.future { processOrderInquiryRefundAsync(input, accessToken) }
    fun provideShipmentInfoForItemNotReceivedInquiryFuture(input: ProvideShipmentInfoForItemNotReceivedInquiryInput, accessToken: String?) =
        scope.future { provideShipmentInfoForItemNotReceivedInquiryAsync(input, accessToken) }
    fun sellerOrderInquiriesFuture(input: SellerOrderInquiriesInput, accessToken: String?) =
        scope.future { sellerOrderInquiriesAsync(input, accessToken) }
    fun sendOrderInquiryMessageFuture(input: SendOrderInquiryMessageInput, accessToken: String?) =
        scope.future { sendOrderInquiryMessageAsync(input, accessToken) }
    fun submitOrderInquiryReferralFuture(input: SubmitOrderInquiryReferralInput, accessToken: String?) =
        scope.future { submitOrderInquiryReferralAsync(input, accessToken) }

    // Orders & Item Commitments
    fun bulkUpdateItemCommitmentTagsFuture(input: BulkUpdateItemCommitmentTagsInput, accessToken: String?) =
        scope.future { bulkUpdateItemCommitmentTagsAsync(input, accessToken) }
    fun itemCommitmentsFuture(input: ItemCommitmentsInput, accessToken: String?) =
        scope.future { itemCommitmentsAsync(input, accessToken) }
    fun itemCommitmentsByIdsFuture(input: ItemCommitmentsByIdsInput, accessToken: String?) =
        scope.future { itemCommitmentsByIdsAsync(input, accessToken) }
    fun markItemCommitmentsPaidFuture(input: MarkItemCommitmentsPaidInput, accessToken: String?) =
        scope.future { markItemCommitmentsPaidAsync(input, accessToken) }
    fun markOrdersPaidFuture(input: MarkOrdersPaidInput, accessToken: String?) =
        scope.future { markOrdersPaidAsync(input, accessToken) }
    fun orderLineItemsByIdsFuture(input: OrderLineItemsByIdsInput, accessToken: String?) =
        scope.future { orderLineItemsByIdsAsync(input, accessToken) }
    fun ordersFuture(input: OrdersInput, accessToken: String?) =
        scope.future { ordersAsync(input, accessToken) }
    fun ordersByIdsFuture(input: OrdersByIdsInput, accessToken: String?) =
        scope.future { ordersByIdsAsync(input, accessToken) }

    // Purchase Quotes
    fun bulkUpdatePurchaseQuotesFuture(input: BulkUpdatePurchaseQuotesInput, accessToken: String?) =
        scope.future { bulkUpdatePurchaseQuotesAsync(input, accessToken) }
    fun createPurchaseQuoteFuture(input: CreatePurchaseQuoteInput, accessToken: String?) =
        scope.future { createPurchaseQuoteAsync(input, accessToken) }
    fun purchaseQuoteLineItemsByIdsFuture(input: PurchaseQuoteLineItemsByIdsInput, accessToken: String?) =
        scope.future { purchaseQuoteLineItemsByIdsAsync(input, accessToken) }
    fun purchaseQuotesFuture(input: PurchaseQuotesInput, accessToken: String?) =
        scope.future { purchaseQuotesAsync(input, accessToken) }
    fun purchaseQuotesByIdsFuture(input: PurchaseQuotesByIdsInput, accessToken: String?) =
        scope.future { purchaseQuotesByIdsAsync(input, accessToken) }

    // Returns
    fun addListingsToReturnRuleListingGroupFuture(input: AddListingsToReturnRuleListingGroupInput, accessToken: String?) =
        scope.future { addListingsToReturnRuleListingGroupAsync(input, accessToken) }
    fun appendSellerReturnResponseRuleFuture(input: AppendSellerReturnResponseRuleInput, accessToken: String?) =
        scope.future { appendSellerReturnResponseRuleAsync(input, accessToken) }
    fun appendSellerReturnToAddressRuleFuture(input: AppendSellerReturnToAddressRuleInput, accessToken: String?) =
        scope.future { appendSellerReturnToAddressRuleAsync(input, accessToken) }
    fun approveReturnFuture(input: ApproveReturnInput, accessToken: String?) =
        scope.future { approveReturnAsync(input, accessToken) }
    fun attachReturnShipmentLabelFuture(input: AttachReturnShipmentLabelInput, accessToken: String?) =
        scope.future { attachReturnShipmentLabelAsync(input, accessToken) }
    fun createInStoreReturnFuture(input: CreateInStoreReturnInput, accessToken: String?) =
        scope.future { createInStoreReturnAsync(input, accessToken) }
    fun createReturnRuleListingGroupFuture(input: CreateReturnRuleListingGroupInput, accessToken: String?) =
        scope.future { createReturnRuleListingGroupAsync(input, accessToken) }
    fun declineReturnFuture(input: DeclineReturnInput, accessToken: String?) =
        scope.future { declineReturnAsync(input, accessToken) }
    fun deleteReturnRuleListingGroupFuture(input: DeleteReturnRuleListingGroupInput, accessToken: String?) =
        scope.future { deleteReturnRuleListingGroupAsync(input, accessToken) }
    fun deleteSellerReturnRuleFuture(input: DeleteSellerReturnRuleInput, accessToken: String?) =
        scope.future { deleteSellerReturnRuleAsync(input, accessToken) }
    fun orderReturnFuture(input: OrderReturnInput, scenario: ExchangeAmountScenario, accessToken: String?) =
        scope.future { orderReturnAsync(input, scenario, accessToken) }
    fun processReturnRefundFuture(input: ProcessReturnRefundInput, accessToken: String?) =
        scope.future { processReturnRefundAsync(input, accessToken) }
    fun proposeKeepItemWithPartialRefundFuture(input: ProposeKeepItemWithPartialRefundInput, scenario: ExchangeAmountScenario, accessToken: String?) =
        scope.future { proposeKeepItemWithPartialRefundAsync(input, scenario, accessToken) }
    fun provideRmaNumberFuture(input: ProvideRmaNumberInput, accessToken: String?) =
        scope.future { provideRmaNumberAsync(input, accessToken) }
    fun recordReturnLabelSentOfflineFuture(input: RecordReturnLabelSentOfflineInput, accessToken: String?) =
        scope.future { recordReturnLabelSentOfflineAsync(input, accessToken) }
    fun recordReturnReceivedFuture(input: RecordReturnReceivedInput, accessToken: String?) =
        scope.future { recordReturnReceivedAsync(input, accessToken) }
    fun returnRuleListingGroupFuture(input: ReturnRuleListingGroupInput, accessToken: String?) =
        scope.future { returnRuleListingGroupAsync(input, accessToken) }
    fun sellerOrderReturnsFuture(input: SellerOrderReturnsInput, scenario: ExchangeAmountScenario, accessToken: String?) =
        scope.future { sellerOrderReturnsAsync(input, scenario, accessToken) }
    fun sellerReturnPreferenceFuture(input: SellerReturnPreferenceInput, accessToken: String?) =
        scope.future { sellerReturnPreferenceAsync(input, accessToken) }
    fun sendReturnMessageFuture(input: SendReturnMessageInput, accessToken: String?) =
        scope.future { sendReturnMessageAsync(input, accessToken) }
    fun submitReturnReferralFuture(input: SubmitReturnReferralInput, accessToken: String?) =
        scope.future { submitReturnReferralAsync(input, accessToken) }
    fun updateSellerReturnResponseRuleConditionFuture(input: UpdateSellerReturnResponseRuleConditionInput, accessToken: String?) =
        scope.future { updateSellerReturnResponseRuleConditionAsync(input, accessToken) }
    fun updateSellerReturnResponseRulesPrioritiesFuture(input: UpdateSellerReturnResponseRulesPrioritiesInput, accessToken: String?) =
        scope.future { updateSellerReturnResponseRulesPrioritiesAsync(input, accessToken) }
    fun updateSellerReturnRuleStatusFuture(input: UpdateSellerReturnRuleStatusInput, accessToken: String?) =
        scope.future { updateSellerReturnRuleStatusAsync(input, accessToken) }
    fun updateSellerReturnToAddressRuleConditionFuture(input: UpdateSellerReturnToAddressRuleConditionInput, accessToken: String?) =
        scope.future { updateSellerReturnToAddressRuleConditionAsync(input, accessToken) }
    fun updateSellerReturnToAddressRulesPrioritiesFuture(input: UpdateSellerReturnToAddressRulesPrioritiesInput, accessToken: String?) =
        scope.future { updateSellerReturnToAddressRulesPrioritiesAsync(input, accessToken) }
    fun updateSellerRmaPreferenceFuture(input: UpdateSellerRmaPreferenceInput, accessToken: String?) =
        scope.future { updateSellerRmaPreferenceAsync(input, accessToken) }

    // ══════════════════════════════════════════════════════════════════════════
    // ESCAPE HATCH: RAW GRAPHQL
    // ══════════════════════════════════════════════════════════════════════════

    /**
     * Execute arbitrary GraphQL query/mutation.
     * Escape hatch for operations not yet wrapped in typed methods.
     */
    fun executeRaw(
        query: String,
        variables: Any?,
        accessToken: String?,
        requestOptions: RequestOptions? = null
    ) = dynamicClient.executeRawUnsafe(query, variables, accessToken, requestOptions)
}
