package ru.academy.io;

import java.io.*;
import java.util.List;

public class FileReaderExample {

    static void main() {
        File exampleFile = new File("example.txt");

        try (Reader reader = new FileReader(exampleFile)) {

            List<String> lines = reader.readAllLines();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println((i + 1) + ". " + lines.get(i));
            }

        } catch (FileNotFoundException exception) {
            System.err.println("Не удалось открыть поток ввода: " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("При работе с файлом возникла ошибка: " + exception.getMessage());
        }
    }
}
