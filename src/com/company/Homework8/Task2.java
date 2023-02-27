package com.company.Homework8;

public class Task2 {
    public static void main(String[] args) {
        String word = "alabala";
        int position = 2;

        System.out.println(removeCharAt(word, position));
    }

    public static String removeCharAt(String str, int index) {
        if (index < 0 || index >= str.length()) {
            return str;  // Return the original string if the indexition is out of range
        }

        char[] charArray = str.toCharArray();
        for (int i = index; i < charArray.length - 1; i++) {
            charArray[i] = charArray[i + 1];  // Shift all characters left by one
        }
        charArray[charArray.length - 1] = '\0';  // Set the last character to null

        return new String(charArray, 0, charArray.length - 1);  // Create a new string without the last character
    }

}
