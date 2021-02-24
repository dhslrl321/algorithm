package baekjoon.ps9exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class P17_DiffToMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        /*int answer = 0;
        Arrays.sort(arr); // 모든 순열은 첫 순열부터 시작해야 하기 때문에 정렬은 필수 과정
        do {
            answer = Math.max(answer, getFormulaResult(arr));
        } while(nextPermutation(arr));

        System.out.println(answer);*/
    }

    /*private static boolean nextPermutation(int[] arr) {
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i]) i--;
        if(i <= 0) return false;

        int j = arr.length - 1;
        while(arr[i-1] >= arr[j]) j--;

        swap(arr, i-1, j);
        j = arr.length - 1;
        while(i < j) {
            swap(arr, i, j);
            i++; j--;
        }
        return true;
    }*/

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int getFormulaResult(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Math.abs(arr[i] - arr[i + 1]);
        }
        return sum;
    }
}
