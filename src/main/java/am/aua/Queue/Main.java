package am.aua.Queue;

public class Main {
    public static void main(String[] args) {
        // Demonstrate ArrayDeque
        System.out.println("--- ArrayDeque Demonstration ---");
        Deque<Integer> deque = new ArrayDeque<>(5);
        deque.addLast(10);
        deque.addFirst(5);
        deque.addLast(20);
        
        System.out.println("First: " + deque.first()); // Expect 5
        System.out.println("Last: " + deque.last());   // Expect 20
        System.out.println("Removed First: " + deque.removeFirst()); // Expect 5
        
        // Demonstrate ArrayCircularQueue
        System.out.println("\n--- ArrayCircularQueue Demonstration ---");
        CircularQueue<String> queue = new ArrayCircularQueue<>(3);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        
        System.out.println("First: " + queue.first()); // Expect A
        queue.rotate();
        System.out.println("After rotate, First: " + queue.first()); // Expect B
        System.out.println("Dequeued: " + queue.dequeue()); // Expect B
    }
}
