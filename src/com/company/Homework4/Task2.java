package com.company.Homework4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 12};
        System.out.println(indexOf(arr, 4));
        System.out.println(indexOf(arr, 3, 1));
    }

    //    Solution with for cycle
    public static boolean indexOf(int[] arr, int searchElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return true;
            }
        }
        return false;
    }

    public static boolean indexOf(int[] arr, int searchElement, int fromIndex) {
        if (fromIndex < 0 || fromIndex >= arr.length) {
            fromIndex = 0;
        }
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return true;
            }
        }
        return false;
    }
}
