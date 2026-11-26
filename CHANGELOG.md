# ChangeLog

## 0.3.0 (11/26/2026)

### Breaking changes

- eBay lists the Post-Order API as legacy, so it is removed. For returns, cancellations and inquiries, use the GraphQL operations.
- The return rule listing group and in-store return operations are no longer in eBay's GraphQL schema, so they are removed.

- The following clients were removed:
  - `PostOrderApiClient`
- The following operations were removed from `OrderManagementGraphQLClient`:
  - `addListingsToReturnRuleListingGroupAsync`
  - `createInStoreReturnAsync`
  - `createReturnRuleListingGroupAsync`
  - `deleteReturnRuleListingGroupAsync`
  - `returnRuleListingGroupAsync`
- The following members were removed from `OrderManagementClient`:
  - `postOrderApi`
- The following operations changed signature on `FulfillmentClient`:
| Operation | Previous signature | New signature |
| --- | --- | --- |
| `getOrderAsync` | `getOrderAsync(String orderId, String fieldGroups, String accessToken, RequestOptions requestOptions)` | `getOrderAsync(String orderId, com.ebay.ordermanagement.generated.fulfillment.order.item.GetFieldGroupsQueryParameterType fieldGroups, String accessToken, RequestOptions requestOptions)` |
| `getOrdersAsync` | `getOrdersAsync(String fieldGroups, String filter, String limit, String offset, String orderIds, String accessToken, RequestOptions requestOptions)` | `getOrdersAsync(com.ebay.ordermanagement.generated.fulfillment.order.GetFieldGroupsQueryParameterType fieldGroups, String filter, String limit, String offset, String orderIds, String accessToken, RequestOptions requestOptions)` |

### Added

- The following operations were added to `FulfillmentClient`:
  - `createAdditionalShippingFulfillmentAsync`

- Local mock servers: a base URL may use plain `http` when its host is a loopback host (`127.0.0.1`, `::1` or `localhost`) that you also pass in `allowedHosts`, for example `List.of("127.0.0.1")`. Every other host still requires `https`. `OrderManagementConfiguration.LOOPBACK_HOSTS` lists the loopback hosts.

### Changed

- Updated the `fulfillment` OpenAPI document to the latest definitions.
- Updated the GraphQL schema to the latest definitions.
- `OrderManagementConfiguration.isTrustedUrl` and the auth provider and GraphQL clients apply the same rule.
- Hosts are compared lowercased and without IPv6 brackets, so `[::1]` and `::1` match.
- A rejected base URL now says whether the scheme or the host is not trusted.
- Fixed multipart uploads so `uploadEvidenceFileAsync` send the file through Kiota.

## 0.2.3 (10/28/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.3 to 2.22.4 to fix CVE-2026-110879 (GHSA-m8xf-2cr7-77ph), a critical `PolymorphicTypeValidator` bypass via generic type arguments that allows arbitrary class instantiation.

## 0.2.2 (10/15/2026)

### Dependencies

- DCCOMICS-21031: Bumped transitive `com.google.guava:guava` from 33.4.0-jre to 33.7.2-jre for Error Prone and NullAway to fix CVE-2026-102554 (SNYK-JAVA-COMGOOGLEGUAVA-20825054), an allocation of resources without limits vulnerability during deserialization.

## 0.2.1 (09/25/2026)

### Dependencies

- Bumped `com.fasterxml.jackson.core:jackson-databind` from 2.22.2 to 2.22.3.


## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`FulfillmentClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `uploadEvidenceFileAsync` | `(String paymentDisputeId, String accessToken, RequestOptions requestOptions)` | `(String paymentDisputeId, byte[] body, String accessToken, RequestOptions requestOptions)` |

`LogisticsClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createFromShippingQuoteAsync` | `(CreateShipmentFromQuoteRequest body, String accessToken, RequestOptions requestOptions)` | `(CreateShipmentFromQuoteRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |
| `createShippingQuoteAsync` | `(ShippingQuoteRequest body, String accessToken, RequestOptions requestOptions)` | `(ShippingQuoteRequest body, String xEBAYCMARKETPLACEID, String accessToken, RequestOptions requestOptions)` |

### Added

- Client `PostOrderApiClient` and member `OrderManagementClient.postOrderApi`.
#### `OrderManagementGraphQLClient`

- `bulkUpdateOrderTagsAsync`
- `commitToPurchaseAsync`
- `requestPurchaseQuoteAsync`