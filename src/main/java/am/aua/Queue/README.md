# Queue Implementations

This package contains implementations of various queue-based data structures. Here is the breakdown.

## 1. Deque (Double-Ended Queue)
A Deque is a generalized version of a queue where elements can be inserted or removed at both the front and the back.

### Advantages:
- **Flexibility:** Supports FIFO (queue) and LIFO (stack) operations efficiently.
- **Efficiency:** O(1) time complexity for additions and removals at both ends (if implemented with an array or doubly linked list).

### Disadvantages:
- **Implementation Complexity:** Harder to implement than a standard FIFO queue.

## 2. Circular Queue
A queue that connects the last position back to the first, forming a circle. This is particularly useful for fixed-size buffers where space efficiency matters.

### Advantages:
- **Memory Efficiency:** Avoids the "shifting" problem found in standard array-based queues by reusing vacated spaces.
- **Performance:** O(1) for enqueue and dequeue operations.

### Disadvantages:
- **Fixed Size:** Often bounded to a specific capacity. If the queue is full, it cannot accept new elements without dropping or resizing.

## Complexity Table

| Data Structure | Operation | Complexity |
| :--- | :--- | :--- |
| Deque | addFirst/Last | O(1) |
| Deque | removeFirst/Last | O(1) |
| Circular Queue | enqueue | O(1) |
| Circular Queue | dequeue | O(1) |
| Circular Queue | rotate | O(1) |

All implementations are optimized for standard use cases. Don't go trying to perform O(n) operations on an O(1) data structure unless you want a lecture.
