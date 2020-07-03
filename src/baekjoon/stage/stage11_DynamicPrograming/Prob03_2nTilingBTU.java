package baekjoon.stage.stage11_DynamicPrograming;

import java.io.*;

public class Prob03_2nTilingBTU {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] d = new int[1001];

        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i <= n; i++) {
            d[i] = d[i-1] + d[i-2];
            d[i] %= 10007;
        }

        System.out.println(d[n]);
    }
}
