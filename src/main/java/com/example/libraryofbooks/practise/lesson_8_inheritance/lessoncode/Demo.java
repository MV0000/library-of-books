package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode;

public class Demo {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Aist", 0);

        MountainBicycle mountainBicycle = new MountainBicycle("BMX", 0, 0);
        mountainBicycle.accelerate();
        mountainBicycle.accelerate();
        mountainBicycle.accelerate();
        System.out.println(mountainBicycle.getSpeed());
        System.out.println(mountainBicycle.getModel());
        System.out.println(mountainBicycle.getGear());

    }
}
