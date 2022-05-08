package com.example.libraryofbooks.practise.lesson_6_arrays_while_loop.lessoncode;

import javaguru.lv.student_ineta.lesson5.level_5.ArrayUtil;

public class WhileExample {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(10);

        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("]");


        int k = 0;
        System.out.print("[");
        while (k < myArray.length) {
            System.out.print(myArray[k] + " ");
            k++; // k = k + 1;
        }
        System.out.println("]");


        int j = 0;
        System.out.print("[");
        do {
            System.out.print(myArray[j] + " ");
            j++;
        } while (j < myArray.length);
        System.out.println("]");
    }
}
