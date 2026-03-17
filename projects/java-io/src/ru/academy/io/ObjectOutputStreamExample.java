package ru.academy.io;

import ru.academy.io.serializable.Report;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamExample {

    static void main() {
        List<Report> reports = new ArrayList<>();

        reports.add(new Report("Отчёт №1", "... текст отчёта ..."));
        reports.add(new Report("Отчёт №2", "... текст 123 отчёта ..."));
        reports.add(new Report("Отчёт №3", "... 123 текст отчёта ..."));

        File reportFile = new File("report.bin");

        try (OutputStream outputStream = new FileOutputStream(reportFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(reports);

        } catch (FileNotFoundException exception) {
            System.err.println("Файл не найден! " + exception.getMessage());
        } catch (IOException exception) {
            System.err.println("Возникла ошибка! " + exception.getMessage());
        }
    }
}
