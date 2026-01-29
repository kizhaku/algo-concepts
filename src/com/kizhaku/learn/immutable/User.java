package com.kizhaku.learn.immutable;

import java.util.Objects;

public class User {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        return username.equalsIgnoreCase(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username.toLowerCase());
    }
}
