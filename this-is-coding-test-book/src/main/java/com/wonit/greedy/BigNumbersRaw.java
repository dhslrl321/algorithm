package com.wonit.greedy;

import java.util.Arrays;
import java.util.Collections;

public class BigNumbersRaw {
    public static void main(String[] args) {

        int m = 2_100_000_000;
        int k = 3;

        int[] arr = {2, 4, 5, 4, 6};

        Pair top2Pair = getTop2Pair(arr);

        int[] bigNumbersRawArray = makeBigNumbersRawArray(top2Pair, m, k);

        long answer = calculateSum(bigNumbersRawArray);

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

    private static int[] makeBigNumbersRawArray(Pair top2Pair, int m, int k) {
        // 큰 수 법칙에 만족하는 숫자 배열을 반환한다
        int[] bigNumbersRawArray = new int[m];
        int totalPushCount = 0;
        int pushCount = 0;
        while (totalPushCount != bigNumbersRawArray.length) {
            if (pushCount < k) {
                bigNumbersRawArray[totalPushCount] = top2Pair.first;
                totalPushCount++;
                pushCount++;
                continue;
            }
            bigNumbersRawArray[totalPushCount] = top2Pair.second;
            totalPushCount++;
            pushCount = 0;
        }

        return bigNumbersRawArray;
    }

    private static long calculateSum(int[] bigNumbersRawArray) {
        long sum = 0;
        for (int i : bigNumbersRawArray) {
            sum += i;
        }
        return sum;
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
