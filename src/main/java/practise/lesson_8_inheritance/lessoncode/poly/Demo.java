package practise.lesson_8_inheritance.lessoncode.poly;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.*;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.LG;

public class Demo {

    public static void main(String[] args) {
        //Static - overloading
        //dynamic - overing

        MobilePhone apple = new Apple("X10", "iOS");
        MobilePhone samsung = new Samsung("X20", "Android");
        MobilePhone lg = new LG("ABC", "Android");
        MobilePhone microsoft = new MicrosoftTryTwo("bvc", "wefw");

        MobilePhone[] phones = new MobilePhone[4];
        phones[0] = apple;
        phones[1] = samsung;
        phones[2] = lg;
        phones[3] = microsoft;


        for (MobilePhone phone : phones) {
            phone.transferData("Hello");
        }
    }
}
