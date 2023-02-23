package com.company.Homework1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int array[] = {1, 3, 1, 2, 5, 2, 1, 3};
        arraySort(array);

        System.out.println(Arrays.toString(array));
    }
    public static int[] arraySort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minimum]) {
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        return a;
    }
}
