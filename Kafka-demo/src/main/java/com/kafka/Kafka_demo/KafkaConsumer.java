package com.kafka.Kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumer {
    @KafkaListener(topics="hello-world-topic" ,groupId = "hello-world-group")
    public void listen(String message){
        System.out.println("Received message: "+message);
    }
}