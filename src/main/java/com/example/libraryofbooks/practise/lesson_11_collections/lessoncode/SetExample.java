package com.example.libraryofbooks.practise.lesson_11_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> strings = new TreeSet<>(); //new TreeSet();

        System.out.println("A".compareTo("B")); // -1, 0, +1

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("DD2");
        strings.add("DD7");
        strings.add("DD3");
        strings.add("DD1");
        strings.add("FF2");
        strings.add("FF6");
        strings.add("FF4");
        strings.add("FF5");
        strings.add("FF8");
        strings.add("FF3");

        System.out.println("Printing set");
        for (String string : strings) {
            System.out.println(string);
        }

        strings.remove("CCC");

        System.out.println("Printing set");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
