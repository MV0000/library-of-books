package practise.lesson_13_junit.lessoncode.booklibrary;

import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book;
import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.BookRepository;
import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.BookService;

import java.util.Optional;

public class BookServiceImpl implements BookService {

    com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(String title, String author) {
        //Some logic
        //validation
        repository.save(new com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book(title, author));
    }

    @Override
    public com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book readByTitle(String title) {
        Optional<com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book> book = repository.readByTitle(title);
        if (book.isPresent()) {
            return book.get();
        }
        return null;
    }

    @Override
    public boolean checkIfPresent(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book) {
        return repository.isPresent(book);
    }

    @Override
    public boolean removeBook(Book book) {
        return repository.delete(book);
    }
}
