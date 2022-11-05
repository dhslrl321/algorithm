package com.wonit.greedy;

import java.util.Arrays;
import java.util.Collections;

public class BigNumbersRaw_3 {
    public static void main(String[] args) {

        int m = 2_100_000_000;
        int k = 3;

        int[] arr = {2, 4, 5, 4, 6};

        Pair top2Pair = getTop2Pair(arr);

        long answer = calculateBigNumbersRawSum(top2Pair, m, k);

        System.out.println(answer);
    }

    private static Pair getTop2Pair(int[] arr) {
        // 주어진 배열에서 가장 큰 2 수 뽑는다.
        // Pair 로 반환한다
        Integer[] integers = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(integers, Collections.reverseOrder());

        return new Pair(integers[0], integers[1]);
    }

    private static long calculateBigNumbersRawSum(Pair top2Pair, int m, int k) {
        int round = (top2Pair.first * k) + top2Pair.second;
        long a = (long) (m / (k + 1)) * round;
        long b = (long) (m % (k + 1)) * top2Pair.first;
        return a + b;
    }

    private static class Pair {

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
