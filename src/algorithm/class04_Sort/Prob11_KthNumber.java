package algorithm.class04_Sort;

import java.io.*;
import java.util.*;

public class Prob11_KthNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];
        int k = Integer.parseInt(st.nextToken());

        String elements = br.readLine();
        st = new StringTokenizer(elements);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr);
        bw.write(String.valueOf(arr[k-1]));
        bw.flush();
        bw.close();
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