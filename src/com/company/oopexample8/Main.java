package com.company.oopexample8;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Bob", 12, "bark");
        System.out.println(animal.createCat("Kiki", 2, "meow", 6));
        System.out.println(animal.createDog("lili", 4, "skrrr", "papa"));
    }
}
