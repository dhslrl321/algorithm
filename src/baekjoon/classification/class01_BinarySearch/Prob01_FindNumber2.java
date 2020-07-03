package baekjoon.classification.class01_BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class Prob01_FindNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int size2 = input.nextInt();
        int[] arr2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            arr2[i] = input.nextInt();
        }
        int[] newArr = finder(arr, arr2);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    static int[] finder(int[] arr, int[] compArr) {
        Arrays.sort(arr);
        int[] ans = new int[compArr.length];
        Arrays.fill(ans, 0);

        for (int i = 0; i < compArr.length; i++) {
            int start = 0;
            int end = compArr.length-1;


            while (start <= end) {
                int center = (start + end) / 2;
                if(arr[center] == compArr[i]){
                    ans[i] = 1;
                    break;
                }else if (arr[center] < compArr[i]){
                    start = center + 1;
                }else {
                    end = center - 1;
                }
            }

        }
        return ans;
    }
}