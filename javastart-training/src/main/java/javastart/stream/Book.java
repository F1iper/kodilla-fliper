package javastart.stream;

import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private LocalDate publishDate;

    public Book(String title, String author, int year, int month, int day) {
        this.title = title;
        this.author = author;
        this.publishDate = LocalDate.of(year, month, day);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
}