package com.company.Homework13;

public class Main {
    public static void main(String[] args) {
        NumberSet set = new NumberSet(256);
        set.add(1);
        set.add(2);
        int[] a = set.values();

        System.out.println(set);
        // {1, 2}
        set.delete(2);
        System.out.println(set);
        // {1}
        set.clear();
        System.out.println(set);
        // {}
    }
}
