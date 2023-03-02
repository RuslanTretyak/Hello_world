package by.itacademy.hw19.task1.menu;

import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.entities.Order;

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

}
