package ru.academy.jcf.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    static void main() {
        HashMap<String, String> dictionaryAsHashMap = new HashMap<>();
        mapExample(dictionaryAsHashMap);

        LinkedHashMap<String, String> dictionaryAsLinkedHashMap = new LinkedHashMap<>();
        mapExample(dictionaryAsLinkedHashMap);

        TreeMap<String, String> dictionaryAsTreeMap = new TreeMap<>();
        mapExample(dictionaryAsTreeMap);
    }

    private static void mapExample(Map<String, String> map) {
        map.put("Хлеб", "Bread");
        map.put("Молоко", "Milk");
        map.put("Яблоко", "Apple");

        String milkInEnglish = map.get("Молоко");
        System.out.println("Молоко на английском это " + milkInEnglish);

        System.out.println(map);

        map.put("Яблоко", "-");
        System.out.println(map);

        map.put("Один", "One");
        map.put("Два", "Two");
        map.put("Три", "Three");

        for (var keyValuePair : map.entrySet()) {
            System.out.println("Ключ: " + keyValuePair.getKey() + ", Значение: " + keyValuePair.getValue());
        }
    }
}
