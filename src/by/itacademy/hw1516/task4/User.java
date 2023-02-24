package by.itacademy.hw1516.task4;

import java.time.LocalDateTime;

public class User {
    private String password;
    private LocalDateTime registrationDate;
    private LocalDateTime lastAuthorizationDate;

    public User(String password) {
        this.password = password;
        this.registrationDate = LocalDateTime.now();
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public String getPassword() {
        return password;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getLastAuthorizationDate() {
        return lastAuthorizationDate;
    }
}
