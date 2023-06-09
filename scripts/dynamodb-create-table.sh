#!/bin/sh

aws dynamodb create-table \
  --table-name drones-devices \
  --cli-input-json file:///dynamodb/schema-drones-devices.json \
  --endpoint-url http://database:7999 \
  --region us-east-1

aws dynamodb create-table \
  --table-name devices-list \
  --cli-input-json file:///dynamodb/schema-devices-list.json \
  --endpoint-url http://database:7999 \
  --region us-east-1

aws dynamodb batch-write-item \
  --request-items file:///dynamodb/device-list-initialisation.json \
  --endpoint-url http://database:7999 \
  --region us-east-1

tail -f /dev/null
