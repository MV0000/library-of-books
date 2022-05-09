package practise.lesson_8_inheritance.homework.level_7_senior.task_32;

import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;

abstract class TwoArgumentMathOperation extends com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation {

	private com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation leftArgument;
	private com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation rightArgument;

	public TwoArgumentMathOperation(com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation leftArgument,
                                    com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}
