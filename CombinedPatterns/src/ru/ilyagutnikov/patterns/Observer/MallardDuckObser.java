package ru.ilyagutnikov.patterns.Observer;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public class MallardDuckObser implements Quackable {

    Observable observable;

    public MallardDuckObser() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {

        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {

        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

        observable.notifyObservers();

    }
}
