package practise.lesson_8_inheritance.homework.level_7_senior.task_32;

import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;
import com.example.libraryofbooks.practise.lesson_8_inheritance.homework.level_7_senior.task_32.TwoArgumentMathOperation;

class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}