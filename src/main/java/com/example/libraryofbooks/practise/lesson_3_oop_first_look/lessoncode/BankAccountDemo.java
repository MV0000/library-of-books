package com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alex", 1234, 10000);

        System.out.println(alexBankAccount.getAmount());
        int withdrawAmount = alexBankAccount.withdraw(1234, 1000);

        System.out.println(withdrawAmount);
        System.out.println(alexBankAccount.getAmount());

        System.out.println("Someone is trying to steal my money: ");
        int withdrawAmountTwo = alexBankAccount.withdraw(4321, 1000);
        System.out.println(withdrawAmountTwo);
        System.out.println(alexBankAccount.getAmount());


        int withdrawAmountThree = alexBankAccount.withdraw(1111, 1000);
        System.out.println(withdrawAmountThree);
        System.out.println(alexBankAccount.getAmount());

        alexBankAccount.setPin(0000, 1234);
        int withdrawAmountFour = alexBankAccount.withdraw(0000, 500);
        System.out.println(withdrawAmountFour);
    }
}
