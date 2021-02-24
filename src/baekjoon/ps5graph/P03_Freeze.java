package baekjoon.ps5graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class P03_Freeze {

    static int n;
    static int m;
    static int[][] graph = new int[1000][1000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        for (int i = 0; i < n; i++) {
            String[] ice = br.readLine().split("");
            for (int j = 0; j < m; j++) {
               graph[i][j] = Integer.parseInt(ice[j]);
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dfs(i, j)) answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static boolean dfs(int x, int y) {
        if(x <= -1 || x >= n || y <= -1 || y >= m) return false;

        if(graph[x][y] == 0) {

            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y + 1);
            dfs(x, y - 1);
            return true;
        }
        return false;
    }
}


/*
4 5
00110
00011
11111
00000*/
