package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.abstractexample;

public class ElecticCar extends Car {

    protected int batteryCapacity;

    public ElecticCar(String model, int speed, int hs, int batteryCapacity) {
        super(model, speed, hs);
        this.batteryCapacity = batteryCapacity;
    }

    public ElecticCar() {
        super();
    }

    @Override
    void startEngine() {

    }


    public int getBatteryCapacity() {

        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
