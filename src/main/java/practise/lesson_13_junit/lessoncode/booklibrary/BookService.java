package practise.lesson_13_junit.lessoncode.booklibrary;

import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book;

public interface BookService {

    void save(String title, String author);

    com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book readByTitle(String title);

    boolean checkIfPresent(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book);

    boolean removeBook(Book book);

}
