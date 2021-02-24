package baekjoon.ps7divideConquer;

import java.util.Arrays;

public class P00_MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 10, 4, 2, 7, 1, 5, 6};

        System.out.println("정렬 전: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end){
        if(end - start == 1) {
            if(arr[start] > arr[end]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            return;
        }
        int mid = (start + end) / 2;

        mergeSort(arr, start, mid - 1);
        mergeSort(arr, mid, end);
    }
}
