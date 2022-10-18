package com.example.demospringapp;

import com.example.demospringapp.producer.MessageProducer;
import org.springframework.stereotype.Service;

//Class where Spring inject beans of producer classes with constructor
//Business logic class
@Service
public class MessagePrinter {
    private final MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
    void printMessage(){
        System.out.println(messageProducer.produceMessage());
    }
}
