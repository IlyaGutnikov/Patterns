package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class Waitress {

    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress (PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {

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
