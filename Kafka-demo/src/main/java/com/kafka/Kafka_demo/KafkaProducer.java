package com.kafka.Kafka_demo;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public record KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {

    public void sendMessage(String message) {
        kafkaTemplate.send("hello-world-topic", message);
    }
}