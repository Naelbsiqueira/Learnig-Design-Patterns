package behavioral.iterator;

import java.util.Iterator;
public interface InterfaceList extends Iterable {
    void appent(Object o);
    Iterator iterator();
    int size();
   Object get(int i);
}
