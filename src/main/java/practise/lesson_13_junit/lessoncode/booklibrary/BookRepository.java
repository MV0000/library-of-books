package practise.lesson_13_junit.lessoncode.booklibrary;

import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book;

import java.util.Optional;

public interface BookRepository {

    boolean save(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book);

    Optional<com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book> readByTitle(String title);

    boolean isPresent(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book);

    boolean delete(Book book);

}
