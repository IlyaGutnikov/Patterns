package ru.ilyagutnikov.patterns.Observer;

/**
 * Created by ilyagutnikov on 08.01.17.
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
