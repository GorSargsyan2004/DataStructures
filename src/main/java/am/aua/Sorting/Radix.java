package am.aua.Sorting;

import java.util.Arrays;

/**
 * Radix Sort Implementation.
 * 
 * How it works:
 * 1. Sorts numbers by processing individual digits.
 * 2. Uses a stable sort (Counting Sort) to sort numbers at each significant position (units, tens, etc.).
 * 3. Starts from the least significant digit (LSD) and moves to the most significant.
 * 4. Efficient for sorting fixed-length integer keys.
 *
 * Complexity:
 * - Time Complexity: O(d * (N + b))
 * - Space Complexity: O(N + b)
 * (Where N is the number of elements, b is the base [number of buckets, e.g., 10 for decimal], 
 *  and d is the number of digits in the largest number [number of passes performed])
 */
public class Radix {

    // Counting Sort used by Radix Sort (for digit place)
    private static void countingSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Digits 0-9

        // Count occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // Accumulate counts
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Main Radix Sort function
    public static void radixSort(int[] arr, int max) {
        // Apply counting sort to each digit
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }
}
