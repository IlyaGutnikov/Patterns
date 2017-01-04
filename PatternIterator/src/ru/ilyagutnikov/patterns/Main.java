package ru.ilyagutnikov.patterns;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList menus = new ArrayList();
        menus.add(new PancakeHouseMenu());
        menus.add(new DinnerMenu());
        menus.add(new CafeMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
