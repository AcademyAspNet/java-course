package ru.academy.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WithStreamApiExample {

    static void main() {
        List<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Orange");
        words.add("Bread");
        words.add("Milk");
        words.add("Potato");

        List<String> result = words.stream()
                .filter(word -> word.length() >= 5)
                .limit(3)
                .toList();

        System.out.println("Результат:");
        System.out.println(result);
    }
}
