package am.aua.homeworks.homework5;

public interface Deque<E> {
    int size();
    boolean isEmpty();

    E removeFirst();
    E removeLast();

    void addFirst(E e);
    void addLast(E e);

    E first();
    E last();
}
