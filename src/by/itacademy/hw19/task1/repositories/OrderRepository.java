package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.entities.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private static OrderRepository orderRepository;
    private List<Order> orders;
    private OrderRepository() {
        orders = new ArrayList<>();
    }
    public static List<Order> getOrders() {
        if (orderRepository == null) {
            orderRepository = new OrderRepository();
        }
        return orderRepository.orders;
    }
}
