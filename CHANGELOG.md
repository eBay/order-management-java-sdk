# ChangeLog

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
