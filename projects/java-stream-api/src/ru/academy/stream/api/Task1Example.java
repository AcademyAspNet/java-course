package ru.academy.stream.api;

import java.util.Arrays;
import java.util.Random;

public class Task1Example {

    static void main() {
        Random random = new Random();

        int[] randomNumbers = random
                .ints(1024)
                .toArray();

        long evenCount = Arrays.stream(randomNumbers)
                .filter(number -> number % 2 == 0)
                .count();

        long oddCount = randomNumbers.length - evenCount;

        long zeroCount = Arrays.stream(randomNumbers)
                .filter(number -> number == 0)
                .count();

        int userNumber;

        while (true) {
            String numberAsString = IO.readln("Введите число: ");

            try {
                userNumber = Integer.parseInt(numberAsString);
                break;
            } catch (NumberFormatException exception) {
                System.err.println("Указано некорректное число, попробуйте еще раз!");
            }
        }

        final int finalUserNumber = userNumber;

        long equalsCount = Arrays.stream(randomNumbers)
                .filter(number -> number == finalUserNumber)
                .count();

        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Количество чисел, равных 0: " + zeroCount);
        System.out.println("Количество чисел, равных пользовательскому числу: " + equalsCount);
    }
}
