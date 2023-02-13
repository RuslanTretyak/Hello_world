package by.itacademy.hw12.task5.menu;

import by.itacademy.hw12.task5.entity.Pet;
import by.itacademy.hw12.task5.logger.ConsoleLogger;
import by.itacademy.hw12.task5.logger.FileLogger;
import by.itacademy.hw12.task5.service.PetShopService;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MenuActions {
    private PetShopService petShopService = new PetShopService();
    Scanner sc = new Scanner(System.in);
    ConsoleLogger consoleLogger = new ConsoleLogger();
    FileLogger fileLogger = new FileLogger();

    public int chooseMenuPoint() {
        int menuPoint = 0;
            try {
                menuPoint = Integer.parseInt(sc.next());
                if (menuPoint < 1 || menuPoint > 6) {
                    consoleLogger.warn(getClass() + " выбран несуществующий пункт меню");
                    fileLogger.warn(getClass() + " выбран несуществующий пункт меню");
                }
            } catch (NumberFormatException e) {
                consoleLogger.error(getClass() + " некорректный ввод пункта меню");
                menuPoint = 0;
            }
        return menuPoint;
    }

    public void showPets () {
        consoleLogger.info(getClass() + " выводим список питомцев");
        fileLogger.info(getClass() + " выводим список питомцев");
        System.out.println(petShopService.printRepository());
    }
    public void showPetsSortedByName() {
        consoleLogger.info(getClass() + " сортируем список питомцев по кличке");
        fileLogger.info(getClass() + " сортируем список питомцев по кличке");
        petShopService.sortPetsByName();
        System.out.println(petShopService.printRepository());
    }
    public void showPetsSortedByPriceToLow() {
        consoleLogger.info(getClass() + " сортируем список питомцев по убыванию цены");
        fileLogger.info(getClass() + " сортируем список питомцев по убыванию цены");
        petShopService.sortByPriceToLow();
        System.out.println(petShopService.printRepository());
    }
    public void showPetsSortedByPriceToHigh() {
        consoleLogger.info(getClass() + " сортируем список питомцев по возрастанию цены");
        fileLogger.info(getClass() + " сортируем список питомцев по возрастанию цены");
        petShopService.sortByPriceToHigh();
        System.out.println(petShopService.printRepository());
    }
    public void showPetsByPriceRange(BigDecimal minPrice, BigDecimal maxPrice) throws IOException {
        if (minPrice.compareTo(maxPrice) != 1) {
            if (!petShopService.findByPriceRange(minPrice, maxPrice).isEmpty()) {
                consoleLogger.info(getClass() + " отображаем список питомцев по ценовому диапазону (" + minPrice + " - " + maxPrice + ")");
                fileLogger.info(getClass() + " отображаем список питомцев по ценовому диапазону (" + minPrice + " - " + maxPrice + ")");
                for (Map.Entry<String, Pet> pet : petShopService.findByPriceRange(minPrice, maxPrice).entrySet()) {
                    System.out.println(pet);
                }
            } else {
                consoleLogger.info(getClass() + " по ценовому диапазону (" + minPrice + " - " + maxPrice + ") не найдено питомцев");
                fileLogger.info(getClass() + " по ценовому диапазону (" + minPrice + " - " + maxPrice + ") не найдено питомцев");
                System.out.println("по заданному диапазону питомцев не найдено");
            }
        } else {
            throw new IOException();
        }
    }
    public void buyPet (String name) {
        try {
            petShopService.buyPet(name);
            consoleLogger.info(getClass() + " пользователь покупает питомца " + "'" + name + "'");
            fileLogger.info(getClass() + " пользователь покупает питомца \" + \"'\" + name + \"'");
        } catch (IOException e) {
            consoleLogger.error(getClass() + " питомца " + "'" + name + "' нет в списке");
            fileLogger.error(getClass() + " питомца " + "'" + name + "' нет в списке");
        }
    }
}
