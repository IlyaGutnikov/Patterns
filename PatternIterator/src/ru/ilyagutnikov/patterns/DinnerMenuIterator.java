package ru.ilyagutnikov.patterns;

import java.util.Iterator;

/**
 * Created by IlyaGutnikov on 16.12.2016.
 */
public class DinnerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {

        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (position >= items.length || items[position] == null) {

            return false;
        } else {

            return true;
        }
    }

    @Override
    public Object next() {

        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public void remove() {
        if (position <=0) {
            throw new IllegalStateException("Can not remove the item");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length - 1] = null;
        }
    }
}
