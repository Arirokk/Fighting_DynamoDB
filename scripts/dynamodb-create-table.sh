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

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "engine"}}'

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "desc_asc"}}'

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "horiz_obstacle"}}'

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "vert_obstacle"}}'

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "gps"}}'

aws dynamodb put-item --endpoint-url http://database:7999 \
  --table-name devices-list \
  --item \
  '{"device_name": {"S": "gas_exploration"}}'

tail -f /dev/null
