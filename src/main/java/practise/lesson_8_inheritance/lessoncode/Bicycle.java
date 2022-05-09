package practise.lesson_8_inheritance.lessoncode;

public class Bicycle {

    protected String model;
    protected int speed;

    public Bicycle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public Bicycle() {
    }

    public void accelerate() {
        speed++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
