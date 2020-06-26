package algorithm.class11_Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Prob05_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            a[i] = sc.nextInt();
        }

        d[1] = Math.max(a[1], a[2]);

        for (int i = 2; i < n+1; i++) {
            d[i] = Math.max(d[i-1] + a[i], d[i-2] + a[i]);
        }

        System.out.println(Arrays.toString(d));
    }
}
