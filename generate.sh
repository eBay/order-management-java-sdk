#!/bin/bash
set -e
echo "Generating Order Management Java SDK with Kiota..."
rm -rf src/main/java/com/ebay/ordermanagement/generated

echo "Generating Fulfillment API client..."
kiota generate -l java -d specs/openapi/fulfillment.yaml \
  -c FulfillmentApiClient -n com.ebay.ordermanagement.generated.fulfillment \
  -o src/main/java/com/ebay/ordermanagement/generated/fulfillment --ebc --co

echo "Generating Logistics API client..."
kiota generate -l java -d specs/openapi/logistics.yaml \
  -c LogisticsApiClient -n com.ebay.ordermanagement.generated.logistics \
  -o src/main/java/com/ebay/ordermanagement/generated/logistics --ebc --co


echo "Adding license headers to generated files..."
./add-license-headers.sh ./src
echo "Code generation complete!"
