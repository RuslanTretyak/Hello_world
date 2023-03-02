package by.itacademy.hw19.task1.services;

import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.repositories.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    public static List<Book> getBooks() {
        return BookRepository.getBooks();
    }
    public static List<Book> getAvailableBooks() {
        return BookService.getBooks().stream().filter(Book::isAvailable).collect(Collectors.toList());
    }
    public static List<Book> getNotAvailableBooks() {
        return BookService.getBooks().stream().filter(book -> !book.isAvailable()).collect(Collectors.toList());

    }
    public static void addBook(int number) {
        getNotAvailableBooks().get(number).setAvailable(true);
    }
    public static void putAwayBook(int number) {
        getAvailableBooks().get(number).setAvailable(false);
    }
    public static void putAwayBook(Book book) {
        for (Book book1: getAvailableBooks()) {
            if (book1.getId() == book.getId()) {
                book1.setAvailable(false);
            }
        }
    }

}
