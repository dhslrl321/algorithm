package algorithm.class11_Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Prob05_Stairs {
    static int[] a = new int[301];
    static int[] d = new int[301];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        d[0] = a[0];
        d[1] = Math.max(a[1], a[0] + a[1]);
        d[2] = Math.max(a[1] + a[2], a[0] + a[2]);

        for (int i = 3; i < n; i++) {
            d[i] = Math.max(d[i-2] + a[i], d[i-3] + a[i-1] + a[i]);
        }

        System.out.println(d[n - 1]);

    }
}
