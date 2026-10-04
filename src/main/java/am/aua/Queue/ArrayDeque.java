package am.aua.Queue;

import java.util.Arrays;

public class ArrayDeque<E> implements Deque<E> {
    private E[] data;
    private int front = 0;
    private int size = 0;
    private static final int CAPACITY = 1000;

    public ArrayDeque() { this(CAPACITY); }

    @SuppressWarnings("unchecked")
    public ArrayDeque(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public E first() { return isEmpty() ? null : data[front]; }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return data[(front + size - 1) % CAPACITY];
    }

    @Override
    public void addFirst(E e) {
        if (size == CAPACITY) throw new IllegalStateException("Deque is full");
        front = (front - 1 + CAPACITY) % CAPACITY;
        data[front] = e;
        size++;
    }

    @Override
    public void addLast(E e) {
        if (size == CAPACITY) throw new IllegalStateException("Deque is full");
        data[(front + size) % CAPACITY] = e;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % CAPACITY;
        size--;
        return answer;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        int lastIndex = (front + size - 1) % CAPACITY;
        E answer = data[lastIndex];
        data[lastIndex] = null;
        size--;
        return answer;
    }
}
