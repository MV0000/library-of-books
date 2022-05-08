package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode;

public class PetrolCar extends Car{

    private int petrolTankCapacity;

    public PetrolCar(String model, int speed, int hs) {
        super(model, speed, hs);
    }

    @Override
    public void engineStart() {
        if (petrolTankCapacity != 0) {
            engineOnOff = true;
        }
    }

}
