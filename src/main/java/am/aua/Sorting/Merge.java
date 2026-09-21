package am.aua.Sorting;

import java.util.Arrays;

/**
 * Merge Sort Implementation.
 *
 * How it works:
 * 1. Divide: Split the array into two halves recursively.
 * 2. Conquer: Sort each half separately.
 * 3. Merge: Combine the two sorted halves into a single sorted array.
 * 4. This is a stable, divide-and-conquer algorithm.
 *
 * Complexity:
 * - Time: O(N log N) (Best, Average, and Worst)
 * - Space: O(N) (Requires auxiliary space for merging)
 */
public class Merge {
    /**
     * Sorts an array of integers using Merge Sort.
     *
     * @param S The array to be sorted.
     */
    public static void mergeSort(int[] S) {
        int n = S.length;
        if (n < 2) return;                                  // array is trivially sorted
        // divide
        int mid = n / 2;
        int[] S1 = Arrays.copyOfRange(S, 0, mid);      // copy of first half
        int[] S2 = Arrays.copyOfRange(S, mid, n);           // copy of second half
        // conquer (with recursion)
        mergeSort(S1);                                      // sort copy of first half
        mergeSort(S2);                                      // sort copy of second half
        // merge results
        merge(S1, S2, S);                                   // merge sorted halves back into original
    }

    /**
     * Merge contents of arrays Sand Sinto properly sized array S.
     */
    public static void merge(int[] S1, int[] S2, int[] S) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && S1[i] < S2[j]))
                S[i + j] = S1[i++];                         // copy ith element of Sand increment i
            else
                S[i + j] = S2[j++];                         // copy jth element of Sand increment j
        }
    }
}
