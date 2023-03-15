package com.company.Homework16;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Stoyan");
        Employee e2 = new Employee("Ivan");
        Employee e3 = new Employee("Petar");
        Employee e4 = new Employee("Albena");

        Employee ea[] = {e1, e2, e3, e4};

        Employee onlyA[] = filter(ea, new StartWithACond());

        System.out.println(Arrays.toString(onlyA));

        System.out.println();

        sort(ea);

        for (int i = 0; i < ea.length; i++) {
            System.out.println(ea[i]);
        }
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j].compareTo(a[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static Employee[] filter(Employee[] arr, Condition cond) {
        List<Employee> result = new ArrayList<>();
        for (Employee o : arr) {
            if (cond.isValid(o)) {
                result.add(o);
            }
        }
        return result.toArray(new Employee[result.size()]);

    }
}

interface Condition {
    boolean isValid(Object o);
}

class StartWithACond implements Condition {
    @Override
    public boolean isValid(Object o) {
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) o;
        String name = e.getName();
        return name.startsWith("A");
    }
}

class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }
}

