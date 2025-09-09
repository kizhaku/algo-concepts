package com.learn.leetcode.model;

import java.util.List;

public class User {

    String name;
    List<String> emails;

    public User(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }
}
