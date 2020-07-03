package baekjoon.classification.class11_Dynamic_Programming;

import java.io.*;

public class Prob06_Make1 {
    static int[] d = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        d[1] = 0;
        d[2] = 1;
        d[3] = 1;

        for (int i = 3; i < n+1; i++) {
            d[i] = d[i-1] + 1;
            if(i % 2 == 0) d[i] = Math.min(d[i/2] + 1, d[i]);
            if(i % 3 == 0) d[i] = Math.min(d[i/3] + 1, d[i]);
        }

        bw.write(String.valueOf(d[n]));
        bw.flush();
        bw.close();
    }
}
