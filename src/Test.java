
import java.util.Scanner;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 9, 5, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        for(int i : arr) System.out.println(i);
    }


    private static void quickSort(int[] arr, int start, int end){
        int part2 = partitioning(arr, start, end);
        if(start < part2 -1) quickSort(arr, start, part2 - 1);
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
