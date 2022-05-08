package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.bankexample;

public class SEB implements BankSystem {
    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public boolean transferMoney(int amount) {
        return false;
    }
}
