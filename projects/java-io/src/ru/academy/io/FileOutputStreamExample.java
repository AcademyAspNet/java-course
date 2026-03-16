package ru.academy.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {

    static void main() {
        File outputFile = new File("output.txt");

        String text = "Привет!";
        byte[] textAsBytes = text.getBytes(StandardCharsets.UTF_8);

        try (OutputStream outputStream = new FileOutputStream(outputFile)) {

            outputStream.write(textAsBytes);

        } catch (FileNotFoundException exception) {
            System.err.println("Не удалось открыть поток ввода: " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("При работе с файлом возникла ошибка: " + exception.getMessage());
        }
    }
}
