package algorithm.class11_Dynamic_Programming;

import java.util.Scanner;

public class Prob07_PinaryNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] d = new int[91][2];

        d[1][0] = 0;
        d[1][1] = 1;
        d[2][0] = 1;
        d[2][1] = 1;

        for (int i = 1; i <= n + 1; i++) {
            d[i][0] = d[i-1][0] * 2;
            d[i][1] = d[i-1][1];
        }

        System.out.println(d[n][0] + d[n][1]);

    }
}
