package solved.graph_search;

import java.io.*;
import java.util.*;

public class B16234 {

    private static int n;
    private static int l;
    private static int r;
    private static int[][] arr;
    private static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nlr = br.readLine().split(" ");

        n = Integer.parseInt(nlr[0]);
        l = Integer.parseInt(nlr[1]);
        r = Integer.parseInt(nlr[2]);

        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(!visited[i][j]) {
                    count += bfs(j, i) ? 1 : 0;
                }
            }
        }
        bw.write(String.valueOf(count));
        System.out.println(Arrays.deepToString(arr));
        bw.flush();
        bw.close();
    }

    private static boolean bfs(int x, int y) {

        boolean flag = false;

        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};

        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y));
        visited[y][x] = true;

        List<Position> list = new ArrayList<>();
        list.add(new Position(x, y));
        int count = 1;
        int sum = arr[y][x];

        while(!queue.isEmpty()) {
            Position front = queue.remove();
            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(0 <= xx && xx < n && 0 <= yy && yy < n) { // 상 하 좌 우

                    int diff = Math.abs(arr[front.y][front.x] - arr[yy][xx]);

                    if(l <= diff && diff <= r) { // r l 범위 안에 있을 때
                        if(!visited[yy][xx]) {
                            queue.add(new Position(xx, yy));
                            visited[yy][xx] = true;
                            sum += arr[yy][xx];
                            list.add(new Position(xx, yy));
                            count++;
                            flag = true;
                        }
                    }
                }
            }
        }

        for(Position position : list) {
            arr[position.y][position.x] = sum / count;
        }

        return flag;
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
