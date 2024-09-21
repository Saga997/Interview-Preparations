package com.collection.illustration.ArrayQuestions;

import java.util.Arrays;

public class RotateArrayByKElements {
    // Method to rotate the array by K elements
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0 || k % n == 0) return; // Return if array is empty or no effective rotation needed

        k = k % n; // In case K is greater than array length, use modulus to avoid extra rotations

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first K elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper method to reverse elements in the array from index 'start' to 'end'
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Sample array
        int k = 3; // Number of positions to rotate

        System.out.println("Original array: " + Arrays.toString(arr));

        rotate(arr, k); // Rotate the array by k elements

        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
