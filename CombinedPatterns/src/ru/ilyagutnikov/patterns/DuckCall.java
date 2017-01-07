package ru.ilyagutnikov.patterns;

/**
 * Created by ilyagutnikov on 07.01.17.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
