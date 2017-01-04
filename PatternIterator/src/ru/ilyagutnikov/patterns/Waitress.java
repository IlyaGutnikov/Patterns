package ru.ilyagutnikov.patterns;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class Waitress {

    ArrayList menus;

    public Waitress(ArrayList menus) {

        this.menus = menus;
    }

    public void printMenu() {

        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {

            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator iterator) {

        while (iterator.hasNext()) {

            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + "   " + menuItem.getPrice() + "   " + menuItem.getDescription());
        }

    }
}
