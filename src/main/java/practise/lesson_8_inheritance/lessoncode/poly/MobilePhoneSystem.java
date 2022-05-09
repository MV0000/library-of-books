package practise.lesson_8_inheritance.lessoncode.poly;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.Apple;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.MicrosoftTryTwo;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.Samsung;

public class MobilePhoneSystem {

    public static void main(String[] args) {
        com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.Apple applePhone = new Apple("X", "iOS");
        com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.Samsung samsung = new Samsung("S21", "Android is the best");
        com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.MicrosoftTryTwo microsoftTryTwo = new MicrosoftTryTwo("Super", "Windows?");

        applePhone.transferData("Hello from javarugu!");
        samsung.transferData("Hello from javarugu!");
        microsoftTryTwo.transferData("Hello from javarugu!");


    }
}
