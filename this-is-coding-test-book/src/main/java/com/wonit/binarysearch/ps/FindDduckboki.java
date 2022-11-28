package com.wonit.binarysearch.ps;

import java.util.Arrays;

/**
 * 떡볶이 떡 찾기
 */
public class FindDduckboki {
    public static void main(String[] args) {
        int m = 6;
        int[] arr = {19, 10, 15, 17};

        Arrays.sort(arr);

        int start = arr[arr.length - 1];
        while (true) {
            int acc = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] - start > 0) {
                    acc += arr[i] - start;
                }
            }

            if (acc >= m) {
                System.out.println(start);
                break;
            }

            // 여기서 bs 를 해야돼
            start = start / 2;
            start--;
        }
    }

}
