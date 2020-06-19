package theory.sort;

import java.util.Arrays;

public class MergeSort {

    static int[] sorted;

    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 2, 7, 1, 6, 5, 8};
        sorted = new int[arr.length];

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end){
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
    private static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = start; // 0로 바꾸면 어케되는지도 관찰하셈
        int index;

        while(i <= mid && j <= end){ // 실질적 정렬 부분
            if(arr[i] <= arr[j]) sorted[k++] = arr[i++];
            else sorted[k++] = arr[j++];
        }

        if(i > mid) {
            for(index = j; index <= end; index++) sorted[k++] = arr[index];
        }else{
            for(index = i; index <= mid; index++) sorted[k++] = arr[index];
        }

        for(index = start; index <= end; index++) arr[index] = sorted[index];
    }
}
