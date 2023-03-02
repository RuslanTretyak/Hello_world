package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.entities.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static OrderRepository orderRepository;
    private List<Order> orders;
    private OrderRepository() {
        orders = new ArrayList<>();
        orders.add(new Order(BookRepository.getBooks().get(0), "+375-29-1111111", 1));
        orders.add(new Order(BookRepository.getBooks().get(0), "+375-29-2222222", 2));
        orders.add(new Order(BookRepository.getBooks().get(0), "+375-29-3333333", 3));

    }
    public static List<Order> getOrders() {
        if (orderRepository == null) {
            orderRepository = new OrderRepository();
        }
        return orderRepository.orders;
    }
}
