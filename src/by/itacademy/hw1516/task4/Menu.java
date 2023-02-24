package by.itacademy.hw1516.task4;

import by.itacademy.hw1516.task4.exceptions.UserNotExistException;
import by.itacademy.hw1516.task4.exceptions.WrongLoginException;
import by.itacademy.hw1516.task4.exceptions.WrongPasswordException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainMenuPoint = 0;
        int menuPoint = 0;
        while (mainMenuPoint != 4) {
            System.out.println("1 - регистрация\n2 - авторизация\n3 - показать пользователей зарегистрированных в заданное время\n4 - выход");
            mainMenuPoint = sc.nextInt();
            switch (mainMenuPoint) {
                case (1):
                    menuPoint = 0;
                    while (menuPoint != 2){
                        System.out.println("Введите логин");
                        String name = sc.next();
                        System.out.println("Введите пароль");
                        String password = sc.next();
                        try {
                            if (Servis.createUser(name, password)) {
                                System.out.println("пользователь с логином \"" + name + "\" создан");
                                menuPoint = 2;
                            }
                        } catch (WrongLoginException | WrongPasswordException e) {
                            System.out.println(e.getMessage());
                            System.out.println("1 - повтрорить попытку\n2 - выход в главное меню");
                            menuPoint = sc.nextInt();
                        }
                    }
                    break;
                case (2):
                    menuPoint = 0;
                    while (menuPoint != 2){
                        System.out.println("Введите логин");
                        String name = sc.next();
                        System.out.println("Введите пароль");
                        String password = sc.next();
                        try {
                            if (Servis.authorizeUser(name, password)) {
                                System.out.println("пользолатель " + name + " авторизован");
                                menuPoint = 2;
                            }
                        } catch (UserNotExistException | WrongPasswordException e) {
                            System.out.println(e.getMessage());
                            System.out.println("1 - повтрорить попытку\n2 - выход в главное меню");
                            menuPoint = sc.nextInt();
                        }
                    }
                    break;
                case (3):
                    menuPoint = 0;
                    while (menuPoint != 2) {
                        try {
                            sc.nextLine();
                            System.out.println("введите начальное время поиска (dd/MM/yyyy HH:mm)");
                            LocalDateTime dateStart = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
                            System.out.println("введите конечное время (dd/MM/yyyy HH:mm)");
                            LocalDateTime dateEnd = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
                            if (!Servis.getUsers(dateStart, dateEnd).isEmpty()) {
                                System.out.println("по заданному времени зарегистрированы пользователи: " +
                                        Servis.getUsers(dateStart, dateEnd));
                            } else {
                                System.out.println("по заданному времени нет зарегистрированных пользователей");
                            }
                            menuPoint = 2;
                        } catch (Exception e) {
                            System.out.println("неверный формат времени");
                            System.out.println("1 - повтрорить попытку\n2 - выход в главное меню");
                            menuPoint = sc.nextInt();
                        }
                    }


                case (4):
            }
        }
    }
}
