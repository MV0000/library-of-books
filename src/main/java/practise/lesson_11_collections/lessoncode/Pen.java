package practise.lesson_11_collections.lessoncode;

import java.util.Objects;

public class Pen implements Comparable<Pen> {

    private String color;
    private int length;

    public Pen(String color, int length) {
        this.color = color;
        this.length = length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return length == pen.length && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, length);
    }

    @Override
    public int compareTo(Pen o) {
        if (this.length == o.length) {
            return 0;
        } else if (this.length > o.length) {
            return -1;
        } else {
            return 1;
        }
    }
}
