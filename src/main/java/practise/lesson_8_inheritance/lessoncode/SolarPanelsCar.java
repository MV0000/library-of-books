package practise.lesson_8_inheritance.lessoncode;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.ElecticCar;

public class SolarPanelsCar extends ElecticCar {

    public SolarPanelsCar(String model, int speed, int hs, int batteryCapacity) {
        super(model, speed, hs, batteryCapacity);
    }

    public void chargeFromTheSun() {
        batteryCapacity++;
    }
}
