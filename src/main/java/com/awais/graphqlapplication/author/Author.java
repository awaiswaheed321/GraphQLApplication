package com.awais.graphqlapplication.author;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public record Author(Integer id, String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Author1"),
            new Author(2, "Author2"),
            new Author(3, "Author3"),
            new Author(4, "Author4")
    );

    public static Author getAuthorById(Integer id) {
        return authors.stream().filter(e -> Objects.equals(e.id, id)).findFirst().orElse(null);
    }
}
