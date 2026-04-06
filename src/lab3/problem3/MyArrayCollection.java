package lab3.problem3;

public class MyArrayCollection<E> implements MyCollection<E> {
    private Object[] elements;
    private int count;

    public MyArrayCollection() {
        elements = new Object[10];
        count = 0;
    }

    @Override
    public boolean add(E element) {
        if (count == elements.length) {
            Object[] newArr = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArr, 0, count);
            elements = newArr;
        }
        elements[count++] = element;
        return true;
    }

    @Override
    public boolean remove(E element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                System.arraycopy(elements, i + 1, elements, i, count - i - 1);
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) return true;
        }
        return false;
    }

    @Override
    public int size() { return count; }

    @Override
    public boolean isEmpty() { return count == 0; }

    @Override
    public void clear() { count = 0; }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[count];
        System.arraycopy(elements, 0, result, 0, count);
        return result;
    }
}
