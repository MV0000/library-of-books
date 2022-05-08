package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly;

public abstract class MobilePhone {

    private int devicePrivateNumber;
    String model;
    String OS;

    public MobilePhone(String model, String OS) {
        this.model = model;
        this.OS = OS;
    }

    public void makeACall() {
        System.out.println("Model: " + model +" is calling...");
    }

    protected int getDevicePrivateNumber() { //protected = default + inheritance level
        return devicePrivateNumber;
    }

    abstract public void transferData(String data);

}
