package com.example.spring5webapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "book")
@EnableConfigurationProperties(Book.class)
public class Book {

    String author;
    String publisher;

    public Book() {
        System.out.println("book created. " + toString());
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        System.out.println(toString());
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
