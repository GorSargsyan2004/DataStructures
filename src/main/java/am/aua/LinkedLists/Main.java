package am.aua.LinkedLists;

/**
 * Main class to demonstrate the functionality of the different Linked List implementations.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Singly Linked List Demonstration ---");

        SinglyLinkedList<Integer> singly = new SinglyLinkedList<>();
        singly.addFirst(10);
        singly.addLast(20);

        System.out.println("First: " + singly.first());
        System.out.println("Last: " + singly.last());
        System.out.println("Removed: " + singly.removeFirst());
        System.out.println("New First: " + singly.first());

        System.out.println("\n--- Doubly Linked List Demonstration ---");

        DoublyLinkedList<Integer> doubly = new DoublyLinkedList<>();
        doubly.addFirst(5);
        doubly.addLast(15);
        doubly.addLast(20);

        System.out.println("First: " + doubly.first());
        System.out.println("Last: " + doubly.last());
        System.out.println("Removed First: " + doubly.removeFirst());
        System.out.println("Removed Last: " + doubly.removeLast());
        System.out.println("Size: " + doubly.size());

        System.out.println("\n--- Circular Linked List Demonstration ---");

        CircularLinkedList<Integer> circular = new CircularLinkedList<>();
        circular.addFirst(100);
        circular.addLast(200);

        System.out.println("First: " + circular.first());
        System.out.println("Last: " + circular.last());
        System.out.println("Removed: " + circular.removeFirst());
        System.out.println("Size: " + circular.size());
    }
}
