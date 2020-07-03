package baekjoon.classification.class04_Sort;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob03_Statistic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        quickSort(arr);

        // avg
        int sum = 0;
        for(int i:arr) sum += i;
        int avg = sum / arr.length;
        System.out.println(avg);

        // center
        int center = arr[arr.length/2];
        System.out.println(center);

        // 최빈값
        Map<Integer, Integer> map = new HashMap<>();

        int[] check = new int[8001];

        for (int i = 0; i < arr.length; i++) {
            check[4000 + arr[i]]++;
        }

        for (int i = 0; i < 8001; i++) {
            if(check[i] != 0) map.put(i, check[i]);
        }

        for (int i = 0; i < map.size(); i++) {
            map.get(i);
        }

        // range
        int range = arr[arr.length-1] - arr[0];
        System.out.println(range);

    }

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int start, int end){
        int part2 = partitioning(arr, start, end);
        if(start < part2 - 1) quickSort(arr, start, part2 - 1);
        if(part2 < end) quickSort(arr, part2, end);
    }

    private static int partitioning(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
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
