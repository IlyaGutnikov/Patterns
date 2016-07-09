package ru.ilyagutnikov.patterns;

/**
 * Created by MartinSeptim on 28.01.2016.
 */

/**
 * Основной класс который расширяют другие классы
 */
public abstract class Duck {

    /**
     * Ссылки на интерфейсами
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    /**
     * Делегирование операции класса поведения полета
     */
    public void performFly() {

        flyBehavior.fly();
    }

    /**
     * Операция кряканья
     */
    public void performQuack() {

        quackBehavior.quack();

    }

    /**
     * Операция плавания
     */
    public void swim() {

        System.out.println("All ducks float");
    }

    public void setFlyBehavior(FlyBehavior fb) {

        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {

        quackBehavior = qb;
    }
}
