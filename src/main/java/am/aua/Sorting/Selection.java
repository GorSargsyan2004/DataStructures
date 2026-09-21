package am.aua.Sorting;

/**
 * Selection Sort Implementation.
 *
 * How it works:
 * 1. Divides the input into a sorted and an unsorted region.
 * 2. Repeatedly selects the minimum element from the unsorted region and moves it to the end of the sorted region.
 * 3. Simple, but performs a fixed number of comparisons regardless of the input's initial order.
 *
 * Complexity:
 * - Time: O(N^2) (Best, Average, and Worst)
 * - Space: O(1) (In-place sorting)
 */
public class Selection {
    /**
     * Sorts an array of integers in non-decreasing order using Selection Sort.
     *
     * @param data The array to be sorted.
     */
    public static void selectionSort(int[] data) {
        int n = data.length;
        for (int k = 0; k < n - 1; k++) {   // begin with first position
            int min = k;                    // position of current minimum
            for (int j = k + 1; j < n; j++) // start at next position
                if (data[j] < data[min])    // a new minimum found
                    min = j;                // update position of minimum
            int temp = data[k];             // put minimum in correct position
            data[k] = data[min];
            data[min] = temp;
        }
    }
}
