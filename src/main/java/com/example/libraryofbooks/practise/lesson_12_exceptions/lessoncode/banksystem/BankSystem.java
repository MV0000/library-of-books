package com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.banksystem;

import java.util.Optional;

public class BankSystem {

    public Optional<String> findClient(String token, Long id) {
        if (id == null) {
            UserInputMismatchException exception = new UserInputMismatchException("Client id is: " + id);
            throw exception;
        }
        if (!token.equals("1234")) {
            AccessDeniedException exception = new AccessDeniedException("Token is invalid", token);
            throw exception;
        }

        if (id.equals(1L)) {
            return Optional.of("Alex");
        }
        return Optional.empty();
    }
}
