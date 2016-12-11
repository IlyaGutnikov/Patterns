package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 11.12.2016.
 */
public abstract  class CaffeineBeverage {

    // final - Для того что бы потомки не могли изменить шаблон
    final void prepareReceipe() {

        //шаблон
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //реализация, которая уникальная для классов-потомков
    abstract void brew();

    abstract void addCondiments();

    void boilWater() {

        System.out.println("Boiling water");
    }

    void pourInCup() {

        System.out.println("Pouring into cup");
    }

}
