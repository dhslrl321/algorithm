package algorithm.class11_dynamic_programming;

import java.io.*;

public class Prob03_RGB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][3]; // 입력 배열
        int[][] dp = new int[n+1][3]; // 계산 결과 배열

        for (int i = 1; i < n + 1; i++) {
            String input = br.readLine();
            String[] str = input.split(" ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        dp[0][0] = dp[0][1] = dp[0][2] = arr[0][0] = arr[0][1] = arr[0][2] = 0;

        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }

        bw.write(Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2])+"");

        bw.flush();
        bw.close();
    }
}
