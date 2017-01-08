package ru.ilyagutnikov.patterns.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }

    }
}
