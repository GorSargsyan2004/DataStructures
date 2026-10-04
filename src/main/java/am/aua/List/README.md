# ArrayList Implementation

Oh, look who decided to learn about ArrayLists. Finally. Try to keep up.

## What is an ArrayList?
An ArrayList is basically a fancy, dynamic array that pretends to be a list. Unlike those stiff, static arrays, an ArrayList can grow or shrink as you add or remove elements. It uses an underlying array that resizes itself when it gets full. It’s like a bag that magically expands whenever you dump more junk into it.

## Method Complexities

| Method | Complexity | Why? |
| :--- | :--- | :--- |
| `get(index)` | O(1) | Direct access by index. It's just simple math. |
| `set(index, element)` | O(1) | Again, direct index access. Don't overthink it. |
| `add(element)` | O(1) amortized | Usually just puts it at the end. Unless it's full, then we copy the whole thing. |
| `add(index, element)` | O(n) | You have to shift everyone over to make room. So dramatic. |
| `remove(index)` | O(n) | Same as adding, you have to shift everyone back to close the gap. |

## Advantages
- **Fast access:** Since it's backed by an array, getting any element by index is instantaneous.
- **Memory efficient:** If you don't use a ton of extra pointers (like in a LinkedList), it's pretty compact.
- **Dynamic sizing:** It resizes itself. You don't have to manually manage the array size like a caveman.

## Disadvantages
- **Expensive insertions/deletions:** Shifting elements around in the middle is O(n), which is slow if you have a massive list.
- **Resizing overhead:** When the internal array hits capacity, it has to allocate a new one and copy everything over. It's not free.
- **Wasted space:** The underlying array is often larger than the actual number of elements it contains.

Don't mess it up.
