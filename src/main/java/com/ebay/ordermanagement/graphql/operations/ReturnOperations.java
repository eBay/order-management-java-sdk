package com.ebay.ordermanagement.graphql.operations;

/**
 * GraphQL query and mutation constants for Return operations.
 *
 * Contains 27 return operations covering returns, return preferences, and return rules.
 */
public final class ReturnOperations {

    public static final String ADD_LISTINGS_TO_RETURN_RULE_LISTING_GROUP = """
mutation AddListingsToReturnRuleListingGroup($input: AddListingsToReturnRuleListingGroupInput!) {
    addListingsToReturnRuleListingGroup(input: $input) {
        __typename
        ... on ReturnRuleListingGroup {
            returnRuleListingGroupId
            groupName
            listings { listingId }
            pagination {
                nextCursor
                previousCursor
            }
        }
        ... on ReturnRuleListingGroupDuplicateListingError {
            errorCode
            errorMessage
            duplicateListingIds
        }
        ... on ReturnRuleListingIdsPerRequestLimitExceededError {
            errorCode
            errorMessage
            requestedCount
            perRequestLimit
        }
        ... on ReturnRuleListingGroupMaxSizeExceededError {
            errorCode
            errorMessage
            groupListingLimit
        }
        ... on ReturnRuleListingGroupNotFoundError {
            errorCode
            errorMessage
            returnRuleListingGroupId
        }
        ... on ReturnRuleFeatureNotEnabledError { errorCode errorMessage }
    }
}
        """;

    public static final String APPEND_SELLER_RETURN_RESPONSE_RULE = """
mutation AppendSellerReturnResponseRule($input: AppendSellerReturnResponseRuleInput!) {
    appendSellerReturnResponseRule(input: $input) {
        __typename
        ... on ReturnResponseRule {
            ruleId
            name
            priority
            status { code displayText }
            responseStrategy { code displayText }
            conditionSet {
                operator
                conditions {
                    __typename
                    ... on ReturnRefundRangeCondition {
                        minRefundAmount { currency value }
                        maxRefundAmount { currency value }
                    }
                    ... on ReturnReasonCondition {
                        returnReasonList {
                            __typename
                            code
                            displayText
                        }
                    }
                    ... on ReturnShipmentOriginCountryCondition {
                        returnShipmentOriginCountries
                    }
                    ... on ReturnItemCategoryCondition {
                        categories { categoryId }
                    }
                    ... on ReturnItemLocationCountryCondition {
                        itemLocationCountries
                    }
                }
            }
        }
        ... on ReturnRuleLimitExceededError {
            errorCode
            errorMessage
            maxAllowed
        }
        ... on ReturnRuleInvalidConditionsError {
            errorCode
            errorMessage
            ruleConditionViolation {
                __typename
                code
                displayMessage
            }
        }
        ... on ReturnRuleNameError {
            errorCode
            errorMessage
            containsInvalidCharacters
            duplicateRuleName
            nameConstraint {
                characterLimit { minLength maxLength }
                allowedPattern
            }
        }
    }
}
        """;

    public static final String APPEND_SELLER_RETURN_TO_ADDRESS_RULE = """
mutation AppendSellerReturnToAddressRule($input: AppendSellerReturnToAddressRuleInput!) {
    appendSellerReturnToAddressRule(input: $input) {
        __typename
        ... on ReturnToAddressRule {
            ruleId
            name
            priority
            status {
                code
                displayText
                ... on ReturnRuleDisabledStatus { disabledBy }
            }
            conditionSet {
                operator
                conditions {
                    __typename
                    ... on ReturnReasonCondition {
                        returnReasonList {
                            __typename
                            code
                            displayText
                        }
                    }
                    ... on ReturnItemCategoryCondition {
                        categories { categoryId }
                    }
                    ... on ReturnShipmentOriginCountryCondition {
                        returnShipmentOriginCountries
                    }
                    ... on ReturnItemLocationCountryCondition {
                        itemLocationCountries
                    }
                    ... on ReturnRefundRangeCondition {
                        minRefundAmount { currency value }
                        maxRefundAmount { currency value }
                    }
                }
            }
        }
        ... on ReturnRuleInvalidConditionsError {
            errorCode
            errorMessage
            ruleConditionViolation {
                __typename
                code
                displayMessage
            }
        }
        ... on ReturnRuleLimitExceededError {
            errorCode
            errorMessage
            maxAllowed
        }
        ... on ReturnToAddressValidationError {
            errorCode
            errorMessage
            invalidAddressId
        }
        ... on ReturnToAddressRequiredError {
            errorCode
            errorMessage
            addressRoutingStrategy { code displayText }
        }
        ... on ReturnRuleNameError {
            errorCode
            errorMessage
            containsInvalidCharacters
            duplicateRuleName
            nameConstraint {
                characterLimit { minLength maxLength }
                allowedPattern
            }
        }
    }
}
        """;

    public static final String APPROVE_RETURN = """
mutation ApproveReturn($input: ApproveReturnInput!) {
    approveReturn(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
                ... on SendMessageReturnAction { code displayText }
                ... on ApproveReturnAction { code displayText }
                ... on DeclineReturnAction { code displayText }
                ... on ProcessReturnRefundAction { code displayText }
                ... on NegotiateOnReturnAction { code displayText }
                ... on ProvideShipmentInfoReturnAction { code displayText }
                ... on ProvideRmaNumberReturnAction { code displayText }
                ... on RecordReturnReceivedAction { code displayText }
                ... on ReturnReferralAction {
                    code
                    displayText
                    referralReasons {
                        __typename
                        ... on UnresponsiveTradingPartner { code displayText }
                        ... on UnableToReachAgreement { code displayText }
                        ... on RefundNotReceived { code displayText }
                        ... on NoRefundForReturnShipping { code displayText }
                        ... on ReturnedWrongItem { code displayText }
                        ... on ReturnNotReceived { code displayText }
                        ... on ReceivedEmptyBox { code displayText }
                        ... on DamagedItemReturned { code displayText }
                        ... on OtherReferralReason { code displayText }
                    }
                }
            }
        }
        ... on ApproveReturnInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
            }
        }
    }
}
        """;

    public static final String ATTACH_RETURN_SHIPMENT_LABEL = """
mutation AttachReturnShipmentLabel($input: AttachReturnShipmentLabelInput!) {
    attachReturnShipmentLabel(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on ReturnShipmentLabelNotFoundError {
            errorCode
            errorMessage
            requestedDocumentId
        }
        ... on MultipleReturnLabelsNotSupportedError { errorCode errorMessage }
        ... on ReturnShippingLabelRequiredError { errorCode errorMessage }
        ... on AttachReturnShipmentLabelInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnTrackingNumberViolation {
                    code
                    displayMessage
                    containsInvalidCharacters
                    exceededLength
                    duplicateTrackingNumber
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
                ... on ReturnShippingCarrierNameViolation {
                    code
                    displayMessage
                    containsInvalidCharacters
                    exceededLength
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
            }
        }
    }
}
        """;

    public static final String CREATE_IN_STORE_RETURN = """
mutation CreateInStoreReturn($input: CreateInStoreReturnInput!) {
    createInStoreReturn(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnCreationNotAllowedError {
            errorCode
            errorMessage
            returnIneligibilityReasons {
                __typename
                code
                displayMessage
                orderLineItem { orderLineItemId }
                ... on ReturnIneligibleReturnNotAccepted {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleQuantityExceeded {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                    requestedQuantity
                    returnableQuantity
                }
                ... on ReturnIneligibleReasonNotAllowed {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                    allowedReasons { code displayText }
                }
                ... on ReturnIneligibleInquiryExists {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleReturnExists {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleTooEarly {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleReturnWindowElapsed {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleRefundIssued {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligiblePaymentDisputeExists {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleInStoreReturnNotSupported {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
                ... on ReturnIneligibleCancellationExists {
                    code
                    displayMessage
                    orderLineItem { orderLineItemId }
                }
            }
        }
        ... on OrderLineItemNotFoundError { errorCode errorMessage }
    }
}
        """;

    public static final String CREATE_RETURN_RULE_LISTING_GROUP = """
mutation CreateReturnRuleListingGroup($input: CreateReturnRuleListingGroupInput!) {
    createReturnRuleListingGroup(input: $input) {
        __typename
        ... on ReturnRuleListingGroup {
            returnRuleListingGroupId
            groupName
            listings { listingId }
            pagination {
                nextCursor
                previousCursor
            }
        }
        ... on ReturnRuleListingGroupInvalidNameError {
            errorCode
            errorMessage
            containsInvalidCharacters
            duplicateGroupName
            nameConstraint {
                characterLimit { minLength maxLength }
                allowedPattern
            }
        }
        ... on ReturnRuleListingGroupDuplicateListingError {
            errorCode
            errorMessage
            duplicateListingIds
        }
        ... on ReturnRuleListingGroupQuotaExceededError {
            errorCode
            errorMessage
            maxAllowedLists
        }
    }
}
        """;

    public static final String DECLINE_RETURN = """
mutation DeclineReturn($input: DeclineReturnInput!) {
    declineReturn(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
                ... on SendMessageReturnAction { code displayText }
                ... on ApproveReturnAction { code displayText }
                ... on DeclineReturnAction { code displayText }
                ... on ProcessReturnRefundAction { code displayText }
                ... on NegotiateOnReturnAction { code displayText }
                ... on ProvideShipmentInfoReturnAction { code displayText }
                ... on ProvideRmaNumberReturnAction { code displayText }
                ... on RecordReturnReceivedAction { code displayText }
                ... on ReturnReferralAction {
                    code
                    displayText
                    referralReasons {
                        __typename
                        ... on UnresponsiveTradingPartner { code displayText }
                        ... on UnableToReachAgreement { code displayText }
                        ... on RefundNotReceived { code displayText }
                        ... on NoRefundForReturnShipping { code displayText }
                        ... on ReturnedWrongItem { code displayText }
                        ... on ReturnNotReceived { code displayText }
                        ... on ReceivedEmptyBox { code displayText }
                        ... on DamagedItemReturned { code displayText }
                        ... on OtherReferralReason { code displayText }
                    }
                }
            }
        }
        ... on DeclineReturnInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnNoteViolation {
                    code
                    displayMessage
                    exceededLength
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
            }
        }
    }
}
        """;

    public static final String DELETE_RETURN_RULE_LISTING_GROUP = """
mutation DeleteReturnRuleListingGroup($input: DeleteReturnRuleListingGroupInput!) {
    deleteReturnRuleListingGroup(input: $input) {
        __typename
        ... on DeleteReturnRuleListingGroupSuccess {
            groupId
            name
        }
        ... on DeleteReturnRuleListingGroupError {
            code
            message
        }
    }
}
        """;

    public static final String DELETE_SELLER_RETURN_RULE = """
mutation DeleteSellerReturnRule($input: DeleteSellerReturnRuleInput!) {
    deleteSellerReturnRule(input: $input) {
        __typename
        ... on DeleteSellerReturnRuleSuccess {
            ruleId
            name
        }
        ... on ReturnRuleNotFoundError {
            errorCode
            errorMessage
            requestedRuleId
        }
    }
}
        """;

    public static final String ORDER_RETURN = """
query OrderReturn($input: OrderReturnInput!) {
    orderReturn(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            requester
            requestedAt
            closedAt
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
            returnLineItems {
                returnLineItemId
                requestedQuantity
                returnReason { code displayText }
                returnNote
                orderLineItem { orderLineItemId }
                listingRestockTasks {
                    __typename
                    ... on PostPurchaseListingRelistTask {
                        relistStatus { code displayText }
                        relistedListing {
                            __typename
                            ... on ListingReference { listingId }
                        }
                    }
                }
            }
            returnNegotiation {
                latestReturnOffer {
                    status {
                        __typename
                        code
                        displayText
                        ... on ReturnOfferPending { code displayText }
                        ... on ReturnOfferAccepted { code displayText }
                        ... on ReturnOfferDeclined { code displayText }
                        ... on ReturnOfferExpired { code displayText }
                    }
                    proposedTerm {
                        __typename
                        ... on KeepItemPartialRefundTerm {
                            refundAmount {
                                original { value currency }
                                exchangeScenario(scenario: SELLER_CURRENCY) {
                                    __typename
                                    ... on ExchangeAmount {
                                        amount { value currency }
                                        exchangeRate
                                        exchangeAt
                                    }
                                    ... on InvalidExchangeScenarioInputError {
                                        errorCode
                                        errorMessage
                                    }
                                }
                            }
                            itemPriceRefundPercentage
                            itemShippingPriceWaived
                            returnLineItem {
                                returnLineItemId
                                requestedQuantity
                                returnReason { code displayText }
                                returnNote
                                orderLineItem { orderLineItemId }
                            }
                        }
                    }
                }
            }
        }
        ... on ReturnNotFoundError { errorCode errorMessage }
    }
}
        """;

    public static final String PROCESS_RETURN_REFUND = """
mutation ProcessReturnRefund($input: ProcessReturnRefundInput!) {
    processReturnRefund(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on ReturnLineItemNotFoundError {
            errorCode
            errorMessage
            requestedLineItemIds
        }
        ... on MultipleRefundWithholdingsNotAllowedError {
            errorCode
            errorMessage
            maxAllowed
            providedCount
        }
        ... on ProcessReturnRefundInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ItemPriceRefundWithholdViolation {
                    code
                    displayMessage
                    constraint {
                        allowedPercentageRange { minValue maxValue }
                    }
                }
                ... on ShippingPriceRefundWithholdViolation {
                    code
                    displayMessage
                }
            }
        }
        ... on RefundProcessingError { errorCode errorMessage }
        ... on RefundInstrumentInvalidError { errorCode errorMessage }
        ... on RefundInstrumentInsufficientFundsError { errorCode errorMessage }
        ... on RefundInstrumentDeclinedError { errorCode errorMessage }
        ... on RefundBlockedByPaymentDisputeError { errorCode errorMessage }
        ... on RefundAuthorizationFailedError { errorCode errorMessage }
    }
}
        """;

    public static final String PROPOSE_KEEP_ITEM_WITH_PARTIAL_REFUND = """
mutation ProposeKeepItemWithPartialRefund($input: ProposeKeepItemWithPartialRefundInput!) {
    proposeKeepItemWithPartialRefund(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
            returnNegotiation {
                latestReturnOffer {
                    status {
                        __typename
                        code
                        displayText
                        ... on ReturnOfferPending { code displayText }
                        ... on ReturnOfferAccepted { code displayText }
                        ... on ReturnOfferDeclined { code displayText }
                        ... on ReturnOfferExpired { code displayText }
                    }
                    proposedTerm {
                        __typename
                        ... on KeepItemPartialRefundTerm {
                            refundAmount {
                                original { value currency }
                                exchangeScenario(scenario: SELLER_CURRENCY) {
                                    __typename
                                    ... on ExchangeAmount {
                                        amount { value currency }
                                        exchangeRate
                                        exchangeAt
                                    }
                                    ... on InvalidExchangeScenarioInputError {
                                        errorCode
                                        errorMessage
                                    }
                                }
                            }
                            itemPriceRefundPercentage
                            itemShippingPriceWaived
                            returnLineItem {
                                returnLineItemId
                                requestedQuantity
                                returnReason { code displayText }
                                returnNote
                                orderLineItem { orderLineItemId }
                            }
                        }
                    }
                }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on ReturnLineItemNotFoundError {
            errorCode
            errorMessage
            requestedLineItemIds
        }
        ... on ReturnRefundTermsRequiredError { errorCode errorMessage }
        ... on MultipleRefundTermsNotAllowedError { errorCode errorMessage }
        ... on ProposeKeepItemWithPartialRefundInputValidationError { errorCode errorMessage }
    }
}
        """;

    public static final String PROVIDE_RMA_NUMBER = """
mutation ProvideRmaNumber($input: ProvideRmaNumberInput!) {
    provideRmaNumber(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on ProvideRmaNumberInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnRmaNumberViolation {
                    code
                    displayMessage
                    containsInvalidCharacters
                    exceededLength
                    constraint {
                        rmaNumberRequired
                        characterLimit { minLength maxLength }
                    }
                }
            }
        }
    }
}
        """;

    public static final String RECORD_RETURN_LABEL_SENT_OFFLINE = """
mutation RecordReturnLabelSentOffline($input: RecordReturnLabelSentOfflineInput!) {
    recordReturnLabelSentOffline(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on RecordReturnLabelSentOfflineInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnTrackingNumberViolation {
                    code
                    displayMessage
                    containsInvalidCharacters
                    exceededLength
                    duplicateTrackingNumber
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
                ... on ReturnShippingCarrierNameViolation {
                    code
                    displayMessage
                    containsInvalidCharacters
                    exceededLength
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
            }
        }
    }
}
        """;

    public static final String RECORD_RETURN_RECEIVED = """
mutation RecordReturnReceived($input: RecordReturnReceivedInput!) {
    recordReturnReceived(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
    }
}
        """;

    public static final String RETURN_RULE_LISTING_GROUP = """
query ReturnRuleListingGroup($input: ReturnRuleListingGroupInput!) {
    returnRuleListingGroup(input: $input) {
        __typename
        ... on ReturnRuleListingGroup {
            returnRuleListingGroupId
            groupName
            listings { listingId }
            pagination {
                nextCursor
                previousCursor
            }
        }
        ... on ReturnRuleListingGroupNotFoundError {
            errorCode
            errorMessage
            returnRuleListingGroupId
        }
    }
}
        """;

    public static final String SELLER_ORDER_RETURNS = """
query SellerOrderReturns($input: SellerOrderReturnsInput!) {
    sellerOrderReturns(input: $input) {
        __typename
        ... on SellerOrderReturns {
            orderReturns {
                returnId
                requester
                requestedAt
                closedAt
                status {
                    __typename
                    code
                    displayText
                    ... on ReturnRequested { code displayText }
                    ... on ReturnOpen { code displayText }
                    ... on ReturnDeclined { code displayText }
                    ... on ReturnCancelled { code displayText }
                    ... on ReturnClosed { code displayText }
                }
                returnLineItems {
                    returnLineItemId
                    requestedQuantity
                    returnReason { code displayText }
                    returnNote
                    orderLineItem { orderLineItemId }
                    listingRestockTasks {
                        __typename
                        ... on PostPurchaseListingRelistTask {
                            relistStatus { code displayText }
                            relistedListing {
                                __typename
                                ... on ListingReference { listingId }
                            }
                        }
                    }
                }
                returnNegotiation {
                    latestReturnOffer {
                        status {
                            __typename
                            code
                            displayText
                            ... on ReturnOfferPending { code displayText }
                            ... on ReturnOfferAccepted { code displayText }
                            ... on ReturnOfferDeclined { code displayText }
                            ... on ReturnOfferExpired { code displayText }
                        }
                        proposedTerm {
                            __typename
                            ... on KeepItemPartialRefundTerm {
                                refundAmount {
                                    original { value currency }
                                    exchangeScenario(scenario: SELLER_CURRENCY) {
                                        __typename
                                        ... on ExchangeAmount {
                                            amount { value currency }
                                            exchangeRate
                                            exchangeAt
                                        }
                                        ... on InvalidExchangeScenarioInputError {
                                            errorCode
                                            errorMessage
                                        }
                                    }
                                }
                                itemPriceRefundPercentage
                                itemShippingPriceWaived
                            }
                        }
                    }
                }
            }
            pagination {
                nextCursor
                previousCursor
            }
        }
        ... on ReturnActionNotPermittedError { errorCode errorMessage }
        ... on ReturnInvalidDateRangeError { errorCode errorMessage }
        ... on ReturnInvalidPageSizeError { errorCode errorMessage }
        ... on ReturnInvalidSearchInputError { errorCode errorMessage }
    }
}
        """;

    public static final String SELLER_RETURN_PREFERENCE = """
query SellerReturnPreference($input: SellerReturnPreferenceInput!) {
    sellerReturnPreference(input: $input) {
        __typename
        ... on SellerReturnPreferences {
            listingMarketplace
            rmaPreference { preferenceStatus }
        }
        ... on ReturnPreferenceNotFoundError { errorCode errorMessage }
    }
}
        """;

    public static final String SEND_RETURN_MESSAGE = """
mutation SendReturnMessage($input: SendReturnMessageInput!) {
    sendReturnMessage(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on SendReturnMessageInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnNoteViolation {
                    code
                    displayMessage
                    exceededLength
                    constraint {
                        characterLimit { minLength maxLength }
                    }
                }
            }
        }
    }
}
        """;

    public static final String SUBMIT_RETURN_REFERRAL = """
mutation SubmitReturnReferral($input: SubmitReturnReferralInput!) {
    submitReturnReferral(input: $input) {
        __typename
        ... on OrderReturn {
            returnId
            status {
                __typename
                code
                displayText
                ... on ReturnRequested { code displayText }
                ... on ReturnOpen { code displayText }
                ... on ReturnDeclined { code displayText }
                ... on ReturnCancelled { code displayText }
                ... on ReturnClosed { code displayText }
            }
        }
        ... on ReturnNotFoundError {
            errorCode
            errorMessage
            requestedReturnId
        }
        ... on ReturnActionNotPermittedError {
            errorCode
            errorMessage
            availableActions {
                __typename
                code
                displayText
            }
        }
        ... on SubmitReturnReferralInputValidationError {
            errorCode
            errorMessage
            violations {
                __typename
                code
                displayMessage
                ... on ReturnReferralReasonViolation {
                    code
                    displayMessage
                    invalidReferralReason
                    constraint {
                        validReferralReasons {
                            __typename
                            ... on UnresponsiveTradingPartner { code displayText }
                            ... on UnableToReachAgreement { code displayText }
                            ... on RefundNotReceived { code displayText }
                            ... on NoRefundForReturnShipping { code displayText }
                            ... on ReturnedWrongItem { code displayText }
                            ... on ReturnNotReceived { code displayText }
                            ... on ReceivedEmptyBox { code displayText }
                            ... on DamagedItemReturned { code displayText }
                            ... on OtherReferralReason { code displayText }
                        }
                    }
                }
            }
        }
    }
}
        """;

    public static final String UPDATE_SELLER_RETURN_RESPONSE_RULE_CONDITION = """
mutation UpdateSellerReturnResponseRuleCondition($input: UpdateSellerReturnResponseRuleConditionInput!) {
    updateSellerReturnResponseRuleCondition(input: $input) {
        __typename
        ... on ReturnResponseRule {
            ruleId
            name
            priority
            responseStrategy { code displayText }
            status { code displayText }
            conditionSet {
                operator
                conditions {
                    __typename
                    ... on ReturnRefundRangeCondition {
                        minRefundAmount { value currency }
                        maxRefundAmount { value currency }
                    }
                    ... on ReturnReasonCondition {
                        returnReasonList {
                            __typename
                            code
                            displayText
                        }
                    }
                    ... on ReturnItemCategoryCondition {
                        categories { categoryId }
                    }
                    ... on ReturnShipmentOriginCountryCondition {
                        returnShipmentOriginCountries
                    }
                    ... on ReturnItemLocationCountryCondition {
                        itemLocationCountries
                    }
                }
            }
        }
        ... on ReturnRuleNameError {
            errorCode
            errorMessage
            containsInvalidCharacters
            duplicateRuleName
            nameConstraint {
                characterLimit { minLength maxLength }
                allowedPattern
            }
        }
        ... on ReturnRuleInvalidConditionsError {
            errorCode
            errorMessage
            ruleConditionViolation {
                __typename
                code
                displayMessage
            }
        }
        ... on ReturnRuleNotFoundError {
            errorCode
            errorMessage
            requestedRuleId
        }
    }
}
        """;

    public static final String UPDATE_SELLER_RETURN_RESPONSE_RULES_PRIORITIES = """
mutation UpdateSellerReturnResponseRulesPriorities($input: UpdateSellerReturnResponseRulesPrioritiesInput!) {
    updateSellerReturnResponseRulesPriorities(input: $input) {
        __typename
        ... on UpdateSellerReturnResponseRulesPrioritiesSuccess {
            returnResponseRules {
                ruleId
                name
                priority
                status { code displayText }
                responseStrategy { code displayText }
                conditionSet {
                    operator
                    conditions { __typename }
                }
            }
        }
        ... on ReturnRuleMissingRuleIdsError {
            errorCode
            errorMessage
            missingRuleIds
        }
        ... on ReturnRuleDuplicateRuleIdsError {
            errorCode
            errorMessage
            duplicateRuleIds
        }
        ... on ReturnRuleInvalidRuleIdsError {
            errorCode
            errorMessage
            invalidRuleIds
        }
    }
}
        """;

    public static final String UPDATE_SELLER_RETURN_RULE_STATUS = """
mutation UpdateSellerReturnRuleStatus($input: UpdateSellerReturnRuleStatusInput!) {
    updateSellerReturnRuleStatus(input: $input) {
        __typename
        ... on ReturnToAddressRule {
            ruleId
            name
            priority
            status { code displayText }
            addressRoutingStrategy {
                __typename
                ... on ReturnToSpecificAddressStrategy {
                    code
                    displayText
                    returnAddress {
                        addressId
                        addressLine1
                        addressLine2
                        city
                        stateOrProvince
                        postalCode
                        countryCode
                    }
                }
                ... on ReturnToNearestSellerAddressStrategy { code displayText }
                ... on ReturnToOriginalShipFromAddressStrategy { code displayText }
            }
        }
        ... on ReturnResponseRule {
            ruleId
            name
            priority
            status { code displayText }
            responseStrategy { code displayText }
        }
        ... on ReturnRuleNotFoundError {
            errorCode
            errorMessage
            requestedRuleId
        }
        ... on ReturnRuleStatusUpdateBlockedError {
            errorCode
            errorMessage
            requestedRuleId
        }
    }
}
        """;

    public static final String UPDATE_SELLER_RETURN_TO_ADDRESS_RULE_CONDITION = """
mutation UpdateSellerReturnToAddressRuleCondition($input: UpdateSellerReturnToAddressRuleConditionInput!) {
    updateSellerReturnToAddressRuleCondition(input: $input) {
        __typename
        ... on ReturnToAddressRule {
            ruleId
            name
            priority
            status { code displayText }
            addressRoutingStrategy {
                code
                displayText
                ... on ReturnToSpecificAddressStrategy {
                    returnAddress {
                        addressLine1
                        city
                        stateOrProvince
                        postalCode
                        countryCode
                    }
                }
            }
            conditionSet {
                operator
                conditions {
                    __typename
                    ... on ReturnShipmentOriginCountryCondition {
                        returnShipmentOriginCountries
                    }
                    ... on ReturnRefundRangeCondition {
                        minRefundAmount { value currency }
                        maxRefundAmount { value currency }
                    }
                    ... on ReturnReasonCondition {
                        returnReasonList { code displayText }
                    }
                    ... on ReturnItemCategoryCondition {
                        categories { categoryId }
                    }
                    ... on ReturnListingGroupCondition {
                        returnRuleListingGroupId
                    }
                }
            }
        }
        ... on ReturnRuleNotFoundError {
            errorCode
            errorMessage
            requestedRuleId
        }
        ... on ReturnRuleInvalidConditionsError { errorCode errorMessage }
        ... on ReturnRuleNameError {
            errorCode
            errorMessage
            containsInvalidCharacters
            duplicateRuleName
        }
        ... on ReturnToAddressRequiredError { errorCode errorMessage }
        ... on ReturnRuleMissingConditionError { errorCode errorMessage }
        ... on ReturnRuleFeatureNotEnabledError { errorCode errorMessage }
    }
}
        """;

    public static final String UPDATE_SELLER_RETURN_TO_ADDRESS_RULES_PRIORITIES = """
mutation UpdateSellerReturnToAddressRulesPriorities($input: UpdateSellerReturnToAddressRulesPrioritiesInput!) {
    updateSellerReturnToAddressRulesPriorities(input: $input) {
        __typename
        ... on UpdateSellerReturnToAddressRulesPrioritiesSuccess {
            returnToAddressRules {
                ruleId
                name
                priority
                status { code displayText }
                addressRoutingStrategy {
                    __typename
                    ... on ReturnToSpecificAddressStrategy {
                        code
                        displayText
                        returnAddress {
                            addressId
                            addressLine1
                            addressLine2
                            city
                            stateOrProvince
                            postalCode
                            countryCode
                        }
                    }
                    ... on ReturnToNearestSellerAddressStrategy { code displayText }
                    ... on ReturnToOriginalShipFromAddressStrategy { code displayText }
                }
                conditionSet {
                    operator
                    conditions { __typename }
                }
            }
        }
        ... on ReturnRuleMissingRuleIdsError {
            errorCode
            errorMessage
            missingRuleIds
        }
        ... on ReturnRuleDuplicateRuleIdsError {
            errorCode
            errorMessage
            duplicateRuleIds
        }
        ... on ReturnRuleInvalidRuleIdsError {
            errorCode
            errorMessage
            invalidRuleIds
        }
    }
}
        """;

    public static final String UPDATE_SELLER_RMA_PREFERENCE = """
mutation UpdateSellerRmaPreference($input: UpdateSellerRmaPreferenceInput!) {
    updateSellerRmaPreference(input: $input) {
        __typename
        ... on SellerReturnPreferences {
            listingMarketplace
            rmaPreference { preferenceStatus }
        }
        ... on ReturnPreferenceNotFoundError { errorCode errorMessage }
    }
}
        """;

    private ReturnOperations() {
        // Utility class
    }
}
