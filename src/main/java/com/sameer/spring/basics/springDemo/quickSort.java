package com.sameer.spring.basics.springDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class quickSort implements sortAlgorithm{
    public int[] sort(int[] arr){
        // Call the recursive quicksort method
        quickSortRecursive(arr, 0, arr.length - 1);
        return arr;
    }
    // Recursive method to perform quick sort
    private static void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSortRecursive(arr, low, pi - 1);
            quickSortRecursive(arr, pi + 1, high);
        }
    }

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
