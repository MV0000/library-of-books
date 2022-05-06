package com.example.libraryofbooks.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "books")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @Column(name = "bookId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "bookTitle")
    private String bookTitle;

    @Column(name = "bookAuthor")
    private String clientLastName;

    @Column(name = "bookReleaseDate")
    private Long bookReleaseDate;

}
