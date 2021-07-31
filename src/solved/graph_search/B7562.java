package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B7562 {

    private static int[] posX = {-1, -2, -2, -1, 1, 2, 2, 1};
    private static int[] posY = {-2, -1, 1, 2, 2, 1, -1, -2};

    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int l = Integer.parseInt(br.readLine());

            arr = new int[l][l];

            String[] from = br.readLine().split(" ");
            String[] to = br.readLine().split(" ");

            int fromX = Integer.parseInt(from[0]);
            int fromY = Integer.parseInt(from[1]);

            int toX = Integer.parseInt(to[0]);
            int toY = Integer.parseInt(to[1]);

            arr[fromY][fromX] = 1;

            int result = bfs(fromX, fromY, toX, toY, l) - 1;

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static int bfs(int fromX, int fromY, int toX, int toY, int l) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(fromX, fromY));

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            if(front.x == toX && front.y == toY) {
                return arr[front.y][front.x];
            }

            for (int i = 0; i < 8; i++) {
                int xx = front.x + posX[i];
                int yy = front.y + posY[i];

                if(0 <= xx && xx < l && 0 <= yy && yy < l) {
                    if(arr[yy][xx] == 0) {
                        queue.add(new Position(xx, yy));
                        arr[yy][xx] = arr[front.y][front.x] + 1;
                    }
                }
            }
        }

        return -1;
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
