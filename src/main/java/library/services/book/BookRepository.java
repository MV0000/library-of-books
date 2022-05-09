package library.services.book;

import library.Book;

import java.util.List;

public interface BookRepository {

    void saveBook(Book book);

    List<Book> getAllBooks();

    List<Book> findBooksByTitle( String bookTitle);

    List<Book> findBookByAuthor(String bookAuthor);
}
