//package com.example.libraryofbooks.console_ui.account;
//
//import com.example.libraryofbooks.console_ui.UIAction;
//import com.example.libraryofbooks.core.domain.Client;
//import com.example.libraryofbooks.core.request.account.LogInToTheAccountRequest;
//import com.example.libraryofbooks.core.response.account.LogInToTheAccountResponse;
//import org.springframework.stereotype.Component;
//
//import java.util.Scanner;
//
//@Component
//public class LogInToTheAccountUIAction implements UIAction {
//
////    private LogInToTheAccountService logInToTheAccountService;
////    private Client client;
//
//    @Override
//    public void execute() {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("To log in to the account, please provide your credentials");
//
//        System.out.println("Enter your username");
//        String clientUserame = scanner.nextLine();
//
//        System.out.println("Enter your password");
//        String clientPassword = scanner.nextLine();
//
//        LogInToTheAccountRequest logInToTheAccountRequest = new LogInToTheAccountRequest(clientUserame, clientPassword);
//        LogInToTheAccountResponse logInToTheAccountResponse = logInToTheAccountService.execute(logInToTheAccountRequest);
//
//        if (logInToTheAccountResponse.hasErrors()) {
//            logInToTheAccountResponse.getErrors().forEach(coreError ->
//                    System.out.println("Error: " + coreError.getField() + " " + coreError.getMessage())
//            );
//        } else {
//            System.out.println("Welcome" + clientUserame + "to your account!");
//            System.out.println("Number of books in your profile" + client.getListOfBooks().size() + "\r\n");
//
//            System.out.println("Menu:");
//            System.out.println("1.To add a new book");
//            System.out.println("2.To list all taken books");
//        }
//
//    }
//}
