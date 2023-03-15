package com.company.Homework13;
public class Task2 {
    public static void main(String[] args) {
        int m1 = max(1); // 1
        int m2 = max(1, 2, 3); // 3
        int m3 = max(-5, -1, -2, -3); // 5

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    public static int max(int... numbers) {  //TODO
        if (numbers == null || numbers.length == 0) {
            System.out.println("Cannot be null or empty!");
            return -1;
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}