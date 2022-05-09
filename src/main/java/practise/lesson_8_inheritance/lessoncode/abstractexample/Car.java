package practise.lesson_8_inheritance.lessoncode.abstractexample;

public abstract class Car {

    protected String model;
    protected int speed;
    protected int hs;
    protected boolean engineOnOff;

    public Car(String model, int speed, int hs) {
        this.model = model;
        this.speed = speed;
        this.hs = hs;
    }

    public Car() {
        super();
    }

    public void openWindow() {
        System.out.println("Opening window");
    }

    abstract void startEngine();

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

    public int getHs() {
        return hs;
    }

    public void setHs(int hs) {
        this.hs = hs;
    }
}
