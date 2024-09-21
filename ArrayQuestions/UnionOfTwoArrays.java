package com.collection.illustration.ArrayQuestions;

//Suppose we consider arr1 and arr2 as a single array say arr,
// then the union of arr1 and arr2 is the distinct elements in arr.
//arr1[] = {1,2,3,4,5,6,7,8,9,10}
//arr2[] = {2,3,4,4,5,11,12}
//arr = arr1 + arr2 = {1,2,3,4,5,67,8,9,
//        10,2,3,4,4,5,11,12}
//
//Distinct element in
//        arr = {1,2,3,4,5,6,7,8,9,10,11,12}
//        = Union of arr1 ,arr2.


import java.util.ArrayList;
import java.util.HashSet;

class TUF{
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> s=new HashSet<>();
        ArrayList < Integer > union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            union.add(it);
        return union;
    }
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}

//second way using two pointer:
//Take two pointers let’s say i,j pointing to the 0th index of arr1 and arr2.
//Create an empty vector for storing the union of arr1 and arr2.
//The Union.get(index) method is used to retrieve an element from a list in Java. The method is part of the List
// interface, commonly used with classes like ArrayList, LinkedList, etc.
//arr1[ i ] == arr2[ j ]

class TUF1{
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}