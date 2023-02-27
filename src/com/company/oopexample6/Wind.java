package com.company.oopexample6;

public class Wind implements Type, Instrument{
    @Override
    public void play() {
        System.out.println("Wind play.");
    }

    @Override
    public void adjust() {
        System.out.println("Adjust wind.");
    }

    @Override
    public void showType() {
        System.out.println("Type is wind");
    }
}
