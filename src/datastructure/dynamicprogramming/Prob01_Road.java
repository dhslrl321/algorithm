package datastructure.dynamicprogramming;

import java.io.*;
import java.util.Arrays;

public class Prob01_Road {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] road = new int[n][m];
        for(int i = 0; i < n; i++){
            String[] rows = br.readLine().split(" ");
            for (int j = 0; j < rows.length; j++) {
                road[i][j] = Integer.parseInt(rows[j]);
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(road[i][j] == 0) road[i][j] = 0;
                else road[i][j] = road[i][j-1] + road[i-1][j];
            }
        }
        bw.write(String.valueOf(road[n-1][m-1]));
        bw.flush();
        bw.close();
    }
}

/*5 5
1 1 1 1 1
1 1 0 0 1
1 1 1 1 1
1 1 1 0 1
0 0 1 1 1*/
