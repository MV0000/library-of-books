package com.example.libraryofbooks.practise.lesson_7_encapsulation.lessoncode;

import javaguru.lv.student_kristina_januskevica.lesson_3.level_4.Car;

import java.awt.*;
import java.net.URI;

public class EqualsDemo {

    public static void main(String[] args) {
        User user1 = new User(1, "Alex");
        User user2 = user1;
        User user3 = new User(1, "Alex");
        Car car1 = new Car("BWM");


        user1.equals(null);
        user1.equals(car1);


        if (user1.equals(user1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (user1.equals(user2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (user1.equals(user3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        String s1 = "Cat";

        String s3 = "Cat";

        s1.equals(s3);
        if (s1.equals(s3)) {
            System.out.println(true);
        }

    }
}
