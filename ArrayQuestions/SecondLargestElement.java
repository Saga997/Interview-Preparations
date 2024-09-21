package com.collection.illustration.ArrayQuestions;

public class SecondLargestElement {
    public static int findSecondLargest(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        // Initialize the largest and second largest to minimum possible values
        int largest = nums[0];
        int secondLargest = -1;



        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            { largest = nums[i]; }
            else if(nums[i]<largest && nums[i]>secondLargest)
            { secondLargest = nums[i]; }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 1, 9, 7, 4, 6}; // Example array
        try {
            int secondLargest = findSecondLargest(nums);
            System.out.println("The second largest element is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

