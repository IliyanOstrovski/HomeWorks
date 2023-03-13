package com.company.Homework12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static <E> List<E> splice(List<E> arr, int start) {
        return splice(arr, start, arr.size() - start);
    }

    public static <E> List<E> splice(List<E> arr, int start, int deleteCount) {
        return splice(arr, start, deleteCount, (E[]) new Object[0]);
    }

    public static <E> List<E> splice(List<E> arr, int start, int deleteCount, E... items) {
        if (start < 0 || start > arr.size()) {
            throw new IllegalArgumentException();
        }

        if (deleteCount < 0 || deleteCount > arr.size()) {
            throw new IllegalArgumentException();
        }

        if (arr == null || arr.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<E> deleted = new ArrayList<>();
        int end = start + deleteCount;

        for (int i = start; i < end && i < arr.size(); i++) {
            deleted.add(arr.get(i));
        }

        arr.subList(start, end).clear();
        for (int i = items.length - 1; i >= 0; i--) {
            arr.add(start, items[i]);
        }
        return deleted;
    }

    public static void main(String[] args) {
        try {
            List<Integer> a = new ArrayList<>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);
            System.out.println(splice(a, 1,1));
            System.out.println(a);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input data.");
        }
    }
}