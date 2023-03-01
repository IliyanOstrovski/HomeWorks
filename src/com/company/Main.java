package com.company;

import com.company.Homework9.Task3;

public class Main {

    public static void main(String[] args) {
        Task3.Range r1 = new Task3.Range(11, 51);
        Task3.Range r2 = new Task3.Range(52, 111);
        Task3.Range r3 = new Task3.Range(1, 3);
        Task3.Range r4 = new Task3.Range(2, 5);
        r1.merge(r2);
        r3.merge(r4);
        System.out.println(r1);
        System.out.println(r3);

    }
}
