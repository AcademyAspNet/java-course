package ru.academy.stream.api;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamApiExample {

    static void main() {
        List<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Orange");
        words.add("Bread");
        words.add("Milk");
        words.add("Potato");

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 5) {
                result.add(word);
            }

            if (result.size() >= 3) {
                break;
            }
        }

        System.out.println("Результат:");
        System.out.println(result);
    }
}
