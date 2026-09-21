package am.aua.LinkedLists;

/**
 * Circular Linked List Implementation.
 * 
 * The last node points back to the head of the list.
 */
public class CircularLinkedList<T> {
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public T first() { return isEmpty() ? null : tail.next.data; }
    public T last() { return isEmpty() ? null : tail.data; }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        addFirst(data);
        tail = tail.next;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        Node<T> head = tail.next;
        T data = head.data;
        if (size == 1) tail = null;
        else tail.next = head.next;
        size--;
        return data;
    }
}
