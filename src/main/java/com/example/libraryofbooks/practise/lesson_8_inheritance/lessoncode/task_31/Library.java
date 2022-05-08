package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    List<Book> libraryBooks = new ArrayList<>();

    public boolean addBook(Book book) {
        return libraryBooks.add(book);
    }

    private Optional<Book> findTheBook(Book bookToFind) {
        for (Book book : libraryBooks) {
            if (book.equals(bookToFind)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public Optional<Book> takeTheBook(Book book, ReaderCard readerCard) {
        Optional<Book> foundBook = findTheBook(book);
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
