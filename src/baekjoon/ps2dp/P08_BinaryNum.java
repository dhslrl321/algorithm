package baekjoon.ps2dp;

import java.io.*;

public class P08_BinaryNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[91]; // n 자리의 이친수 갯수
        dp[0] = 0;
        dp[1] = dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}
