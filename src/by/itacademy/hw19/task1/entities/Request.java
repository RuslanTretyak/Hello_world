package by.itacademy.hw19.task1.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Request implements Comparable<Request>{
    private final Book book;
    private final LocalDateTime timeOfCreation;

    public Request(Book book) {
        this.book = book;
        this.timeOfCreation = LocalDateTime.now();
    }

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "запрос на книгу '" + book +
                "', создан - " + timeOfCreation.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
    @Override
    public int compareTo(Request request) {
        if (this.timeOfCreation.isAfter(request.timeOfCreation)) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(book, request.book) && Objects.equals(timeOfCreation, request.timeOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, timeOfCreation);
    }
}
