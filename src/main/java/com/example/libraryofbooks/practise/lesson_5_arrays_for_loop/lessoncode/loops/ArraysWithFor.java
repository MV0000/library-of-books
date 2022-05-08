package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.loops;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWithFor {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println(myArray.length);

        //Условие прохода по всему массиву
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        System.out.println(Arrays.toString(myArray));

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < myArray.length + 1; i++) {
            myArray[i - 1] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }
}
