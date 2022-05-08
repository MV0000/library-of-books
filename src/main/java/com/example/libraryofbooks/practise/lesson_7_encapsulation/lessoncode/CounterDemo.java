package com.example.libraryofbooks.practise.lesson_7_encapsulation.lessoncode;

public class CounterDemo {

    public static void main(String[] args) {
        Counter counter = new Counter();
//        something();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println("Counter value: " + counter.getCounterValue());
        counter.decrement();
        System.out.println("Counter value: " + counter.getCounterValue());
        counter.setCounter(-5);
        System.out.println("Counter value: " + counter.getCounterValue());
    }

    public void something() {

    }
}
