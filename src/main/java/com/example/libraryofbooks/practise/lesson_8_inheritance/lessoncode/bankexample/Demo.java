package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.bankexample;

public class Demo {

    public static void main(String[] args) {
        BankSystem sebBank = new SEB();
        BankSystem swedBank = new SwedBank();

        sebBank.transferMoney(100);
        sebBank.getBalance();

    }
}
