package lab3.problem3;

import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E element);
    boolean remove(Object o);
    void clear();
    Object[] toArray();
    Iterator<E> iterator();
}
