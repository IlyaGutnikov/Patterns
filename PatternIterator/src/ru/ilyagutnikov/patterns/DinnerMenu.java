package ru.ilyagutnikov.patterns;

import ru.ilyagutnikov.patterns.Menu;

import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 16.12.2016.
 */
public class DinnerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {

        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeterian BLTt", "Fake Bacon with lettuce and tomato", true, 2.99);

        addItem("BLT", "Bacon with lettuce and tomato", false, 2.99);

        addItem("Soup of the day", "Soup of the day", false, 3.99);

        addItem("Hotdog", "Hotdog with onion and cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegeterian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        if (numberOfItems >= MAX_ITEMS) {

            System.err.println("Too many items");
        } else {

            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    @Override
    public Iterator createIterator() {

        return new DinnerMenuIterator(menuItems);
    }
}
