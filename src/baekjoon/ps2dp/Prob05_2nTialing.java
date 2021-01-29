package baekjoon.ps2dp;

import java.awt.image.DataBufferDouble;
import java.io.*;

@SuppressWarnings("SpellCheckingInspection")
public class Prob05_2nTialing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-2] * 2) + arr[i-1];
            arr[i] %= 10007;
        }

        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
    }
}


