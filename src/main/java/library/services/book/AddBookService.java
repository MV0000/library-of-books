package library.services.book;


import library.Book;

public class AddBookService {


    private BookRepositoryImpl bookRepository;



    public void execute( Book book) {

        bookRepository.saveBook(book);

    }
}
