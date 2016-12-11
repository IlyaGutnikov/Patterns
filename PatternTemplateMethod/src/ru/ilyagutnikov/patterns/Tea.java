package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 11.12.2016.
 */
public class Tea extends CaffeineBeverage {


    @Override
    void brew() {

        System.out.println("Steeping in cup");
    }

    @Override
    void addCondiments() {

        System.out.println("Adding lemon");
    }
}
