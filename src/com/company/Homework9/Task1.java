package com.company.Homework9;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
        System.out.println(sameLetters("abc", "ab"));
        System.out.println(sameLetters("ababc", "abcccc"));
    }


    public static boolean sameLetters(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        Set<Character> lettersInS1 = new HashSet<>();
        Set<Character> lettersInS2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            lettersInS1.add(c);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            lettersInS2.add(c);
        }

        return lettersInS1.equals(lettersInS2);
    }
}


