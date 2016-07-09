package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */

/**
 * Реализация интерфейса кряканья
 */
public class Quack implements QuackBehavior {

    public void quack() {

        System.out.print("Quack-Quack");
    }
}
