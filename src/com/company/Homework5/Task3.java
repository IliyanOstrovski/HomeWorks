package com.company.Homework5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3};
        int startNumber = 2;
        int endNumber = 3;
        System.out.println(Arrays.toString(getSubarray(arr, startNumber)));
        System.out.println(Arrays.toString(getSubarray(arr, startNumber, endNumber)));
    }

    public static int[] getSubarray(int[] arr, int start) {
        int[] subarray = new int[arr.length - start];
        if (start >= arr.length || start < 0) {
            // if start index is out of bounds or is less than 0
            start = 0;
        }
        // copy the elements from the original array to the subarray
        for (int i = start; i < arr.length; i++) {
            subarray[i - start] = arr[i];
        }
        return subarray;
    }

    public static int[] getSubarray(int[] arr, int start, int end) {
        if (start >= arr.length || start < 0 || end < start) {
            return new int[0];
        } else if (end > arr.length) {
            end = arr.length - 1;
        }
        // calculate the length of the subarray
        int length = Math.min(end - start + 1, arr.length - start);
        // create a new array for the subarray
        int[] subarray = new int[length];
        // copy the elements from the original array to the subarray
        for (int i = start; i <= end; i++) {
            subarray[i - start] = arr[i];
        }
        return subarray;
    }
}


