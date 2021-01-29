package baekjoon.ps2dp;

import java.io.*;

public class Prob11_SequenceSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[100001];
        int[] dp = new int[100001];

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
        }

        int answer = dp[0];

        for (int i = 0; i < n; i++) answer = Math.max(dp[i], answer);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
