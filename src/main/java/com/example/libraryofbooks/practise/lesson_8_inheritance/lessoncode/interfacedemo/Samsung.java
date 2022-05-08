package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.interfacedemo;

public class Samsung implements MobilePhone {


    @Override
    public void makeCall(int number) {
        System.out.println("Making call to the number " + number);
    }

    @Override
    public String receiveSMS() {
        return "Received sms text";
    }

    @Override
    public void sendSMS(String message) {
        System.out.println("Sending SMS with text " + message);
    }

}
