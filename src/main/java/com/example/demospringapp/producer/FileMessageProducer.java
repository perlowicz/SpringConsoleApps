package com.example.demospringapp.producer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

@Repository
@Profile("file")
public class FileMessageProducer implements MessageProducer{
    @Override
    public String produceMessage() {
        Path path = getPath();
        try {
            return String.join("", Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Path getPath() {
        System.out.println("Podaj nazwę pliku z komunikatem do odczytania");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        return Path.of(fileName);
    }
}
