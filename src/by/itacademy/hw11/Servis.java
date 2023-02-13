package by.itacademy.hw11;

import by.itacademy.hw11.exceptions.UserNotExistException;
import by.itacademy.hw11.exceptions.WrongLoginException;
import by.itacademy.hw11.exceptions.WrongPasswordException;

import java.util.Scanner;

public class Servis {
    public static boolean createUser(String name, String password) {

        if (name.matches("\\b[a-z_\\d]{5,20}\\b") && password.matches("\\b[a-z_\\d]{8,}\\b")) {
            UserRepository.getRepository().put(name, password);
            return true;
        } else {
            if (!name.matches("\\b[a-z_\\d]{5,20}\\b")) {
                throw new WrongLoginException("недопустимый логин");
            }
            if (!password.matches("\\b[a-z_\\d]{8,}\\b")) {
                throw new WrongPasswordException("недопустимый пароль");
            }
            return false;
        }
    }
    public static boolean authorizeUser(String name, String password){
        if(UserRepository.getRepository().containsKey(name) && UserRepository.getRepository().get(name).equals(password)) {
                return true;
        } else {
            if(!UserRepository.getRepository().containsKey(name)) {
                throw new UserNotExistException("пользователь с логином \"" + name + "\" не существует");
            }
            if (!UserRepository.getRepository().get(name).equals(password)) {
                throw new WrongPasswordException("неверный пароль");
            }
            return false;
        }
    }
}
