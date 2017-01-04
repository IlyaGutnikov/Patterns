package ru.ilyagutnikov.patterns;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress (MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {

        allMenus.print();
    }

    public void printVegeterianMenu() {

        Iterator iterator = allMenus.createIterator();
        while (iterator.hasNext()) {

            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegeterian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}

        }
    }
}
