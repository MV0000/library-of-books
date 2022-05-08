package com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode;

public class BoxSorterNewWayImpl implements BoxSorter {

    private Stamper stamper;

    @Override
    public int calculateNextBoxPosition() {
        return 0;
    }

    @Override
    public void putTheBoxAccordingToThePosition(int position) {
        System.out.println("Putting the box into position " + position + " FASTER...");
    }

    @Override
    public void sortBoxes() {
        System.out.println("Sorting the box faster");
    }

    @Override
    public void closeTheBox() {
        System.out.println("Closing the box faster also...");
    }

    @Override
    public void addSignId() {
        //stamper
        System.out.println("Add sign id");
    }
}
