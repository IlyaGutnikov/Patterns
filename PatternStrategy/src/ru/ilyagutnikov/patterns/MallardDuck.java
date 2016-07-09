package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */

/**
 * Кряква
 */
public class MallardDuck extends Duck {

    /**
     * Конструктор кряквы
     */
    public MallardDuck() {

        /**
         * Кряканье и летание
         */
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    @Override
    public void display() {

        System.out.println("I am a goddamned Mallard Duck");

    }
}
