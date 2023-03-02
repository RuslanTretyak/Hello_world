package by.itacademy.hw19.task1.services;

import by.itacademy.hw19.task1.OrderStatus;
import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.entities.Order;
import by.itacademy.hw19.task1.repositories.OrderRepository;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    public static void createOrder(String customerPhoneNumber, Book book) {
        OrderRepository.getOrders().add(new Order(book, customerPhoneNumber, OrderRepository.getOrders().size() + 1));
    }
    public static void cancelOrder(Order order) {
        order.setStatus(OrderStatus.CANCELED);
    }
    public static boolean completeOrder(Order order) {
        boolean isCanComplete = order.getBooksInOrder().stream().allMatch(Book::isAvailable);
        if (isCanComplete) {
            order.setStatus(OrderStatus.COMPLETED);
            order.getBooksInOrder().stream().forEach(BookService::putAwayBook);
            return true;
        } else return false;
    }
    public static List<Order> getOrders(OrderStatus orderStatus) {
        return OrderRepository.getOrders().stream().
                filter(order -> order.getStatus() == orderStatus).collect(Collectors.toList());
    }
    public static boolean addBookInOrder(Order order, Book book) {
        boolean isCanAdd = order.getBooksInOrder().stream().noneMatch(book1 -> book1.getId() == book.getId());
        if (isCanAdd) {
            order.getBooksInOrder().add(book);
            return true;
        } else return false;
    }

}
