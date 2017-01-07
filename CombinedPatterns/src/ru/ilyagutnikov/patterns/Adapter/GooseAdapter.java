package ru.ilyagutnikov.patterns.Adapter;

import ru.ilyagutnikov.patterns.Duck.Goose;
import ru.ilyagutnikov.patterns.Duck.Quackable;

/**
 * Created by ilyagutnikov on 07.01.17.
 * Pattern Adapter
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {

        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
