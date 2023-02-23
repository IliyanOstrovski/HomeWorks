package com.company.Homework3;

public class Task2 {
    public static void main(String[] args) {
        String ipAddress = "255.255.255.255";
        String[] ipComponents = ipAddress.split("\\.");

        int component1 = Integer.parseInt(ipComponents[0]);
        int component2 = Integer.parseInt(ipComponents[1]);
        int component3 = Integer.parseInt(ipComponents[2]);
        int component4 = Integer.parseInt(ipComponents[3]);

        long ipInteger = ((long) component1 << 24)
                       | ((long) component2 << 16)
                       | ((long) component3 << 8)
                       | component4;

        System.out.println(ipInteger);
    }
}
