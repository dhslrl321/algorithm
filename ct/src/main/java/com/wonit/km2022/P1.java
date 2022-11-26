package com.wonit.km2022;

public class P1 {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 5},
                {3, 7},
                {10, 11}
        };

        System.out.println(solution(arr));
    }

    private static int[] days = new int[366];

    private static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            for (int j = start; j < end; j++) {
                days[j]++;
            }
        }

        int count = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] != 0) count++;
        }

        return count;
    }
}
