package com.wonit.greedy;

public class NumberCardGame {

    public static void main(String[] args) {
        int[][] tc1Arr = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};
        int[][] tc2Arr = {{7, 3, 1, 8}, {3, 3, 3, 4}};

        solution(tc1Arr);
        solution(tc2Arr);
    }

    private static void solution(int[][] tcArr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : tcArr) {
            int min = getMinimumNumberIn(ints);
            max = Math.max(max, min);
        }

        System.out.println("max = " + max);
    }

    private static int getMinimumNumberIn(int[] ints) {
        int min = Integer.MAX_VALUE;
        for (int anInt : ints) {
            min = Math.min(min, anInt);
        }
        return min;
    }
}
