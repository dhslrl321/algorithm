package baekjoon.classification.class12_Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob03_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int acc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                count += arr[j];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}


