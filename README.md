# Model for screwing DynamoDB to the Jaxel Drone Project

The purpose of this repo is to improve the creating `docker-compose.yml` skill and to develop a model which will do CRUD against DynamoDB which installed locally.

### What it does

It creates three containers, with:
- DynamoDB (port: 7999)
- AWS CLI (port: 8001)
- Spring App (port: 8080)  

And one volume with persistent DynamoDB inside

### To run the app

Clone  
`mvn clean install`  
`docker compose up`  

### Behavior

To check that one table was initialized in the DB, open the terminal in the container with AWS CLI and run:  
`aws dynamodb list-tables --endpoint-url http://database:7999`

To check that the container with spring is alive, put into your browser:  
`http://localhost:8080/`