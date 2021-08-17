import java.io.*;
import java.util.*;

public class Main {

    private static int n;
    private static int m;
    private static int[][] visited;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        visited = new int[n][m];
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {

            String[] s = br.readLine().split("");

            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
                visited[i][j] = Integer.MAX_VALUE;
            }
        }

        bw.write(String.valueOf(bfs()));

        bw.flush();
        bw.close();
    }

    private static int bfs() {

        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};

        Queue<Position> queue = new LinkedList<>();

        queue.add(new Position(0, 0, 1, 0));
        visited[0][0] = 0;

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            if(front.x == m - 1 && front.y == n - 1) return front.depth;

            for(int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];
                if(!(0 <= xx && xx < m && 0 <= yy && yy < n)) continue;

                if(visited[yy][xx] > front.breakWall) { // 방문하지 않는 노드만

                    if(arr[yy][xx] == 0) {
                        queue.add(new Position(xx, yy, front.depth + 1, front.breakWall));
                        visited[yy][xx] = front.breakWall;
                    }else { // arr[yy][xx] == 1 (벽인 경우)
                        if(front.breakWall == 0) {
                            queue.add(new Position(xx, yy, front.depth + 1, 1));
                            visited[yy][xx] = 1;
                        }
                    }
                }
            }
        }

        return -1;
    }

    private static class Position {
        int x, y, depth, breakWall;

        Position(int x, int y, int depth, int breakWall) {
            this.x = x;
            this.y = y;
            this.depth = depth;
            this.breakWall = breakWall;
        }
    }
}