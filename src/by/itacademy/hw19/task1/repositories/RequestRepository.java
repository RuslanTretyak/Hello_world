package by.itacademy.hw19.task1.repositories;

import by.itacademy.hw19.task1.entities.Request;

import java.util.Set;
import java.util.TreeSet;

public class RequestRepository {
    private static RequestRepository requestRepository;
    private Set<Request> requestSet;
    private RequestRepository() {
        requestSet = new TreeSet<>();
    }
    public static Set<Request> getRequestRepository() {
        if (requestRepository == null) {
            requestRepository = new RequestRepository();
        }
        return requestRepository.requestSet;
    }
}
