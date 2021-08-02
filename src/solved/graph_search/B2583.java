package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class B2583 {

    private static int m;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mnk = br.readLine().split(" ");

        m = Integer.parseInt(mnk[0]); // y
        n = Integer.parseInt(mnk[1]); // x
        int k = Integer.parseInt(mnk[2]); // 개수

        boolean[][] arr = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            String[] s = br.readLine().split(" ");
            int fromX = Integer.parseInt(s[0]);
            int fromY = Integer.parseInt(s[1]);

            int toX = Integer.parseInt(s[2]);
            int toY = Integer.parseInt(s[3]);

            mark(arr, fromX, fromY, toX, toY); // 색칠
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(!arr[i][j]) {
                    list.add(getConnectedComponent(arr, j, i));
                }
            }
        }
        Collections.sort(list);

        bw.write(list.size() + "\n");

        for(int value : list) {
            bw.write(value + " ");
        }

        bw.flush();
        bw.close();
    }

    private static void mark(boolean[][] arr, int fromX, int fromY, int toX, int toY) {
        for (int i = fromY; i < toY; i++) {
            for (int j = fromX; j < toX; j++) {
                arr[i][j] = true;
            }
        }
    }

    private static int getConnectedComponent(boolean[][] arr, int x, int y) {

        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y));
        arr[y][x] = true;

        int count = 1;

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(0 <= xx && xx < n && 0 <= yy && yy < m) {
                    if(!arr[yy][xx]) {
                        arr[yy][xx] = true;
                        queue.add(new Position(xx, yy));
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static class Position {
        int x;
        int y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
