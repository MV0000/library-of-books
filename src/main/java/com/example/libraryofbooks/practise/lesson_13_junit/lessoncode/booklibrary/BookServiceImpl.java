package com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary;

import java.util.Optional;

public class BookServiceImpl implements BookService {

    BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(String title, String author) {
        //Some logic
        //validation
        repository.save(new Book(title, author));
    }

    @Override
    public Book readByTitle(String title) {
        Optional<Book> book = repository.readByTitle(title);
        if (book.isPresent()) {
            return book.get();
        }
        return null;
    }

    @Override
    public boolean checkIfPresent(Book book) {
        return repository.isPresent(book);
    }

    @Override
    public boolean removeBook(Book book) {
        return repository.delete(book);
    }
}
