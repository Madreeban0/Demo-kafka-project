package com.kafka.Kafka_demo;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {
    private final KafkaProducer kafkaProducer;


    public Helloworldcontroller(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public String sendMessage(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return "Message sent to kafka";
    }
}