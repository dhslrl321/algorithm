package baekjoon.ps10greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class P01_BigNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nmk = br.readLine().split(" ");
        String[] ns = br.readLine().split(" ");

        int n = Integer.parseInt(nmk[0]);
        int m = Integer.parseInt(nmk[1]);
        int k = Integer.parseInt(nmk[2]);

        int[] arr = new int[ns.length];

        for (int i = 0; i < ns.length; i++) {
            arr[i] = Integer.parseInt(ns[i]);
        }

        Arrays.sort(arr);

        int first = arr[arr.length - 1];
        int second = arr[arr.length - 2];

        int answer = 0;

        for (int i = 1; i <= m;) {
            answer += first;
            if(i % k == 0) {
                answer += second;
                i += 2;
            }else {
                i += 1;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
