package datastructure.dynamicprogramming;

import java.io.*;

public class Prob01_Road2 {
    static int[][] road;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        road = new int[n][m];
        for(int i = 0; i < n; i++){
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < rows.length; j++) {
                road[i][j] = Integer.parseInt(rows[j]);
            }
        }

        bw.write(String.valueOf(getWeight(n-1, m-1)));

        bw.flush();
        bw.close();
    }

    private static int getWeight(int n, int m) {
        if(n == 0 && m == 0) return 1;
        if(road[n][m] == 0) return 0;

        return ((n > 0) ? getWeight(n-1, m) : 0) +
                ((m > 0) ? getWeight(n, m-1) : 0);
    }
}
