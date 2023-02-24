package by.itacademy.hw1516.task4.exceptions;

public class UserNotExistException extends RuntimeException{
    public UserNotExistException(String message) {
        super(message);
    }
}
