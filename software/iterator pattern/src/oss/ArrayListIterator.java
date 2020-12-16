package oss;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayListIterator implements Iterator<menuItem>
{
    ArrayList<menuItem>array;
    int position = 0;
    public ArrayListIterator(ArrayList<menuItem>array) {
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        if (position >= array.size() || array.get(position)== null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public menuItem next() {
        menuItem menuItem = array.get(position);
        position = position + 1;
        return menuItem;
    }

}
