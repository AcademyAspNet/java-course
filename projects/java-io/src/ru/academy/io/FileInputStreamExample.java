package ru.academy.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileInputStreamExample {

    static void main() {
        File exampleFile = new File("example.txt");

        // try-with-resources

        try (InputStream inputStream = new FileInputStream(exampleFile)) {

            byte[] fileData = inputStream.readAllBytes();

            System.out.println("Данные в байтовом представлении:");
            System.out.println(Arrays.toString(fileData));

            String textFromFile = new String(fileData, StandardCharsets.UTF_8);

            System.out.println("Данные в текстовом представлении:");
            System.out.println(textFromFile);

        } catch (FileNotFoundException exception) {
            System.err.println("Не удалось открыть поток ввода: " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("При работе с файлом возникла ошибка: " + exception.getMessage());
        }
    }
}
