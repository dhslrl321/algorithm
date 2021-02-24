package baekjoon.ps5graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P08_Tomato {

    static int[][] graph;
    static boolean[][] visited;
    static int m;
    static int n;
    static int h;
    static int[] dx = {-1, 1, 0, 0, n, -n};
    static int[] dy = {0, 0, 1, -1, 0, 0};
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] mnh = br.readLine().split(" ");

        m = Integer.parseInt(mnh[0]); // 가로
        n = Integer.parseInt(mnh[1]); // 세로
        h = Integer.parseInt(mnh[2]); // 높이
        graph = new int[n*h][m];
        visited = new boolean[n*h][m];
        boolean flag = false;

        for (int i = 0; i < n * h; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
                if(graph[i][j] == 0) flag = true;
            }
        }

        if(!flag) answer = 0; // 토마토가 하나라도 익지 않은 상황

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 1) bfs(i, j);
            }
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] == 0) {
                    answer = -1; // 토마토가 다 익지 않은 상황
                    break;
                }
            }
        }
        bw.write(Arrays.deepToString(graph));
        bw.write(String.valueOf(answer)); // 토마토가 제대로 익은 상황
        bw.flush();
        bw.close();
    }

    private static void bfs(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        visited[x][y] = true;
        while(!queue.isEmpty()) {
            Point point = queue.remove();
            for (int i = 0; i < dx.length; i++) {
                int xx = dx[i] + point.x;
                int yy = dy[i] + point.y;
                if(0 <= xx && 0 <= yy && xx < n * h && yy < m) {
                    if(graph[xx][yy] == 0 && !visited[xx][yy]) {
                        queue.add(new Point(xx, yy));
                        graph[xx][yy] = graph[x][y] + 1;
                        visited[xx][yy] = true;
                    }
                }
            }
            graph[x][y]++;
            answer++;
        }
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
