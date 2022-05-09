package practise.lesson_4_if_statement.lessoncode;

public class TV {

    private int MAX_VOLUME = 100;
    private int MIN_VOLUME = 0;

    private String color;
    private boolean onOff; //false
    private int volume; // 0
    private int channel; // 0

    public TV(String color) {
        this.color = color;
    }

    public void changeChannel(int newChannel) {
        if (onOff) {
            channel = newChannel;
        } else {
            System.out.println("TV is off");
        }
    }

    public void volumeUp() {
        if (onOff) {
            if (volume < MAX_VOLUME) {
                volume++; //volume = volume + 1;
                System.out.println("Volume added. Current: " + volume);
            } else {
                System.out.println("Already on max");
            }
        } else {
            System.out.println("TV is off");
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
