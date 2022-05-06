package com.example.libraryofbooks.console_ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Component
public class ProgramMenu {

    private Map<Integer, UIAction> menuNumberToUIActionMap;

    @Autowired ProgramMenu(List<UIAction> uiActions) {

        menuNumberToUIActionMap = new HashMap<>();
//        menuNumberToUIActionMap.put(1, findUIAction(uiActions, LogInToTheAccountUIAction.class));
//        menuNumberToUIActionMap.put(2, findUIAction(uiActions, AddNewClientUIAction.class));
//        menuNumberToUIActionMap.put(3, findUIAction(uiActions, AddNewBookToLibraryUIAction.class));
//        menuNumberToUIActionMap.put(4, findUIAction(uiActions, AddNewBookToLibraryUIAction.class));
//        menuNumberToUIActionMap.put(5, findUIAction(uiActions, DeleteBookFromLibraryUIAction.class));
//        menuNumberToUIActionMap.put(6, findUIAction(uiActions, FindBookByTitleUIAction.class));
//        menuNumberToUIActionMap.put(7, findUIAction(uiActions, FindBooksByAuthorUIAction.class));
//        menuNumberToUIActionMap.put(8, findUIAction(uiActions, ShowAllBooksInLibraryUIAction.class));

    }

    private UIAction findUIAction(List<UIAction> uiActions, Class uiActionClass) {
        return uiActions.stream()
                .filter(uiAction -> uiAction.getClass().equals(uiActionClass))
                .findFirst()
                .get();
    }

    public void printProgramMenu() {

        System.out.println("Welcome to the Magnificent Emporium of Extravagant Collection of old and smelly books");
        System.out.println("Menu:");
        System.out.println("1.  Logg in to the account");
        System.out.println("2.  Create new client account");
        System.out.println("3.  Add a book to the library");
        System.out.println("4.  Take a book out of the library");
        System.out.println("5.  Delete book from the library");
        System.out.println("6.  Find book by title");
        System.out.println("7.  Find books by author");
        System.out.println("8.  Show all books in the collection");
        System.out.println("9. Exit");
    }

    public int getUserChoice() {
        System.out.println("Select a menu number to continue");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public void executeSelectedMenuItem(int selectedMenu) {
        menuNumberToUIActionMap.get(selectedMenu).execute();
    }
}
