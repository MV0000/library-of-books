package practise.lesson_4_if_statement.lessoncode.tests;

import com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector;

public class ColorDetectorTest {

    public static void main(String[] args) {
        ColorDetectorTest testRunner = new ColorDetectorTest();

        testRunner.detectingYellow();
        testRunner.detectingRed();
        testRunner.detectingBlue();
    }

    public void detectingYellow() {
        com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector victim = new com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector();
        String expectedResult = "Yellow";

        String actualResult = victim.detect(600);
        check(expectedResult, actualResult, "Test1");
    }

    public void detectingRed() {
        com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector victim = new com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector();
        String expectedResult = "Red";

        String actualResult = victim.detect(651);
        check(expectedResult, actualResult, "Test2");
    }

    public void detectingBlue() {
        com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests.ColorDetector victim = new ColorDetector();
        String expectedResult = "Blue";

        String actualResult = victim.detect(650);
        check(expectedResult, actualResult, "Test3");
    }

    private void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed");
            System.out.println("Expected was: " + expectedResult + " but was " + actualResult);
        }
    }
}
