package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */

/**
 * Класс реализации интерфейса
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {

        System.out.println("Fuck! I can't fly!");
    }
}
