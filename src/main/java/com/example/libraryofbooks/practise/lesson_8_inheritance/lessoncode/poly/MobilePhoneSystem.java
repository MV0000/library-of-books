package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.poly;

public class MobilePhoneSystem {

    public static void main(String[] args) {
        Apple applePhone = new Apple("X", "iOS");
        Samsung samsung = new Samsung("S21", "Android is the best");
        MicrosoftTryTwo microsoftTryTwo = new MicrosoftTryTwo("Super", "Windows?");

        applePhone.transferData("Hello from javarugu!");
        samsung.transferData("Hello from javarugu!");
        microsoftTryTwo.transferData("Hello from javarugu!");


    }
}
