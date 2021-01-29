package baekjoon.ps2dp;

import java.io.*;

public class Prob04_MakeOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];
        arr[1] = 0; arr[2] = 1; arr[3] = 1;

        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i-1] + 1;
            if(i % 2 == 0) arr[i] = Math.min(arr[i/2] + 1, arr[i]);
            if(i % 3 == 0) arr[i] = Math.min(arr[i/3] + 1, arr[i]);
        }
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
    }
}
