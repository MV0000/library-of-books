package com.example.libraryofbooks.practise.lesson_11_collections.lessoncode.mapbasedmenu;

import javaguru.lv.student_ineta.lesson9.level_5.Book;

import java.util.List;

public class AddOperation implements Operation {


    @Override
    public void doOperation(List<Book> books, Book book) {
        books.add(book);
    }
}
