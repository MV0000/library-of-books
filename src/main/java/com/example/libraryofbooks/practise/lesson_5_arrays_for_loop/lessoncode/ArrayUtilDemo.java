package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        int[] inputArray = {-100, -2, 10, -10, 8};

        int output = ArrayUtil.findMinNumber(inputArray);
        System.out.println("Min value is: " + output);

        int[] myArray = ArrayUtil.createArray(10);
        System.out.println(Arrays.toString(myArray));

        ArrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
