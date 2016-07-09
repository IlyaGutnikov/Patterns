package ru.ilyagutnikov.patterns;

/**
 * Created by ilyagutnikov on 09.07.16.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {

        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    public void display() {

        System.out.println("I am model dick");
    }
}
