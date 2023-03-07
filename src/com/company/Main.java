package com.company;


public class Main {

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(2);
        integerStack.push(5);
        System.out.println(integerStack.pop());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("asfdad");
        stringStack.push("sjsfsl");
        System.out.println(stringStack.isEmpty());
        System.out.println(stringStack.pop());
    }
}
