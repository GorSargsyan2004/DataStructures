# Stack Data Structure 🥞

A Stack is a collection of elements that follows the **Last-In, First-Out (LIFO)** principle. The last element added to the stack is the first one to be removed. Think of it like a stack of plates: you add plates to the top and take them from the top.

## Stack Interface Methods

*   **`push(E e)`**: Adds an element to the top of the stack.
*   **`pop()`**: Removes and returns the top element. Returns `null` if empty.
*   **`top()`**: Returns the top element without removing it. Returns `null` if empty.
*   **`size()`**: Returns the current number of elements in the stack.
*   **`isEmpty()`**: Returns `true` if the stack contains no elements, `false` otherwise.

---

## Comparison: ArrayStack vs. LinkedStack

| Feature | ArrayStack | LinkedStack |
| :--- | :--- | :--- |
| **Underlying Data Structure** | Fixed-size array | Singly Linked List |
| **Memory Usage** | Pre-allocated (may waste space) | Dynamic (overhead per node) |
| **Complexity (Push/Pop)** | O(1) amortized/worst | O(1) worst |
| **Capacity** | Limited by fixed size | Theoretically infinite (JVM limit) |

### When to use which?

*   **Use `ArrayStack` if:**
    *   You know the maximum number of elements in advance.
    *   Performance is critical and you want to avoid the memory overhead of creating `Node` objects for every single entry.
    *   You want better cache locality (arrays are contiguous in memory).

*   **Use `LinkedStack` if:**
    *   You do not know how many elements you will need to store (dynamic size).
    *   Memory usage needs to be strictly proportional to the current number of elements.
    *   You want to avoid the "Stack is full" exception that occurs with fixed-capacity arrays.

---

*Keep pushing and popping, but don't push too hard :)*
