package baekjoon.ps2dp;

import java.io.*;
import java.util.Arrays;

public class Prob10_LIS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        int[] dp = new int[1001];

        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < nums.length; i++) {
            arr[i] = Integer.parseInt(nums[i]);
        }

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(dp[i], answer);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

