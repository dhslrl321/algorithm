package baekjoon.ps2dp;

import java.io.*;
import java.util.Arrays;

public class P13_FillTheTile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[31];
        arr[1] = 0;
        arr[3] = 0;
        arr[4] = 11;

        if(n % 2 != 0) bw.write("0");
        else {
            for (int i = 6; i <= n; i = i+2) {
                arr[i] = arr[i-2] + arr[i-4];
            }
            bw.write(String.valueOf(arr[n]));
        }

        bw.flush();
        bw.close();
    }
}
