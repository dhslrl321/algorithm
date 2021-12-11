package kep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P1 {

    private static int n;
    private static int k;
    private static int[][] arr;
    private static int[][] visited;
    private static int nextTarget;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");

        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        arr = new int[n][n];
        visited = new int[n][n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                int number = Integer.parseInt(line[j]);
                max = Math.max(max, number);
                arr[i][j] = number;
            }
        }

        int answer = 0;

        for (int outer = 1; outer < max; outer++) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] == outer) {
                        answer += escape(j, i, outer);
                        visited = new int[n][n];
                    }
                }
            }

        }

        System.out.println(answer);
    }

    private static int escape(int x, int y, int value) {
        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};

        Queue<Pair> queue = new LinkedList<>();
        int nextTarget = value + 1;

        queue.add(new Pair(x, y));
        visited[y][x] = 1;
        int ret = 0;

        while(!queue.isEmpty()) {
            Pair front = queue.remove();
            if(arr[front.y][front.x] == nextTarget) {
                ret = visited[front.y][front.x] - 1;
                break;
            }
            for(int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(!(0 <= xx && xx < n && 0 <= yy && yy <n)) continue;
                if(visited[yy][xx] != 0) continue;

                visited[yy][xx] = visited[front.y][front.x] + 1;
                queue.add(new Pair(xx, yy));
                int z = arr[yy][xx];
                System.out.println(z);
            }
        }

        return ret;
    }
    private static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
