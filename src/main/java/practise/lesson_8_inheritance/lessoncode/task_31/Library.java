package practise.lesson_8_inheritance.lessoncode.task_31;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Penalty;
import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.ReaderCard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    List<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> libraryBooks = new ArrayList<>();

    public boolean addBook(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book book) {
        return libraryBooks.add(book);
    }

    private Optional<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> findTheBook(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book bookToFind) {
        for (com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book book : libraryBooks) {
            if (book.equals(bookToFind)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public Optional<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> takeTheBook(com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book book, ReaderCard readerCard) {
        Optional<com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31.Book> foundBook = findTheBook(book);
        if (foundBook.isPresent()) {
            readerCard.assignBook(book);
            return Optional.of(book);
        }
        return Optional.empty();
    }

    public void addPenalty(Book book, int amount, ReaderCard readerCard) {
        Penalty penalty = new Penalty(1L, book, amount, LocalDate.of(2021, 7, 1),LocalDate.now());
        readerCard.assignPenalty(penalty);
    }

}
