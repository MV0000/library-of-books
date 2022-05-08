package com.example.libraryofbooks.practise.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

public class Car {

    private String model;
    private int hp;
    private int doorsCount;
    private int currentSpeed;
    private boolean engineOnOff;

    public Car(String model, int hp, int doorsCount) {
        this.model = model;
        this.hp = hp;
        this.doorsCount = doorsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hp == car.hp && doorsCount == car.doorsCount && Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", hp=" + hp +
                ", doorsCount=" + doorsCount +
                ", currentSpeed=" + currentSpeed +
                ", engineOnOff=" + engineOnOff +
                '}';
    }
}
