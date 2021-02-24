package baekjoon.ps9exhaustiveSearch;

import java.io.*;

public class P01_CalcDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] esm = br.readLine().split(" ");

        int E = Integer.parseInt(esm[0]);
        int S = Integer.parseInt(esm[1]);
        int M = Integer.parseInt(esm[2]);
        int count = 1;
        int e = 1;
        int s = 1;
        int m = 1;

        while(true) {
            if(E==e && S==s && M==m) break;
            e++; s++; m++;

            if(e == 16) e = 1;
            if(s == 29) s = 1;
            if(m == 20) m = 1;

            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
