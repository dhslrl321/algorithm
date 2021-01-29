package baekjoon.ps2dp;

import java.io.*;

public class Prob01_FibonacciFunction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] numCounts = new int[41][2];


            numCounts[0][0] = 1; numCounts[0][1] = 0;
            numCounts[1][0] = 0; numCounts[1][1] = 1;
            numCounts[2][0] = 1; numCounts[2][1] = 1;

            for(int i = 2; i <= n; i++) {
                numCounts[i][0] = numCounts[i-1][0] + numCounts[i-2][0];
                numCounts[i][1] = numCounts[i-1][1] + numCounts[i-2][1];
            }
            bw.write(numCounts[n][0] + " " + numCounts[n][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}