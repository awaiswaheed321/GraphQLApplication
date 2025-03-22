package com.awais.graphqlapplication.book;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "book1", 604),
            new Book(2, "book2", 600),
            new Book(3, "book3", 704),
            new Book(4, "book4", 714)
    );
}
