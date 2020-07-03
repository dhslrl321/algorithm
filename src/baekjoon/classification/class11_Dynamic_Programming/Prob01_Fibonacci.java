package baekjoon.classification.class11_Dynamic_Programming;

import java.io.*;

public class Prob01_Fibonacci {
    static long[] fibo;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        fibo = new long[n + 1];
        fibo[0] = 0L;
        fibo[1] = 1L;
        fibo[2] = 1L;

        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        bw.write(String.valueOf(fibo[n]));
        bw.flush();
        bw.close();
    }
}
