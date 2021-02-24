package baekjoon.ps9exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class P14_NextPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        /*nextPermutation(arr);*/
        for(int value : arr) System.out.print(value + " ");
    }

   /* private static int[] nextPermutation(int[] arr) {
        int i = arr.length-1;
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if(i <= 0) return new int[]{-1};

        int j = arr.length-1;

        while(arr[j] <= arr[i-1]) j--;

        swap(arr, i-1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }*/

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
