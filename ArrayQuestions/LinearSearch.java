package com.collection.illustration.ArrayQuestions;


public class LinearSearch {
    public int search(int arr[], int n, int num) {
        for (int i = 0; i < n; i++) {  // Declared i within the loop
            if (arr[i] == num) {
                return i;  // Return the index if the number is found
            }
        }
        return -1;
    }

    public static void main() {
        LinearSearch ls = new LinearSearch();
        int arr[] = {1, 2, 3, 4, 5};
        int num = 4;
        int n = arr.length;
        // search(arr,n,num); // search is an insatnce method so you can invoke it by creating an instance of it
        // Create an instance of the LinearSearch class
        int result = ls.search(arr, n, num);  // Call the search method
        System.out.println("Element found at index: " + result);  // Print the result
    }
}

//This approach works for statically allocated arrays where the size is known at compile time. in C++ it's used
// However, it doesn't work for dynamically allocated arrays (e.g., arrays created with new or malloc), where sizeof(arr) would give you the size of the pointer, not the total array size.