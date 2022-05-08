package com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode;

public class BoxSorterUser {

    private BoxSorter sorter;

    public BoxSorterUser(BoxSorter sorter) {
        this.sorter = sorter;
    }

    public void setSorter(BoxSorter sorter) {
        this.sorter = sorter;
    }

    public void doSomethingWithBoxes() {
        int nextPosition = sorter.calculateNextBoxPosition();
        for (int i = 0; i < 10; i++) {
            sorter.putTheBoxAccordingToThePosition(nextPosition);
        }
        sorter.addSignId();
        sorter.closeTheBox();
    }

    public void sortTheBoxes() {
        sorter.sortBoxes();
    }
}
