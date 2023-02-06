package by.itacademy.hw11;

import by.itacademy.hw11.exceptions.UserNotExistException;
import by.itacademy.hw11.exceptions.WrongLoginException;
import by.itacademy.hw11.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Servis {
    public static boolean createUser(String name, String password){

        if (!name.matches("\\b[a-z_\\d]{5,20}\\b")) {
            try {
                throw new WrongLoginException("недопустимый логин");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } else {

            if (!password.matches("\\b[a-z_\\d]{8,}\\b")) {
                try {
                    throw new WrongPasswordException("недопустимый пароль");
                } catch (WrongPasswordException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                UserRepository.getRepository().put(name, password);
                return true;
            }
        }
        return false;
    }
    public static boolean authorizeUser(String name, String password){
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
                return true;
            }
        }

    }
}
