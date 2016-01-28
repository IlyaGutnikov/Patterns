package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {

        flyBehavior.fly();
    }

    public void performQuack() {

        quackBehavior.quack();

    }

    public void swim() {

        System.out.println("All ducks float");
    }
}
