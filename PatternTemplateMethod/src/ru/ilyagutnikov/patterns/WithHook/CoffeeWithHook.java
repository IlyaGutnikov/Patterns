package ru.ilyagutnikov.patterns.WithHook;


/**
 * Created by IlyaGutnikov on 11.12.2016.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {

        System.out.println("Dripping coffee");

    }

    @Override
    void addCondiments() {

        System.out.println("Add milk and sugar");

    }

    @Override
    boolean customerWantsCondiments() {
        return false;
    }
}
