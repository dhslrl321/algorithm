package algorithm.class04_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Prob02_SortingNum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        int[] arr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        for(int i:arr) System.out.println(i);
    }
}
