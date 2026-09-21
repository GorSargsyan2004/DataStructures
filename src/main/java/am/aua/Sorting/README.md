# Sorting Algorithms 🧠

Welcome to the collection. Sorting is the bread and butter of Data Structures. Don't mess this up.

## Quick Cheat Sheet

*   **Bubble Sort:** The "lazy" one. Repeatedly swaps adjacent elements.
    *   *Complexity:* O(n²)
    *   *Advantages:* Simple to understand and implement.
    *   *Disadvantages:* Extremely inefficient for large datasets; unnecessary overhead due to constant swapping.
*   **Selection Sort:** Pick the smallest, put it at the front. Rinse, repeat.
    *   *Complexity:* O(n²)
    *   *Advantages:* Minimal memory usage (in-place).
    *   *Disadvantages:* Performance is always O(n²), even if the array is already sorted; not stable.
*   **Insertion Sort:** Like sorting playing cards in your hand.
    *   *Complexity:* O(n²)
    *   *Advantages:* Extremely efficient for small or nearly sorted lists; adaptive and stable.
    *   *Disadvantages:* Very slow for large, unsorted datasets; high overhead for large elements.
*   **Merge Sort:** Divide and conquer. Split everything, then merge back sorted.
    *   *Complexity:* O(n log n)
    *   *Advantages:* Guaranteed O(n log n) performance; stable sorting.
    *   *Disadvantages:* High memory overhead because it requires O(n) auxiliary space.
*   **Quick Sort:** The "go-to" for performance. Pick a pivot, partition, sort.
    *   *Complexity:* Average O(n log n), Worst O(n²)
    *   *Advantages:* Very cache-efficient and generally faster in practice than Merge Sort.
    *   *Disadvantages:* Worst-case O(n²) if the pivot is chosen poorly; not stable by default.

---
### Performance Benchmark
*Based on 100 random variations of 10,000 elements (range 1-1000):*

| Algorithm | Avg Time (ms) |
| :--- | :--- |
| **Quick Sort** | 0.62 |
| **Merge Sort** | 0.91 |
| **Insertion Sort** | 3.68 |
| **Selection Sort** | 17.52 |
| **Bubble Sort** | 79.52 |

---
