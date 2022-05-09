package library;

import library.services.book.AddBookService;

import java.util.Scanner;


public class AddBookUIAction implements library.UIAction {

  AddBookService bookService = new AddBookService();
    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title of the book");
        String bookTitle = scanner.nextLine();

        System.out.println("Enter author of the book");
        String bookAuthor = scanner.nextLine();

        System.out.println("Enter enter release date of the book");
        int releaseDate = scanner.nextInt();


        Book book = new Book(bookTitle, bookAuthor, releaseDate);
        bookService.execute(book);

    }

}
