package com.company.Homework6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(checkTwoStrings("abcdd", "def"));
        System.out.println(checkTwoStrings("abc", "cde"));
        System.out.println(checkTwoStrings("abc", "dafc"));
    }

    public static String checkTwoStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set.contains(c)) {
                sb.append(c);
                set.remove(c);
            }
        }
        return sb.toString();
    }
}
