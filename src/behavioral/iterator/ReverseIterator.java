package behavioral.iterator;

import java.util.Iterator;

public class ReverseIterator implements Iterator {
    private ReverseList l;
    private int position;

    public ReverseIterator(ReverseList l){
        this.l = l;
        position = l.size();

    }
    @Override
    public boolean hasNext() {
        return position != 0;
    }

    @Override
    public Object next() {
        return l.get(--position);
    }
}
