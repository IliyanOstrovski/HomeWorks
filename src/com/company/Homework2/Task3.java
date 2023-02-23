package com.company.Homework2;

public class Task3 {
    public static void main(String[] args) {
        String[] strArr = {"abc"};
        int shiftBy = 3;
        int ascii_a = 97;
        int ascii_z = 122;

        for (int i = 0; i < strArr.length; i++) {
             String str = strArr[i];
            char[] charArr = str.toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                int asciiCode = charArr[j];
                asciiCode = ((asciiCode - 32 + shiftBy) % 95) + 32;
                if (asciiCode > ascii_z) {
                    asciiCode = asciiCode - ascii_z + ascii_a - 1;
                }
                else if (asciiCode < ascii_a) {
                    int x = ascii_a - asciiCode;
                    int y = x + x -1;
                    asciiCode = x + ascii_z - y;
                }
                charArr[j] = (char) asciiCode;
            }
            strArr[i] = new String(charArr);
        }
        for (String str : strArr) {
            System.out.print(str + " ");

        }
    }
}
