package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    @Override
    public void display() {

        System.out.println("I am a goddamned Mallard Duck");

    }
}
