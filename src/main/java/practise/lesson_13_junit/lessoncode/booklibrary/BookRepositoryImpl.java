package practise.lesson_13_junit.lessoncode.booklibrary;

import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book;
import com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.BookRepository;

import java.util.List;
import java.util.Optional;

public class BookRepositoryImpl implements BookRepository {

    List<com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book> dataBase;

    public BookRepositoryImpl(List<com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book> dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean save(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book) {
        return dataBase.add(book);
    }

    @Override
    public Optional<com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book> readByTitle(String title) {
        for (com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book : dataBase) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean isPresent(com.example.libraryofbooks.practise.lesson_13_junit.lessoncode.booklibrary.Book book) {
        return dataBase.contains(book);
    }

    @Override
    public boolean delete(Book book) {
        return dataBase.remove(book);
    }

}
