package baekjoon.ps5graph;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 1. 섬마다 가중치 다르게
// 2. 섬 끝자락 노드 찾기
public class P11_MakeBridge {

    static int n;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        graph = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(graph[i][j] == 1 && !visited[i][j]) setLabel(j, i, count++);
            }
        }

        ArrayList<IslandPoint> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isEdge(j, i)) list.add(new IslandPoint(j, i));
            }
        }
        for(IslandPoint p : list) {
            System.out.println(p.x + " " + p.y);
        }
        int answer = getMinDistance(list.get(0).x, list.get(0).y);

        for (int i = 1; i < list.size(); i++) {
            IslandPoint point = list.get(i);
            visited = new boolean[n][n];
            answer = Math.min(answer, getMinDistance(point.x, point.y));
        }

        print(graph);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static int getMinDistance(int x, int y){
        int distance = 0;
        Queue<IslandPoint> queue = new LinkedList<>();
        queue.add(new IslandPoint(x, y));
        visited[y][x] = true;
        while(!queue.isEmpty()) {
            IslandPoint point = queue.remove();
            for (int i = 0; i < dx.length; i++) {
                int xx = dx[i] + point.x;
                int yy = dx[i] + point.y;
                if(validation(xx, yy)) {
                    if(graph[yy][xx] == 0 && !visited[yy][xx]) {
                        visited[yy][xx] = true;
                        queue.add(new IslandPoint(xx, yy));
                        graph[yy][xx] = graph[point.y][point.x] + 1;
                    }
                }
            }
        }
        return distance;
    }

    private static boolean isEdge(int x, int y) {
        for (int i = 0; i < dx.length; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(validation(xx, yy)) {
                if(graph[yy][xx] == 0 && graph[y][x] >= 1) return true;
            }
        }
        return false;
    }

    private static boolean validation(int x, int y) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    private static void setLabel(int x, int y, int count) {
        Queue<IslandPoint> queue = new LinkedList<>();

        queue.add(new IslandPoint(x, y));
        visited[y][x] = true;
        graph[y][x] = count;
        while (!queue.isEmpty()) {
            IslandPoint point = queue.remove();
            for (int i = 0; i < 4; i++) {
                int xx = dx[i] + point.x;
                int yy = dy[i] + point.y;
                if(xx >= 0 && yy >= 0 && xx < n && yy < n) {
                    if(graph[yy][xx] == 1  && !visited[yy][xx]) {
                        queue.add(new IslandPoint(xx, yy));
                        visited[yy][xx] = true;
                        graph[yy][xx] = count;
                    }
                }
            }
        }
    }

    private static void print(int[][] arr) {
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int iter : arr[i])   {
                System.out.print(iter + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }
}

class IslandPoint {
    int x;
    int y;
    IslandPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
