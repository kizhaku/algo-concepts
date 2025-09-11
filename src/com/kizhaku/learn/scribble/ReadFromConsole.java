package com.kizhaku.learn.scribble;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = """
                Hello %s, your age is %s
                This is a console program written in Java
                """;

        System.out.println("Welcome to the console");
        System.out.println("Enter you name: ");
        String name = scanner.nextLine();
        System.out.println("Enter you age: ");
        String age = scanner.nextLine();
        System.out.println(message.formatted(name, age));
    }
}
