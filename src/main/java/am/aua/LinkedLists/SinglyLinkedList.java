package am.aua.LinkedLists;

/**
 * Singly Linked List Implementation.
 * 
 * Each node points only to the next node in the sequence.
 */
public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) { this.data = data; }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public T first() { return isEmpty() ? null : head.data; }
    public T last() { return isEmpty() ? null : tail.data; }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        if (isEmpty()) tail = head;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T data = head.data;
        head = head.next;
        size--;
        if (isEmpty()) tail = null;
        return data;
    }
}
