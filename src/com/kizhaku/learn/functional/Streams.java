package com.kizhaku.learn.functional;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> placesInIndia = List.of("Joshi Math", "Rishikesh" ,"Tiruvannamalai", "Puducherry",
                "Ujjain", "Prayagraj", "Varanasi", "Haridwar", "Alandi", "Rudraprayag", "Coimbatore");

        Stream<String> sortedPlacesInIndia = placesInIndia.stream()
                .peek(p -> System.out.println("Before sorting: " + p))
                .sorted()
                .map(p -> "India: " + p);

        System.out.println("After sorting:");
        System.out.println(sortedPlacesInIndia.toList());

        Map<String, String> places = Map.of("India", "Delhi", "UK", "London",
                "Sri Lanka", "Colombo", "Japan", "Tokyo", "Germany", "Berlin");

        Map<String, String> collect = places.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> "Capital is: " + e.getValue()
                ));

    }
}
