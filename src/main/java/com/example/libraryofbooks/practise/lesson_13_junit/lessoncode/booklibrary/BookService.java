package com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary;

public interface BookService {

    void save(String title, String author);

    Book readByTitle(String title);

    boolean checkIfPresent(Book book);

    boolean removeBook(Book book);

}
