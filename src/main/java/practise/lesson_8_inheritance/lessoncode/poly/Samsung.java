package practise.lesson_8_inheritance.lessoncode.poly;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly.MobilePhone;

public class Samsung extends MobilePhone {


    public Samsung(String model, String OS) {
        super(model, OS);
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transferring data " + data + " with BT");
    }
}
