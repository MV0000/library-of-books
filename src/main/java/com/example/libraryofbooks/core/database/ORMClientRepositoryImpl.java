package com.example.libraryofbooks.core.database;

import com.example.libraryofbooks.core.database.interfaces.BookRepository;
import com.example.libraryofbooks.core.domain.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class ORMClientRepositoryImpl implements BookRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBookToLibrary(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public boolean removeBookById(Long bookId) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                "delete Book where bookId = :bookId");
        query.setParameter("bookId", bookId);
        int result = query.executeUpdate();
        return result == 1;
    }

    @Override
    public List<Book> findBookByTitle(String bookTitle) {

        Query query = sessionFactory.getCurrentSession().createQuery(
                "select b FROM Book b where advTitle = :advTitle");
        query.setParameter("bookTitle", bookTitle);
        return query.getResultList();

    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }
}
