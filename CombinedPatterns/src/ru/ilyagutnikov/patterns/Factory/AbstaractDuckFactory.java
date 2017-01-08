package ru.ilyagutnikov.patterns.Factory;

import ru.ilyagutnikov.patterns.Duck.Quackable;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public abstract class AbstaractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
}
