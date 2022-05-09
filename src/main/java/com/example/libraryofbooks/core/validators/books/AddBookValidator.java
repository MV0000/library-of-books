package com.example.libraryofbooks.core.validators.books;

import com.example.libraryofbooks.core.request.book.AddBookRequest;
import com.example.libraryofbooks.core.validators.CoreError;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AddBookValidator {

    @Autowired
    private SessionFactory sessionFactory;

    public List<CoreError> validate(AddBookRequest request){

        List<CoreError> errors = new ArrayList<>();

        validateAuthor(request).ifPresent(errors::add);
        validateTitle(request).ifPresent(errors::add);
        validateReleaseDate(request).ifPresent(errors::add);

        return errors;

    }
    private Optional<CoreError> validateTitle(AddBookRequest request) {
        return (request.getBookTitle() == null || request.getBookTitle().isEmpty())
                ? Optional.of(new CoreError("Title", "Must not be empty!"))
                : Optional.empty();
    }
    private Optional<CoreError> validateAuthor(AddBookRequest request) {
        return (request.getBookAuthor() == null || request.getBookAuthor().isEmpty())
                ? Optional.of(new CoreError("Author", "Must not be empty!"))
                : Optional.empty();
    }
    private Optional<CoreError> validateReleaseDate(AddBookRequest request) {
        return (request.getBookReleaseDate() == null)
                ? Optional.of(new CoreError("Release date", "Must not be empty!"))
                : Optional.empty();
    }
}
