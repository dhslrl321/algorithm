package algorithm.class04_Sort;

import java.util.*;

public class Prob06_WordSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[input.nextInt()];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        quickSort(arr);

        for(String ans : arr) System.out.println(ans);

    }

    private static void quickSort(String[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(String[] arr, int start, int end){
        int part2 = partitioning(arr, start, end);
        if(start < part2 - 1) quickSort(arr, start, part2 - 1);
        if(part2 < end) quickSort(arr, part2, end);
    }

    private static int partitioning(String[] arr, int start, int end){
        int pivot = arr[(start + end) / 2].length();
        while(start <= end){
            while(arr[start].length() < arr[pivot].length()) start++;
            while(arr[pivot].length() > arr[end].length()) end--;
            if(start >= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(String[] arr, int idx1, int idx2){
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}

