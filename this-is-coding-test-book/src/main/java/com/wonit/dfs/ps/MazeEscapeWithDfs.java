package com.wonit.dfs.ps;

public class MazeEscapeWithDfs {

    private static final int[] deltaX = {1, 0, -1, 0};
    private static final int[] deltaY = {0, 1, 0, -1};

    /**
     * 이 문제는 최단경로 문제이므로 dfs 로는 얻어진 해가 최적해가 아닐 수 있다
     * 고로 정답일 수도 있고 아닐 수도 있다
     */

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

        // dfs 돌리기
        markEscapeCount(0, 0, arr, 1);
        // n, m 출력하기
        System.out.println("answer = " + visited[n - 1][m - 1]);
    }

    private static void markEscapeCount(int y, int x, int[][] arr, int depth) {
        if (isVisited(x, y)) {
            return;
        }

        visit(x, y, depth);

        for (int i = 0; i < 4; i++) {
            int xx = x + deltaX[i];
            int yy = y + deltaY[i];

            if (available(xx, yy, arr)) {
                depth++;
                markEscapeCount(yy, xx, arr, depth);
            }
        }
    }

    private static boolean available(int x, int y, int[][] arr) {
        return boundaryCheck(x, y, arr) && (arr[y][x] != 0);
    }

    private static boolean boundaryCheck(int x, int y, int[][] arr) {
        return (0 <= x && x < arr[0].length) &&
                (0 <= y && y < arr.length);
    }

    private static boolean isVisited(int x, int y) {
        return visited[y][x] != 0;
    }

    private static void visit(int x, int y, int depth) {
        visited[y][x] = depth;
    }
}
