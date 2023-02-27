package com.company.Homework8;

public class Task3 {
    public static void main(String[] args) {
        String input = "alabala";
        char ch = 'a';
        char ch1 = 'c';

        System.out.println(replaceChar(input, ch, ch1));
    }

    public static String replaceChar(String str, char ch1, char ch2) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == ch1) {
                result.append(ch2);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

}
