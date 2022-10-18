package com.example.demospringapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleMessageProducer implements MessageProducer{
    @Override
    public void produceMessage() {
        System.out.println("Example message: " + System.currentTimeMillis());
    }
}
