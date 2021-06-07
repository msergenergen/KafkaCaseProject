# Spring Boot with Kafka Example

This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic.

## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## List Topics
- `bin/kafka-topics.sh --list --zookeeper localhost:2181`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Location_json`

## Consume from the Kafka Topic via Console
- `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Location_json --from-beginning`

## Produce from the Kafka Topic via Console
- `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Location_json`

