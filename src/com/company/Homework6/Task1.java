package com.company.Homework6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 3, 4, 4, 5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));

        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
