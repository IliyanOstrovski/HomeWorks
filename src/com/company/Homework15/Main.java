package com.company.Homework15;

import static com.company.Homework15.Task1.compare;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Manager m1 = new Manager("Svilen");
        Employee e1 = new Employee("Ivan", m1);

        Manager m2 = new Manager("Refo");
        Employee e2 = new Employee("Daniela", m2);

        Manager m3 = new Manager("Refo");
        Employee e3 = new Employee("Ivan", m3);

        Manager m4 = new Manager("Svilen");
        Employee e4 = new Employee("Ivan", m4);

        Employee e5 = new Employee("Ivan", m1);

        System.out.println(compare(e1, e2)); // => false
        System.out.println(compare(e1, e3)); // => false
        System.out.println(compare(e1, e4)); // => true
        System.out.println(compare(e1, e5)); // => true
    }
}
