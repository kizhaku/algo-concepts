package com.kizhaku.learn.scribble;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Scribble {
    public static void main(String[] args) {
        ScribbleInner scribbleInner = new ScribbleInner();
        scribbleInner.foo();

        System.out.println("Day is " +DaysEnum.MONDAY +" which is day " +DaysEnum.MONDAY.getDayInt() +" of week");
        System.out.println("-----------------");

        String displayOut = """
                Day is %s
                which is day %s of week
                and a %s.
                """
                .formatted(DaysEnum.MONDAY, DaysEnum.MONDAY.getDayInt(), DaysEnum.MONDAY.getWeekday());

        System.out.println(displayOut);

        AFuncInterface afunc = () -> System.out.println("Hello from afunc");
        afunc.display();

        String str = "Howdy";
        str.toUpperCase();
        System.out.println(str);

        System.out.println("Helloo\rWorld");
        System.out.println("------------");

        List<String> lst = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        lst.forEach(System.out::println);

        System.out.println("------------");
        lst.set(1, "coconut");
        lst.forEach(System.out::println);

        BigDecimal bd = new BigDecimal("13.656");
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Bigdecimal: " +bd);

        int t = 13;
        float t2 = 1.2f;
        int mult = t * (int)t2;
        double mult2 = t * t2;

        System.out.println(mult);
        System.out.println(t*t2);
        System.out.println(mult2);
        System.out.println(String.format("%.2f", mult2));
        System.out.println(5%2);
        System.out.println((int)(Math.random() * 20));

        int day = (int)(Math.random() * 7) + 1;
        System.out.println("Day is: " +day);

        switch (day) {
            case 1 -> System.out.println("It is " +DaysEnum.MONDAY);
            case 2 ->  System.out.println("It is " +DaysEnum.TUESDAY);
            case 3 ->  System.out.println("It is " +DaysEnum.WEDNESDAY);
            case 4 ->  System.out.println("It is " +DaysEnum.THURSDAY);
            case 5 ->  System.out.println("It is " +DaysEnum.FRIDAY);
            case 6, 7 -> {
                if (day == 6)
                    System.out.println("It is " +DaysEnum.SATURDAY);
                else
                    System.out.println("It is " +DaysEnum.SUNDAY);

                System.out.println("It is also a weekend");
            }
            default -> System.out.println("Thats not a correct day");
        }

        Map<String, Supplier<String>> map = Map.of("Monday", () -> "Hello weekday",
                "Saturday", () -> "Hello weekend");

        System.out.println(map.getOrDefault("Tuesday", () -> "Sorry, I dont understand the day").get());

        {
            int codeVar = 10;
            System.out.println("This is code in a block " +codeVar);
        }

    }

    static {
        System.out.println("This code executes once per class when loaded before main itself");
    }

    static class ScribbleInner {
        void foo() {

        }
    }
}


