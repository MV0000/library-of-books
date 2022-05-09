package practise.lesson_4_if_statement.lessoncode;

public class IfElseExample {

    public static void main(String[] args) {
        int x = 3;

        if (x == 3) {
            System.out.println("x == 3");
        }

        //
        if (x == 1) {
            System.out.println("X == 1");
        } else if (x == 2) {
            System.out.println("X == 2");
        } else if (x == 3) {
            System.out.println("X == 3");
        } else if (x == 4) {
            System.out.println("X == 4");
        } else if (x == 5) {
            System.out.println("X == 5");
        } else if (x == 6) {
            System.out.println("X == 6");
        } else if (x == 7) {
            System.out.println("X == 7");
        } else {
            System.out.println("X out of range...");
        }
    }
}
