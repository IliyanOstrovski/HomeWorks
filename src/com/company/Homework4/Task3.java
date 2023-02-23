package com.company.Homework4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 12};
        int[] emptyArr = new int[0];
        System.out.println(removeAndReturnFirstElement(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(removeAndReturnFirstElement(emptyArr));
    }

    public static int removeAndReturnFirstElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int firstElement = arr[0];

        // Remove first element from array.
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        //Adding at the end of array Int.Min_Value.
        arr[arr.length - 1] = Integer.MIN_VALUE;

        return firstElement;
    }
}
