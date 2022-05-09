package practise.lesson_8_inheritance.lessoncode;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.Car;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.ElecticCar;

public class CarDemo {

    public static void main(String[] args) {
        com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.Car car = new Car("X4", 0, 240);

        ElecticCar tesla = new ElecticCar("Tesla", 0, 300, 100);
    }
}
