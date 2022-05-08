package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] leapYears = {2020, 2016, 2012};
        leapYears[1] = 1111;
        System.out.println(leapYears[0]);
        System.out.println(leapYears[1]);
        System.out.println(leapYears[2]);

        //                   0 0 0 0 - values
        //                  |_|_|_|_|
        //                   0 1 2 3 - indexes
        int[] myFirstArray = new int[4];
        myFirstArray[2] = 5;
        //                   0 0 5 0
        //                  |_|_|_|_|
        System.out.println(Arrays.toString(myFirstArray));


        double[] myDoubleArray = new double[3];
        myDoubleArray[0] = 3.3;
        myDoubleArray[1] = 6.6;
        myDoubleArray[2] = 9;
        System.out.println(Arrays.toString(myDoubleArray));


        int[][] matrix = new int[3][3];
    }
}
