package com.example.libraryofbooks.practise.lesson_7_encapsulation.lessoncode;

public class Counter {

    private int counterValue;

    Counter() {
    }

    public void setCounter(int value) {
        if (isPositive(value)) {
            counterValue = value;
        } else {
            clearCounter();
        }
    }

    private boolean isPositive(int value) {
        return value > 0;
    }

    public void increment() {
        counterValue++;
    }

    public void decrement() {
        counterValue--;
    }

    public void clearCounter() {
        counterValue = 0;
    }

    public int getCounterValue() {
        return counterValue;
    }
}
