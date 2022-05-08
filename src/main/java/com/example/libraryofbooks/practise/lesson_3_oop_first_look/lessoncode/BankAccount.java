package com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode;

public class BankAccount {

    private String ownerName;
    private int pin;
    private int amount;

    public BankAccount(String ownerName, int pin, int amount) {
        this.ownerName = ownerName;
        this.pin = pin;
        this.amount = amount;
    }

    public int withdraw(int pin, int targetSum) {
        if (this.pin == pin) {
            amount = amount - targetSum;
            return targetSum;
        }
        return 0;
    }

    public void setPin(int newPin, int actualPin) {
        if (pin == actualPin) {
            pin = newPin;
        }
    }

    public int getAmount() {
        return amount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
