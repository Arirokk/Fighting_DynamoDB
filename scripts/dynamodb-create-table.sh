#!/bin/sh

aws dynamodb create-table \
  --table-name drones-devices \
  --cli-input-json file:///scripts/schema.json \
  --endpoint-url http://database:7999 \
  --region us-east-1

tail -f /dev/null

# aws dynamodb list-tables --endpoint-url http://database:7999