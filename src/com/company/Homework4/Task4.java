package com.company.Homework4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 12};
        int value = 8;
        System.out.println(Arrays.toString(unShift(arr, value)));
    }
    public static int[] unShift(int[] arr, int value) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(value);

        //Add the values from array to List
        for (int i : arr) {
            resultList.add(i);
        }
        //Initialize new array
        int[] result = new int[resultList.size()];

        //Fill array with values
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
