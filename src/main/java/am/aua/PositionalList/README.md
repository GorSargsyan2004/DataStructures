# Positional Lists 📚

## Public Methods
* `int size()`: Returns the number of elements in the list.
* `boolean isEmpty()`: Tests whether the list is empty.
* `Position<E> first()`: Returns the first Position.
* `Position<E> last()`: Returns the last Position.
* `Position<E> before(Position<E> p)`: Returns the Position before p.
* `Position<E> after(Position<E> p)`: Returns the Position after p.
* `Position<E> addFirst(E e)`: Inserts element at the front.
* `Position<E> addLast(E e)`: Inserts element at the back.
* `Position<E> addBefore(Position<E> p, E e)`: Inserts element before p.
* `Position<E> addAfter(Position<E> p, E e)`: Inserts element after p.
* `E set(Position<E> p, E e)`: Replaces element at p.
* `E remove(Position<E> p)`: Removes element at p.

---

Welcome to the **Positional List** implementation. A Positional List provides a clean, abstract way to manipulate elements in a collection by their *position*, rather than by numerical index.

## What is a Positional List?
Unlike a standard `ArrayList` or `LinkedList` where you access elements by integer index (e.g., `list.get(5)`), a Positional List uses **Position** objects as "tokens" or "handles" to locate elements. This decouples the identity of the element from its location in the list.

## How it Works
- **Positions:** Objects that encapsulate an element and provide access to it.
- **Cursors/Nodes:** The internal representation often uses a Doubly Linked List where nodes act as positions.
- **Abstraction:** The user never interacts with the nodes directly, only via the `Position<E>` interface.

## Where are they used?
Positional Lists are essential when:
- You need to frequently insert or remove elements at arbitrary locations without re-indexing.
- You are implementing algorithms like **Insertion Sort** on linked structures, where you need to hold a reference to a specific element to move it.

## Advantages & Disadvantages
### Advantages:
- **Efficiency:** O(1) time complexity for additions/removals if you already have the position handle.
- **Robustness:** No index shifting errors common with array-based lists.
- **Flexibility:** Easy to traverse both ways and manipulate sub-segments.

### Disadvantages:
- **Memory Overhead:** Each node in a doubly linked structure requires extra space for `prev`, `next`, and the element reference.
- **Access Time:** No O(1) random access by index; finding the "k-th" element is O(k).

## Operations Complexity (PositionalLinkedList)

| Operation | Complexity |
| :--- | :--- |
| `first()`, `last()` | O(1) |
| `before(p)`, `after(p)` | O(1) |
| `addFirst(e)`, `addLast(e)` | O(1) |
| `addBefore(p, e)`, `addAfter(p, e)` | O(1) |
| `remove(p)` | O(1) |
| `set(p, e)` | O(1) |

*Note: All operations assume you have already obtained the `Position<E>` object.*
