package com.company.oopexample6;

public class Stringed implements Type, Instrument{
    @Override
    public void play() {
        System.out.println("Stringed play.");
    }

    @Override
    public void adjust() {
        System.out.println("Stringed adjust.");
    }

    @Override
    public void showType() {
        System.out.println("Stringed type.");
    }
}
