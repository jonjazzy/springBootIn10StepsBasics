package com.jonjazzy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksRESTController
{
    //return books when someone calls "/books"
    @GetMapping("/book")
    public List<Book> getABook()
    {
        return Arrays.asList(
                    new Book(
                    1l,
                    "Mastering Spring",
                    "Authored by Jon Jazzy"
                ));
    }

    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        List<Book> myBooks = new ArrayList<Book>();
        myBooks.add(new Book(1, "Silence of the Lambs", "Charles Darwin"));
        myBooks.add(new Book(2, "Mirrors on the Ceiling", "The Eagles"));
        myBooks.add(new Book(3, "Dont walk Run!", "Sarah Palin"));

        return myBooks;
    }
}
