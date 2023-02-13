package by.itacademy.hw12.task5.service;

import by.itacademy.hw12.task5.entity.Pet;
import by.itacademy.hw12.task5.repository.PetsRepository;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class PetShopService {

    private PetsRepository petsRepository = new PetsRepository();
    private Map<String, Pet> repository = petsRepository.getPets();
    public String printRepository() {
        StringBuilder temp = new StringBuilder();
        for (Map.Entry<String, Pet> pet : this.repository.entrySet()) {
            temp.append(pet).append("\n");
        }
        return temp.toString();
    }

    public void sortPetsByName() {
        Map <String, Pet> buffer = new TreeMap<>(this.repository);
        this.repository = buffer;

    }
    public void sortByPriceToLow() {
        Map<String, Pet> buffer = new TreeMap<>(this.repository);
        this.repository.clear();
        List<String> keys = new ArrayList<>(buffer.keySet());
        BigDecimal maxPrice = new BigDecimal(0);
        int bufKeyInd = 0;
        while (!keys.isEmpty()) {
            for (int i = 0; i < keys.size(); i++) {
                if (buffer.get(keys.get(i)).getPrice().compareTo(maxPrice) >= 0) {
                    maxPrice = buffer.get(keys.get(i)).getPrice();
                    bufKeyInd = i;
                }
            }
            this.repository.put(keys.get(bufKeyInd), buffer.get(keys.get(bufKeyInd)));
            keys.remove(bufKeyInd);
            maxPrice = new BigDecimal(0);
        }
    }
    public void sortByPriceToHigh() {
        sortByPriceToLow();
        Map<String, Pet> buffer = new LinkedHashMap<>(this.repository);
        this.repository.clear();
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Pet> pet : buffer.entrySet()){
            names.add(pet.getKey());
        }
        for (int i = names.size() - 1; i >= 0; i--) {
            this.repository.put(names.get(i), buffer.get(names.get(i)));
        }
    }
    public Map<String, Pet> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        Map<String, Pet> foundPets = new TreeMap<>();
        for (Map.Entry<String, Pet> pet : this.repository.entrySet()) {
            if (pet.getValue().getPrice().compareTo(minPrice) > 0 && pet.getValue().getPrice().compareTo(maxPrice) < 0 ) {
                foundPets.put(pet.getKey(), pet.getValue());
            }
        }
        return foundPets;
    }
    public void buyPet(String name) throws IOException {
        if (this.repository.containsKey(name)) {
            System.out.println("питомец " + name + " - " + this.repository.get(name) + " куплен!");
            this.repository.remove(name);
        } else {
            throw new IOException();
        }
    }
}
