package com.example.libraryofbooks.core.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "books")
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Book {

    @Id
    @Column(name = "bookId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "bookTitle")
    private String bookTitle;

    @Column(name = "bookAuthor")
    private String bookAuthor;

    @Column(name = "bookReleaseDate")
    private Long bookReleaseDate;

    public Book(String bookTitle, String bookAuthor, Long bookReleaseDate) {
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
