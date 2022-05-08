package com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode;

public class Demo {

    public static void main(String[] args) {
        BoxSorter oldWay = new BoxSorterImpl();
        BoxSorter boxSorter = new BoxSorterNewWayImpl();
        BoxSorterUser user = new BoxSorterUser(boxSorter);
        user.doSomethingWithBoxes();
        user.sortTheBoxes();

        user.setSorter(oldWay);
        user.doSomethingWithBoxes();
        user.sortTheBoxes();
    }
}
