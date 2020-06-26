package algorithm.class11_Dynamic_Programming;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prob04_Triangle {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][n];

        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0){
                    dp[i][j] = dp[i-1][0] + arr[i][j];
                }else if(i == j) {
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
            }
        }

        Arrays.sort(dp[n-1]);
        bw.write(String.valueOf(dp[n-1][n-1]));
        bw.flush();
        bw.close();
    }
}
