package com.company.Homework10;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";
        System.out.println(reverse(str1));
        System.out.println(reverse(str2));
    }

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

}
