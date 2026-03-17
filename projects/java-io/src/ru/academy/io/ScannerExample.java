package ru.academy.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExample {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();

        System.out.print("Введите целое число: ");

        while (scanner.hasNextInt()) {
            System.out.print("Введите целое число: ");

            int integer = scanner.nextInt();
            integers.add(integer);
        }

        System.out.println("Список целых чисел:");
        System.out.println(integers);
    }
}
