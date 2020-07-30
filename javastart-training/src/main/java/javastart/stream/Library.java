package javastart.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Library {

    public static void main(String[] args) {

        getBooks().stream()
                .filter(b -> b.getPublishDate().getYear() <= 2000)
                .map(b -> b.getTitle().toUpperCase())
                .forEach(System.out::println);
    }

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("This is book 1", "King Kong", 2007, 4, 15));
        books.add(new Book("This is book 2", "King Kong", 2000, 4, 15));
        books.add(new Book("This is book 3", "King Kong", 1996, 4, 15));
        books.add(new Book("This is book 4", "King Kong", 1997, 4, 15));
        books.add(new Book("This is book 5", "King Kong", 1998, 4, 15));
        books.add(new Book("This is book 6", "King Kong", 1987, 4, 15));
        books.add(new Book("This is book 7", "King Kong", 2011, 4, 15));
        return books;
    }
}