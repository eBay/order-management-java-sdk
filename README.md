# eBay Order Management Java SDK

A production-ready Java SDK for eBay Order Management APIs, providing unified access to Fulfillment and Logistics REST APIs plus GraphQL support.

## Features

- **Fulfillment API**: Order retrieval, shipping fulfillments, and payment dispute management (15 operations)
- **Logistics API**: Shipping quote and shipment lifecycle management (6 operations)
- **GraphQL Support**: Dynamic client for arbitrary GraphQL queries against the eBay Graph
- **Strong Typing**: Internal Kiota-generated types with public client wrappers
- **Per-call Overrides**: Pass per-request headers and access tokens alongside SDK-wide defaults

## Architecture

```
src/main/java/com/ebay/ordermanagement/
├── generated/                         # Kiota-generated REST clients (internal)
│   ├── fulfillment/
│   └── logistics/
├── clients/
│   ├── rest/
│   │   ├── FulfillmentClient.java     # REST client wrappers (public API)
│   │   └── LogisticsClient.java
│   └── graphql/
│       └── DynamicGraphQLClient.java  # GraphQL escape hatch
├── configuration/                     # SDK configuration and auth
├── exceptions/                        # SDK exceptions
└── OrderManagementClient.java         # Main SDK facade
```

## Requirements

- Java 17+
- Gradle

## Installation

```kotlin
dependencies {
    implementation("com.ebay:order-management-java-sdk:1.0.0")
}
```

## Quick Start

```java
var config = new OrderManagementConfiguration();
config.setAccessToken("your-oauth-token");

try (var sdk = new OrderManagementClient(config)) {
    // Fulfillment
    Order order = sdk.fulfillment.getOrderAsync("order-id", null, null, null).join();

    // Logistics
    ShippingQuote quote = sdk.logistics.getShippingQuoteAsync("quote-id", null, null).join();

    // GraphQL
    String query = "query($id: ID!) { order(id: $id) { status } }";
    JsonNode data = sdk.graphQL.executeRawUnsafe(query, Map.of("id", "order-id"), null, null);
}
```

Per-request headers and tokens can be passed to any method:

```java
var options = new RequestOptions();
options.addHeader("X-EBAY-C-MARKETPLACE-ID", "EBAY_US");

sdk.fulfillment.getOrderAsync("order-id", null, "per-call-token", options).join();
```

## API Operations

### Fulfillment API

| Method | Description |
|---|---|
| `getOrderAsync` | Get a specific order by ID |
| `getOrdersAsync` | Search orders with filtering and pagination |
| `issueRefundAsync` | Issue a refund for an order |
| `getShippingFulfillmentsAsync` | Get all shipping fulfillments for an order |
| `createShippingFulfillmentAsync` | Create a shipping fulfillment |
| `getShippingFulfillmentAsync` | Get a specific shipping fulfillment |
| `getPaymentDisputeAsync` | Get a specific payment dispute |
| `getPaymentDisputeSummariesAsync` | Search payment disputes with filtering |
| `getActivitiesAsync` | Get activity history for a payment dispute |
| `acceptPaymentDisputeAsync` | Accept a payment dispute |
| `contestPaymentDisputeAsync` | Contest a payment dispute |
| `addEvidenceAsync` | Add evidence to a payment dispute |
| `updateEvidenceAsync` | Update evidence for a payment dispute |
| `fetchEvidenceContentAsync` | Download evidence content |
| `uploadEvidenceFileAsync` | Upload an evidence file |

### Logistics API

| Method | Description |
|---|---|
| `createShippingQuoteAsync` | Create a shipping quote |
| `getShippingQuoteAsync` | Get a specific shipping quote |
| `createFromShippingQuoteAsync` | Create a shipment from a quote |
| `getShipmentAsync` | Get a specific shipment |
| `cancelShipmentAsync` | Cancel a shipment |
| `downloadLabelFileAsync` | Download the shipping label file |

### GraphQL API

```java
String query = """
    query GetOrder($id: ID!) {
      order(id: $id) {
        status
        lineItems { itemId title quantity }
      }
    }
    """;

JsonNode data = sdk.graphQL.executeRawUnsafe(query, Map.of("id", "order-id"), null, null);
```

> **Warning:** Never interpolate user input directly into the query string — always pass dynamic values through `variables` to avoid GraphQL injection.

## Error Handling

```java
try {
    var order = sdk.fulfillment.getOrderAsync("order-id", null, null, null).join();
} catch (GraphQLException ex) {
    System.err.println("GraphQL errors: " + ex.getErrors());
} catch (OrderManagementException ex) {
    System.err.println("SDK error: " + ex.getMessage());
}
```

## Configuration Options

| Property | Default | Description |
|---|---|---|
| `fulfillmentBaseUrl` | `https://api.ebay.com/sell/fulfillment/v1` | Fulfillment API base URL |
| `logisticsBaseUrl` | `https://api.ebay.com/sell/logistics/v1` | Logistics API base URL |
| `graphQLBaseUrl` | `https://apig.ebay.com/graphql` | GraphQL API endpoint |
| `accessToken` | `null` | Static fallback token; per-call token takes precedence |
| `defaultRequestOptions` | `RequestOptions()` | Default headers applied to all SDK calls |
| `diagnosticLogging` | `false` | Enable diagnostic request/response logging |

## Specs

OpenAPI specs and the GraphQL schema are in `specs/`:

- `sell_fulfillment_v1_oas3.yaml` — Fulfillment V1
- `sell_logistics_v1_oas3.yaml` — Logistics V1
- `eBay_Graph.graphqls` — eBay Graph schema

## License

Apache 2.0 © 2026 eBay Inc. See [LICENSE](LICENSE) for details.
