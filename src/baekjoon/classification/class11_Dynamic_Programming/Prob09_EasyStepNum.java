package baekjoon.classification.class11_Dynamic_Programming;

import java.util.Scanner;

public class Prob09_EasyStepNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] d = new long[n+1];

        d[1] = 9;

        for (int i = 2; i < n+1; i++) {
            d[i] = (d[i-1]*2) - 1;
        }
        System.out.println(d[n] % 1000000000);
    }
}
