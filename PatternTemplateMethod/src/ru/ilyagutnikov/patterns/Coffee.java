package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 11.12.2016.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {

        System.out.println("Dripping coffee");

    }

    @Override
    void addCondiments() {

        System.out.println("Add milk and sugar");

    }
}

