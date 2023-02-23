package com.company.Homework3;

public class Task3 {
    public static void main(String[] args) {
        int num = 255;
        convertToBinary(num);
    }

    private static void convertToBinary(int num) {
        String hexString = Integer.toHexString(num);
        hexString = String.format(hexString, 4 - hexString.length());
        String hexValue = hexString;
        System.out.println(hexValue);
    }
}
