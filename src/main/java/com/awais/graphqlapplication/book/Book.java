package com.awais.graphqlapplication.book;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {
    public static List<Book> books = Arrays.asList(
            new Book(1, "book1", 604, 1),
            new Book(2, "book2", 600, 2),
            new Book(3, "book3", 704, 3),
            new Book(4, "book4", 714, 4)
    );

    public static Book getBookById(Integer id) {
        return books.stream().filter(e -> Objects.equals(e.id, id)).findFirst().orElse(null);
    }
}
