package baekjoon.ps11simulation;

import java.io.*;
import java.util.Arrays;

public class P04_Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int middle = 8000;
        int mode = 8000;

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());

            sum += value;
            arr[value + 4000]++;

            if(max < value) max = value;
        }

        bw.flush();
        bw.close();
    }
}
