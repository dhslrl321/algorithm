package com.wonit.binarysearch.core;

import java.util.Arrays;

public class BinarySearchWithLoop {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 2, 4, 8};

        // array should be sorted !!
        Arrays.sort(arr);
        // sorted arr = [0, 1, 2, 3, 4, 5, 7, 8, 9]

        int foundIndexByImpl = binarySearch(arr, 5);
        System.out.println("my implementation = " + binarySearch(arr, arr[foundIndexByImpl]));
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
