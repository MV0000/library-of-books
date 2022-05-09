package practise.lesson_6_arrays_while_loop.lessoncode;

import com.example.libraryofbooks.practise.lesson_6_arrays_while_loop.lessoncode.BranchingExample;

public class BranchingDemo {

    public static void main(String[] args) {
        int[] inputArray = {5, 10, 4, 15, 43, 28};

        BranchingExample branchingExample = new BranchingExample();
        int numberInArray = branchingExample.findNumberInArrayV2(inputArray, 15);

        branchingExample.showAllEvenNumberV2(inputArray);
    }
}
