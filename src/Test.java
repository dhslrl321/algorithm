import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException{
        int[] arr = {5, 2, 9, 1, 8 ,7, 4, 3, 6};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*quick for call*/
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    /*quick sort for logic*/
    private static void quickSort(int[] arr, int start, int end){
        int part = partition(arr, start, end);
        if(start < part - 1) quickSort(arr, start, part - 1);
        if(part < end) quickSort(arr, part, end);
    }

    /*partition method*/
    private static int partition(int[] arr, int start, int end){
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
    /*swap method*/
    private static int[] swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        return arr;
    }
}