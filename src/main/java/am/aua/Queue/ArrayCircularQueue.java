package am.aua.Queue;

public class ArrayCircularQueue<E> implements CircularQueue<E> {
    private E[] data;
    private int front = 0;
    private int size = 0;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void enqueue(E e) {
        if (size == capacity) throw new IllegalStateException("Queue is full");
        data[(front + size) % capacity] = e;
        size++;
    }

    @Override
    public E first() { return isEmpty() ? null : data[front]; }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % capacity;
        size--;
        return answer;
    }

    @Override
    public void rotate() {
        if (size > 1) {
            E element = dequeue();
            enqueue(element);
        }
    }
}
