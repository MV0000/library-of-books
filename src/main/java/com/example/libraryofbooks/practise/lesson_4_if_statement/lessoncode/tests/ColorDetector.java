package com.example.libraryofbooks.practise.lesson_4_if_statement.lessoncode.tests;

public class ColorDetector {

    public String detect(int waveLength) {
        if (waveLength > 500 && waveLength <= 550) {
            return "White";
        } else if (waveLength > 550 && waveLength <= 600) {
            return "Yellow";
        } else if (waveLength > 600 && waveLength <= 650) {
            return "Blue";
        } else if (waveLength > 650 && waveLength <= 700) {
            return "Red";
        } else {
            return "Not visible";
        }
    }
}
