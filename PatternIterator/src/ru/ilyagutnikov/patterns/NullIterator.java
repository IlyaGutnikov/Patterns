package ru.ilyagutnikov.patterns;

import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
