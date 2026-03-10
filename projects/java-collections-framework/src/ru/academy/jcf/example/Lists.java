package ru.academy.jcf.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    static void main() {
        System.out.println("Вызов метода 'listExample' для ArrayList<String>:");

        ArrayList<String> wordsAsArrayList = new ArrayList<>();
        listExample(wordsAsArrayList);

        System.out.println("Вызов метода 'listExample' для LinkedList<String>:");

        LinkedList<String> wordsAsLinkedList = new LinkedList<>();
        listExample(wordsAsLinkedList);
    }

    private static void listExample(List<String> words) {
        words.add("Один");
        words.add("Три");

        words.add(1, "Два");

        System.out.println("Добавлены три элемента:");
        System.out.println(words);

        words.remove("Один");

        System.out.println("Удален элемент с названием 'Один':");
        System.out.println(words);

        System.out.println("Элементы списка (через for-each):");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Элементы списка (через for):");

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.println((i + 1) + ". " + word);
        }

        words.clear();

        if (words.isEmpty()) {
            System.out.println("Список слов пуст.");
        } else {
            System.out.println("Список слов не пуст, его размер - " + words.size() + " шт.");
        }
    }
}
