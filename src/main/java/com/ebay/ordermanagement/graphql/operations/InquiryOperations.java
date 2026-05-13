package com.ebay.ordermanagement.graphql.operations;

/**
 * GraphQL query and mutation constants for Inquiry operations.
 *
 * Contains 6 inquiry operations:
 * - ORDER_INQUIRY
 * - PROCESS_ORDER_INQUIRY_REFUND
 * - PROVIDE_SHIPMENT_INFO_FOR_ITEM_NOT_RECEIVED_INQUIRY
 * - SELLER_ORDER_INQUIRIES
 * - SEND_ORDER_INQUIRY_MESSAGE
 * - SUBMIT_ORDER_INQUIRY_REFERRAL
 */
public final class InquiryOperations {

    public static final String ORDER_INQUIRY = """
query OrderInquiry($input: OrderInquiryInput!) {
    orderInquiry(input: $input) {
        __typename
        ... on OrderInquirySuccess {
            orderInquiry {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    status {
                        __typename
                        ... on OrderInquiryOpen { code displayText }
                        ... on OrderInquiryClosed { code displayText }
                    }
                    createdAt
                    closedAt
                    initiator
                    responder
                    inquirers
                    lineItems {
                        inquiryLineItemId
                        quantity
                        orderLineItem { orderLineItemId }
                    }
                    sellerAvailableActions {
                        respondByAction {
                            respondAction { code displayText }
                            responseDueAt
                        }
                        secondaryActions {
                            code
                            displayText
                            ... on OrderInquiryRefundAction { code displayText }
                            ... on OrderInquiryReferralAction {
                                code
                                displayText
                                referralReasons {
                                    ... on ConfirmedDelivery { code displayText }
                                    ... on BuyerConfirmedDelivery { code displayText }
                                    ... on RefundedBuyer { code displayText }
                                }
                            }
                        }
                    }
                    requestedInformation {
                        ... on ShipmentTrackingInformationRequested { requester requestedAt }
                        ... on SignatureConfirmationRequested { requester requestedAt }
                    }
                    providedInformation {
                        submitter
                        submittedAt
                        submittedInformation {
                            __typename
                            ... on OrderInquiryShipmentTracking {
                                trackingNumber
                                shippingCarrier { carrierCode unsupportedCarrierName }
                            }
                            ... on OrderInquirySignatureConfirmation {
                                trackingNumber
                                signatureConfirmationProof {
                                    documentId
                                    filenameExtension
                                    documentName
                                    uploadedAt
                                }
                            }
                        }
                    }
                    cases {
                        caseId
                        status {
                            ... on PostPurchaseCaseOpen { code displayText }
                            ... on PostPurchaseCaseClosed { code displayText }
                        }
                        initiator
                        reason { code displayText }
                    }
                }
            }
        }
        ... on OrderInquiryNotFoundError { errorCode errorMessage }
    }
}
        """;

    public static final String PROCESS_ORDER_INQUIRY_REFUND = """
mutation ProcessOrderInquiryRefund($input: ProcessOrderInquiryRefundInput!) {
    processOrderInquiryRefund(input: $input) {
        __typename
        ... on ProcessOrderInquiryRefundSuccess {
            orderInquiry {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    status {
                        __typename
                        ... on OrderInquiryOpen { code displayText }
                        ... on OrderInquiryClosed { code displayText }
                    }
                    createdAt
                    closedAt
                    initiator
                    responder
                    inquirers
                    lineItems {
                        inquiryLineItemId
                        quantity
                        orderLineItem { orderLineItemId }
                    }
                    sellerAvailableActions {
                        respondByAction {
                            respondAction { code displayText }
                            responseDueAt
                        }
                        secondaryActions { code displayText }
                    }
                    refunds { refundId }
                }
            }
        }
        ... on OrderInquiryActionNotPermittedError {
            errorCode
            errorMessage
            availableActions { code displayText }
        }
        ... on OrderInquiryNotFoundError {
            errorCode
            errorMessage
            inquiryId
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

    public static final String PROVIDE_SHIPMENT_INFO_FOR_ITEM_NOT_RECEIVED_INQUIRY = """
mutation ProvideShipmentInfoForItemNotReceivedInquiry($input: ProvideShipmentInfoForItemNotReceivedInquiryInput!) {
    provideShipmentInfoForItemNotReceivedInquiry(input: $input) {
        __typename
        ... on ProvideShipmentInfoForItemNotReceivedInquirySuccess {
            orderInquiry {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    providedInformation {
                        submitter
                        submittedAt
                        submittedInformation {
                            __typename
                            ... on OrderInquiryShipmentTracking {
                                trackingNumber
                                shippingCarrier { carrierCode unsupportedCarrierName }
                            }
                            ... on OrderInquirySignatureConfirmation {
                                trackingNumber
                                signatureConfirmationProof {
                                    documentId
                                    filenameExtension
                                    documentName
                                    uploadedAt
                                }
                            }
                        }
                    }
                }
            }
        }
        ... on OrderInquiryActionNotPermittedError {
            errorCode
            errorMessage
            availableActions { code displayText }
        }
        ... on OrderInquiryNotFoundError {
            errorCode
            errorMessage
            inquiryId
        }
        ... on ProvideShipmentInfoForInquiryInputValidationError {
            errorCode
            errorMessage
            violations { code displayMessage }
        }
    }
}
        """;

    public static final String SELLER_ORDER_INQUIRIES = """
query SellerOrderInquiries($input: SellerOrderInquiriesInput!) {
    sellerOrderInquiries(input: $input) {
        __typename
        ... on SellerOrderInquiries {
            orderInquiries {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    status {
                        __typename
                        ... on OrderInquiryOpen { code displayText }
                        ... on OrderInquiryClosed { code displayText }
                    }
                    createdAt
                    closedAt
                    initiator
                    responder
                    inquirers
                    lineItems {
                        inquiryLineItemId
                        quantity
                        orderLineItem { orderLineItemId }
                    }
                    sellerAvailableActions {
                        respondByAction {
                            respondAction { code displayText }
                            responseDueAt
                        }
                        secondaryActions { code displayText }
                    }
                }
            }
            pagination {
                nextCursor
                previousCursor
            }
        }
        ... on OrderInquiryInvalidDateRangeError { errorCode errorMessage }
        ... on OrderInquiryInvalidPageSizeError {
            errorCode
            errorMessage
            maxAllowedPageSize
            minAllowedPageSize
            requestedPageSize
        }
        ... on OrderInquiryInvalidSearchInputError { errorCode errorMessage }
    }
}
        """;

    public static final String SEND_ORDER_INQUIRY_MESSAGE = """
mutation SendOrderInquiryMessage($input: SendOrderInquiryMessageInput!) {
    sendOrderInquiryMessage(input: $input) {
        __typename
        ... on SendOrderInquiryMessageSuccess {
            orderInquiry {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    status {
                        __typename
                        ... on OrderInquiryOpen { code displayText }
                        ... on OrderInquiryClosed { code displayText }
                    }
                    createdAt
                    closedAt
                    initiator
                    responder
                    inquirers
                    lineItems {
                        inquiryLineItemId
                        quantity
                        orderLineItem { orderLineItemId }
                    }
                    sellerAvailableActions {
                        respondByAction {
                            respondAction { code displayText }
                            responseDueAt
                        }
                        secondaryActions { code displayText }
                    }
                    requestedInformation {
                        ... on ShipmentTrackingInformationRequested { requester requestedAt }
                        ... on SignatureConfirmationRequested { requester requestedAt }
                    }
                    providedInformation {
                        submitter
                        submittedAt
                        submittedInformation {
                            __typename
                            ... on OrderInquiryShipmentTracking {
                                trackingNumber
                                shippingCarrier { carrierCode unsupportedCarrierName }
                            }
                            ... on OrderInquirySignatureConfirmation {
                                trackingNumber
                                signatureConfirmationProof {
                                    documentId
                                    filenameExtension
                                    documentName
                                    uploadedAt
                                }
                            }
                        }
                    }
                    cases {
                        caseId
                        status {
                            __typename
                            ... on PostPurchaseCaseOpen { code displayText }
                            ... on PostPurchaseCaseClosed { code displayText }
                        }
                        reason { code displayText }
                    }
                    refunds { refundId }
                }
            }
        }
        ... on OrderInquiryNotFoundError {
            errorCode
            errorMessage
            inquiryId
        }
        ... on OrderInquiryActionNotPermittedError {
            errorCode
            errorMessage
            availableActions { code displayText }
        }
        ... on SendOrderInquiryMessageInputValidationError {
            errorCode
            errorMessage
            violations { code displayMessage }
        }
    }
}
        """;

    public static final String SUBMIT_ORDER_INQUIRY_REFERRAL = """
mutation SubmitOrderInquiryReferral($input: SubmitOrderInquiryReferralInput!) {
    submitOrderInquiryReferral(input: $input) {
        __typename
        ... on SubmitOrderInquiryReferralSuccess {
            orderInquiry {
                __typename
                ... on ItemNotReceivedInquiry {
                    inquiryId
                    status {
                        __typename
                        ... on OrderInquiryOpen { code displayText }
                        ... on OrderInquiryClosed { code displayText }
                    }
                    createdAt
                    closedAt
                    initiator
                    responder
                    inquirers
                    lineItems {
                        inquiryLineItemId
                        quantity
                        orderLineItem { orderLineItemId }
                    }
                    sellerAvailableActions {
                        respondByAction {
                            respondAction { code displayText }
                            responseDueAt
                        }
                        secondaryActions { code displayText }
                    }
                    cases {
                        caseId
                        status {
                            __typename
                            ... on PostPurchaseCaseOpen { code displayText }
                            ... on PostPurchaseCaseClosed { code displayText }
                        }
                        initiator
                        reason { code displayText }
                    }
                    refunds { refundId }
                }
            }
        }
        ... on OrderInquiryActionNotPermittedError {
            errorCode
            errorMessage
            availableActions { code displayText }
        }
        ... on OrderInquiryNotFoundError {
            inquiryId
            errorCode
            errorMessage
        }
        ... on SubmitOrderInquiryReferralInputValidationError {
            errorCode
            errorMessage
            violations { code displayMessage }
        }
    }
}
        """;

    private InquiryOperations() {
        // Utility class
    }
}
