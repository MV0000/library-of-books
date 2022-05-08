package com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode;

public class Dog {

    String color;
    String name;
    boolean hungry;
    int age;

    //default constructor
    public Dog(String color, String name, int age) {
        this.color = color; //White
        this.name = name; //Sharik
        this.age = age; //1
    }

    public void run() {

    }

    public void bark() {
        System.out.println("Gav gav...");
    }

    public void eat() {
        hungry = false;
    }

    public String getColor() {
        return color;
    }
}
