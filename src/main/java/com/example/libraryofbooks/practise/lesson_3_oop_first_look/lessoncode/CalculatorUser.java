package com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode;

public class CalculatorUser {

    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        int sumResult = myCalc.sum(1, 2);

        System.out.println("Sum operation: " + sumResult);
    }
}
