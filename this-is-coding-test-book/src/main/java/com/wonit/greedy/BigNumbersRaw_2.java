package com.wonit.greedy;

import java.util.Arrays;
import java.util.Collections;

public class BigNumbersRaw_2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 3;

        int[] arr = {2, 4, 5, 4, 6};
        Integer[] integers = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        int first = integers[0];
        int second = integers[1];

        int result = 0;

        while (true) {
            for (int i = 0; i < k; i++) {
                if (m == 0) {
                    break;
                }

                result += first;
                m--;
            }

            if (m == 0) {
                break;
            }

            result += second;
            m--;
        }

        System.out.println("result = " + result);
    }
}
