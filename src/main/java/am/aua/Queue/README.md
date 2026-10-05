# Queue Implementations

This package contains implementations of various queue-based data structures in Java, adhering to the First-In, First-Out (FIFO) principle, with specialized variations for different operational requirements.

## 1. Queue Interface
The core `Queue<E>` interface defines the standard behavior for all queue implementations.

### Methods
- `int size()`: Returns the number of elements in the queue.
- `boolean isEmpty()`: Checks if the queue is empty.
- `void enqueue(E e)`: Inserts an element at the rear.
- `E first()`: Returns the front element without removing it.
- `E dequeue()`: Removes and returns the front element.

---

## 2. Queue Types

### LinkedQueue
A queue implemented using a Singly Linked List.
- **Where to use:** When you need a dynamic, unbounded queue where you don't know the capacity in advance.
- **Advantages:** Dynamic resizing, no memory wasted on unused capacity.
- **Disadvantages:** Slightly higher overhead per element due to node object allocation.

### ArrayQueue
A queue implemented using a fixed-size array.
- **Where to use:** When you have a predictable maximum capacity and want to minimize object allocation overhead.
- **Advantages:** Cache-friendly and low memory overhead.
- **Disadvantages:** Limited capacity; resizing is an O(n) operation.

### CircularQueue
An extension of the queue where the rear connects back to the front. 
- **Interface:** Extends `Queue<E>` and adds `void rotate()`.
- **Where to use:** Fixed-size buffers, round-robin scheduling, and stream processing.
- **Advantages:** Highly efficient space reuse without shifting elements.
- **Disadvantages:** Fixed capacity; can overflow if the production rate exceeds consumption.

### Deque (Double-Ended Queue)
A generalized queue allowing insertion/removal at both ends.
- **Where to use:** When you need a combination of Queue and Stack functionality (e.g., undo/redo buffers, work-stealing algorithms).
- **Advantages:** O(1) operations at both ends.
- **Disadvantages:** More complex to implement and manage.

---

## 3. Performance Summary

| Data Structure | Enqueue | Dequeue | Notes |
| :--- | :--- | :--- | :--- |
| `LinkedQueue` | O(1) | O(1) | Dynamic sizing |
| `ArrayQueue` | O(1) | O(1) | Predictable, fixed-size |
| `CircularQueue` | O(1) | O(1) | Efficient circular buffer |
| `Deque` | O(1) | O(1) | Flexible (front & back) |

*Everything here is O(1) for basic operations.*
