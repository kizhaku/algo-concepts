package com.kizhaku.learn.immutable;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Create an immutable User class.
 * The class must have one non-static field:
 *
 * String username
 * username:
 * must not be null or blank
 * comparison is case-insensitive ("John" and "john" are the same user)
 *
 * Create an in-memory collection that stores unique users.
 *
 * No two users with the same username (case-insensitive) are allowed.
 * Create a main / runner class.
 * Print all stored usernames:
 * one per line
 * any order
 * preferably using Java Streams
 *
 * Definition of Done
 * In main, add:
 * "alice"
 * "bob"
 * Run → output:
 *
 * alice
 * bob
 *
 * Modify main to add "ALICE" again.
 *
 * Run → output must still be:
 * alice
 * bob
 */
public class Main {

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        User user1 = new User("Alice");
        User user2 = new User("bob");
        User user3 = new User("ALICE");
        User user4 = new User("alice");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

       // users.forEach(u -> System.out.println(u.getUsername()));

        //Person

        Comparator<Person> comp = (o1, o2) -> {
                if (o1.getFirstName().equalsIgnoreCase(o2.getFirstName())
                        && o1.getLastName().equalsIgnoreCase(o2.getLastName()))
                    return 0;

                return -1;
        };

        Set<Person> persons = new TreeSet<>();
        Person person1 = new Person("John", "Smith");
        Person person2 = new Person("Alice", "Brown");
        Person person3 = new Person("john", "SMITH");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);


        persons.forEach(p -> System.out.println(p.getFirstName() +" "+ p.getLastName()));

        System.out.println("---------------------");

        Set<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");
        set.add("d");
        set.add("c");

        set.forEach(System.out::println);
    }

}
