package ru.ilyagutnikov.patterns;

import java.util.ArrayList;

/**
 * Created by IlyaGutnikov on 04.01.2017.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList _menuItems) {

        this.menuItems = _menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {

            return false;

        } else {

            return true;
        }
    }

    @Override
    public Object next() {

        Object menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
