package com.wonit.sort.core;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int[] arr2 = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr2[j] < arr2[j - 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j - 1];
                    arr2[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for (int insertTargetIndex = 1; insertTargetIndex < arr.length; insertTargetIndex++) {
            for (int j = 0; j < insertTargetIndex; j++) {
                if (arr[insertTargetIndex] <= arr[j]) {
                    insertLeft(arr, insertTargetIndex, j);
                }
            }
        }

        System.out.println(Arrays.toString(arr2));
    }

    private static void insertLeft(int[] arr, int insertTargetIndex, int start) {
        int temp = arr[insertTargetIndex];
        for (int i = insertTargetIndex; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}
