package com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode;

public class AndOrExample {
    public static void main(String[] args) {
        int x = 0;
            //true  &&  true
        if ((x > 5) && (x <= 15) || x == 0) {
            System.out.print("X is within bounds! OR is equal to ZERO");
        }
    }
}
