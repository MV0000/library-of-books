package com.example.libraryofbooks.practise.lesson_6_arrays_while_loop.lessoncode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDemArray {

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        printArrayToConsol(array);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
//      |1||2||3|
//      |4||5||6|
//      |7||8||9|

        printArrayToConsol(array);
    }

    private static void printArrayToConsol(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("|" + array[i][j] + "|");
            }
            System.out.println();
        }
//        System.out.print("|" + array[0][0] + "|");
//        System.out.print("|" + array[0][1] + "|");
//        System.out.print("|" + array[0][2] + "|");
//        System.out.print("|" + array[1][0] + "|");
//        System.out.print("|" + array[1][1] + "|");
//        System.out.print("|" + array[1][2] + "|");
//        System.out.print("|" + array[2][0] + "|");
//        System.out.print("|" + array[2][1] + "|");
//        System.out.print("|" + array[2][2] + "|");
    }
}
