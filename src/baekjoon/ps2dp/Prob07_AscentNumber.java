package baekjoon.ps2dp;

import java.io.*;
import java.util.Arrays;

public class Prob07_AscentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[1001][10];

        for (int i = 0; i < 10; i++) {
            arr[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                int sum = 0;
                for (int k = 0; k <= j; k++) {
                    sum += arr[i-1][k];
                }
                arr[i][j] = sum % 10007;
            }
        }
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            answer += arr[n][i];
        }
        bw.write(String.valueOf(answer % 10007));
        bw.flush();
        bw.close();
    }
}
