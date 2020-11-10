package baekjoon.classification.class05_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Prob09_ReverseTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[k];
        for (int i = 1; i <= k; i++) {
            StringBuilder a = new StringBuilder(String.valueOf(n * i));
            arr[i-1] = Integer.parseInt(a.reverse().toString());
        }

        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
