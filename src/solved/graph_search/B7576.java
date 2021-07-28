package solved.graph_search;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class B7576 {

    private static int[][] arr;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int[] xPos = { -1, 1, 0, 0 };
    static int[] yPos = { 0, 0, -1, 1 };

    private static Queue<Position> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]); // x
        int m = Integer.parseInt(nm[1]); // y

        arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < inputs.length; j++) {
                arr[i][j] = Integer.parseInt(inputs[j]);
                if(arr[i][j] == 1) {
                    queue.add(new Position(j, i));
                }
            }
        }

        decay(n, m);

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for(int value : arr[i]) {
                if(value == 0) {
                    System.out.println(-1);
                    return ;
                }
                answer = Math.max(answer, value);
            }
        }
        System.out.println(answer - 1);
    }

    private static void decay(int n, int m) {
        while(!queue.isEmpty()) {
            Position front = queue.remove();
            for (int i = 0; i < 4; i++) {
                int xx = xPos[i] + front.x;
                int yy = yPos[i] + front.y;

                if(0 <= xx && xx < n && 0 <= yy & yy < m) {
                    if(arr[yy][xx] == 0) {
                        arr[yy][xx] = arr[front.y][front.x] + 1;
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
    }
}


