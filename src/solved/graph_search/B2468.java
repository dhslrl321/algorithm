package solved.graph_search;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class B2468 {

    private static int n;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] xPos = {1, -1, 0, 0};
    private static int[] yPos = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);

        arr = new int[n][n];

        int maxHeight = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < inputs.length; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
                maxHeight = Math.max(maxHeight, arr[i][j]);
            }
        }

        int answer = 0;

        for (int i = 0; i <= maxHeight; i++) {

            visited = new boolean[n][n];
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    if(arr[j][k] > i && !visited[j][k]) {
                        bfs(i, k, j);
                        sum++;
                    }
                }
            }

            answer = Math.max(answer, sum);
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }

    private static void bfs(int height, int x, int y) {

        Queue<Position> queue = new LinkedList<>();

        queue.add(new Position(x, y));
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = xPos[i] + front.x;
                int yy = yPos[i] + front.y;

                if(0 <= xx && xx < n && 0 <= yy && yy < n) {
                    if(!visited[yy][xx] && arr[yy][xx] > height) {
                        queue.add(new Position(xx, yy));
                        visited[yy][xx] = true;
                    }
                }
            }
        }
    }

    private static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
