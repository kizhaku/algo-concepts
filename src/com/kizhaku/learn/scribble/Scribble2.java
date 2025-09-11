package com.kizhaku.learn.scribble;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Scribble2 {

    public static void main(String[] args) throws InterruptedException {
        AFinalClass finalClass = new AFinalClass();
        finalClass.print("Hello!");

        OuterClass outerClass = new OuterClass.InnerClass().outerFactory();
        outerClass.print("Hello from outer class");

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");

        int timer = 0;
        while (timer > 0) {
            System.out.println(LocalDateTime.now().format(format));
            Thread.sleep(1000);
            timer--;
        }

        int[] arr = {10, 20, 30};
        System.out.println(arr[0]);

        arr[0] = 25;
        System.out.println(arr[0]);

        Map<String, String> map = new HashMap<>(30);
        File fl = new File("abc.txt");
        System.out.println(fl.exists());
        //Create file

        try {
            fl.createNewFile();
            if (fl.exists()) {
                try(FileWriter fWriter = new FileWriter(fl, true)) {
                    //fWriter.write("This is a message from hello world");
                    Scanner reader = new Scanner(fl);
                    System.out.println(reader.nextLine());
                } catch (IOException iex) {
                    System.out.println(iex.getMessage());
                }
            }
                System.out.println(fl.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-------------------");
        File dir = new File("/Users/arunk/Documents/Git/Leetcode");

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File f : files) {
                System.out.println(f.getName());
            }
        }

        Map<String, String> aMap = new HashMap<>();
        aMap.put("Name", "Arun");
        aMap.put("Age", "38");
        aMap.put("Location", "Berlin");
        Iterator<Map.Entry<String, String>> iterator = aMap.entrySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getValue());
        }

        List<String> arrList = new ArrayList<>();
        arrList.add("apple");
        arrList.add("orange");
        arrList.add("banana");
        arrList.forEach(System.out::println);

        System.out.println("-----------------------");

        arrList.add(1, "coconut");
        arrList.set(3, "plum");
        arrList.forEach(System.out::println);

        System.out.println("-----------------------");

        arrList.addFirst("grapes");
        arrList.forEach(System.out::println);

        arrList.sort((v1, v2) -> v1.compareTo(v2));
        System.out.println("-----------------------");
        arrList.forEach(System.out::println);

        System.out.println("-----------------------");
        Set<String> fruitSet = Set.of("mango", "apple", "orange", "banana");
        fruitSet.forEach(System.out::println);

        System.out.println(aMap);

        Comparator<String> comp = (v1, v2) -> v2.compareTo(v1);
        Map<String, String> treeMap = new TreeMap<>(comp);

        treeMap.put("cc", "some foo1");
        treeMap.put("aa", "some foo2");
        treeMap.put("bb", "some foo3");

        System.out.println(treeMap);

        Map<String, Car> carMap = new TreeMap<>();
        carMap.put("Berlin", new Car("Swift", 2025, "Suzuki"));
        carMap.put("Hamburg", new Car("Q3", 2022, "Audi"));
        carMap.put("Munich", new Car("GWagon", 2024, "Mercedes"));
        carMap.put("Frankfurt", new Car("Swift", 2015, "Suzuki"));

        Comparator<String> carComparatorYear = (c1, c2) -> {
            if (carMap.get(c1).getModelYear() > carMap.get(c2).getModelYear()) return 1;
            if (carMap.get(c1).getModelYear() < carMap.get(c2).getModelYear()) return -1;
            return 0;
        };

        Comparator<String> carComparatorModel = Comparator.comparing(c -> carMap.get(c).getModelName());
        Comparator<String> carComparatorConstructor = Comparator.comparing(c -> carMap.get(c).getConstructor());

        Map<String, Comparator<String>> compareMap = Map.of("MODEL",carComparatorModel,
                "YEAR", carComparatorYear,
                "COMPANY", carComparatorConstructor);

        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome to car search");
            System.out.println("Below are the current options:");
            carMap.entrySet().forEach((e) -> {
                System.out.print("Location: " +e.getKey() +", Car: " +e.getValue() +"\n");
            });

            System.out.println("Choose option to sort:");
            System.out.println("Model, Year, Company \n");

            String option = scanner.nextLine().toUpperCase();
            if(option.equalsIgnoreCase("exit")) break;

            Map<String, Car> carMapSorted = new TreeMap<>(compareMap.get(option));
            carMapSorted.putAll(carMap);
            System.out.println(carMapSorted);

            /*switch (option) {
                case "MODEL" -> {
                    Map<String, Car> carMapModel = new TreeMap<>(carComparatorModel);
                    carMapModel.putAll(carMap);
                    System.out.println(carMapModel);
                }
                case "YEAR" -> {
                    Map<String, Car> carMapModel = new TreeMap<>(carComparatorYear);
                    carMapModel.putAll(carMap);
                    System.out.println(carMapModel);
                }
                case "COMPANY" -> {
                    Map<String, Car> carMapModel = new TreeMap<>(carComparatorConstructor);
                    carMapModel.putAll(carMap);
                    System.out.println(carMapModel);
                }
            }*/


        } while (!scanner.nextLine().equalsIgnoreCase("exit"));



    }
}

