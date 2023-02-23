package com.company.Homework3;

public class Task1 {
    public static void main(String[] args) {
        long input = 256;

        int component1 = (int) ((input >> 24) & 0xFF);
        int component2 = (int) ((input >> 16) & 0xFF);
        int component3 = (int) ((input >> 8) & 0xFF);
        int component4 = (int) (input & 0xFF);

        String ipAddress = component1 + "." + component2 + "." + component3 + "." + component4;

        System.out.println(ipAddress);
    }
}
