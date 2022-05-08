package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly;

public class MicrosoftTryTwo extends MobilePhone {

    public MicrosoftTryTwo(String model, String OS) {
        super(model, OS);
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transferring data with 5G..." + data);
    }

}
