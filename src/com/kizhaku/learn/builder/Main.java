package com.kizhaku.learn.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.Builder()
                .withName("Kittu")
                .withAge(10)
                .withSex("F")
                .build();

        User.Builder builder = new User.Builder();
        builder.withName("Ringo");
        builder.withSex("M");

        if((int)(Math.random() * 5) > 3)
            builder.withAge(10);
        else
            builder.withAge(20);

        User user2 = builder.build();

        System.out.println(user);
        System.out.println(user2);
    }
}
