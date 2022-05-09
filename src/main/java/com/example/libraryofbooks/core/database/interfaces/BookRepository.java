package com.example.libraryofbooks.core.database.interfaces;

import com.example.libraryofbooks.core.domain.Book;

import java.util.List;

public interface BookRepository {

    void addBookToLibrary(Book book);

    boolean removeBookById(Long bookId);

    List<Book> findBookByTitle(String bookTitle);

    List<Book> findBooksByAuthor(String bookAuthor);

    List<Book> getAllBooks();
}
