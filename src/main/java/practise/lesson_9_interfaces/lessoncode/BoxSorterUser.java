package practise.lesson_9_interfaces.lessoncode;

import com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorter;

public class BoxSorterUser {

    private com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorter sorter;

    public BoxSorterUser(com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorter sorter) {
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
