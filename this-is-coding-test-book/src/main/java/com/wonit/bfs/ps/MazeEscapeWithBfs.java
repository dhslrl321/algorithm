package com.wonit.bfs.ps;

import java.util.LinkedList;
import java.util.Queue;

public class MazeEscapeWithBfs {
    private static final int[] deltaX = {1, 0, -1, 0};
    private static final int[] deltaY = {0, 1, 0, -1};

    private static int[][] visited;

    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        // TODO 실행 시간 비교
        int[][] arr = {
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
        };

        visited = new int[n][m];

        markEscapeCount(0, 0, arr);
        // n, m 출력하기
        System.out.println("answer = " + visited[n - 1][m - 1]);
    }

    private static void markEscapeCount(int y, int x, int[][] arr) {

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        visit(x, y);

        while (!queue.isEmpty()) {
            Pair poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int xx = poll.x + deltaX[i];
                int yy = poll.y + deltaY[i];

                if (available(xx, yy, arr)) {
                    queue.add(new Pair(xx, yy));
                    visit(xx, yy, poll.x, poll.y);
                }
            }
        }
    }

    private static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean available(int x, int y, int[][] arr) {
        return boundaryCheck(x, y, arr) && (arr[y][x] != 0) && !isVisited(x, y);
    }
g
    private static boolean boundaryCheck(int x, int y, int[][] arr) {
        return (0 <= x && x < arr[0].length) &&
                (0 <= y && y < arr.length);
    }

    private static boolean isVisited(int x, int y) {
        return visited[y][x] != 0;
    }

    private static void visit(int x, int y, int beforeX, int beforeY) {
        visited[y][x] = visited[beforeY][beforeX] + 1;
    }

    private static void visit(int x, int y) {
        visited[y][x] = 1;
    }
}
