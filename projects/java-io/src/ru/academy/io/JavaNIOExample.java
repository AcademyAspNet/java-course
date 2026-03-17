package ru.academy.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JavaNIOExample {

    static void main() throws IOException {
        Path relativeFilePath = Path.of("example.txt");
        System.out.println("Относительный путь: " + relativeFilePath);

        Path absoluteFilePath = relativeFilePath.toAbsolutePath();
        System.out.println("Абсолютный путь: " + absoluteFilePath);

        Path rootPath = absoluteFilePath.getRoot();
        System.out.println("Корень диска: " + rootPath);

        Path directoryPath = Path.of("abc", "123", "321");
        System.out.println("Исходный путь к директории: " + directoryPath);

        Path resolvedFilePath = directoryPath.resolve(relativeFilePath);
        System.out.println("Новый путь к файлу: " + resolvedFilePath);

        String fileContentAsString = Files.readString(relativeFilePath);
        System.out.println("Текст из файла: " + fileContentAsString);

        List<String> fileContentAsList = Files.readAllLines(relativeFilePath);
        System.out.println(fileContentAsList);
    }
}
