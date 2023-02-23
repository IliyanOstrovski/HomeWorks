package com.company.Homework2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, -1, 8, 9};
        int n = array.length;
        List<String> result = new ArrayList<String>();
        result.add(Integer.toString(array[0]));
        for (int i = 1; i < n; i++) {
            array[i] = array[i] + array[i-1];
            result.add(Integer.toString(array[i]));
        }
        String output = String.join(", ", result);
        System.out.println(output);
    }
}


