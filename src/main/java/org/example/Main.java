package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");
        list.add("Шесть");
        list.add("Шесть");
        list.add("Семь");
        list.add("Восемь");
        list.add("Девять");
        list.add("Десять");
        list.add("Десять");
        list.add("Одиннадцать");
        list.add("Двенадцать");
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");
        System.out.println(list);
        Set<String> uniqueStrings = new HashSet<>(list);
        System.out.println(uniqueStrings);
        Map<String, Integer> map = counWords(list);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<String, Integer> counWords(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : list) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;

    }
}

