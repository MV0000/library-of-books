package com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode;

public class BoxSorterImpl implements BoxSorter {

    @Override
    public int calculateNextBoxPosition() {
        return 0;
    }

    @Override
    public void putTheBoxAccordingToThePosition(int position) {
        System.out.println("Putting the box into position " + position + " slowly...");
    }

    @Override
    public void sortBoxes() {
        System.out.println("Sorting the box slowly");
    }

    @Override
    public void closeTheBox() {
        System.out.println("Closing the box");
    }


}
