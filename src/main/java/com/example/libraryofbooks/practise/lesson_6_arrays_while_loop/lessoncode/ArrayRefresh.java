package com.example.libraryofbooks.practise.lesson_6_arrays_while_loop.lessoncode;

import javaguru.lv.student_aleksandrs_grigorjevs.homework.lesson_5.level_4.task_25.ArrayTask25;
import javaguru.lv.student_murat_v.lesson_5.level_5.ArrayUtil;

import java.util.Arrays;

public class ArrayRefresh {

    public static void main(String[] args) {
        int[] myArray = new int[100];
        System.out.println(Arrays.toString(myArray));

        boolean[] booleanArray = new boolean[10];
        System.out.println(Arrays.toString(booleanArray));

        String someString = null;

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] resultArray = arrayUtil.createArray(5);

        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == 0) {
                System.out.println("Array cell with index " + i + " is equal " + 0);
            }
        }
    }
}
