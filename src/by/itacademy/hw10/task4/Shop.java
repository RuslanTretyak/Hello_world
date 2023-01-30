package by.itacademy.hw10.task4;

import by.itacademy.hw10.task4.pet.Cat;
import by.itacademy.hw10.task4.pet.Dog;
import by.itacademy.hw10.task4.pet.Parrot;
import by.itacademy.hw10.task4.pet.Pet;

import java.math.BigDecimal;
import java.util.*;


public class Shop {

    private Map<String, Pet> pets = new LinkedHashMap<>();

    public Shop() {
        this.pets.putIfAbsent("Max", new Dog("Dachshund", "black", 1.5, "M", new BigDecimal(100)));
        this.pets.putIfAbsent("Luna", new Dog("Pug", "white", 1, "F", new BigDecimal(150)));
        this.pets.putIfAbsent("Lucy", new Dog("Terrier", "brown", 0.5, "M", new BigDecimal(50)));
        this.pets.putIfAbsent("Felix", new Cat("Abyssinian", "brown", 0.5, "M", new BigDecimal(200)));
        this.pets.putIfAbsent("Oscar", new Cat("Bengal", "spotted", 0.7, "M", new BigDecimal(150)));
        this.pets.putIfAbsent("Leo", new Cat("Bombay", "black", 1.1, "M", new BigDecimal(170)));
        this.pets.putIfAbsent("Ivy", new Parrot("Amazon", "green", 0.3, "F", new BigDecimal(120)));
        this.pets.putIfAbsent("Cory", new Parrot("Cockatoo", "white", 0.4, "M", new BigDecimal(90)));
        this.pets.putIfAbsent("Pearl", new Parrot("Eclectus", "red", 1.1, "F", new BigDecimal(130)));
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (Map.Entry<String, Pet> pet : this.pets.entrySet()) {
            temp.append(pet).append("\n");
        }
        return temp.toString();
    }

    public void sortPetsByName() {
        Map<String, Pet> buffer = new TreeMap<>(this.pets);
        this.pets.clear();
        this.pets.putAll(buffer);
    }
    public void sortByPriceToLow() {
        Map<String, Pet> buffer = new TreeMap<>(this.pets);
        this.pets.clear();
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
            this.pets.put(keys.get(bufKeyInd), buffer.get(keys.get(bufKeyInd)));
            keys.remove(bufKeyInd);
            maxPrice = new BigDecimal(0);
        }
    }
    public void sortByPriceToHigh() {
        sortByPriceToLow();
        Map<String, Pet> buffer = new LinkedHashMap<>(this.pets);
        this.pets.clear();
        List<String> names = new ArrayList<>();
        for (Map.Entry<String, Pet> pet : buffer.entrySet()){
            names.add(pet.getKey());
        }
        for (int i = names.size() - 1; i >= 0; i--) {
            this.pets.put(names.get(i), buffer.get(names.get(i)));
        }
    }
    public Map<String, Pet> findByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) {
        Map<String, Pet> foundPets = new TreeMap<>();
        for (Map.Entry<String, Pet> pet : this.pets.entrySet()) {
            if (pet.getValue().getPrice().compareTo(minPrice) > 0 && pet.getValue().getPrice().compareTo(maxPrice) < 0 ) {
                foundPets.put(pet.getKey(), pet.getValue());
            }
        }
        return foundPets;
    }
    public void buyPet(String name) {
        if (this.pets.containsKey(name)) {
            System.out.println("питомец " + name + " - " + this.pets.get(name) + " куплен!");
            this.pets.remove(name);
        }
    }


}
