package practise.lesson_4_if_statement.lessoncode;

import com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.TV;

public class TVExample {
    public static void main(String[] args) {
        com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.TV myTV = new TV("Black");

        myTV.setOnOff(true);
        myTV.changeChannel(100);
        System.out.println(myTV.getChannel());

        myTV.setVolume(98);
        myTV.volumeUp();
        myTV.volumeUp();
        myTV.volumeUp();
    }
}
