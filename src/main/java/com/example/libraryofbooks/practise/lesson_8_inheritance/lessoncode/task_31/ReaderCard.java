package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31;

import java.util.List;

public class ReaderCard {

    private Reader reader;
    private List<Book> takenBooks;
    private List<Penalty> penalties;

    public ReaderCard(Reader reader, List<Book> takenBooks, List<Penalty> penalties) {
        this.reader = reader;
        this.takenBooks = takenBooks;
        this.penalties = penalties;
    }

    public void assignBook(Book book) {
        takenBooks.add(book);
    }

    public void assignPenalty(Penalty penalty) {
        penalties.add(penalty);
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }

    public List<Penalty> getPenalties() {
        return penalties;
    }

    public void setPenalties(List<Penalty> penalties) {
        this.penalties = penalties;
    }
}
