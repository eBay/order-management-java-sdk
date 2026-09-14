# ChangeLog

## 0.2.0 (09/14/2026)

### Breaking changes

#### Changed signatures

`FulfillmentClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `uploadEvidenceFileAsync` | `(String, String, RequestOptions)` | `(String, byte[], String, RequestOptions)` |

`LogisticsClient`:

| Operation | Previous parameters | Current parameters |
| --- | --- | --- |
| `createFromShippingQuoteAsync` | `(CreateShipmentFromQuoteRequest, String, RequestOptions)` | `(CreateShipmentFromQuoteRequest, String, String, RequestOptions)` |
| `createShippingQuoteAsync` | `(ShippingQuoteRequest, String, RequestOptions)` | `(ShippingQuoteRequest, String, String, RequestOptions)` |

### Added

- Client `PostOrderApiClient` and member `OrderManagementClient.postOrderApi`.
#### `OrderManagementGraphQLClient`

- `bulkUpdateOrderTagsAsync`
- `commitToPurchaseAsync`
- `requestPurchaseQuoteAsync`
