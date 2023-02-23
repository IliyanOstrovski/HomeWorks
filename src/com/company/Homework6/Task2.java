package com.company.Homework6;

public class Task2 {
    public static void main(String[] args) {
        String str = "#abc#";
        String str1 = "a#bc";
        String str2 = "abc##";

        System.out.println(processString(str));
        System.out.println(processString(str1));
        System.out.println(processString(str2));
    }

    public static String processString(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(input.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
