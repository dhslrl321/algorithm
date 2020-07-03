package baekjoon.classification.class11_Dynamic_Programming;

import java.util.Scanner;

public class Prob08_Wine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int[] d = new int[10001];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        if (n >= 1) d[0] = arr[0];
        if (n >= 2) d[1] = arr[1] + arr[0];
        if (n >= 3) d[2] = Math.max(arr[0] + arr[2], arr[1] + arr[2]);

        for (int i = 3; i < n; i++) {
            d[i] = Math.max(d[i-3] + arr[i-2] + arr[i], d[i-2] + arr[i]);
            d[i] = Math.max(d[i-1], d[i]);
        }

        System.out.println(d[n-1]);
    }
}