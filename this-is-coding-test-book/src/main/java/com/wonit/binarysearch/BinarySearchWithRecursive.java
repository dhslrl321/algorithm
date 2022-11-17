package com.wonit.binarysearch;

import com.wonit.util.Assertions;
import java.util.Arrays;

public class BinarySearchWithRecursive {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 2, 4, 8};

        // array should be sorted !!
        Arrays.sort(arr);

        int foundIndex = binarySearch(arr, 7);
        Assertions.equals(7, arr[foundIndex]);

        foundIndex = binarySearch(arr, 1);
        Assertions.equals(1, arr[foundIndex]);

        foundIndex = binarySearch(arr, 0);
        Assertions.equals(0, arr[foundIndex]);

        foundIndex = binarySearch(arr, 9);
        Assertions.equals(9, arr[foundIndex]);
    }

    private static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] > key) {
            // what if end is (mid + 1) ?
            return binarySearch(arr, key, start, mid - 1);
        } else if (arr[mid] < key) {
            return binarySearch(arr, key, mid + 1, end);
        } else {
            return mid;
        }
    }
}
