package com.wonit.dfs.ps;

public class FreezingDrinkWithDfs {

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
                if (arr[i][j] != 1 && dfs(i, j, arr)) {
                    answer++;
                }
            }
        }

        System.out.println("answer = " + answer);
    }

    private static boolean dfs(int y, int x, int[][] arr) {
        if (visited[y][x]) {
            return false;
        }
        visit(x, y);

        for (int i = 0; i < deltaX.length; i++) {
            int xx = x + deltaX[i];
            int yy = y + deltaY[i];

            if (available(xx, yy, arr) &&
                    !visited[yy][xx] &&
                    arr[yy][xx] != 1) {
                dfs(yy, xx, arr);
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
}
