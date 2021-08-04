package solved.graph_search;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class B14502 {

    private static int n;
    private static int m;
    private static int[][] arr;
    private static int[][] temp;
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        n = Integer.parseInt(nm[0]); // y
        m = Integer.parseInt(nm[1]); // x

        arr = new int[n][m];
        temp = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < s.length; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }

        // 반복 돌면서 setWall() 함수 호출

        // bfs 로 바이러스 퍼트리기
        setWall(0);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    private static void setWall(int depth) {
        if(depth == 3) {
            spread();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    setWall(depth + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void spread() {


        Queue<Position> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp[i][j] = arr[i][j];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] == 2) {
                    queue.add(new Position(j, i));
                }
            }
        }

        int[] xPos = {1, -1, 0, 0};
        int[] yPos = {0, 0, 1, -1};


        while(!queue.isEmpty()) {
            Position front = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = front.x + xPos[i];
                int yy = front.y + yPos[i];

                if(0 <= xx && xx < m && 0 <= yy && yy < n) {
                    if (temp[yy][xx] == 0) {
                         temp[yy][xx] = 2;
                         queue.add(new Position(xx, yy));
                    }
                }
            }
        }

        answer = Math.max(answer, countSafetyZone());
    }

    private static int countSafetyZone() {
        int count = 0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if(temp[i][j] == 0) count++;
            }
        }
        return count;
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
