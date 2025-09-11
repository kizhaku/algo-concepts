package com.kizhaku.learn.functional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {

    /**
     * Group Words by First Letter
     */

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "apricot", "blueberry", "avocado");

        //Collectors.groupingBy(Tell on what key you want to group)
        Map<Character, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        //Imperative
        Map<Character, List<String>> collect_v2 = new HashMap<>();
        for (String word : words) {
            Character firstLetter = word.charAt(0);
            //if (!collect_v2.containsKey(firstLetter)) {
            //    collect_v2.put(firstLetter, new ArrayList<>(words.size()));
            //}
            //collect_v2.get(firstLetter).add(word);

            collect_v2.computeIfAbsent(firstLetter, f -> new ArrayList<>())
                    .add(word);
        }

        System.out.println(collect);
        System.out.println(collect_v2);
    }
}
