package com.company.Homework7;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "  abc  ";
        String str2 = "abc";
        String str3 = " ала bala  ";
        String str4 = "alabala";

        System.out.println(compareStrings(str1, str2));
        System.out.println(compareStrings(str3, str4));
    }
    public static boolean compareStrings(String str1, String str2) {
        // Remove spaces
        str1 = str1.strip().toLowerCase();
        str2 = str2.strip().toLowerCase();

        return str1.equals(str2);
    }
}
