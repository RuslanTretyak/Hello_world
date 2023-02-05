package by.itacademy.hw11;

import by.itacademy.hw11.exceptions.UserNotExistException;
import by.itacademy.hw11.exceptions.WrongLoginException;
import by.itacademy.hw11.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Servis {
    public static boolean createUser(){

        System.out.println("Введите логин");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (!name.matches("\\b[a-z_\\d]{5,20}\\b")) {
            try {
                throw new WrongLoginException("недопустимый логин");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Введите пароль");
            String password = sc.nextLine();
            if (!password.matches("\\b[a-z_\\d]{8,}\\b")) {
                try {
                    throw new WrongPasswordException("недопустимый пароль");
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                UserRepository.getRepository().put(name, password);
                System.out.println("пользователь с логином \"" + name + "\" создан");
                return true;
            }
        }
        return false;
    }
    public static boolean authorizeUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите логин");
        String name = sc.nextLine();
        System.out.println("введите пароль");
        String password = sc.nextLine();
        if(!UserRepository.getRepository().containsKey(name)) {
            try {
                throw new UserNotExistException("пользователь с логином \"" + name + "\" не существует");
            } catch (UserNotExistException e) {
                System.out.println(e.getMessage());
                return false;
            }
        } else {
            if (!UserRepository.getRepository().get(name).equals(password)){
                try {
                    throw new WrongPasswordException("неверный пароль");
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            } else {
                System.out.println("пользолатель " + name + " авторизован");
                return true;
            }
        }

    }
}
