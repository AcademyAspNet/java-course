package ru.academy.jcf.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    static void main() {
        HashSet<String> wordsAsHashSet = new HashSet<>();
        setExample(wordsAsHashSet);

        LinkedHashSet<String> wordsAsLinkedHashSet = new LinkedHashSet<>();
        setExample(wordsAsLinkedHashSet);

        TreeSet<String> wordsAsTreeSet = new TreeSet<>();
        setExample(wordsAsTreeSet);
    }

    private static void setExample(Set<String> words) {
        words.add("Хлеб");
        words.add("Молоко");
        words.add("Яблоко");
        words.add("Хлеб");
        words.add("Молоко");

        System.out.println(words);

        words.add("Один");
        words.add("Два");
        words.add("Три");

        System.out.println(words);

        for (String word : words) {
            System.out.println(word);
        }

        if (words.contains("Два")) {
            System.out.println("Во множестве слов присутствует слово 'Два', удаляем его...");
            words.remove("Два");

            System.out.println("Теперь множество выглядит следующим образом:");
            System.out.println(words);
        }
    }
}
