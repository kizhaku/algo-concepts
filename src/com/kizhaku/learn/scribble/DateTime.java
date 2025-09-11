package com.kizhaku.learn.scribble;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        do {
            System.out.println("UTC time: " + utcNow);
            System.out.println("UTC time: " + Instant.now());
            System.out.println("Local time: " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now()));
            System.out.println("Local time: " + ZonedDateTime.now());
            System.out.println("Local time: " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX").format(ZonedDateTime.now()));
            System.out.println("Hello");
        } while (!scanner.nextLine().equalsIgnoreCase("exit"));

    }
}
