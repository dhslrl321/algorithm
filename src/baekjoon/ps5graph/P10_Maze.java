package baekjoon.ps5graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P10_Maze {

    static int n, m;
    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        graph = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] line = br.readLine().split("");
            for (int j = 1; j <= m; j++) {
                graph[i][j] = Integer.parseInt(line[j-1]);
            }
        }

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<MazePoint> queue = new LinkedList<>();

        queue.add(new MazePoint(1, 1));
        visited[1][1] = true;
        while(!queue.isEmpty()) {
            MazePoint point = queue.remove();
            for (int i = 0; i < dx.length; i++) {
                int xx = point.x + dx[i];
                int yy = point.y + dy[i];
                if(xx > 0 && yy > 0 && xx <= m && yy <= n) {
                    if(graph[yy][xx] != 0 && !visited[yy][xx]) {
                        visited[yy][xx] = true;
                        graph[yy][xx] = graph[point.y][point.x] + 1;
                        queue.add(new MazePoint(xx, yy));
                    }
                }
            }
        }
        bw.write(String.valueOf(graph[n][m]));
        bw.flush();
        bw.close();
}
}

class MazePoint {
    int x;
    int y;
    MazePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
