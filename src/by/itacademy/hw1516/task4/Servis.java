package by.itacademy.hw1516.task4;

import by.itacademy.hw1516.task4.exceptions.UserNotExistException;
import by.itacademy.hw1516.task4.exceptions.WrongLoginException;
import by.itacademy.hw1516.task4.exceptions.WrongPasswordException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Servis {
    public static boolean createUser(String name, String password) {

        if (name.matches("\\b[a-z_\\d]{5,20}\\b") && password.matches("\\b[a-z_\\d]{8,}\\b")) {
            UserRepository.getRepository().put(name, new User(password));
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
        if(UserRepository.getRepository().containsKey(name) && UserRepository.getRepository().get(name).getPassword().equals(password)) {
            UserRepository.getRepository().get(name).setLastAuthorizationDate(LocalDateTime.now());
                return true;
        } else {
            if(!UserRepository.getRepository().containsKey(name)) {
                throw new UserNotExistException("пользователь с логином \"" + name + "\" не существует");
            }
            if (!UserRepository.getRepository().get(name).getPassword().equals(password)) {
                throw new WrongPasswordException("неверный пароль");
            }
            return false;
        }
    }
    public static List<String> getUsers (LocalDateTime dateStart, LocalDateTime dateEnd) {
        List<String> registeredUsers = UserRepository.getRepository().keySet().stream().
                filter(x -> UserRepository.getRepository().get(x).getRegistrationDate().isBefore(dateEnd) &&
                        UserRepository.getRepository().get(x).getRegistrationDate().isAfter(dateStart)).collect(Collectors.toList());
        return registeredUsers;
    }
}
