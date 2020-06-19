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
        int i, j, k, l;
        i = start; // 시작 임시 인덱스 값
        j = mid + 1; // 중간 임시 인덱스 값
        k = start; // 시작 임시 인덱스 값(임시 배열 index 의 역할)

        while(i <= mid && j <= end) { // 앞 배열과 뒷 배열 중 먼저 쫑나는 배열이 있을 떄 까지 반복
            if(arr[i] <= arr[j]) sorted[k++] = arr[i++];
            else sorted[k++] = arr[j++];
        }

        /*앞 배열이던 뒷 배열이던 먼저 쫑나지 않은 배열의 남은 값(정렬된 값)을 임시 배열에 넣는 작업*/
        if(i <= mid) for(l = i; l <= mid; l++) sorted[k++] = arr[l];
        else for(l = j; l <= end; l++) sorted[k++] = arr[l];
        /*if(i > mid) for(l = j; l <= end; l++) sorted[k++] = arr[l];
        else for(l = i; l <= mid; l++) sorted[k++] = arr[l];*/

        /*정렬된 임시 배열을 완성된 부분 배열로*/
        for(l = start; l <= end; l++) arr[l] = sorted[l];
    }
}
