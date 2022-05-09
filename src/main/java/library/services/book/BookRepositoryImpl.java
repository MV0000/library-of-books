package library.services.book;

import library.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<Book> books = new ArrayList<Book>();

    @Override
    public void saveBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books.stream().toList();
    }

    @Override
    public List<Book> findBooksByTitle(String bookTitle) {
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String bookAuthor) {
        return null;
    }


}
