package com.company.Homework13;

public class NumberSet {
    private int[] elements;
    private int size;

    public NumberSet(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public void add(int n) {
        try {
            if (size == elements.length) {
                throw new IllegalStateException("NumberSet is already full capacity");
            }
        }
        catch (IllegalStateException e) {
            e.getMessage();
        }
        if (!has(n)) {
            elements[size++] = n;
        }
    }

    public void delete(int n) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == n) {
                // Move all elements after the deleted one up by one index
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j+1];
                }
                size--;
                break;
            }
        }
    }

    public boolean has(int n) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
    }

    public int[] values() {
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = elements[i];
        }
        return values;
    }

    public boolean equals(NumberSet set2) {
        if (size != set2.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!set2.has(elements[i])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

