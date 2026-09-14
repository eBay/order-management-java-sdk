# ChangeLog

## 1.1.0 (09/14/2026)

- The following clients were added:
  - `PostOrderApiClient`
- The following members were added to `OrderManagementClient`:
  - `postOrderApi`

## 1.0.0 (09/14/2026)

**Breaking changes**
- The following operations changed signature on `FulfillmentClient`:
  - `uploadEvidenceFileAsync`: `(String, String, RequestOptions)` → `(String, byte[], String, RequestOptions)`
- The following operations changed signature on `LogisticsClient`:
  - `createFromShippingQuoteAsync`: `(CreateShipmentFromQuoteRequest, String, RequestOptions)` → `(CreateShipmentFromQuoteRequest, String, String, RequestOptions)`
  - `createShippingQuoteAsync`: `(ShippingQuoteRequest, String, RequestOptions)` → `(ShippingQuoteRequest, String, String, RequestOptions)`

- The following operations were added to `OrderManagementGraphQLClient`:
  - `bulkUpdateOrderTagsAsync`
  - `commitToPurchaseAsync`
  - `requestPurchaseQuoteAsync`
