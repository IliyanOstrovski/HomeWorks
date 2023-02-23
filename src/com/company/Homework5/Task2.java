package com.company.Homework5;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "ala bala";
        String str2 = "la";
        String str3 = "github";
        String str4 = "hub";
        String str5 = "microsoft";
        String str6 = "google";

        System.out.println(indexOf(str1, str2));
        System.out.println(indexOf(str3, str4));
        System.out.println(indexOf(str5, str6));

    }

    public static int indexOf(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
                if (j == s2.length()) {
                    return i - j + 1;
                }
            }
            i++;
        }
        return -1;
    }
}
