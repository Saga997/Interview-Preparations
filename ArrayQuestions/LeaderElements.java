package com.collection.illustration.ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class LeaderElements {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>(); // List to store leader elements
        int n = arr.length;
        if (n == 0) return leaders; // Return empty list if array is empty

        int maxFromRight = arr[n - 1]; // Start with the last element as the leader
        leaders.add(maxFromRight); // Add the last element to the list of leaders

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            // Check if the current element is greater than the maxFromRight
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i]; // Update maxFromRight
                leaders.add(maxFromRight); // Add the new leader to the list
            }
        }

        // Reverse the list to maintain the order of leaders as they appear in the array
        reverseList(leaders); // or use COllections.reverse(leaders);

        return leaders;
    }

    // Helper method to reverse the list
    private static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2}; // Sample array
        List<Integer> leaders = findLeaders(arr); // Find leaders

        // Print leader elements
        System.out.print("Leader elements in the array: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}

