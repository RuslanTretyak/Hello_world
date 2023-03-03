package by.itacademy.hw19.task1.entities;

import by.itacademy.hw19.task1.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int number;
    private List<Book> booksInOrder;
    private OrderStatus status;
    private String customerPhoneNumber;

    public Order(Book book, String customerPhoneNumber, int number) {
        this.booksInOrder = new ArrayList<>();
        this.booksInOrder.add(book);
        this.status = OrderStatus.NEW;
        this.customerPhoneNumber = customerPhoneNumber;
        this.number = number;
    }
    @Override
    public String toString() {
        if (this.booksInOrder.size() == 1) {
            return "заказ № " + number +
                    ", номер телефона заказчика: '" + customerPhoneNumber +
                    "', статус: '" + status + "', книга: " + booksInOrder;
        } else {
            return "заказ № " + number +
                    ", номер телефона заказчика: '" + customerPhoneNumber +
                    "', статус: '" + status + "', список книг: " + booksInOrder;
        }
    }
    public void setStatus(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<Book> getBooksInOrder() {
        return booksInOrder;
    }
}
