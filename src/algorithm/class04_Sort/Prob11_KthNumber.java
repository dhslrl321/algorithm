package algorithm.class04_Sort;

import java.util.*;

public class Prob11_KthNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();
        int k = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        quickSort(arr);

        System.out.println(arr[k-1]);
    }

    private static void quickSort(int[] arr, int k){
        quickSort(arr, 0, arr.length-1, k);
    }

    private static void quickSort(int[] arr, int start, int end, int k){
        int part2 = partitioning(arr, start, end);
        if(part2 == k) return arr[k]
        if(start < part2 - 1) quickSort(arr, start, part2 - 1);
        if(part2 - 1 > end) quickSort(arr, part2, end);
    }

    private static int partitioning(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];

        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}