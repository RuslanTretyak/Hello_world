package by.itacademy.hw12.task5.menu;

import by.itacademy.hw12.task5.logger.ConsoleLogger;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        File file = new File("./src/by/itacademy/hw12/task5/logger/log.txt");
        MenuActions menuActions = new MenuActions();
        Scanner sc = new Scanner(System.in);
        int menuPoint = 0;
        while (menuPoint != 6) {
            System.out.println("\n1 - показать список питомцев\n2 - сортировать питомцев по кличке\n" +
                    "3 - сортировать питомцев по цене\n4 - поиск питомцев по ценовому диапазону\n" +
                    "5 - купить питомца\n6 - выход");
            menuPoint = menuActions.chooseMenuPoint();
            switch (menuPoint) {
                case (1):
                    menuActions.showPets();
                    break;
                case (2):
                    menuActions.showPetsSortedByName();
                    break;
                case (3):
                    System.out.println("1 - по возрастанию цены\n2 - по убыванию цены");
                    menuPoint = menuActions.chooseMenuPoint();
                    switch (menuPoint) {
                        case (1):
                            menuActions.showPetsSortedByPriceToHigh();
                            break;
                        case (2):
                            menuActions.showPetsSortedByPriceToLow();
                            break;
                    }
                    break;
                case (4):
                    System.out.println("Укажите минимальную сумму");
                    BigDecimal minPrice = sc.nextBigDecimal();
                    System.out.println("Укажите максимальную сумму");
                    BigDecimal maxPrice = sc.nextBigDecimal();
                    try {
                        menuActions.showPetsByPriceRange(minPrice, maxPrice);
                    } catch (IOException e) {
                        System.out.println("некорректно задан ценовой диапазон");

                    }
                    break;
                case (5):
                    System.out.println("введите кличку питомца");
                    String name = sc.next();
                    menuActions.buyPet(name);
                    break;
                case (7):
                    break;
            }
        }
    }
}
