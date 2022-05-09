package practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1;

import com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    public void fizzBuzzTest(){
        com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz fizzBuzz = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz();
        checkResults(fizzBuzz.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }

    public void fizzTest(){
        com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz fizzBuzz = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz();
        checkResults(fizzBuzz.detect(3).equals("Fizz"), "Test Fizz");
    }

    public void buzzTest(){
        com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz fizzBuzz = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz();
        checkResults(fizzBuzz.detect(5).equals("Buzz"), "Test Buzz");
    }

    public void notFizzBuzzTest(){
        com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzz fizzBuzz = new FizzBuzz();
        checkResults(fizzBuzz.detect(4).equals("4"), "Test NotFizzBuzz");
    }

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}