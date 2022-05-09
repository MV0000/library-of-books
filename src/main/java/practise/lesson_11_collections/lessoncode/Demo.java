package practise.lesson_11_collections.lessoncode;

import com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.Pen;

public class Demo {

    public static void main(String[] args) {
        com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.Pen pen1 = new com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.Pen("White", 10);
        com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.Pen pen2 = new Pen("White", 10);

        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
    }
}
