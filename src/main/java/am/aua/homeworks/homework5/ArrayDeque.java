package am.aua.homeworks.homework5;

public class ArrayDeque<E> implements Deque<E> {
    private int size = 0;
    private int f = 0;
    private static final int CAPASITY = 32;
    private E[] data;

    // constructors
    public ArrayDeque(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public ArrayDeque() {
        this(CAPASITY);
    }

    // public methods
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E temp = data[f];
        data[f] = null;
        f = (f+1) % CAPASITY;
        size--;
        return temp;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        int last = (f+size-1) % CAPASITY;
        E temp = data[last];
        data[last] = null;
        size--;
        return temp;
    }

    @Override
    public void addFirst(E e) throws IllegalStateException {
        if (size == CAPASITY) throw new IllegalStateException("Deque is full");
        data[(f - 1 + CAPASITY) % CAPASITY] = e;
        size++;
    }

    @Override
    public void addLast(E e) throws IllegalStateException {
        if (size == CAPASITY) throw new IllegalStateException("Deque is full");
        data[(f + size) % CAPASITY] = e;
        size++;
    }

    @Override
    public E first() {
        return (isEmpty()) ? null : data[f];
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return data[(f + size - 1) % CAPASITY];
    }
}
