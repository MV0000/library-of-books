package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly;

public class Apple extends MobilePhone {

    public Apple(String model, String OS) {
        super(model, OS);
    }

    public int getId(int secNumber) {
        if (secNumber == 1111) {
            return getDevicePrivateNumber();
        }
        return 0;
    }

    @Override
    public void transferData(String data) {
        System.out.println("Using fancy AirDrop to transfer + " + data);
    }
}
