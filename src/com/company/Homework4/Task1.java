package com.company.Homework4;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 12};

        System.out.println(indexOf(arr, 3));
        System.out.println(indexOf(arr, 3, -10));
    }

    //   Solution with for cycle
    public static int indexOf(int[] arr, int searchElement) {
        if (searchElement < 0 || searchElement >= arr.length) {
            searchElement = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] arr, int searchElement, int fromIndex) {
        if (fromIndex < 0 || fromIndex >= arr.length) {
            fromIndex = 0;
        }
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}
