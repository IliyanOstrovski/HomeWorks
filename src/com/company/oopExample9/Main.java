package com.company.oopExample9;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    }

    public static void printElements(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
    }
}
