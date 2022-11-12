package com.wonit.bfs.ps;

import java.util.LinkedList;
import java.util.Queue;

public class FreezingDrinkWithBfs {

    private static int[] deltaX = {1, 0, -1, 0};
    private static int[] deltaY = {0, -1, 0, 1};

    private static boolean[][] visited;

    public static void main(String[] args) {

        int[][] arr = {
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
        };

        visited = new boolean[arr.length][arr[0].length];

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0 && isHole(arr, i, j)) {
                    answer++;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

    private static boolean isHole(int[][] arr, int y, int x) {
        if (visited[y][x]) { // 방문 여부 확인
            return false;
        }

        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(x, y));

        while (!queue.isEmpty()) {
            Pair poll = queue.poll();
            visit(poll.x, poll.y);

            for (int i = 0; i < 4; i++) {
                int r = poll.x + deltaX[i];
                int c = poll.y + deltaY[i];

                if (available(r, c, arr) && !visited[c][r] && arr[c][r] != 1) { // 경계 안에 있으면서, 방문하지 않은 노드
                    queue.add(new Pair(r, c));
                }
            }
        }

        return true;
    }

    private static boolean available(int x, int y, int[][] arr) {
        boolean xAvailable = 0 <= x && x < arr[0].length;
        boolean yAvailable = 0 <= y && y < arr.length;
        return xAvailable && yAvailable; // TODO spec;
    }

    private static void visit(int x, int y) {
        visited[y][x] = true;
    }

    private static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
