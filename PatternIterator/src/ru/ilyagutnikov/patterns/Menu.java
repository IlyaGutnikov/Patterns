package ru.ilyagutnikov.patterns;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class Menu extends MenuComponent{

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    Iterator iterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add (MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove (MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int j) {
        return (MenuComponent) menuComponents.get(j);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {

        System.out.println("    " + getName() + "   ");
        System.out.println("    " + getDescription() + "   ");
        System.out.println("    ------   ");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    public Iterator createIterator() {

        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
