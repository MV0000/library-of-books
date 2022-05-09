package com.example.libraryofbooks.core.response.book;

import com.example.libraryofbooks.core.domain.Book;
import com.example.libraryofbooks.core.validators.CoreError;
import com.example.libraryofbooks.core.validators.CoreResponse;

import java.util.List;

public class AddBookResponse extends CoreResponse {

    private Book book;

    public AddBookResponse(Book book) {
        this.book = book;
    }

    public AddBookResponse(List<CoreError> errors) {
        super(errors);
    }

    public Book getBook() {
        return book;
    }
}
