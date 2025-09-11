package com.kizhaku.learn.dsa;

import com.kizhaku.learn.model.Student;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {

    public static void main(String[] args) {
        hashMap();
        //linkedHashMap();
        //concurrentHashMap();
        //treeMapDefault();
        //treeMapCustom();
    }

    /**
     *  Backed by an array.
     *  Key is hashed.
     *  Doesn't maintain insertion order.
     *  O(1) for add and lookup in average. O(log n) in worst case. Stored as Btree on high collision beyond threshold.
     */
    static void hashMap() {
        Map<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("UK", "London");
        countryCapitals.put("India", "Delhi");

        //countryCapitals.computeIfAbsent("Germany", s -> "Berlin");

        System.out.println(countryCapitals);
    }

    /**
     *  Maintains insertion order.
     */
    static void linkedHashMap() {
        Map<String, String> countryCapitals = new LinkedHashMap<>();
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("UK", "London");
        countryCapitals.put("India", "Delhi");

        System.out.println(countryCapitals);
    }

    /**
     *  Thread safe.
     */
    static void concurrentHashMap() {
        Map<String, String> countryCapitals = new ConcurrentHashMap<>();
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("UK", "London");
        countryCapitals.put("India", "Delhi");

        System.out.println(countryCapitals);
    }

    /**
     *  Data stored in a tree.
     *  By default key sorted by natural order.
     *  A comparator can be passed in constructor for custom order.
     */
    static void treeMapDefault() {
        Map<String, String> countryCapitals = new TreeMap<>();
        countryCapitals.put("India", "Delhi");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("UK", "London");

        System.out.println(countryCapitals);
    }

    static void treeMapCustom() {
        // Order by the ID of the student.
        Map<Student, String> students = new TreeMap<>(Comparator.comparing(Student::getId));

        /* Without method reference.
            Map<Student, String> students = new TreeMap<>((o1, o2) -> {
                return o1.getId().compareTo(o2.getId());
            });
        */

        Student student1 = new Student("Kittu", "1", "Catology");
        Student student2 = new Student("Ringo", "2", "Dogology");
        Student student3 = new Student("Anand", "3", "Elephantology");

        students.put(student1, student1.getName());
        students.put(student2, student2.getName());
        students.put(student3, student3.getName());

        System.out.println(students);
    }

}
