package am.aua.Sorting;

/**
 * Insertion Sort Implementation.
 *
 * How it works:
 * 1. Takes elements one by one from the unsorted portion.
 * 2. Inserts each element into its correct position within the sorted portion.
 * 3. Similar to organizing a hand of playing cards: you pick up a card and place it where it belongs.
 * 4. Efficient for small datasets and "nearly sorted" data.
 *
 * Complexity:
 * - Best Case: O(N) (Array already sorted)
 * - Average Case: O(N^2)
 * - Worst Case: O(N^2) (Array sorted in reverse)
 */
public class Insertion {

    /**
     * Sorts an array of integers in non-decreasing order using Insertion Sort.
     *
     * @param data The array to be sorted.
     */
    public static void insertionSort(int[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {               // begin with second integer
            int cur = data[k];                      // time to insert cur=data[k]
            int j = k;                              // find correct index j for cur
            while (j > 0 && data[j-1] > cur) {      // thus, data[j-1] must go after cur
                data[j] = data[j-1];                // slide data[j-1] rightward
                j--;                                // and consider previous j for cur
            }
            data[j] = cur;                          // this is the proper place for cur
        }
    }
}
