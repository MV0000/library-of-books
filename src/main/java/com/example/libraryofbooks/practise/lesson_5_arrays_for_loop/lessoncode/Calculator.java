package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode;

public class Calculator {


    public Calculator() { //Это пустой конструктор
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) { //подали значение в виде firstNumber и secondNumber
        if (firstNumber > secondNumber) {
            return firstNumber; //а тут результат
        } else {
            return secondNumber; //или тут результат
        }
    }
}
