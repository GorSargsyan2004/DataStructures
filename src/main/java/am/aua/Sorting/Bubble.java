package am.aua.Sorting;

/**
 * Bubble Sort Implementation.
 *
 * How it works:
 * 1. Iteratively steps through the list, comparing adjacent elements.
 * 2. Swaps them if they are in the wrong order.
 * 3. The largest unsorted element "bubbles up" to its correct position at the end of the array in each pass.
 * 4. Optimization: A 'swapped' flag is used to detect if the array is already sorted, allowing early exit.
 *
 * Complexity:
 * - Best Case: O(N) (Array already sorted)
 * - Average Case: O(N^2)
 * - Worst Case: O(N^2) (Array sorted in reverse)
 */
public class Bubble {
    /**
     * Sorts an array of integers in non-decreasing order.
     *
     * @param data The array to be sorted.
     */
    public static void bubbleSort(int[] data) {
        int n = data.length;
        for (int k = 0; k < n - 1; k++) {           // find last k + 1 elements
            boolean swapped = false;
            for (int j = 0; j < n - k - 1; j++) {   // consider successive elements
                if (data[j] > data[j + 1]) {        // compare successive elements
                    int temp = data[j];             // swap successive elements
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)                           // stop if there were no swaps
                break;
        }
    }
}
