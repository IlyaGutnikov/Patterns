package ru.ilyagutnikov.patterns.Composite;

import ru.ilyagutnikov.patterns.Duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ilyagutnikov on 08.01.17.
 *
 * Pattern Composite
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    @Override
    public void quack() {
        //Pattern Iterator
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {

            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    public void add(Quackable quacker) {

        quackers.add(quacker);
    }
}
