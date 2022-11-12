package com.wonit.bfs.ps;

import java.util.LinkedList;
import java.util.Queue;

public class FreezingDrink {

    private static int[] deltaX = {1, 0, -1, 0};
    private static int[] deltaY = {0, -1, 0, 1};

    private static boolean[][] visited;

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0},
        };

        visited = new boolean[4][5];

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (isHole(arr, i, j)) {
                    answer++;
                }
            }
        }
    }

    private static boolean isHole(int[][] arr, int y, int x) {
        if (visited[y][x]) {
            return false;
        }

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        visit(x, y);

        while (!queue.isEmpty()) {
            Pair removed = queue.remove();

            for (int i = 0; i < 4; i++) {
                int xx = removed.x +
            }
        }
    }

    private static boolean available(int x, int y) {
        return 0 > x - 1 &&  x + 1 <
    }

    private static void visit(int x, int y) {
        visited[y][x] = true;
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
