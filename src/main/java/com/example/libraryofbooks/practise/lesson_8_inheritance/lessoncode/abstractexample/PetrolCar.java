package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.abstractexample;

public class PetrolCar extends Car {

    private int petrolTankCapacity;

    public PetrolCar(String model, int speed, int hs) {
        super(model, speed, hs);
    }

    @Override
    void startEngine() {
        if (petrolTankCapacity != 0) {
            engineOnOff = true;
        }
    }
}
