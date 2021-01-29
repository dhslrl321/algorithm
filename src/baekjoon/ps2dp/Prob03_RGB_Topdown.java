package baekjoon.ps2dp;

import java.io.*;
@SuppressWarnings("SpellCheckingInspection")
public class Prob03_RGB_Topdown {

    static int[][] rgb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        rgb = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] rgbs = br.readLine().split(" ");
            for (int j = 0; j < rgbs.length; j++) {
                rgb[i][j] = Integer.parseInt(rgbs[j]);
            }
        }
        bw.flush();
        bw.close();
    }
    private static int rgbWeight(int n, int m){
        if(n == 0) return myMinimum(rgb[0][0], rgb[0][1], rgb[0][2]);

        return myMinimum(rgb[n-1][0], rgb[n-1][1], rgb[n-1][2]);
    }

    private static int myMinimum(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }
}
