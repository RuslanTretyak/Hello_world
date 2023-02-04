package by.itacademy.hw8.task2;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public class Query {
        public Query() {
            printToLog();
        }
        public void printToLog(){
            System.out.printf("пользователь с логином %s и паролем %s отправил запрос", userName, password);
        }
    }
}
