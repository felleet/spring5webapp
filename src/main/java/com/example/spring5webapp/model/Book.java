package com.example.spring5webapp.model;

public class Book {

    private Long id;
    private String title;
    private String isbn;
    private String publisher;

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }
}
