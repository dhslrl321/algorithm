package baekjoon.ps2dp;

import java.io.*;

public class Prob12_StairClimbing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[301];
        int[] dp = new int[301];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = Math.max(arr[1], arr[0] + arr[1]);
        dp[2] = Math.max(arr[1] + arr[2], arr[0] + arr[2]);

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-3] + arr[i-1], dp[i-2]) + arr[i];
        }

        bw.write(String.valueOf(dp[n-1]));
        bw.flush();
        bw.close();
    }
}
