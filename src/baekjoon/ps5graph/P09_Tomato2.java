package baekjoon.ps5graph;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P09_Tomato2 {

    static int m, n, h;
    static int[][][] graph;
    //                  좌 하  우  상 앞 뒤
    static int[] dx = {-1, 0, 1, 0, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] mnh = br.readLine().split(" ");

        m = Integer.parseInt(mnh[0]);
        n = Integer.parseInt(mnh[1]);
        h = Integer.parseInt(mnh[2]);

        graph = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    graph[i][j][k] = Integer.parseInt(line[k]);
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(graph[i][j][k] == 1) bfs(k, j, i);
                }
            }
        }
        int answer = -1;
        boolean flag = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(graph[i][j][k] == 0) flag = true; // 하나라도 익지 않은 토마토
                    answer = Math.max(answer, graph[i][j][k]); // 최대 값
                }
            }
        }

        if(answer == 1) {
            bw.write("0");
        }else if(flag) {
            bw.write("-1");
        }else {
            bw.write(String.valueOf(answer - 1));
        }
        bw.write(Arrays.deepToString(graph)); // 그래프 내부 보기 위해서 임시 출력
        bw.flush();
        bw.close();
    }
    private static void bfs(int x, int y, int z) {

        Queue<PointXYZ> queue = new LinkedList<>();
        queue.add(new PointXYZ(x, y, z));

        while(!queue.isEmpty()) {
            PointXYZ point = queue.remove();

            for (int i = 0; i < dx.length; i++) {

                int xx = point.x + dx[i];
                int yy = point.y + dy[i];
                int zz = point.z + dz[i];

                if(validation(xx, yy ,zz)) {
                    graph[zz][yy][xx] = graph[point.z][point.y][point.x] + 1;
                    queue.add(new PointXYZ(xx, yy, zz));
                }
            }
        }
    }
    private static boolean validation(int x, int y, int z) {
        if(0 > x || 0 > y || 0 > z || x >= m || y >= n || z >= h)  return false;
        if(graph[z][y][x] == 0) {
            return true;
        }
        else return false; // 이미 방문했거나 -1이라 갈 수 없는 경우

    }
}

class PointXYZ {
    int x;
    int y;
    int z;

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}