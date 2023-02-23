package com.company.Homework1;

public class Task2 {
    public static void main(String[] args) {
      checkTwoStrings("abc", "dafc");
    }
    public static void checkTwoStrings(String string1,String string2) {
        StringBuilder match = new StringBuilder();
        for (int i = 0; i < string1.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    match.append(string1.charAt(i));
                }
            }
        }
        System.out.println("\"" + string1 + "\", " + "\"" + string2 + "\" => " + "\"" + match + "\"");
    }
}
