package com.company.Homework5;

public class Task1 {
    public static void main(String[] args) {
        Object[] arr = {1, 0, 3, 0, 12};
        int searchElement = 0;
        int fromIndex = 2;
        System.out.println(lastIndexOf(arr, searchElement));
        System.out.println(lastIndexOf(arr, searchElement, fromIndex));
    }

    public static int lastIndexOf(Object[] arr, int searchElement) {
        if (searchElement < 0 || searchElement >= arr.length) {
            searchElement = -1;
        }
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchElement)) {
                index = i;
            }
        }
        return index;
    }

    public static int lastIndexOf(Object[] arr, int searchElement, int fromIndex) {
        if (arr == null || fromIndex >= arr.length) {
            return -1;
        }

        if (fromIndex < 0) {
            fromIndex = arr.length + fromIndex;
        }

        for (int i = fromIndex; i >= 0; i--) {
            if (arr[i] != null && arr[i].equals(searchElement)) {
                return i;
            }
        }
        return -1;
    }


}
