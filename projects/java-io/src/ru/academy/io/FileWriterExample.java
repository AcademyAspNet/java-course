package ru.academy.io;

import java.io.*;

public class FileWriterExample {

    static void main() {
        File outputFile = new File("output.txt");

        try (Writer writer = new FileWriter(outputFile)) {

            writer.write("Привет, мир!");

        } catch (FileNotFoundException exception) {
            System.err.println("Не удалось открыть поток ввода: " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("При работе с файлом возникла ошибка: " + exception.getMessage());
        }
    }
}
