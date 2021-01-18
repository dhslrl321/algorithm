package skill;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 2, 5, 1, 4, 3, 7, 0};

        /*
        * 1. 배열 인덱스 최솟값 찾기
        * 2. 배열 인덱스 첫번째 값과 변경*/

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    private static int findLowestIndex(int[] arr, int start) {
        int lowest = start;
        for (int i = start; i < arr.length; i++) {
            if(arr[lowest] > arr[i]) {
                lowest = i;
            }
        }
        return lowest;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int targetIndex = findLowestIndex(arr, i);
            swap(arr, i, targetIndex);
        }
    }
}
