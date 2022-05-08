package com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary;

import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepository {

    List<Book> dataBase;

    public BookRepositoryImpl(List<Book> dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean save(Book book) {
        return dataBase.add(book);
    }

    @Override
    public Optional<Book> readByTitle(String title) {
        for (Book book : dataBase) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean isPresent(Book book) {
        return dataBase.contains(book);
    }

    @Override
    public boolean delete(Book book) {
        return dataBase.remove(book);
    }

}
