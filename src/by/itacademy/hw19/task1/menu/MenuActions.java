package by.itacademy.hw19.task1.menu;

import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.entities.Order;
import by.itacademy.hw19.task1.services.RequestService;

import java.util.List;

public class MenuActions {
    public static void printBooks(List<Book> books) {
        if (!books.isEmpty()) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + " - " + books.get(i));
            }
        } else System.out.println("нет книг для отображения");
    }
    public static void printOrders(List<Order> orders) {
        if (!orders.isEmpty()) {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + " - " + orders.get(i));
            }
        } else System.out.println("нет заказов для отображения");
    }
    public static void printRequests() {
        if (!RequestService.getRequests().isEmpty()) {
            RequestService.getRequests().stream().forEach(System.out::println);
        } else System.out.println("нет запросов");
    }

}
