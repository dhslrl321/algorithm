package baekjoon.ps5graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prob06_AddressNumber {
    static int[][] graph;
    static int count;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] house = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(house[j]);
            }
        }
        int called = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(i, j)) {
                    called++;
                    answer.add(count);
                    count = 0;
                }
            }
        }
        bw.write(called + "\n");
        Collections.sort(answer);
        for(int number: answer) bw.write(number + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean dfs(int x, int y) {
        if(x < 0 || y < 0 || x > n-1 || y > n-1) return false;
        if(graph[x][y] == 0) return false;
        graph[x][y] = 0;
        count++;
        dfs(x + 1, y);
        dfs(x - 1, y);
        dfs(x, y + 1);
        dfs(x, y - 1);

        return true;
    }
}
