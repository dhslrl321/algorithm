package com.wonit.greedy;

public class MM {
    public static void main(String[] args) {
        Integer n = 10;

        while (n != 0) {
            minus(n);
        }
    }

    private static void minus(Integer n) {
        n--;
    }
}

class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
