package ru.academy.io;

import java.io.*;
import java.util.Random;

public class OutputStreamOverride {

    static void main() throws IOException {
        File outputFile = new File("output.log");

        OutputStream outputStream = new FileOutputStream(outputFile);
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        System.out.println("Hello, world!");
        System.out.println("Привет, мир!");

        Random random = new Random();
        int randomNumber = random.nextInt();

        System.out.println("Случайное число: " + randomNumber);
    }
}
