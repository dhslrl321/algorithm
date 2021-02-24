package baekjoon.ps6binarySearch;

import java.io.*;
import java.util.Arrays;

public class P04_SetRouter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nc = br.readLine().split(" ");
        int n = Integer.parseInt(nc[0]);
        int c = Integer.parseInt(nc[1]);

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        bw.flush();
        bw.close();
    }
}
