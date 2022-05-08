package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode;

public class ElecticCar extends Car {

    protected int batteryCapacity;

    public ElecticCar(String model, int speed, int hs, int batteryCapacity) {
        super(model, speed, hs);
        this.batteryCapacity = batteryCapacity;
    }

    public ElecticCar() {
        super();
    }

    public int getBatteryCapacity() {

        return batteryCapacity;
    }

    @Override
    public void engineStart() {
        if (batteryCapacity != 0) {
            engineOnOff = true;
        }
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
