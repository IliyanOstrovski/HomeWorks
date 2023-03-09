package com.company.Homework12;

import java.util.ArrayList;

public class Task1 {
    public static ArrayList<Integer> splice(ArrayList<Integer> arr, int start) {
        ArrayList<Integer> removed = new ArrayList<Integer>();
        while (start < arr.size()) {
            removed.add(arr.remove(start));
        }
        return removed;
    }

    public static ArrayList<Integer> splice(ArrayList<Integer> arr, int start, int deleteCount) {
        ArrayList<Integer> removed = new ArrayList<Integer>();
        int end = start + deleteCount;
        if (end > arr.size()) {
            end = arr.size();
        }
        for (int i = start; i < end; i++) {
            removed.add(arr.remove(start));
        }
        return removed;
    }

    public static ArrayList<Integer> splice(ArrayList<Integer> arr, int start, int deleteCount, int item) {
        ArrayList<Integer> removed = splice(arr, start, deleteCount);
        arr.add(start, item);
        return removed;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(splice(a, 1, 1));
        System.out.println(a);
    }
}