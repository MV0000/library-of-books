package practise.lesson_8_inheritance.lessoncode;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.Bicycle;

public class MountainBicycle extends Bicycle {

    private int gear;

    public MountainBicycle(String model, int speed, int gear) {
        super(model, speed);
        this.gear = gear;
    }


    @Override
    public void accelerate() {
        speed += 2;
    }

    public void gearUp() {
        gear++;
    }

    public int getGear() {
        return gear;
    }
}
