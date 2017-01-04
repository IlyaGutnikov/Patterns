package ru.ilyagutnikov.patterns;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {

        addItem("Veggie Burger","Veggie Burger with lettuce,tomato and fries", true, 3.99);
        addItem("Burrito","A large burrito", true, 4.29);

    }

    public void addItem(String name, String description, boolean vegeterian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {

       return menuItems.values().iterator();
    }
}
