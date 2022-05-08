package com.example.libraryofbooks.practise.lesson_2_variables.lessoncode;

public class DogDemo {

    public static void main(String[] args) {
        Dog sharik = new Dog();
        sharik.color = "White";
        sharik.age = 4;
        sharik.hungry = false;
        sharik.name = "Sharik";

        sharik.bark();

        System.out.println(sharik.color);
        System.out.println(sharik.age);
        System.out.println(sharik.hungry);
        System.out.println(sharik.name);

        Dog bobik = new Dog();
        bobik.color = "Black";
        bobik.age = 9;
        bobik.hungry = true;
        bobik.name = "Bobik";



        System.out.println(bobik.color);
        System.out.println(bobik.age);
        System.out.println(bobik.hungry);
        System.out.println(bobik.name);

        bobik.eat();
        bobik.bark();
        System.out.println(bobik.hungry);
    }
}
