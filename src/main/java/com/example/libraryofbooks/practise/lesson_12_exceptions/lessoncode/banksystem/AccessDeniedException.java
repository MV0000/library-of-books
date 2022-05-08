package com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.banksystem;

//RuntimeException - unchecked
//Exception - checked
public class AccessDeniedException extends RuntimeException {

    private String requestedToken;

    public AccessDeniedException(String message, String requestedToken) {
        super(message);
        this.requestedToken = requestedToken;
    }

    public String getRequestedToken() {
        return requestedToken;
    }
}
