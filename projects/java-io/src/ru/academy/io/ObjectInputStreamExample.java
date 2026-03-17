package ru.academy.io;

import ru.academy.io.serializable.Report;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamExample {

    static void main() {
        File reportFile = new File("report.bin");

        try (InputStream inputStream = new FileInputStream(reportFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            List<Report> report = (ArrayList<Report>) objectInputStream.readObject();
            System.out.println(report);

        } catch (FileNotFoundException exception) {
            System.err.println("Файл не найден! " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("Возникла ошибка! " + exception.getMessage());
        } catch (ClassNotFoundException exception) {
            System.err.println("Класс не найден! " + exception.getMessage());
        }
    }
}
