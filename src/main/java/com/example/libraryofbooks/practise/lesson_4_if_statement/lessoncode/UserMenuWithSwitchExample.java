package com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserMenuWithSwitchExample {

    public static void main(String[] args) {
        TV myTv = new TV("White");
        Scanner scanner = new Scanner(System.in);

        boolean doContinue = true;
        while (doContinue) {
            System.out.println("This is your TV menu...");
            System.out.println("1 - Turn On");
            System.out.println("2 - Turn Off");
            System.out.println("3 - Volume Up");
            System.out.println("4 - New Channel set");
            System.out.println("5 - For exit");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    myTv.setOnOff(true);
                    break;
                case 2:
                    myTv.setOnOff(false);
                    break;
                case 3:
                    myTv.volumeUp();
                    break;
                case 4:
                    System.out.println("Pick the channel...");
                    int newChannel = scanner.nextInt();
                    myTv.changeChannel(newChannel);
                    break;
                case 5:
                    doContinue = false;
                    break;
                default:
                    System.out.println("No such option...");
            }
        }
    }
}
