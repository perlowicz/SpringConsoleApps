package com.example.demospringapp.producer;

//Interface that adds abstraction to our logic
// so we can use every impl of this interface in "Message Printer" constructor

public interface MessageProducer {
    String produceMessage();
}
