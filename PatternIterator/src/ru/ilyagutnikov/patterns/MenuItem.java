package ru.ilyagutnikov.patterns;

import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 16.12.2016.
 */
public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegeterian;
    double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {

        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }


    public String getName() {

        return name;
    }

    public String getDescription() {

       return description;
    }

    public boolean isVegeterian() {

        return vegeterian;
    }

    public double getPrice() {

        return price;
    }

    public void print() {
        System.out.println("  " + getName() +"   " + (isVegeterian() ? "v" : "")   +  "   " + getDescription() + "   " + getPrice());
    }

    public Iterator createIterator() {
        return new NullIterator();
    }
}
