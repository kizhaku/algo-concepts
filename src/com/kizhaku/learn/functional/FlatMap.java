package com.kizhaku.learn.functional;

import com.kizhaku.learn.model.User;

import java.util.*;
import java.util.function.Predicate;

public class FlatMap {

    public static void main(String[] args) {

        //flattenWordsFromSentence();
        //flattenLettersInSentence();
        //flattenAndDistinctWords();
        //emailsFromUsersSorted();
        parseThenSum();
        parseWithOptional();
    }

    static void flattenListofList() {
        List<List<List<String>>> lst = List.of(List.of(List.of("Joshi Math", "Rishikesh" ,"Tiruvannamalai"),
                List.of("Ujjain", "Prayagraj", "Varanasi"),
                List.of("Haridwar", "Alandi", "Rudraprayag")));
        System.out.println("Before: \n" +lst);

        List<String> listFlat = lst.stream()
                .flatMap(x -> x.stream())
                .flatMap(x -> x.stream())
                .toList();

        System.out.println("After: ");
        System.out.println(listFlat);
    }

    static void flattenWordsFromSentence() {
        //Split-and-flatten words from sentences
        List<String> sentences = List.of("hello world", "java streams rock");
        List<String> words = sentences.stream()
                .flatMap(x -> Arrays.stream(x.split("\\s")))
                .toList();

        System.out.println("Before: \n" +sentences);
        System.out.println("After: \n" +words);
    }

    static void flattenLettersInSentence() {
        //Flatten letters in sentences
        List<String> lstPlaces = List.of("Joshi Math", "Rishikesh" ,"Tiruvannamalai");
        List<String> list = lstPlaces.stream()
                .map(word -> word.replaceAll(" ", ""))
                .flatMap(word -> Arrays.stream(word.split("")))
                .toList();

        System.out.println(list);
    }

    static void flattenAndDistinctWords() {
        List<String> lines = List.of("a b c", "b c d", "d  e");

        List<String> list = lines.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .distinct()
                .toList();

        System.out.println(list);
    }

    /** Expected output
     *  ["a@gmail.com", "alice@yahoo.com", "bob@gmail.com"]
     */
    static void emailsFromUsersSorted() {
        List<User> users = List.of(
                new User("Alice", List.of("a@gmail.com", "alice@yahoo.com")),
                new User("Bob", List.of("bob@gmail.com", "a@gmail.com"))
        );

        List<String> emails = users.stream()
                .flatMap(user -> user.getEmails().stream())
                .distinct()
                .sorted()
                .toList();

        System.out.println(emails);
    }

    static void parseThenSum() {
        List<String> raw = List.of("1","x","2","y","3");
        Predicate<String> filterString = s -> {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                return false;
            }
            return true;
        };

        int sum = raw.stream()
                .filter(filterString)
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(sum);
    }

    static void parseWithOptional() {
        List<String> raw = List.of("1","x","2","y","3");
        int sum = raw.stream()
                .map(FlatMap::tryParse)
                .flatMap(Optional::stream)
                .mapToInt(s -> s)
                .sum();

        System.out.println(sum);
    }

    static Optional<Integer> tryParse(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }
}
