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
}
