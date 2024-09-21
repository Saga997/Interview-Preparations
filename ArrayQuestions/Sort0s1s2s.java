package com.collection.illustration.ArrayQuestions;

import java.util.Arrays;

public class Sort0s1s2s {   ///dutch National Flag with three pointers

    public static void sortArray(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        // Traverse the array
        while (mid <= high) {
            if(arr[mid]==0) {
                // Swap arr[low] and arr[mid] and move both pointers forward
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {   mid++;
            }
            else if (arr[mid]==2){ // Swap arr[mid] and arr[high] and move the high pointer backward
                    swap(arr, mid, high);
                    high--;
            }
        }
    }

    // Utility function to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
