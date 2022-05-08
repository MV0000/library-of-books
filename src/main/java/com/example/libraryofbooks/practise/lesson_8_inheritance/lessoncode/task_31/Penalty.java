package com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.task_31;

import java.time.LocalDate;

public class Penalty {

    private Long id;
    private Book book;
    private int amount;
    private LocalDate dueDate;
    private LocalDate creationDate;

    public Penalty(Long id, Book book, int amount, LocalDate dueDate, LocalDate creationDate) {
        this.id = id;
        this.book = book;
        this.amount = amount;
        this.dueDate = dueDate;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Penalty{" +
                "id=" + id +
                ", book=" + book +
                ", amount=" + amount +
                ", dueDate=" + dueDate +
                ", creationDate=" + creationDate +
                '}';
    }
}
