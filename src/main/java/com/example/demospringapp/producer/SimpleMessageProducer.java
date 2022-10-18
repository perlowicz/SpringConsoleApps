package com.example.demospringapp.producer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

// Repository class

@Repository
@Profile("simple")
public class SimpleMessageProducer implements MessageProducer{
    @Override
    public String produceMessage() {
        return "Example message: " + System.currentTimeMillis();
    }
}
