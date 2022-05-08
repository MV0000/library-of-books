package com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode;

public class DogDemo {

    public static void main(String[] args) {
        Dog sharik = new Dog("White", "Sharik", 1); //14B12A

        String sharikName = sharik.name;
        System.out.println(sharikName);

        System.out.println(sharik.color);
        System.out.println(sharik.age);

        Dog bobik = new Dog("Black", "Bobik", 2);
        System.out.println(bobik.name);
        System.out.println(bobik.color);
        System.out.println(bobik.age);
    }
}
