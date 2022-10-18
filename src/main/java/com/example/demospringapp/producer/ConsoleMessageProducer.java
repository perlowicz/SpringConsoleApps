package com.example.demospringapp.producer;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

//Repository class

@Service
@Profile("console")
public class ConsoleMessageProducer implements MessageProducer{

    private final Scanner scanner;

    public ConsoleMessageProducer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String produceMessage() {
        System.out.println("Wpisz dowolny tekst:");
        return scanner.nextLine();
    }
}
