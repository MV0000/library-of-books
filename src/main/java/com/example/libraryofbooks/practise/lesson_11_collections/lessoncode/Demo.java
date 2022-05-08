package com.example.libraryofbooks.practise.lesson_11_collections.lessoncode;

public class Demo {

    public static void main(String[] args) {
        Pen pen1 = new Pen("White", 10);
        Pen pen2 = new Pen("White", 10);

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
    }
}
