package ru.ilyagutnikov.patterns.Factory;

import ru.ilyagutnikov.patterns.Decorator.QuackCounter;
import ru.ilyagutnikov.patterns.Duck.DuckCall;
import ru.ilyagutnikov.patterns.Duck.MallardDuck;
import ru.ilyagutnikov.patterns.Duck.Quackable;
import ru.ilyagutnikov.patterns.Duck.RedheadDuck;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public class CountingDuckFactory extends AbstaractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
