package com.wonit.greedy;

public class BecomesOne {

    private static int operationCount = 0;

    public static void main(String[] args) {
        int n = 17;
        int k = 4;

        while (n != 1) {
            if (isDividable(n, k)) {
                n = divide(n, k);
                continue;
            }
            
            n = minus(n);
        }

        System.out.println("operationCount = " + operationCount);
    }

    private static boolean isDividable(int n, int k) {
        return n % k == 0;
    }

    private static int divide(int n, int k) {
        plusOperationCount();
        return n / k;
    }

    private static int minus(int n) {
        plusOperationCount();
        return n - 1;
    }

    private static void plusOperationCount() {
        operationCount++;
    }
}
