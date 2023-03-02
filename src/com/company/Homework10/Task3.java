package com.company.Homework10;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";
        System.out.println(reverse(str1.toCharArray()));
        System.out.println(reverse(str2.toCharArray()));
    }

    public static char[] reverse(char[] s) {
        if (s == null || s.length == 0) {
            return s;
        }
        int length = s.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
        return s;
    }
}
