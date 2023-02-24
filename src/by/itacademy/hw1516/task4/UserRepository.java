package by.itacademy.hw1516.task4;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository userRepository;
    private Map<String, User> users = new HashMap<>();

    private UserRepository() {}
    public static Map<String, User> getRepository(){
        if(userRepository == null) userRepository = new UserRepository();
        return userRepository.users;
    }

}
