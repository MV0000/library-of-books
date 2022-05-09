package com.example.libraryofbooks.core.services.book;

import com.example.libraryofbooks.core.domain.Book;
import com.example.libraryofbooks.core.database.interfaces.BookRepository;
import com.example.libraryofbooks.core.request.book.AddBookRequest;
import com.example.libraryofbooks.core.response.book.AddBookResponse;
import com.example.libraryofbooks.core.validators.CoreError;
import com.example.libraryofbooks.core.validators.books.AddBookValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional

public class AddBookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AddBookValidator validator;

    public AddBookResponse execute(AddBookRequest request) {
        List<CoreError> errors = validator.validate(request);
        if (!errors.isEmpty()) {
            return new AddBookResponse(errors);
        }
        Book book = new Book(request.getBookTitle(),request.getBookAuthor(),request.getBookReleaseDate());
        bookRepository.addBookToLibrary(book);
        return new AddBookResponse(book);

    }
}
