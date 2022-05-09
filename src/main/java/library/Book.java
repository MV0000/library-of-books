package library;

import java.util.Objects;

public class Book {

    private String bookTitle;

    private String bookAuthor;
    private int releaseDate;


    public Book(String bookTitle, String bookAuthor, int releaseDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.releaseDate = releaseDate;
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

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseDate == book.releaseDate && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, releaseDate);
    }
}
