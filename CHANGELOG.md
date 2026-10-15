# ChangeLog

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