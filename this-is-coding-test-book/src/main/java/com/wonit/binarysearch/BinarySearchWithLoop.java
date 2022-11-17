package com.wonit.binarysearch;

import java.util.Arrays;

public class BinarySearchWithLoop {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 2, 4, 8};

        // array should be sorted !!
        Arrays.sort(arr);

        int foundIndexByImpl = binarySearch(arr, 7);
        System.out.println("my implementation = " + binarySearch(arr, arr[foundIndexByImpl]));
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (arr[mid] > key) {
                end = mid + 1;
            } else if (arr[mid] < key) {
                start = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
