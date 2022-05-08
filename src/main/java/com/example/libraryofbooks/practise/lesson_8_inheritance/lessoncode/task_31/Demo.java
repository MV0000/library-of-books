package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31;

import java.util.ArrayList;
import java.util.Optional;

public class Demo {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1L, "AAA", "BBB", false));
        library.addBook(new Book(2L, "CCC", "TTT", false));
        library.addBook(new Book(3L, "DDD", "RRR", false));

        Reader reader = new Reader("123", "Alex", 21);
        ReaderCard readerCard = new ReaderCard(reader, new ArrayList<>(), new ArrayList<>());

        Book bookToTake = new Book(2L, "CCC", "TTT", false);
        Optional<Book> book = library.takeTheBook(bookToTake, readerCard);
        if (book.isPresent()) {
            System.out.println("The book is" + book.get().toString());
            System.out.println(readerCard.getTakenBooks());
        }

        library.addPenalty(bookToTake, 100, readerCard);
        System.out.println(readerCard.getPenalties());
    }
}
