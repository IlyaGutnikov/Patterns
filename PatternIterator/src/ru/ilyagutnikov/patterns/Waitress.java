package ru.ilyagutnikov.patterns;

import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress (Menu pancakeHouseMenu, Menu dinnerMenu) {

        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public  void printMenu() {

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinnerIterator);

    }

    private void printMenu(Iterator iterator) {

        while (iterator.hasNext()) {

            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "   " + menuItem.getPrice() + "   " + menuItem.getDescription());
        }

    }
}
