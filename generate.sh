#!/bin/bash
set -e
echo "Generating Order Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/ordermanagement/generated

echo "Generating Fulfillment API client..."
kiota generate -l java -d specs/sell_fulfillment_v1_oas3.yaml \
  -c FulfillmentApiClient -n com.ebay.ordermanagement.generated.fulfillment \
  -o src/main/java/com/ebay/ordermanagement/generated/fulfillment --ebc --co

echo "Generating Logistics API client..."
kiota generate -l java -d specs/sell_logistics_v1_oas3.yaml \
  -c LogisticsApiClient -n com.ebay.ordermanagement.generated.logistics \
  -o src/main/java/com/ebay/ordermanagement/generated/logistics --ebc --co

echo "Code generation complete!"
