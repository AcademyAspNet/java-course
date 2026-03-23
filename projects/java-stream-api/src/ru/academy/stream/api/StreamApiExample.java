package ru.academy.stream.api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiExample {

    static void main() {
//        example1();
        example2();
    }

    private static void example1() {
        int[] numbers = { 10, 40, 20, 30, 70, 90, 80, 7, 5, 12, 0, -100, 5 };

        int[] result = Arrays.stream(numbers)
                .filter(number -> number > -10 && number < 10)
                .sorted()
                .limit(2)
                .toArray();

        System.out.println("Результат:");
        System.out.println(Arrays.toString(result));
    }

    private static void example2() {
        List<Integer> result = Stream.of(10, 40, 20, 30, 70, 90, 80, 7, 5, 12, 0, -100, 5)
                .filter(number -> number > -10 && number < 10)
                .sorted()
                .limit(2)
                .toList();

        System.out.println("Результат:");
        System.out.println(result);
    }
}
