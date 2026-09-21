package am.aua.Sorting;

import java.util.Arrays;

/**
 * Quick Sort Implementation.
 *
 * How it works:
 * 1. Choose a 'pivot' element from the array.
 * 2. Partition: Reorder the array so that all elements less than the pivot are on the left,
 *    and all elements greater than the pivot are on the right.
 * 3. Recursively apply the process to the sub-arrays.
 *
 * Complexity:
 * - Best Case: O(N log N)
 * - Average Case: O(N log N)
 * - Worst Case: O(N^2) (Happens when pivot choice is poor, e.g., already sorted array)
 */
public class Quick {
    /**
     * Sorts an array of integers using Quick Sort.
     *
     * @param S The array to be sorted.
     */
    public static void quickSort(int[] S) {
        int n = S.length;
        if (n < 2) return;                                  // array is trivially sorted
        // divide
        int pivot = S[n - 1];                               // using last as arbitrary pivot
        int m = 0, k = n;
        int[] temp = new int[n];
        for (int i = 0; i < n - 1; i++)                     // divide original into L, E, and G
            if (S[i] < pivot)                               // element is less than pivot
                temp[m++] = S[i];
            else if (S[i] > pivot)                          // element is greater than pivot
                temp[--k] = S[i];
        int[] L = Arrays.copyOfRange(temp, 0, m);
        int[] E = new int[k - m];
        Arrays.fill(E, pivot);
        int[] G = Arrays.copyOfRange(temp, k, n);
        // conquer (with recursion)
        quickSort(L);                                       // sort elements less than pivot
        quickSort(G);                                       // sort elements greater than pivot
        // concatenate results
        System.arraycopy(L, 0, S, 0, m);
        System.arraycopy(E, 0, S, m, k - m);
        System.arraycopy(G, 0, S, k, n - k);
    }
}