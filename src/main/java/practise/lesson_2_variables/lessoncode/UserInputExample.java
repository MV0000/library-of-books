package practise.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please, type your arguments...");
        System.out.println("Argument one...");
        double variableOne = myScanner.nextDouble();
        System.out.println("Argument two...");
        double variableTwo = myScanner.nextDouble();

        double sum = variableOne + variableTwo;
        double dif = variableOne - variableTwo;
        double div = (double) variableOne / variableTwo;
        double mul = variableOne * variableTwo;

        System.out.println("Input arguments: " + variableOne + ", " + variableTwo);
        System.out.println("Sum = " + sum);
        System.out.println("Dif = " + dif);
        System.out.println("Div = " + div);
        System.out.println("Mul = " + mul);

    }
}
