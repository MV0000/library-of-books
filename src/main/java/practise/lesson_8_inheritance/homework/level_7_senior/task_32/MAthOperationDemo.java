package practise.lesson_8_inheritance.homework.level_7_senior.task_32;

import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Addition;
import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument;
import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;
import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Subtraction;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg1 = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(10);
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg2 = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(20);
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation addition = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg3 = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(50);
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg4 = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(20);
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation subtraction = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation addition1 = new com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());
	}

}
