package baekjoon.ps9exhaustiveSearch;

import java.io.*;
import java.util.Arrays;

public class P07_RepaintChessBoard {

    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        char[][] arr =  new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line[j];
            }
        }
        int answer = 32;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.min(answer, countRepaintNum(arr, j, i));
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int countRepaintNum(char[][] arr, int x, int y) {
        int count = 0;
        int xx = x + 7;
        int yy = y + 7;

        char[] bw = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        char[] wb = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
        int jIndex;
        if(isValidPoint(xx, yy)) {
            for (int i = y; i <= yy; i++) {
                jIndex = 0;
                for (int j = x; j <= xx; j++) {
                    if(i % 2 != 0) {
                        if(arr[i][j] != bw[jIndex++]) count++;
                    }else {
                        if(arr[i][j] != wb[jIndex++]) count++;
                    }
                }
            }

            int temp = count;
            count = 0;
            for (int i = y; i <= yy; i++) {
                jIndex = 0;
                for (int j = x; j <= xx; j++) {
                    if(i % 2 != 0) {
                        if(arr[i][j] != wb[jIndex++]) count++;
                    }else {
                        if(arr[i][j] != bw[jIndex++]) count++;
                    }
                }
            }
            return Math.min(count, temp);
        }else return 100;
    }

    private static boolean isValidPoint(int x, int y) {
        return (0 <= x && 0 <= y && x < m && y < n);
    }
}

/*
8 8
BBBWBWBW
BBBBWBWB
BBBWBWBW
BBBBWBWB
BBBWBWBW
BBBBWBWB
BBBWBWBW
BBBBWBWB
  */
