package am.aua.Sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    final static int SELECTION = 0;
    final static int INSERTION = 1;
    final static int BUBBLE = 2;
    final static int MERGE = 3;
    final static int QUICK = 4;
    final static int NUM_OF_ALGORITHMS = 5;
    final static int SIZE = 10000;
    final static int COUNT = 100;
    final static int ORIGIN = 1;
    final static int BOUND = 1000;

    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        double avg[] = new double[NUM_OF_ALGORITHMS];
        Random rand = new Random(42);

        System.out.println("Size of an array: " + SIZE);
        System.out.println("Elements chosen randomly from " + ORIGIN + " to " + BOUND);
        System.out.println("Number of array variations: " + COUNT +
                "\nPlease wait...");

        for (int j = 0; j < COUNT; j++) {
            for (int i = 0; i < SIZE; i++)
                arr[i] = rand.nextInt(ORIGIN, BOUND);

            avg[SELECTION] += selection(arr);
            avg[INSERTION] += insertion(arr);
            avg[BUBBLE] += bubble(arr);
            avg[MERGE] += merge(arr);
            avg[QUICK] += quick(arr);
        }

        for (int i = 0; i < NUM_OF_ALGORITHMS; i++)
            avg[i] /= COUNT;


        System.out.println("\n===================< RESULTS >===================");
        System.out.println("Avg running times:");
        System.out.println("Selection: " + avg[SELECTION]);
        System.out.println("Insertion: " + avg[INSERTION]);
        System.out.println("Bubble: " + avg[BUBBLE]);
        System.out.println("Merge: " + avg[MERGE]);
        System.out.println("Quick: " + avg[QUICK]);
    }

    private static double selection(int[] arr) {
        int[] arr_ = Arrays.copyOf(arr, arr.length);
        double start = System.currentTimeMillis();
        Selection.selectionSort(arr_);
        return System.currentTimeMillis() - start;
    }

    private static double insertion(int[] arr) {
        int[] arr_ = Arrays.copyOf(arr, arr.length);
        double start = System.currentTimeMillis();
        Insertion.insertionSort(arr_);
        return System.currentTimeMillis() - start;
    }

    private static double bubble(int[] arr) {
        int[] arr_ = Arrays.copyOf(arr, arr.length);
        double start = System.currentTimeMillis();
        Bubble.bubbleSort(arr_);
        return System.currentTimeMillis() - start;
    }

    private static double merge(int[] arr) {
        int[] arr_ = Arrays.copyOf(arr, arr.length);
        double start = System.currentTimeMillis();
        Merge.mergeSort(arr_);
        return System.currentTimeMillis() - start;
    }

    private static double quick(int[] arr) {
        int[] arr_ = Arrays.copyOf(arr, arr.length);
        double start = System.currentTimeMillis();
        Quick.quickSort(arr_);
        return System.currentTimeMillis() - start;
    }
}