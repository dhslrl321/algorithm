package baekjoon.ps2dp;

import java.io.*;

public class P09_Wine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];
        int[] dp = new int[10001];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = Math.max(arr[0], arr[1]) + arr[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[n-2], arr[n-1] + dp[n-3]) + arr[i];
        }

        int max = 0;
        for (int i = 0; i <= n; i++) {
            max = Math.max(dp[i], max);
        }
        bw.write(String.valueOf(max));

        bw.flush();
        bw.close();
    }
}
