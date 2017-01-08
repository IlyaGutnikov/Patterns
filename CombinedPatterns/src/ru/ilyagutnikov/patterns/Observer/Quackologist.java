package ru.ilyagutnikov.patterns.Observer;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist " + duck + " just quacked");
    }
}
