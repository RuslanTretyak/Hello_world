package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private static BookRepository bookRepository;
    private List<Book> books;
    private BookRepository() {
        this.books = new ArrayList<>();
        books.add(new Book("Книга1", true));
        books.add(new Book("Книга2", true));
        books.add(new Book("Книга3", false));
        books.add(new Book("Книга4", false));
        books.add(new Book("Книга5", true));
    }
    public static List<Book> getBooks() {
        if (bookRepository == null) {
            bookRepository = new BookRepository();
        }
        return bookRepository.books;
    }
}