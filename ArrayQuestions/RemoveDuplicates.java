package com.collection.illustration.ArrayQuestions;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Slow pointer, starting from the first element
        int i = 0;

        // Fast pointer, starting from the second element
        for (int j = 1; j < nums.length; j++) {
            // If the current element is not equal to the last unique element
            if (nums[j] != nums[i]) {
                i++; // Move the slow pointer forward
                nums[i] = nums[j]; // Update the next unique position
            }
        }

        // The number of unique elements is i + 1
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int length = removeDuplicates(nums);

        // Print the array with unique elements only
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
