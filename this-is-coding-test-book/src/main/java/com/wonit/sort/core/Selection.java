package com.wonit.sort.core;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        /**
         * 반복을 돈다.
         * 매번 가장 작은 수를 찾는다.
         * 가장 작은 수와 index 의 값을 swap 한다
         */
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = findMinimumIndexFrom(arr, i + 1);
            swap(arr, minIndex, i);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static int findMinimumIndexFrom(int[] arr, int provided) {
        int minIndex = provided;
        for (int i = provided; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
