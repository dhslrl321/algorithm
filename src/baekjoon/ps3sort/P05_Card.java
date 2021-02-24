package baekjoon.ps3sort;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class P05_Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine()) + 1;
            arr[(int) num]++;
        }

        Arrays.sort(arr);

        bw.flush();
        bw.close();
    }
}
