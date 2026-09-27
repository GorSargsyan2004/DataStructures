package am.aua.Sorting;

/**
 * Bucket Sort Implementation.
 * 
 * How it works:
 * 1. Counts the occurrences of each element in the input array.
 * 2. Uses an auxiliary array (buckets) to store the count of each number.
 * 3. Reconstructs the sorted sequence by iterating through the bucket array.
 * 4. Efficient for data with a limited range of integer values.
 *
 * Complexity:
 * - Best Case: O(N + K)
 * - Average Case: O(N + K)
 * - Worst Case: O(N^2) (if many elements are in one bucket, though this is a counting version)
 * (Where N is number of elements, K is the range of values)
 */
public class Bucket {

    public static int[] bucketSort(int[] sequence, int maxValue) {
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;

        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;

        return sorted_sequence;
    }

    private static void printSequence(int[] sorted_sequence) {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }

    private static int maxValue(int[] sequence) {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++)
            if (sequence[i] > maxValue)
                maxValue = sequence[i];
        return maxValue;
    }
}
