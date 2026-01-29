package com.kizhaku.learn.immutable;

public class Person implements Comparable<Person>
{

    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person o) {
        if (o.getFirstName().equalsIgnoreCase(this.getFirstName()) && o.getLastName().equalsIgnoreCase(this.getLastName()))
            return 0;

        return -1;
    }
}
