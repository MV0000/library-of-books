package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode;

public class CalculatorTest {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    public static void test1() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Test 10 is greater that 5");
    }

    public static void test2() {
        Calculator calculator = new Calculator();
        int firstNumber = 2;
        int secondNumber = 8;
        int expectedResult = 8;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Test 8 is greater that 2");
    }

    public static void test3() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, actualResult, "Test that 5 is is equal 5");
    }

    private static void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed");
            System.out.println("Expected was: " + expectedResult + " but was " + actualResult);
        }
    }
}
