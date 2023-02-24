package by.itacademy.hw11;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static UserRepository userRepository;
    private Map<String, String> users = new HashMap<>();

    private UserRepository() {}
    public static Map<String, String> getRepository(){
        if(userRepository == null) userRepository = new UserRepository();
        return userRepository.users;
    }

}
