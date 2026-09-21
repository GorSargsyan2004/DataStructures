# Linked Lists 🔗

A Linked List is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element (called a **Node**) points to the next node in the sequence.

## Core Concepts
* **Node:** The basic building block. Contains:
    * **Data:** The value being stored.
    * **Next:** A reference/pointer to the next node.
* **Head:** The first node in the list.
* **Tail:** The last node in the list (points to `null`).

---

## Types of Linked Lists

### 1. Singly Linked List
* **Visual:** `[Data|Next] -> [Data|Next] -> [Data|Null]`
* **Characteristics:** Each node has only one link pointing to the next node.
* **Pros:** Simple, uses less memory than doubly linked lists.
* **Cons:** Can only be traversed in one direction (forward).

### 2. Doubly Linked List
* **Visual:** `Null <- [Prev|Data|Next] <-> [Prev|Data|Next] -> Null`
* **Characteristics:** Each node has two links: one to the next node and one to the previous node.
* **Pros:** Can be traversed forward and backward. Easier deletion if you have the node reference.
* **Cons:** Uses more memory per node (extra pointer).

### 3. Circular Linked List
* **Visual:** `[Data|Next] -> [Data|Next] -> [Back to Head]`
* **Characteristics:** The last node points back to the first node instead of `null`.
* **Pros:** Good for tasks like cyclic buffers or round-robin scheduling.
* **Cons:** Infinite loops are a risk if traversal logic isn't careful.

---

### Comparison Table

| Type | Traversal | Memory Usage | Complexity |
| :--- | :--- | :--- | :--- |
| **Singly** | Forward only | Low | Simple |
| **Doubly** | Both directions | High | Complex |
| **Circular** | Cyclic | Low | Loop-prone |
