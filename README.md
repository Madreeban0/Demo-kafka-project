Kafka Hello World Demo

This project is a simple demonstration of Apache Kafka, where a producer sends a "Hello World" message and a consumer receives it. It is implemented using Java with three main files:

KafkaProducer.java – sends messages to a Kafka topic

KafkaConsumer.java – listens and consumes messages from a Kafka topic

HelloWorldController.java – REST controller to trigger message production

🔹 What is Apache Kafka?

Apache Kafka is an event streaming platform that allows applications to publish and subscribe to streams of records in real time. In simple terms:

Producer → sends messages

Broker (Kafka server) → stores and manages messages

Consumer → reads messages

Kafka is widely used for building systems that need to handle high-throughput, real-time data.

🔹 How This Project Works

Start Kafka in KRaft mode (no Zookeeper required).

Run this Spring Boot application.

Use the REST endpoint in HelloWorldController to send the "Hello World" message.

The message will be published by the producer and received by the consumer.

🔹 Requirements

Java 21 (or compatible version)

Apache Kafka (KRaft mode) running locally

Maven/Gradle to build and run the Spring Boot project

🔹 Running the Project

Start Kafka (KRaft mode)

bin/kafka-server-start.sh config/kraft/server.properties


Create a topic (example: hello-topic)

bin/kafka-topics.sh --create --topic hello-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1


Run the Spring Boot app

mvn spring-boot:run


Trigger the Producer
Call the REST endpoint (e.g., using curl or Postman):

curl http://localhost:8080/produce


See the Consumer Output
The console will log the "Hello World" message consumed.

🔹 Project Structure
src/main/java/com/example/kafka/
│── KafkaProducer.java
│── KafkaConsumer.java
│── HelloWorldController.java

🔹 Why This Project?

To understand the basic flow of Kafka

To see how a producer and consumer communicate

To provide a minimal working example for beginners
