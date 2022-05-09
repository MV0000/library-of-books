package practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2;

import com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear;
import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {

	public static void main(String[] args) {
		LeapYearTest test = new LeapYearTest();
		test.shouldBeRegularYearIfNotDevidedBy4();
		test.shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100();
		test.shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400();
		test.shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400();
	}

	public void shouldBeRegularYearIfNotDevidedBy4() {
		com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(!leapYear.isLeapYear(2), "shouldBeRegularYearIfNotDevidedBy4");
	}

	public void shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100() {
		com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(leapYear.isLeapYear(80), "shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100");
	}

	public void shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400() {
		com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(leapYear.isLeapYear(400), "shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400");
	}

	public void shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400() {
		com.example.libraryofbooks.practise.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new LeapYear();
		checkResults(!leapYear.isLeapYear(500), "shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400");
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}
}
