package com.company.Homework15;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
public class Task1 {
    static boolean compare(Object o1, Object o2) throws IllegalAccessException {
        if (o1 == o2) {
            return true;
        }
        if (o1 == null || o2 == null) {
            return false;
        }
        Class<?> clazz = o1.getClass();
        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object v1 = field.get(o1);
                Object v2 = field.get(o2);
                if (v1 == null || v2 == null) {
                    if (v1 != v2) {
                        return false;
                    }
                } else if (!Objects.equals(v1, v2)) {
                    if (field.getName().equals("name") && o1 instanceof Employee && o2 instanceof Employee) {
                        return false;
                    } else if (field.getName().equals("manager") && o1 instanceof Employee && o2 instanceof Employee) {
                        if (!compare(v1, v2)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            clazz = clazz.getSuperclass();
        }
        return true;
    }
}

class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee {
    private String name;
    private Manager manager;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

