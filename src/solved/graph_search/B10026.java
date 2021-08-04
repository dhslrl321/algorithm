package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B10026 {

    private static int[] xPos = {1, -1, 0, 0};
    private static int[] yPos = {0, 0, 1, -1};
    private static int n;

    private static boolean[][] visited;
    private static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        arr = new String[n][n];


        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                arr[i][j] = s[j];
            }
        }

        int normal = 0;
        int colorBlindness = 0;

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) { // 방문한 적이 없다면?
                    if(arr[i][j].equals("R")) {
                        visitSingleColor(j, i, "R");
                        normal++;
                    }else if(arr[i][j].equals("G")) {
                        visitSingleColor(j, i, "G");
                        normal++;
                    }else if(arr[i][j].equals("B")) {
                        visitSingleColor(j, i, "B");
                        normal++;
                    }
                }
            }
        }

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j]) { // 방문한 적이 없다면?
                    if(arr[i][j].equals("R") || arr[i][j].equals("G")) {
                        visitMultiColor(j, i);
                        colorBlindness++;
                    }else if(arr[i][j].equals("B")) {
                        visitSingleColor(j, i, "B");
                        colorBlindness++;
                    }
                }
            }
        }

        bw.write(normal + " " + colorBlindness);

        bw.flush();
        bw.close();
    }

    private static void visitSingleColor(int x, int y, String color) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y));
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(Position.isValid(xx, yy)) {
                    if(!visited[yy][xx] && arr[yy][xx].equals(color)) {
                        visited[yy][xx] = true;
                        queue.add(new Position(xx, yy));
                    }
                }
            }
        }
    }

    private static void visitMultiColor(int x, int y) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(x, y));
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            Position front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(Position.isValid(xx, yy)) {
                    if(!visited[yy][xx] && (arr[yy][xx].equals("R") || arr[yy][xx].equals("G"))) {
                        visited[yy][xx] = true;
                        queue.add(new Position(xx, yy));
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

        static boolean isValid(int x, int y) {
            return 0 <= x && x < n && 0 <= y && y < n;
        }
    }
}
