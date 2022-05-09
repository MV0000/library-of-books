package practise.lesson_6_arrays_while_loop.lessoncode;

 class BranchingExample {

    int findNumberInArray(int[] array, int number) {
        int result = 0;
        for (int value : array) {
            if (value == number) {
                result = value;
                break;
            }
        }
        return result;
    }

    void showAllEvenNumber(int[] array) {
        for (int number : array) {
            if (number % 2 != 0) {
                continue;
            }


            System.out.println(number);
        }
    }

    int findNumberInArrayV2(int[] array, int number) {
        int result = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                result = array[i];
                break;
            }
            i++;
        }
        return result;
    }

    void showAllEvenNumberV2(int[] array) {
        int i = 0;
        while (i < array.length) {
            if (array[i] % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(array[i]);
            i++;
        }

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                continue;
//            }
//            System.out.println(array[i]);
//        }
    }
}
