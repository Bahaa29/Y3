package oss;
import java.util.Iterator;

class DinerMenuIterator implements Iterator<menuItem> {
    menuItem[] list;
    int position = 0;

    public DinerMenuIterator(menuItem[] list) {
        this.list = list;
    }

    public menuItem next() {
        menuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}