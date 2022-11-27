package com.wonit.binarysearch.ps;

import java.util.Arrays;

public class FindGoods {
    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 9, 2};
        int[] targets = {3, 7, 9};

        boolean notFound = false;
        Arrays.sort(arr);
        for (int target : targets) {
            if (!searchByLoop(arr, target) && !searchByRecursive(arr, target, 0, arr.length - 1)) {
                notFound = true;
                break;
            }
        }

        System.out.println(notFound ? "찾으려는 상품이 없음": "상품 존재, 판매 가능");
    }

    private static boolean searchByRecursive(int[] arr, int target, int start, int end) {

        if (start > end) {
            return false;
        }

        int mid = (start + end) / 2;

        if (target > arr[mid]) {
            return searchByRecursive(arr, target, mid + 1, end);
        } else if (target < arr[mid]) {
            return searchByRecursive(arr, target, start, mid - 1);
        } else {
            return true;
        }
    }

    private static boolean searchByLoop(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }  else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
