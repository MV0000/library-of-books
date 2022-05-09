package practise.lesson_3_oop_first_look.lessoncode;

import com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode.Dog;

public class DogDemo {

    public static void main(String[] args) {
        com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode.Dog sharik = new com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode.Dog("White", "Sharik", 1); //14B12A

        String sharikName = sharik.name;
        System.out.println(sharikName);

        System.out.println(sharik.color);
        System.out.println(sharik.age);

        com.example.libraryofbooks.practise.lesson_3_oop_first_look.lessoncode.Dog bobik = new Dog("Black", "Bobik", 2);
        System.out.println(bobik.name);
        System.out.println(bobik.color);
        System.out.println(bobik.age);
    }
}
