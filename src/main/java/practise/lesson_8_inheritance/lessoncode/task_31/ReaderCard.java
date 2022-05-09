package practise.lesson_8_inheritance.lessoncode.task_31;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Reader;

import java.util.List;

public class ReaderCard {

    private com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Reader reader;
    private List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> takenBooks;
    private List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty> penalties;

    public ReaderCard(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Reader reader, List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> takenBooks, List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty> penalties) {
        this.reader = reader;
        this.takenBooks = takenBooks;
        this.penalties = penalties;
    }

    public void assignBook(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book book) {
        takenBooks.add(book);
    }

    public void assignPenalty(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty penalty) {
        penalties.add(penalty);
    }

    public com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }

    public List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty> getPenalties() {
        return penalties;
    }

    public void setPenalties(List<Penalty> penalties) {
        this.penalties = penalties;
    }
}
