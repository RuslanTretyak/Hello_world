package by.itacademy.hw11;

import by.itacademy.hw11.exceptions.UserNotExistException;
import by.itacademy.hw11.exceptions.WrongLoginException;
import by.itacademy.hw11.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mainMenuPoint = 0;
        int menuPoint = 0;
        while (mainMenuPoint != 3) {
            System.out.println("1 - регистрация\n2 - авторизация\n3 - выход");
            mainMenuPoint = sc.nextInt();
            switch (mainMenuPoint) {
                case (1):
                    menuPoint = 0;
                    while (menuPoint != 2){
                        System.out.println("Введите логин");
                        String name = sc.next();
                        System.out.println("Введите пароль");
                        String password = sc.next();
                        if (!name.matches("\\b[a-z_\\d]{5,20}\\b")) {
                            try {
                                throw new WrongLoginException("недопустимый логин");
                            } catch (WrongLoginException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        if (!password.matches("\\b[a-z_\\d]{8,}\\b")) {
                            try {
                                throw new WrongPasswordException("недопустимый пароль");
                            } catch (WrongPasswordException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        if (Servis.createUser(name, password)) {
                            System.out.println("пользователь с логином \"" + name + "\" создан");
                            menuPoint = 2;
                        } else {
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
                        if(!UserRepository.getRepository().containsKey(name)) {
                            try {
                                throw new UserNotExistException("пользователь с логином \"" + name + "\" не существует");
                            } catch (UserNotExistException e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            if (!UserRepository.getRepository().get(name).equals(password)) {
                                try {
                                    throw new WrongPasswordException("неверный пароль");
                                } catch (WrongPasswordException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                        }
                        if (Servis.authorizeUser(name, password)) {
                            System.out.println("пользолатель " + name + " авторизован");
                            menuPoint = 2;
                        } else {
                            System.out.println("1 - повтрорить попытку\n2 - выход в главное меню");
                            menuPoint = sc.nextInt();
                        }
                    }
                    break;
                case (3):

            }
        }
    }
}
