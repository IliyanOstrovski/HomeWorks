package com.company.Homework5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3};
        int[] arr2 = {1, 2, 2, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 3, 3};
        int[] arr4 = {2, 2, 2, 4};
        System.out.println(haveSameNumbers(arr1, arr2));
        System.out.println(haveSameNumbers(arr3, arr4));
    }
    public static boolean haveSameNumbers(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add all elements of arr1 to set1
        for (int i : arr1) {
            set1.add(i);
        }

        // Add all elements of arr2 to set2
        for (int i : arr2) {
            set2.add(i);
        }

        // Check if each element of set1 is in set2
        for (int i : set1) {
            if (!set2.contains(i)) {
                return false;
            }
        }

        // Check if each element of set2 is in set1
        for (int i : set2) {
            if (!set1.contains(i)) {
                return false;
            }
        }
        return true;
    }

}
