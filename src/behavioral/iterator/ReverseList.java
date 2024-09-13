package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseList implements InterfaceList{
    private ArrayList list = new ArrayList();

    @Override
    public void appent(Object o) {
        list.add(o);
       }

    @Override
    public Iterator iterator() {
        return new ReverseIterator(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }
}
