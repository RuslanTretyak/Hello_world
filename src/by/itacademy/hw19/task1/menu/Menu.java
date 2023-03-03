package by.itacademy.hw19.task1.menu;

import by.itacademy.hw19.task1.*;
import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.entities.Order;
import by.itacademy.hw19.task1.repositories.OrderRepository;
import by.itacademy.hw19.task1.services.BookService;
import by.itacademy.hw19.task1.services.OrderService;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {
            System.out.println("\n1 - просмотр списка книг\n2 - добавить/списать книгу\n3 - просмотр списка заказов" +
                    "\n4 - обработка заказов\n5 - просмотр запросов\n6 - выход");
            switch (checkMenuPoint(1, 6)) {
                case (1):
                    System.out.println("\n1 - все книги\n2 - в наличии\n3 - выход\n");
                    switch (checkMenuPoint(1, 3)) {
                        case (1):
                            MenuActions.printBooks(BookService.getBooks());
                            break;
                        case (2):
                            MenuActions.printBooks(BookService.getAvailableBooks());
                            break;
                        case (3):
                            break;
                    }
                    break;
                case (2):
                    while (!isDone) {
                        System.out.println("\n1 - добавить книгу\n2 - списать книгу\n3 - выход\n");
                        switch (checkMenuPoint(1, 3)) {
                            case (1):
                                if (!BookService.getNotAvailableBooks().isEmpty()) {
                                    System.out.println("выберите книгу для добавления");
                                    MenuActions.printBooks(BookService.getNotAvailableBooks());
                                    BookService.addBook(BookService.getNotAvailableBooks().get(checkMenuPoint(1, BookService.getNotAvailableBooks().size()) - 1));
                                    System.out.println("\nкнига добавлена");
                                } else System.out.println("нет книг для добавления");
                                break;
                            case (2):
                                if (!BookService.getAvailableBooks().isEmpty()) {
                                    System.out.println("выберите книгу для списания");
                                    MenuActions.printBooks(BookService.getAvailableBooks());
                                    BookService.putAwayBook(checkMenuPoint(1, BookService.getAvailableBooks().size()) - 1);
                                    System.out.println("\nкнига списана");
                                } else System.out.println("нет книг для списания");
                                break;
                            case (3):
                                isDone = true;
                                break;
                        }
                    }
                    isDone = false;
                    break;
                case (3):
                    while (!isDone) {
                        System.out.println("\n1 - все заказы\n2 - новые заказы\n3 - отмененные заказы\n" +
                                "4 - выполненные заказы\n5 - выход");
                        switch (checkMenuPoint(1, 5)) {
                            case (1):
                                MenuActions.printOrders(OrderRepository.getOrders());
                                break;
                            case (2):
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.NEW));
                                break;
                            case (3):
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.CANCELED));
                                break;
                            case (4):
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.COMPLETED));
                                break;
                            case (5):
                                isDone = true;
                                break;
                        }
                    }
                    isDone = false;
                    break;
                case (4):
                    while (!isDone) {
                        boolean actionDone;
                        System.out.println("\n1 - создать заказ\n2 - добавить книгу в заказ\n3 - выполнить заказ\n" +
                                "4 - отменить заказ\n5 - выход");
                        switch (checkMenuPoint(1,5)) {
                            case (1):
                                System.out.println("введите номер телефона заказчика");
                                String phoneNumber = scanner.nextLine();
                                System.out.println("выберите книгу");
                                MenuActions.printBooks(BookService.getBooks());
                                OrderService.createOrder(phoneNumber, BookService.getBooks().
                                        get(checkMenuPoint(1, BookService.getBooks().size()) - 1));
                                break;
                            case (2):
                                System.out.println("выберите заказ для добавления книги");
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.NEW));
                                Order correctOrder = OrderService.getOrders(OrderStatus.NEW).
                                        get(checkMenuPoint(1, OrderService.getOrders(OrderStatus.NEW).size()) - 1);
                                System.out.println("выберите книгу для добавления в заказ");
                                MenuActions.printBooks(BookService.getBooks());
                                Book bookForAdd = BookService.getBooks().
                                        get(checkMenuPoint(1, BookService.getBooks().size()) - 1);
                                actionDone = OrderService.addBookInOrder(correctOrder, bookForAdd);
                                if (actionDone) System.out.println("книга добавлена");
                                else System.out.println("невозможно добавить, книга уже есть в заказе");
                                break;
                            case (3):
                                System.out.println("выберите заказ для выполнения");
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.NEW));
                                actionDone = OrderService.completeOrder(OrderService.getOrders(OrderStatus.NEW).
                                        get(checkMenuPoint(1, OrderService.getOrders(OrderStatus.NEW).size()) - 1));
                                if (actionDone) System.out.println("заказ выполнен");
                                else System.out.println("невозможно выполнить заказ");
                                break;
                            case (4):
                                System.out.println("выберите заказ для отмены");
                                MenuActions.printOrders(OrderService.getOrders(OrderStatus.NEW));
                                OrderService.cancelOrder(OrderService.getOrders(OrderStatus.NEW).
                                        get(checkMenuPoint(1, OrderService.getOrders(OrderStatus.NEW).size()) - 1));
                                System.out.println("заказ отменен");
                                break;
                            case (5):
                                isDone = true;
                                break;
                        }
                    }
                    isDone = false;
                    break;
                case (5):
                    MenuActions.printRequests();
                    break;
                case (6):
                    isDone = true;
                    break;

            }
        }
    }
    public static int checkMenuPoint(int min, int max) {
        int menuPoint = min - 1;
        while (menuPoint < min || menuPoint > max) {
            try {
                menuPoint = Integer.parseInt(scanner.nextLine().trim());
                if (menuPoint >= min && menuPoint <= max) {
                    break;
                } else System.out.println("некорректный ввод");
            } catch (Exception e) {
                menuPoint = 0;
                System.out.println("некорректный ввод");
            }
        }
        return menuPoint;
    }
}
