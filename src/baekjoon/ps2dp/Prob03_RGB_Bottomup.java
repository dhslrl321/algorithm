package baekjoon.ps2dp;

import java.io.*;
@SuppressWarnings("all")
public class Prob03_RGB_Bottomup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] rgb = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] rgbs = br.readLine().split(" ");
            for (int j = 0; j < rgbs.length; j++) {
                rgb[i][j] = Integer.parseInt(rgbs[j]);
            }
        }

        for (int i = 1; i < n; i++) {
            rgb[i][0] += Math.min(rgb[i-1][1], rgb[i-1][2]);
            rgb[i][1] += Math.min(rgb[i-1][0], rgb[i-1][2]);
            rgb[i][2] += Math.min(rgb[i-1][0], rgb[i-1][1]);
        }
        int min = Math.min(rgb[n-1][0], Math.min(rgb[n-1][1], rgb[n-1][2]));
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
