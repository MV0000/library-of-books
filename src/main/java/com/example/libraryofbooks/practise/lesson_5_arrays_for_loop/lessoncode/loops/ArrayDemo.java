package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.loops;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class ArrayDemo {

    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
           System.out.println("i = " + i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Hello");
        }

        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Sum = " + sum);
            sum = sum * i;
            System.out.println(" * " + i + " = " + sum);
        }

        System.out.println(sum);



        System.out.println("Line after for");
    }
}
