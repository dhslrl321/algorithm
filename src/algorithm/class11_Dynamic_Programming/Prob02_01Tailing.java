package algorithm.class11_Dynamic_Programming;

import java.io.*;

public class Prob02_01Tailing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1000001];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] %= 15746;
        }
        bw.write(String.valueOf(dp[n]));// 결과에서 나눠주면 값이 넘어가니까
        bw.flush();
        bw.close();
    }
}
