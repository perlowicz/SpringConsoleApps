package com.example.demospringapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
@Primary
public class ConsoleMessageProducer implements MessageProducer{
    @Override
    public void produceMessage() {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        System.out.println(message);
    }
}
