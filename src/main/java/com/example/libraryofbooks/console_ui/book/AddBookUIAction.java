package com.example.libraryofbooks.console_ui.book;

import com.example.libraryofbooks.console_ui.UIAction;
import com.example.libraryofbooks.core.request.book.AddBookRequest;
import com.example.libraryofbooks.core.response.book.AddBookResponse;
import com.example.libraryofbooks.core.services.book.AddBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AddBookUIAction implements UIAction {
    @Autowired
    private AddBookService addBookService;



    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter title of the book");
        String bookTitle = scanner.nextLine();

        System.out.println("Enter author of the book");
        String bookAuthor = scanner.nextLine();

        System.out.println("Enter enter release date of the book");
        Long releaseDate = scanner.nextLong();

        AddBookRequest addBooktRequest = new AddBookRequest(bookTitle, bookAuthor, releaseDate);
        AddBookResponse addBookResponse = addBookService.execute(addBooktRequest);

        if (addBookResponse.hasErrors()) {
            addBookResponse.getErrors().forEach(coreError ->
                    System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage())
            );
        } else {
            System.out.println("Book: " + addBookResponse.getBook().getBookTitle() + " by: " + addBookResponse.getBook().getBookAuthor() + " added");
        }
    }

}
