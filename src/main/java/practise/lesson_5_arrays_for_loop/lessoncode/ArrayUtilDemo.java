package practise.lesson_5_arrays_for_loop.lessoncode;

import com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.ArrayUtil;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        int[] inputArray = {-100, -2, 10, -10, 8};

        int output = com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.ArrayUtil.findMinNumber(inputArray);
        System.out.println("Min value is: " + output);

        int[] myArray = com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.ArrayUtil.createArray(10);
        System.out.println(Arrays.toString(myArray));

        ArrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
