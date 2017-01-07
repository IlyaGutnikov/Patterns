package ru.ilyagutnikov.patterns.Decorator;

import ru.ilyagutnikov.patterns.Duck.Quackable;

/**
 * Created by ilyagutnikov on 07.01.17.
 * Pattern Decorator
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {

        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumberOfQuacks() {

        return numberOfQuacks;
    }
}
