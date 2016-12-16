package ru.ilyagutnikov.patterns;

import java.util.ArrayList;

/**
 * Created by IlyaGutnikov on 16.12.2016.
 */
public class PancakeHouseMenu {

    ArrayList menuItems;

    public PancakeHouseMenu() {

        menuItems = new ArrayList();

        addItem("Pancakes Breakfast", "Pancakes with fried eggs and toast", true, 2.99);

        addItem("Regular Pancakes Breakfast", "Pancakes with fried eggs and sausage", false, 2.99);

        addItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49);

        addItem("Waffles", "Waffles with blueberries or strawberries", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.add(menuItem);

    }

    public ArrayList getMenuItems() {

        return menuItems;
    }
}
