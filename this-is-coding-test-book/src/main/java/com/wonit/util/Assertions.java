package com.wonit.util;

public class Assertions {
    public static void equals(int left, int right) {
        if (left != right) {
            throw new IllegalStateException();
        }

        System.out.printf("left: [%d], right: [%d] is same%n", left, right);
    }
}
