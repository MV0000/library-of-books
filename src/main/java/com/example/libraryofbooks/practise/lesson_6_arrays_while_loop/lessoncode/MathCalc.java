package com.example.libraryofbooks.practise.lesson_6_arrays_while_loop.lessoncode;

public class MathCalc {

    public int pow(int number, int power) {
        int result = number;
        do {
            result = result * number;
            power--;
        } while (power > 0);

        return result;
    }
}
