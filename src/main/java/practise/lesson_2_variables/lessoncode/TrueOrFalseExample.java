package practise.lesson_2_variables.lessoncode;

public class TrueOrFalseExample {

    public static void main(String[] args) {
        int variableOne = 10;
        int variableTwo = 20;
        int result = variableOne + variableTwo;

        boolean isEquals = result == 30;

        System.out.println(isEquals);

        System.out.println(variableOne);
        variableOne = 50;
        System.out.println(variableOne);


        int resultTwo = variableOne + variableTwo;
        boolean isEqualsTwo = resultTwo == 30;
        System.out.println(isEqualsTwo);

    }
}
