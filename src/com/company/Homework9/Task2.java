package com.company.Homework9;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";
        System.out.println(reverse(str1));
        System.out.println(reverse(str2));
    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
