package ru.ilyagutnikov.patterns.Duck;

/**
 * Created by ilyagutnikov on 07.01.17.
 */
public class MallardDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
