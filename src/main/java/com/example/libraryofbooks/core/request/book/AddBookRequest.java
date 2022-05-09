package com.example.libraryofbooks.core.request.book;

public class AddBookRequest {

    private String bookTitle;
    private String bookAuthor;
    private Long bookReleaseDate;

    public AddBookRequest() {
    }

    public AddBookRequest(String bookTitle, String bookAuthor, Long bookReleaseDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookReleaseDate = bookReleaseDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Long getBookReleaseDate() {
        return bookReleaseDate;
    }

    public void setBookReleaseDate(Long bookReleaseDate) {
        this.bookReleaseDate = bookReleaseDate;
    }
}
