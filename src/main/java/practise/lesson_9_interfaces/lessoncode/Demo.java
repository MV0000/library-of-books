package practise.lesson_9_interfaces.lessoncode;

import com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorter;
import com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorterImpl;
import com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorterNewWayImpl;
import com.example.libraryofbooks.practise.lesson_9_interfaces.lessoncode.BoxSorterUser;

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
