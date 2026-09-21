package am.aua.LinkedLists;

/**
 * Doubly Linked List Implementation.
 * 
 * Each node has a pointer to both the next and previous nodes.
 */
public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;
        Node(T data) { this.data = data; }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public T first() { return isEmpty() ? null : head.data; }
    public T last() { return isEmpty() ? null : tail.data; }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
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
        else head.prev = null;
        return data;
    }

    public T removeLast() {
        if (isEmpty()) return null;
        T data = tail.data;
        tail = tail.prev;
        size--;
        if (isEmpty()) head = null;
        else tail.next = null;
        return data;
    }
}
