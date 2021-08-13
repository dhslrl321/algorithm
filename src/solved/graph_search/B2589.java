package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B2589 {

    private static int l;
    private static int w;
    private static String[][] arr;
    private static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lw = br.readLine().split(" ");

        l = Integer.parseInt(lw[0]);
        w = Integer.parseInt(lw[1]);

        arr = new String[l][w];

        for (int i = 0; i < l; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < w; j++) {
                arr[i][j] = s[j];
            }
        }

        int max = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < w; j++) {
                if(arr[i][j].equals("L")) {
                    visited = new int[l][w];
                    max = Math.max(max, getTreasure(j, i));
                }
            }
        }

        bw.write(String.valueOf(max - 1));

        bw.flush();
        bw.close();
    }

    private static int getTreasure(int x, int y) {

        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(x, y));
        visited[y][x] = 1;

        while(!queue.isEmpty()) {
            Pair front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(!(0 <= xx && xx < w && 0 <= yy && yy < l)) continue;
                if(visited[yy][xx] != 0) continue;
                if(arr[yy][xx].equals("W")) continue;

                visited[yy][xx] = visited[front.y][front.x] + 1;
                queue.add(new Pair(xx, yy));
            }
        }

        int max = 0;

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                max = Math.max(max, visited[i][j]);
            }
        }

        return max;
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
