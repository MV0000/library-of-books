package com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode;

public interface BoxSorter {

    int calculateNextBoxPosition();

    void putTheBoxAccordingToThePosition(int position);

    void sortBoxes();

    void closeTheBox();

    default void addSignId() {
        System.out.println("This functionality is not not working");
    }

}
