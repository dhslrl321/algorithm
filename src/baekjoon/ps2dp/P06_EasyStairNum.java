package baekjoon.ps2dp;

import java.io.*;
import java.util.Arrays;

public class P06_EasyStairNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[101][10];

        for (int i = 1; i <= 9; i++) {
            arr[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            arr[i][0] = arr[i-1][1];
            arr[i][9] = arr[i-1][8];
            for (int j = 1; j < 9; j++) {
                arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
            }
        }
        int answer = 0;
        for(int iter : arr[n]) answer += iter;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
