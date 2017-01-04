package ru.ilyagutnikov.patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}
