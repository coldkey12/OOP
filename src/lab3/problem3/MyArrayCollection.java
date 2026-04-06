package lab3.problem3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

// A simple resizable-array implementation of MyCollection.
public class MyArrayCollection<E> implements MyCollection<E> {
    private Object[] data;
    private int count;

    public MyArrayCollection() {
        data = new Object[10];
        count = 0;
    }

    @Override
    public int size() { return count; }

    @Override
    public boolean isEmpty() { return count == 0; }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            if (o == null ? data[i] == null : o.equals(data[i])) return true;
        }
        return false;
    }

    @Override
    public boolean add(E element) {
        if (count == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[count++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (o == null ? data[i] == null : o.equals(data[i])) {
                System.arraycopy(data, i + 1, data, i, count - i - 1);
                data[--count] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, count, null);
        count = 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(data, count);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() { return index < count; }

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                return (E) data[index++];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            if (i > 0) sb.append(", ");
            sb.append(data[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
