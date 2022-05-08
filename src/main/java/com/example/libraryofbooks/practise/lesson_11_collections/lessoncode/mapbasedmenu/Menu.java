package com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.mapbasedmenu;


import javaguru.lv.student_ineta.lesson9.level_5.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    public static void main(String[] args) {

        Map<Integer, Operation> operations = new HashMap<>();
        operations.put(1, new AddOperation());
        operations.put(2, new RemoveOperation());
        //etc..

        int userInput = 1;

        List<Book> books = new ArrayList<>();
        Book bookToAdd = new Book("Name", "Author");
        Operation operation = operations.get(1);
        operation.doOperation(books, bookToAdd);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
