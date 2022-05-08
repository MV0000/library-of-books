package com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary;

import java.util.Optional;

public interface BookRepository {

    boolean save(Book book);

    Optional<Book> readByTitle(String title);

    boolean isPresent(Book book);

    boolean delete(Book book);

}
