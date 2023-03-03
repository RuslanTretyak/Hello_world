package by.itacademy.hw19.task1.services;

import by.itacademy.hw19.task1.entities.Book;
import by.itacademy.hw19.task1.entities.Request;
import by.itacademy.hw19.task1.repositories.RequestRepository;

import java.util.Optional;
import java.util.Set;

public class RequestService {
    protected static void createRequest(Book book) {
        if (!book.isAvailable()) {
            RequestRepository.getRequestRepository().add(new Request(book));
        }
    }
    protected static void removeRequest(Book book) {
        RequestService.getRequests().removeIf(request -> request.getBook().getId() == book.getId());
    }
    public static Set<Request> getRequests() {
        return RequestRepository.getRequestRepository();
    }

}
