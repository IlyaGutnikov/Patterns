package ru.ilyagutnikov.patterns;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MenuComponent pancakeMenuComponent = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerComponent = new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeComponent = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertComponent = new Menu("DESSERT MENU", "Dessert");

        MenuComponent allMenus = new Menu("All menus", "");

        cafeComponent.add(new MenuItem("Veggie Burger","Veggie Burger with lettuce,tomato and fries", true, 3.99));
        cafeComponent.add(new MenuItem("Burrito","A large burrito", true, 4.29));

        dinnerComponent.add(new MenuItem("Vegeterian BLTt", "Fake Bacon with lettuce and tomato", true, 2.99));
        dinnerComponent.add(new MenuItem("BLT", "Bacon with lettuce and tomato", false, 2.99));
        dinnerComponent.add(new MenuItem("Soup of the day", "Soup of the day", false, 3.99));
        dinnerComponent.add(new MenuItem("Hotdog", "Hotdog with onion and cheese", false, 3.05));

        pancakeMenuComponent.add(new MenuItem("Pancakes Breakfast", "Pancakes with fried eggs and toast", true, 2.99));
        pancakeMenuComponent.add(new MenuItem("Regular Pancakes Breakfast", "Pancakes with fried eggs and sausage", false, 2.99));

        dessertComponent.add(new MenuItem("Blueberry Pancakes", "Pancakes with fresh blueberries", true, 3.49));
        dessertComponent.add(new MenuItem("Waffles", "Waffles with blueberries or strawberries", true, 2.99));

        dinnerComponent.add(dessertComponent);

        allMenus.add(pancakeMenuComponent);
        allMenus.add(cafeComponent);
        allMenus.add(dinnerComponent);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

        System.out.println("VEGETERIAN");
        waitress.printVegeterianMenu();

    }
}
